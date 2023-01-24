package com.xworkz.tetraaa.servalet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=5,urlPatterns="/bubbly")
public class Chocolate extends HttpServlet{
	
	public Chocolate() {
		System.out.println("creating"+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		System.out.println("running doGet in Chocalate");
	}

}
