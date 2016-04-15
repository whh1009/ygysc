package com.svw.uc.ws.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.svw.uc.ws.AuthProduct;
import com.svw.uc.ws.Brand;
import com.svw.uc.ws.Dealer;
import com.svw.uc.ws.Make;
import com.svw.uc.ws.Model;
import com.svw.uc.ws.Series;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IBase", targetNamespace = "http://ws.uc.svw.com/")
public interface IBase {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns com.svw.uc.ws.AuthProduct
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryAuthProduct", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryAuthProduct")
	@ResponseWrapper(localName = "queryAuthProductResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryAuthProductResponse")
	public AuthProduct queryAuthProduct(@WebParam(name = "arg0", targetNamespace = "") String arg0, @WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @return returns java.util.List<com.svw.uc.ws.Model>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryModel", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryModel")
	@ResponseWrapper(localName = "queryModelResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryModelResponse")
	public List<Model> queryModel();

	/**
	 * 
	 * @return returns java.util.List<com.svw.uc.ws.Brand>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryBrand", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryBrand")
	@ResponseWrapper(localName = "queryBrandResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryBrandResponse")
	public List<Brand> queryBrand();

	/**
	 * 
	 * @return returns java.util.List<com.svw.uc.ws.Dealer>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryDealer", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryDealer")
	@ResponseWrapper(localName = "queryDealerResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryDealerResponse")
	public List<Dealer> queryDealer();

	/**
	 * 
	 * @return returns java.util.List<com.svw.uc.ws.Series>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "querySeries", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QuerySeries")
	@ResponseWrapper(localName = "querySeriesResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QuerySeriesResponse")
	public List<Series> querySeries();

	/**
	 * 
	 * @return returns java.util.List<com.svw.uc.ws.Make>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "queryMake", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryMake")
	@ResponseWrapper(localName = "queryMakeResponse", targetNamespace = "http://ws.uc.svw.com/", className = "com.svw.uc.ws.QueryMakeResponse")
	public List<Make> queryMake();

}
