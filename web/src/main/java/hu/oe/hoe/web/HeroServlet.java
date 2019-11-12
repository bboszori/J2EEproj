package hu.oe.hoe.web;

import hu.oe.hoe.adatok.Hero;
import hu.oe.hoe.adatok.HeroesRepository;
import hu.oe.hoe.adatok.Hybrid;
import hu.oe.hoe.adatok.Species;
import hu.oe.hoe.adatok.SpeciesRepository;
import hu.oe.hoe.adatok.User;
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
@WebServlet(name = "HeroServlet", urlPatterns = {"/newhero"})
public class HeroServlet extends HttpServlet {
    @Inject
    SpeciesRepository speciesRepository;
    
    @Inject
    HeroesRepository heroesRepository;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       User sess = ((User)request.getSession().getAttribute("user"));
        Hero hero = new Hero(request.getParameter("name"),request.getParameter("desc"), sess);
        for(Species sp: speciesRepository.getSpecies()){
            Hybrid nh = new Hybrid(sp, Byte.parseByte(request.getParameter(sp.getName())));
            hero.getHybrid().add(nh);
           
        }
        
        
        hero.setUser(sess);
        heroesRepository.add(hero);
        
        response.getWriter().print("The hero is ready");
        
        
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
