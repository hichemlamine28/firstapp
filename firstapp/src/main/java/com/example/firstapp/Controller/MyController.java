/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.firstapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Hichem
 */
@RestController
public class MyController {
    
@GetMapping("")   
String welcome(){
    
  return ("hello spring maryouma hichem") ;
}
@GetMapping("/Demo")
 ModelAndView spring(){
    
    ModelAndView mv = new ModelAndView("index.html");
            
            return mv;
            }
}
