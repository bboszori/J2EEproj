package hu.oe.hoe.web;

import hu.oe.hoe.adatok.Asset;
import hu.oe.hoe.adatok.AssetRepository;
import hu.oe.hoe.adatok.Empire;
import hu.oe.hoe.adatok.People;
import hu.oe.hoe.adatok.PeopleRepository;
import hu.oe.hoe.adatok.Population;
import hu.oe.hoe.adatok.Stock;
import hu.oe.hoe.adatok.User;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EmpireServlet", urlPatterns = {"/newempire"})
public class EmpireServlet extends HttpServlet {
    @Inject
    AssetRepository assetrepository;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Empire empire = new Empire(request.getParameter("name"));
        for(Asset asset: assetrepository.getAssets()){
            Stock ns = new Stock(asset, Byte.parseByte(request.getParameter(asset.getName())));
            empire.getStocks().add(ns);
           
        }
        for(People ppl: PeopleRepository.instance.getPeople()){
            Population np = new Population(ppl, Byte.parseByte(request.getParameter(ppl.getName())));
            empire.getPopulations().add(np);
           
        }
        
        User sess = ((User)request.getSession().getAttribute("user"));
        sess.getEmpire().add(empire);
        response.getWriter().print("-------");
        
        
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
