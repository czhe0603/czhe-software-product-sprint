package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/greeting")
public class JsonServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    ArrayList<String> greetings = new ArrayList<String>();
    greetings.add("Hello!");
    greetings.add("Good evening");
    greetings.add("Good morning");
    int index = (int)(Math.random() * greetings.size());
    response.getWriter().println(greetings.get(index));
  }
}
