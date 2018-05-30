/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lion's Life
 */
public class session extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out=response.getWriter();
       HttpSession s=request.getSession();
       String fname=request.getParameter("fname");
       String lname=request.getParameter("lname");
       s.setAttribute(fname,lname);
       out.println("welcome"+fname+":"+lname);
       out.println("creation time"+s.getCreationTime());
       out.println("last acces time"+s.getLastAccessedTime());
       out.println("max inactive"+s.getMaxInactiveInterval());
    }

}