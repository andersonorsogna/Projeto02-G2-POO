/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aline
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home.html"})
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> :: Juros Simples | Juros Composto ::</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<center>");
            
            out.println("<h1>");
            out.println("<img src='Img/icon-fin-pb.jpg' width='30' height='30'/>");
            out.println("Juros Simples - Juros Composto");
            out.println("</h1>");
            
            out.println("<Table width='920'>");
                        
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Integrantes:</b> <br/><br/>-Anderson Orsogna Esteves<br/>-André Tripode Colognesi<br/>-João Augusto V. Viana<br/>-Raul G. P. G. da Silva<br/>");
            out.println("</td>");
            out.println("<td width='620'>");
            out.println("<img src='Img/financeiro022.jpg' width='620' height='350'/>");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<h2>Aplicação</h2><br/><br/>"
                    + "<u><b>Juros Simples:</u></b><br/>"
                    + "O regime de juros será simples quando o percentual de juros incidir apenas sobre o valor principal. Sobre os juros gerados a cada período não incidirão novos juros. Valor Principal ou simplesmente principal é o valor inicial emprestado ou aplicado, antes de somarmos os juros.<br/>"
                    + "<u><b>Juros Composto:</u></b><br/>"
                    + "O regime de juros compostos é o mais comum no sistema financeiro e portanto, o mais útil para cálculos de problemas do dia-a-dia. Os juros gerados a cada período são incorporados ao principal para o cálculo dos juros do período seguinte.");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td colspan='2'>");
            out.println("<a href='js.html'><img src='Img/btn-js.jpg'/></a>");
            out.println("<a href='jc.html'><img src='Img/btn-jc.jpg'/></a>");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("</Table>");
            
            out.println("</center>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
