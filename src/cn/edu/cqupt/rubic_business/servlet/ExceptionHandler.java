package cn.edu.cqupt.rubic_business.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Title: ExceptionHandler.java
 * 
 * @description:异常处理类，系统任何一个地方抛出异常都会通过web.xml的映射跳转到此，进行处理
 * @author liucx
 * @created 2015-5-23 上午9:57:37
 */
@WebServlet(name = "ExceptionHandler", urlPatterns = "/servlet/ExceptionHandler")
public class ExceptionHandler extends HttpServlet {

	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 *      javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Throwable throwable = (Throwable) request
				.getAttribute("javax.servlet.error.exception");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(throwable.getMessage());
	}
}
