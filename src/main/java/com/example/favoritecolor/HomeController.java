package com.example.favoritecolor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Random;


@Controller
public class HomeController {
    @GetMapping("/questionform")
    public ModelAndView loadForm(Model model){
        model.addAttribute("favoritecolor", new FavoriteColor());
        return new ModelAndView("questionform", "randquestion", randQuestion()) ;
    }

    @PostMapping("/questionform")
    public String processForm(@ModelAttribute FavoriteColor favoritecolor, Model model){
        model.addAttribute("favoritecolor", favoritecolor);
        return "confirmform";
    }

    public String randQuestion(){
        ArrayList<String> question3 = new ArrayList<>();
        question3.add("What is your favorite color?");
        question3.add("What is the airspeed velocity of an unladen swallow?");
        Random rand = new Random();
        int randQuesIndex = rand.nextInt(2);
        String randQues = question3.get(randQuesIndex);
        return randQues;
    }



}
