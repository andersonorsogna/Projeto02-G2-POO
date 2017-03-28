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
@WebServlet(name = "JurossimplesServlet", urlPatterns = {"/js.html"})
public class JurossimplesServlet extends HttpServlet {

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
            out.println("<title> :: Juros Simples ::</title>");            
            out.println("</head>");
            out.println("<body>");
           
                float j = 0;
                
                int c = 0;
                try{ c = Integer.parseInt(request.getParameter("c"));
                }catch(Exception ex){}
                
                int t = 0;
                try{ t = Integer.parseInt(request.getParameter("t"));
                }catch(Exception ex){}
                
                int n = 0;
                try{ n = Integer.parseInt(request.getParameter("n"));
                }catch(Exception ex){}
                j = c*( +(t*n));
                float m = j/100 + c;
            
            out.println("<center>");
           
            out.println("<h1>");
            out.println("<img src='Img/icon-fin-pb.jpg' width='30' height='30'/>");
            
            out.println("Juros Simples");
            out.println("</h1>");
            
            out.println("</center>");
            
            out.println("<fieldset>");
            out.println("<legend>Juros Simples</legend>");
            out.println("<form>");
            
            out.println("<p>");
            
            out.println("<Table>");
                                
            out.println("<tr>");
            out.println("<td align=right>");
            out.println("<label>Capital (R$):</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='c' value='"+c+"'/>");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=right>");
            out.println("<label>Taxa de Juros (%):</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='t' value='"+t+"'/>");
            
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=right>");
            out.println("<label>Número de Períodos (Meses):</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='n' value='"+n+"'/>");
            out.println("</td>");
            out.println("</tr>");
            
            
            
            out.println("<tr>");
            out.println("<td colspan='3' align=center>");
            out.println("<p><input type='submit' value='Calcular'/>");
            //t = t/100;
            //c = c * t * n;
            //j = c;
            
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Valor do juros:</td>");
           
            out.println("<td>" + "R$ "  + j/100 + "</td>");
            out.println("<td>Total do montante:</td>");
            out.println("<td>" + "R$ " + m + "</td>");
        
            out.println("</tr>");
            
            out.println("</Table>");
            out.println("</form>");
            out.println("</fieldset>");
                        
            out.println("<br/><a href='home.html'><img src='Img/btn-vt.jpg'/></a>");
            
            //for(int i=1; i<=3; i++){
            //out.println("<u>"+j+"</u>");
            //}
            
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
