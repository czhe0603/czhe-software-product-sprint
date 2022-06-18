package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/greeting")
public class greetingServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> greetings = new ArrayList<String>();
    greetings.add("Hello!");
    greetings.add("Good evening");
    greetings.add("Good morning");
    Gson gson = new Gson(); 
    String json = gson.toJson(greetings); 
    
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}