/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp20.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class MainView {
     public static void showHome(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP 2.0 Program!</h1>");
        
         pw.write("<form action=\"calc\" method=\"post\"> \n" +
                "    Ingrese los numeros Lim Inf: <input type=\"text\" name=\"calcx\">\n" +
                "    Ingrese los numeros Lim Sup: <input type=\"text\" name=\"calcy\">\n" +
                 "    Ingrese los numeros Division : <input type=\"text\" name=\"calcz\">\n" +
                "    <input type=\"submit\" value=\"Calc\">\n" +
                "</form> ");
        pw.write("</html>");

    }
    
    public static void showResults(HttpServletRequest req, HttpServletResponse resp,  Double valX, Double valY, Double valZ, Double result)
            throws ServletException, IOException {
        resp.getWriter().println("<b>List X:</b> "+valX +"<br>");
        resp.getWriter().println("<b>List Y:</b> "+valY +"<br>");
        resp.getWriter().println("<b>VS:</b> "+ valZ + "<br>");
        resp.getWriter().println("<b>S:</b> "+ result + "<br>");
        //resp.getWriter().println("<b>STD: </b> "+stdDev + "<br>");
    }
    
    public static void error(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Error!!!");
    }
}
