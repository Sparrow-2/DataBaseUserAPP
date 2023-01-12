package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.List;

@Controller
public class AppController {
    @Autowired
    private KlientDAO dao;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Klient> listKlient = dao.list();
        model.addAttribute("listKlient", listKlient);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewForm(Model model) {
        Klient klient = new Klient();
        model.addAttribute("klient", klient);

        return "new_form";
    }

}