package com.bdbt_project.ClientAPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Configuration
public class AppController {
    @Autowired
    private AdresyDAO daoAdresy;
    @Autowired
    private BiletyDAO daoBilety;
    @Autowired
    private KlientDAO daoKlient;

    @Autowired
    private KolejnosciDAO daoKolejnosci;

    @Autowired
    private PocztyDAO daoPoczty;

    @Autowired
    private PojazdyDAO daoPojazdy;

    @Autowired
    private SprzedazeDAO daoSprzedaze;
    @Autowired
    private StopDAO daoStop;

    @Autowired
    private TrasyDAO daoTrasy;

    @Autowired
    private PracownicyDAO daoPracownicy;



    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
    }

    @Controller
    public class DashboardController {
        @RequestMapping("/")
        public String viewHomePage(Model model) {

            return "index";
        }

        @RequestMapping("/login")
        public String showLogin(Model model) {
            return "login";
        }

        @RequestMapping("/index")
        public String showIndex(Model model) {
            return "index";
        }


        @RequestMapping
                ("/main"
                )


        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/main_admin";
            } else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/main_user/1";
            } else {
                return "redirect:/index";
            }
        }

        @RequestMapping(value = {"/main_admin"})
        public String showAdminPage(Model model) {

            return "admin/main_admin";
        }


        @RequestMapping(value = "/main_user/{Nr_klienta}")
        public ModelAndView showUserPage(Model model, @PathVariable(name = "Nr_klienta") int Nr_klienta) {
            ModelAndView mav = new ModelAndView("user/main_user");

            Klient klient = daoKlient.get(Nr_klienta);
            mav.addObject(klient);

            return mav;
        }


        @RequestMapping(value = {"/employees_list"})
        public String showEmpManagementPage(Model model) {
            List<Pracownicy> listPracownicy = daoPracownicy.list();
            model.addAttribute("listPracownicy", listPracownicy);
            return "admin/employees_list";
        }


        @RequestMapping(value = {"/new"})
        public String showNewEmpPage(Model model) {
            Pracownicy pracownicy = new Pracownicy();
            model.addAttribute("pracownicy", pracownicy);
            return "admin/new_employee_form";
        }

        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String saveEmp(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
            daoPracownicy.save(pracownicy);

            return "redirect:/employees_list";
        }

        @RequestMapping("/edit/{Nr_pracownika}")
        public ModelAndView showEditEmpPage(@PathVariable(name = "Nr_pracownika") int nr_pracownika) {
            ModelAndView mav = new ModelAndView("admin/edit_employee_form");
            Pracownicy pracownicy = daoPracownicy.get(nr_pracownika);
            mav.addObject("pracownicy", pracownicy);

            return mav;
        }

        @RequestMapping(value="/update", method = RequestMethod.POST)
        public String updateEmp(@ModelAttribute("pracownik") Pracownicy pracownicy) {
            daoPracownicy.update(pracownicy);

            return "redirect:/employees_list";
        }

        @RequestMapping(value = "/new_stop")
        public String showNewStopPage(Model model) {
            Stop przystanek = new Stop();
            model.addAttribute("przystanek", przystanek);

            return "admin/new_stop_form";
        }


        @RequestMapping(value = "/new_route")
        public String showNewRoutePage(Model model) {
            Trasy linia = new Trasy();
            model.addAttribute("linia", linia);

            return "admin/new_route_form";
        }





        @RequestMapping(value = "/choose_route_or_stop")
        public String showChooseRouteTypePage() {
            return "user/choose_route_or_stop";
        }

      @RequestMapping(value="/savePrzystanek", method = RequestMethod.POST)
        public String saveStop(@ModelAttribute("przystanek") Stop przystanek) {
            daoStop.save(przystanek);

            return "redirect:/stops_list";
        }

               @RequestMapping(value="/save_linia", method = RequestMethod.POST)
   public String saveLinia(@ModelAttribute("trasy") Trasy trasy) {
         daoTrasy.save(trasy);

       return "redirect:/routes_list";
   }

        @RequestMapping("/show_user_data/{Nr_klienta}")

        public ModelAndView showUserDataPage(@PathVariable(name = "Nr_klienta") int Nr_klienta) {
            ModelAndView mav = new ModelAndView("user/show_user_data");

            Klient klient = daoKlient.get(Nr_klienta);
            mav.addObject("klient", klient);

            return mav;
        }


        @RequestMapping("/edit_user_data/{Nr_klienta}")

        public ModelAndView showEditUserDataPage(@PathVariable(name = "Nr_klienta") int Nr_klienta) {
            ModelAndView mav = new ModelAndView("user/edit_user_data_form");

            Klient klient = daoKlient.get(Nr_klienta);
            mav.addObject("klient", klient);

            return mav;
        }

      @RequestMapping("/edit_stop/{nr_przystanku}")
       public ModelAndView showEditStopPage(@PathVariable(name = "nr_przystanku") int nr_przystanku) {
           ModelAndView mav = new ModelAndView("admin/edit_stop_form");
           Stop przystanek = daoStop.get(nr_przystanku);
          mav.addObject("przystanek", przystanek);

          return mav;
      }




       @RequestMapping("/edit_route/{Nr_trasy}")
  public ModelAndView showEditRoutePage(@PathVariable(name = "Nr_trasy") int Nr_trasy) {
          ModelAndView mav = new ModelAndView("admin/edit_route_form");
     Trasy linia = daoTrasy.get(Nr_trasy);
     mav.addObject("linia", linia);

         return mav;
           }

    @RequestMapping(value = "/routes_listu", method = RequestMethod.GET)
        public String showRoutesTypePage(Model model) {
            List<Trasy> listLiniaType = daoTrasy.list();
            model.addAttribute("listLiniaType", listLiniaType);

            return "user/routes_list";
        }
        @RequestMapping(value = "/stop_list", method = RequestMethod.GET)
        public String ShowStopsTypePageUser(Model model) {
            List<Stop> listStop = daoStop.list();
            model.addAttribute("listStop", listStop);

            return "user/stop_list";
        }


    @RequestMapping(value="/update_stop", method = RequestMethod.POST)
       public String updateStop(@ModelAttribute("przystanek") Stop przystanek) {
        daoStop.update(przystanek);

        return "redirect:/stops_list";
    }

      @RequestMapping(value="/update_route", method = RequestMethod.POST)
     public String updateRoute(@ModelAttribute("linia") Trasy linia) {
         daoTrasy.update(linia);

    return "redirect:/routes_list";
   }

              @RequestMapping(value = "/update_user_data", method = RequestMethod.POST)
  public String updateUserData(@ModelAttribute("klient") Klient klient) {
         daoKlient.update(klient);



    return "redirect:/main_user/" + '3';
       }
//
        @RequestMapping("/delete/{Nr_pracownika}")
        public String deleteEmp(@PathVariable(name = "Nr_pracownika") int Nr_pracownika) {
            daoPracownicy.delete(Nr_pracownika);

            return "redirect:/emp_management";
        }



        @RequestMapping("/delete_route/{idLinii}")
        public String deleteRoute(@PathVariable(name = "idLinii") int id) {
            daoTrasy.delete(id);

            return "redirect:/routes_list";
        }

      @RequestMapping(value={"/routes_stops"})
        public String showRoutesManagementPage(Model model) { return "admin/routes_stops"; }
//
       @RequestMapping(value={"/stops_list"})
     public String showStopsListPage(Model model) {
            List<Stop> listPrzystanek = daoStop.list();
          model.addAttribute("listPrzystanek", listPrzystanek);

            return "admin/stops_list";
        }

      @RequestMapping(value={"/routes_list"})
     public String showRoutesListPage(Model model) {
        List<Trasy> listLinia = daoTrasy.list();
           model.addAttribute("listLinia", listLinia);

           return "admin/routes_list";
     }

        @RequestMapping(value = {"/my_tickets"})
        public String showMyTickets(Model model) {
            List<Bilety> listaMoichBiletow = daoBilety.getUserTickets();
            model.addAttribute("listaMoichBiletow", listaMoichBiletow);
            return "user/ticket_list";
        }
        @RequestMapping(value = {"/new_ticket_form"})
        public String NewTicket(Model model) {
            Bilety bilety = new Bilety();
            model.addAttribute("bilety", bilety);
            return "user/new_ticket_form";

        }

        @RequestMapping(value = {"/save_ticket"}, method = RequestMethod.POST)
        public String saveTic(@ModelAttribute("bilety") Bilety bilety) {
            bilety.setNr_klienta(3);
            bilety.setNr_zarzadu(1);

            bilety.setRodzaj_biletu("KWARTALNY");
            bilety.setCzy_ulgowy(false);







            bilety.setCena(200);


            daoBilety.save(bilety);
            return "redirect:/my_tickets";
        }


    }
    }



