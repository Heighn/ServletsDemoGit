package nl.getthere.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int counter = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Hello, World!!!");
		counter++;
		response.getWriter().append("Counter:" + counter);
		response.getWriter().append("");
		if(Math.random() < 0.5){
			response.getWriter().append("LEFT");
		}else{
			response.getWriter().append("RIGHT");
		}
	}
	static void reset(){
		counter = 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
