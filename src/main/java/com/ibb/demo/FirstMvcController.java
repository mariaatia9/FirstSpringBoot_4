/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import com.ibb.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author trainer
 */
@Controller
@RequestMapping(path = "/web")
public class FirstMvcController {
    
     @Autowired 
   private MyService myService;

    public FirstMvcController() {
        System.out.println("Controller erstellt!");
    }
    
    
    
    @GetMapping(path = "/start")
    public ModelAndView lp(){
        ModelAndView m=new ModelAndView();
        m.addObject("personen", myService.serviceListe());
        m.setViewName("listperson.xhtml");
        return m;
    }
    
}
