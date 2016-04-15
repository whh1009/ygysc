package com.car.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.car.controller.ab.BaseController;
import com.car.exception.BaseBussException;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.JFinal;

/**
 * 异常拦截器
 * 
 * @author 王宏慧
 * 
 */
public class ExceptionAndLogInterceptor implements Interceptor {
	private static final Logger log = Logger.getLogger(ExceptionAndLogInterceptor.class);

	@Override
	public void intercept(Invocation inv) {
		BaseController controller = (BaseController) inv.getController();
		HttpServletRequest request = controller.getRequest();
		try {
			inv.invoke();
		} catch (Exception e) {
			//
			doLog(inv, e);
			// 判断是否ajax请求
			String header = request.getHeader("X-Requested-With");
			boolean isAjax = "XMLHttpRequest".equalsIgnoreCase(header);
			String msg = formatException(e);
			if (isAjax) {
				msg = new StringBuilder().append("{\"status\":\"0\",\"msg\":\"").append(msg).append("\"}").toString();
				controller.renderJson(msg);
			} else {
				String redirctUrl = request.getHeader("referer");
				if (StringUtils.isBlank(redirctUrl)) {
					redirctUrl = request.getRequestURI();
				}
				controller.setAttr("message", msg);
				controller.setAttr("redirctUrl", redirctUrl);
//				controller.renderJsp("/common/fail.jsp");
			}
		} finally {
			// 记录日志
//			try {
//				Menu menu = matchDefineRecordLogMenu(request);
//				if (menu != null) {
//					ActionLogVo actionLog = controller.wrapActionLog();
//					
//					new ActionLog().set(ActionLog.ACT_NAME, menu.getName())//
//							.set(ActionLog.ACT_TIME, new Date())//
//							.set(ActionLog.DATA, actionLog.getData())//
//							.set(ActionLog.IP, actionLog.getIp())//
//							.set(ActionLog.SUCESSED, successed)//
//							.set(ActionLog.URI, actionLog.getUri())//
//							.set(ActionLog.USER_ID, actionLog.getUserId())//
//							.set(ActionLog.USER_NAME, actionLog.getUserName())//
//							.save();
//				}
//			} catch (Exception e2) {
//
//			}
		}
	}

//	private Menu matchDefineRecordLogMenu(HttpServletRequest request) {
//		Map<String, Menu> menus = Menu.getAllUrlMenus();
//		if (menus != null) {
//			String uri = request.getRequestURI();
//			Set<String> urls = menus.keySet();
//			for (String url : urls) {
//				if (url == null)
//					continue;
//				// url匹配 && 有参数 && 已配置记录日志
//				if (url.contains(uri) && request.getParameterNames().hasMoreElements() && menus.get(url).isRecordLog()) {
//					return menus.get(url);
//				}
//			}
//		}
//		return null;
//	}

	
	/**
	 * 记录日志
	 * @param ai
	 * @param e
	 */
	private void doLog(Invocation ai, Exception e) {
		// 开发模式
		if (JFinal.me().getConstants().getDevMode()) {
			e.printStackTrace();
		}
		// 业务异常不记录 ？？
		if (e instanceof BaseBussException)
			return;
		StringBuilder sb = new StringBuilder("\n---Exception Log Begin---\n");
		sb.append("Controller:").append(ai.getController().getClass().getName()).append("\n");
		sb.append("Method:").append(ai.getMethodName()).append("\n");
		sb.append("Exception Type:").append(e.getClass().getName()).append("\n");
		sb.append("Exception Details:");
		log.error(sb.toString(), e);
	}

	/**
	 * 格式化异常信息，用于友好响应用户
	 * @param e
	 * @return
	 */
	private static String formatException(Exception e) {
		String message = null;
		Throwable ourCause = e;
		while ((ourCause = e.getCause()) != null) {
			e = (Exception) ourCause;
		}
		String eClassName = e.getClass().getName();
		// 一些常见异常提示
		if ("java.lang.NumberFormatException".equals(eClassName)) {
			message = "请输入正确的数字";
		} else if (e instanceof BaseBussException || e instanceof RuntimeException) {
			message = e.getMessage();
			if (StringUtils.isBlank(message))
				message = e.toString();
		}

		// 获取默认异常提示
		if (StringUtils.isBlank(message)) {
			message = "系统繁忙,请稍后再试";
		}
		// 替换特殊字符
		message = message.replaceAll("\"", "'");
		return message;
	}

}
