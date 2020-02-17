package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import comands.InfoMail;


//@WebServlet("/Mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	System.out.println("teste");
     /*   response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); */
        
        String to = request.getParameter("to");
        String subject = request.getParameter("subject");
        String message =  request.getParameter("message");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        InfoMail.send(to,subject, message, user, pass);
        System.out.println("Mail send successfully"); 
    }   
}