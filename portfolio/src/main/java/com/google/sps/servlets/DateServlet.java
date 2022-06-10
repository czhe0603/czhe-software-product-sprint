
package com.google.sps.servlets;

import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that responds with the current date. */
@WebServlet("/date")
public class DateServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    Date date = new Date();
    // display time and date
    String str = String.format("Current Date/Time : %tc", date);    
    response.getWriter().println(str);
  }
}