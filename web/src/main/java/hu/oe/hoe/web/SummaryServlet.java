package hu.oe.hoe.web;

import hu.oe.hoe.adatok.EmpireRepository;
import hu.oe.hoe.adatok.HeroesRepository;
import hu.oe.hoe.adatok.SpeciesRepository;
import hu.oe.hoe.adatok.UserRepository;
import java.io.IOException;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javaee
 */
@WebServlet(name = "SummaryServlet", urlPatterns = {"/summary"})
public class SummaryServlet extends HttpServlet {
    
    @Inject
    UserService userservice;
    
    @Inject
    SpeciesRepository speciesRepository;
    
    @Inject
    HeroesRepository heroesRepository;
    
    @EJB
    EmpireService empireservice;
       
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String button_param = request.getParameter("button");
            RequestDispatcher rd = null;

           
            request.setAttribute("heroes", heroesRepository.getHeroes());
            //request.setAttribute("heroes", empireservice.getEmpires());
            if (button_param == "Uj hos letrehozasa")
            {
                rd = request.getRequestDispatcher("/newhero.jsp");
            }
            else
            {
                rd = request.getRequestDispatcher("/newempire.jsp");
            }
            rd.forward(request, response);

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
