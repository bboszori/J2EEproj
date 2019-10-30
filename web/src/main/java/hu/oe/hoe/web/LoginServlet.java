package hu.oe.hoe.web;

import hu.oe.hoe.adatok.LoginException;
import hu.oe.hoe.adatok.SpeciesRepository;
import hu.oe.hoe.adatok.UserRepository;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javaee
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    @Inject
    UserService userservice;
    
    @Inject
    SpeciesRepository speciesRepository;
       
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password =request.getParameter("password");
       
        try{
            request.getSession().setAttribute("user", userservice.login(name, password));
            request.setAttribute("species", speciesRepository.getSpecies());
            getServletContext().getRequestDispatcher("/summary.jsp").include(request, response);
        }
        catch(LoginException e){response.getWriter().print("nem jó bejelenetkezés ");}
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
