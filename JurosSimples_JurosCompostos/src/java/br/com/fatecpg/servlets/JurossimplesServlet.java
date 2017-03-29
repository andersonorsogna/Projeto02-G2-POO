/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
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
            out.println("<title> :: Juros Compostos ::</title>");            
            out.println("</head>");
            out.println("<body>");
           
               float c = 0;
                try{ c = Float.parseFloat(request.getParameter("c"));
                }catch(Exception ex){}
                
               float t = 0;
                try{ t = Float.parseFloat(request.getParameter("t"));
                }catch(Exception ex){}
               
               DecimalFormat cj = new DecimalFormat("#.00"); 
               DecimalFormat cm = new DecimalFormat("#.00");
               
               int n = 0;
                try{ n = Integer.parseInt(request.getParameter("n"));
                }catch(Exception ex){}
                Float j = c*( +(t*n));
                Float m = j/100 + c;
            
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
            out.println("<input type='text' name='c' maxlength='20' placeholder='ex:25000'"+c+"'/>");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=right>");
            out.println("<label>Taxa de Juros (%):</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='t' maxlength='20' placeholder='ex:15'"+t+"'/>");
            
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td align=right>");
            out.println("<label>Número de Períodos (Meses):</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' name='n' maxlength='20' placeholder='ex:12'"+n+"'/>");
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
           
            out.println("<td><b>Juros Total (R$): "+ cj.format(j/100) +"</td>");
            
            out.println("<td><b>Montante Total (R$): "+ cm.format(m) +"</td>");
        
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
