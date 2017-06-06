package fr.ibformation.springboot.bataillenavale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;

@Controller
public class ConnectionController {
	
	
@Autowired
private Joueur joueur;

@RequestMapping("/login")
public ModelAndView login(){
	ModelAndView mav = new ModelAndView();   	
	mav.addObject("joueur", joueur.getNomJoueur());
    return mav;
}



}

}
