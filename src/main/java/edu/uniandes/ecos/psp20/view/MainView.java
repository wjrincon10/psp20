/*
 * Paquete que representa la vista
 */
package edu.uniandes.ecos.psp20.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Clase para representar la vista
 * @author Wilman Rincon
 */
public class MainView {
    /*
    metodo para visualizar el formulario inicial
    */
     public static void showHome(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP 2.0 Program!</h1>");
        
         pw.write("<form action=\"calc\" method=\"post\"> \n" +
                "    Ingrese X: <input type=\"text\" name=\"calcx\">\n" +
                "    Ingrese Dof: <input type=\"text\" name=\"calcy\">\n" +
                "    <input type=\"submit\" value=\"Calc\">\n" +
                "</form> ");
        pw.write("</html>");

    }
    
     /*
     Metodo para escribir el resultado
     */
    public static void showResults(HttpServletRequest req, HttpServletResponse resp,  Double valX, Double valY, Double result)
            throws ServletException, IOException {
        resp.getWriter().println("<b>X:</b> "+valX +"<br>");
        resp.getWriter().println("<b>Dof:</b> "+valY +"<br>");
        resp.getWriter().println("<b>P:</b> "+ result + "<br>");
        //resp.getWriter().println("<b>STD: </b> "+stdDev + "<br>");
    }
    
    /*
    Metodo para escribir un error de la aplicacion
    */
    public static void error(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("Error!!!");
    }
}
