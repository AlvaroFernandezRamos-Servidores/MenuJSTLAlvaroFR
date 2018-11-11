/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.IOException;
import java.util.Date;
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
@WebServlet(name = "Formatos", urlPatterns = {"/Formatos"})
public class Formatos extends HttpServlet {

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
	Date fecha = new Date();
	Locale idioma = null;
	
	HttpSession sesion = request.getSession();
	
//	Map localeSessionData = (Map) sesion.getAttribute("locale");

//	StringBuilder localeBuilder = new StringBuilder(request.getParameter("seleccionPais"));
//	String localeData = localeBuilder.substring(0,localeBuilder.indexOf("-"));

	String localeData = (String) request.getParameter("seleccionPais").split("-")[0];
	String pais = (String) request.getParameter("seleccionPais").split("-")[1];
	String localeDataLang = localeData.split("_")[0];
	String localeDataLocation = localeData.split("_")[1];
	
	Double numero;
	numero = 1000.00/3;
	
	idioma = new Locale(localeDataLang,localeDataLocation);
	
	sesion.setAttribute("localeString", idioma);
	sesion.setAttribute("fecha", fecha);
	sesion.setAttribute("pais", pais);
	sesion.setAttribute("numero", numero);
	
	request.getRequestDispatcher("/JSP/views/visualizar.jsp").forward(request,response);
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
