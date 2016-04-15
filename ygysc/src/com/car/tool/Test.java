package com.car.tool;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.car.model.Pic;

public class Test {

	public static void main(String[] args) throws Exception {

		List<Pic> list = new ArrayList<Pic>();
		Pic p1 = new Pic();
		p1.setVhclId("");
		p1.setPicType("22010003");
		p1.setVhclPic("");
		list.add(p1);
		Pic p2 = new Pic();
		p2.setVhclId("");
		p2.setPicType("22010002");
		p2.setVhclPic("");
		list.add(p2);
		Pic p3 = new Pic();
		p3.setVhclId("");
		p3.setPicType("22010011");
		p3.setVhclPic("");
		list.add(p3);
		Pic p4 = new Pic();
		p4.setVhclId("");
		p4.setPicType("22010010");
		p4.setVhclPic("");
		list.add(p4);
		// list 排序
		Collections.sort(list, new Comparator<Pic>() {
			public int compare(Pic p1, Pic p2) {
				return p1.getPicType().compareTo(p2.getPicType());
			}
		});
		for(Pic p : list) {
			System.out.println(p.getPicType());
		}
	}

	

}
