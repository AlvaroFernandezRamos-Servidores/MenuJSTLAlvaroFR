/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author atomsk
 */
@WebServlet(name = "Locales", urlPatterns = {"/Locales"})
public class Locales extends HttpServlet {

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
	    Locale locales[] = SimpleDateFormat.getAvailableLocales();
	    Map<String, String> localesMap = new HashMap<>();
	    for(Locale item:locales){
		if(item.getCountry().length() > 0){
		    localesMap.put(item.getDisplayCountry(),(item.getLanguage()+"_"+item.getCountry()));
		    //System.out.println(item.getLanguage()+"_"+item.getCountry() + " : " + item.getDisplayCountry());
		}
	    }
	    
//	    for (Map.Entry<String, String> entry : localesMap.entrySet()) {
//		System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
//	    }
	    HttpSession sesion = request.getSession();
	    sesion.setAttribute("locales" , localesMap);
	    //Hay que pasar el idioma como un objeto Locale
	    request.getRequestDispatcher("/JSP/views/showLocales.jsp").forward(request,response);
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
