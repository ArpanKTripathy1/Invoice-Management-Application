//package com.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.crud.Crud;
//import com.pojo.Students;
//
///**
// * Servlet implementation class Fetch
// */
//@WebServlet("/Fetch")
//public class Fetch extends HttpServlet {
// private static final long serialVersionUID = 1L;
//
// /**
//  * @see HttpServlet#HttpServlet()
//  */
// public Fetch() {
//  super();
//  // TODO Auto-generated constructor stub
// }
//
// /**
//  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//  *      response)
//  */
// protected void doGet(HttpServletRequest request, HttpServletResponse response)
//   throws ServletException, IOException {
//  // TODO Auto-generated method stub
//  
//  PrintWriter out = response.getWriter();
//  response.setContentType("application/json"); 
//  Crud fetchdata=new Crud();
//    
//  ArrayList<Students> data = fetchdata.getData(); //System.out.println(data);
//  
//  Gson gson = new Gson();
////    Builder().setPrettyPrinting().create(); 
//  String respData = gson.toJson(data);
//   
//  out.write(respData);
////  out.print("Hello world");
// }
//
// /**
//  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//  *      response)
//  */
// protected void doPost(HttpServletRequest request, HttpServletResponse response)
//   throws ServletException, IOException {
//  // TODO Auto-generated method stub
//  doGet(request, response);
// }
//
//}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.crud.Crud;
import com.pojo.Students;

/**
 * Servlet implementation class Fetch
 */
@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Fetch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("application/json"); 
		Crud fetchdata=new Crud();
		  
		ArrayList<Students> data = fetchdata.getData(); //System.out.println(data);
		
		Gson gson = new Gson();
//				Builder().setPrettyPrinting().create(); 
		String respData = gson.toJson(data);
		// CORS Policy issue ----
		response.setHeader("Access-Control-Allow-Origin", "*");
		out.write(respData);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}