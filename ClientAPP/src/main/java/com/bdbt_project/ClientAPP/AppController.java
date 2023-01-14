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
    public class DashboardController
    {
        @RequestMapping("/")
        public String viewHomePage(Model model){

            return "index";
        }

        @RequestMapping("/login")
        public String showLogin(Model model){
            return "login";
        }

        @RequestMapping("/index")
        public String showIndex(Model model){
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
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/main_user/1";
            }
            else
            {
                return "redirect:/index";
            }
        }
        @RequestMapping(value={"/main_admin"})
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

        @RequestMapping(value={"/emp_management"})
        public String showEmpManagementPage(Model model) {
            List<Pracownicy> listPracownicy = daoPracownicy.list();
            model.addAttribute("listPracownicy", listPracownicy);
            return "admin/emp_management";
        }

        @RequestMapping(value={"/new"})
        public String showNewEmpPage(Model model) {
            Pracownicy pracownicy = new Pracownicy();
            model.addAttribute("pracownicy", pracownicy);
            return "admin/new_form";
        }

//        @RequestMapping(value = "/new_stop")
//        public String showNewStopPage(Model model) {
//            Stop przystanek = new Stop();
//            model.addAttribute("przystanek", przystanek);
//
//            return "admin/new_stop_form";
//        }
//
//        @RequestMapping(value = "/new_route")
//        public String showNewRoutePage(Model model) {
//            Trasy linia = new Trasy();
//            model.addAttribute("linia", linia);
//
//            return "admin/new_route_form";
//        }

//        @RequestMapping(value = "/new_stop_on_route")
//        public String showNewStopOnRouteForm(Model model) {
//            PrzystankiNaLinii przystankiNaLinii = new PrzystankiNaLinii();
//            model.addAttribute("przystankiNaLinii", przystankiNaLinii);
//
//            return "admin/new_stop_on_route_form";
//        }

//        @RequestMapping(value = "/inspect_route/{idLinii}/new_stop_on_route")
//        public ModelAndView showNewStopOnRoutePage(Model model, @PathVariable(name = "idLinii") int id) {
//            ModelAndView mav = new ModelAndView("admin/new_stop_on_route_form");
//            List<Stop> listStop = daoStop.list();
//            model.addAttribute("listStop", listStop);
//
//            List<Stop> listTypePrzystanek = daoStop.listType(daoTrasy.get(id).getRodzajLinii());
//            model.addAttribute("listTypePrzystanek", listTypePrzystanek);
//
//            Trasy linia = daoTrasy.get(id);
//            mav.addObject("linia", linia);
//
//            return mav;
//        }

//        @RequestMapping(value="/inspect_route/{idLinii}/save_przystanek_na_linii", method = RequestMethod.POST)
//        public String saveStopOnRoute(@PathVariable(name = "idLinii") int idLinii, @RequestParam(name = "idPrzystanku") int idPrzystanku) {
//            System.out.println("idLinii: " + idLinii);
//            System.out.println("idPrzystanku" + idPrzystanku);
//
//            Kolejnosci przystanek = new Kolejnosci(idPrzystanku, idLinii);
//
//            daoKolejnosci.saveKolejnosci(przystanek);
//
//            return "redirect:/inspect_route/{idLinii}";
        }

        @RequestMapping(value="/save", method = RequestMethod.POST)
        public String saveEmp(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
            daoPracownicy.save(pracownicy);

            return "redirect:/emp_management";
        }

        @RequestMapping(value = "/choose_route_type")
        public String showChooseRouteTypePage() {
            return "user/choose_route_type";
        }

//        @RequestMapping(value="/savePrzystanek", method = RequestMethod.POST)
//        public String saveStop(@ModelAttribute("przystanek") Stop przystanek) {
//            daoStop.saveStop(przystanek);
//
//            return "redirect:/stops_list";
//        }

//        @RequestMapping(value="/save_linia", method = RequestMethod.POST)
//        public String saveLinia(@RequestParam boolean czyAktywna, @RequestParam char rodzajLinii, @RequestParam int idBazy) {
//            System.out.println(czyAktywna);
//            System.out.println(rodzajLinii);
//            System.out.println(idBazy);
//
//            Trasy linia = new Trasy(czyAktywna, rodzajLinii, idBazy);
//
//            daoTrasy.saveTrasy(linia);
//
//            return "redirect:/routes_list";
//        }
//
        @RequestMapping("/edit/{Nr_pracownika}")
        public ModelAndView showEditEmpPage(@PathVariable(name = "Nr_pracownika") int Nr_pracownika) {
            ModelAndView mav = new ModelAndView("admin/edit_form");
            Pracownicy pracownicy = daoPracownicy.get(Nr_pracownika);
            mav.addObject("pracownicy", pracownicy);

            return mav;
        }

        @RequestMapping("/edit_user_data/{Nr_klienta}")
        public ModelAndView showEditUserDataPage(@PathVariable(name = "Nr_klienta") int Nr_klienta) {
            ModelAndView mav = new ModelAndView("user/edit_user_data_form");

            Klient klient = daoKlient.get(Nr_klienta);
            mav.addObject("klient", klient);

            return mav;
        }

//        @RequestMapping("/edit_stop/{idPrzystanku}")
//        public ModelAndView showEditStopPage(@PathVariable(name = "idPrzystanku") int id) {
//            ModelAndView mav = new ModelAndView("admin/edit_stop_form");
//            Stop przystanek = daoStop.get(id);
//            mav.addObject("przystanek", przystanek);
//
//            return mav;
//        }

//        @RequestMapping("/edit_route/{idLinii}")
//        public ModelAndView showEditRoutePage(@PathVariable(name = "idLinii") int id) {
//            ModelAndView mav = new ModelAndView("admin/edit_route_form");
//            Trasy linia = daoTrasy.get(id);
//            mav.addObject("linia", linia);
//
//            return mav;
//        }

//        @RequestMapping("/inspect_route/{idLinii}")
//        public ModelAndView showInspectRoutePage(Model model, @PathVariable(name = "idLinii") int id) {
//            ModelAndView mav = new ModelAndView("admin/inspect_route");
//            Trasy linia = daoTrasy.get(id);
//            mav.addObject("linia", linia);
//
//            List<Kolejnosci> listPrzystankiNaLinii = daoKolejnosci.list(id);
//            model.addAttribute("listPrzystankiNaLinii", listPrzystankiNaLinii);
//
//            return mav;
//        }
//
//        @RequestMapping("/inspect_route_user/{idLinii}")
//        public ModelAndView showInspectRouteUserPage(Model model, @PathVariable(name = "idLinii") int id) {
//            ModelAndView mav = new ModelAndView("user/inspect_route_user");
//            Trasy linia = daoTrasy.get(id);
//            mav.addObject("linia", linia);
//
//            List<Kolejnosci> listPrzystankiNaLinii = daoKolejnosci.list(id);
//            model.addAttribute("listPrzystankiNaLinii", listPrzystankiNaLinii);
//
//            return mav;
//        }

//        @RequestMapping("/choose_route_type/{rodzajLinii}")
//        public String showRoutesTypePage(Model model, @PathVariable (name = "rodzajLinii") char rodzajLinii) {
//            List<Trasy> listLiniaType = daoTrasy.listType(rodzajLinii);
//            model.addAttribute("listLiniaType", listLiniaType);
//
//            return "user/routes_list_type";
//        }
//
        @RequestMapping(value="/update", method = RequestMethod.POST)
        public String updateEmp(@ModelAttribute("pracownik") Pracownicy pracownicy) {
            daoPracownicy.update(pracownicy);

            return "redirect:/emp_management";
        }

//        @RequestMapping(value="/update_stop", method = RequestMethod.POST)
//        public String updateStop(@ModelAttribute("przystanek") Stop przystanek) {
//            daoStop.update(przystanek);
//
//            return "redirect:/stops_list";
//        }

//        @RequestMapping(value="/update_route", method = RequestMethod.POST)
//        public String updateRoute(@ModelAttribute("linia") Trasy linia) {
//            daoTrasy.update(linia);
//
//            return "redirect:/routes_list";
//        }

//        @RequestMapping(value = "/update_user_data", method = RequestMethod.POST)
//        public String updateUserData(@ModelAttribute("klient") Klient klient) {
//            daoKlient.update(klient);
//
//            String idString = Integer.toString(klient.getIdKlienta());
//
//            return "redirect:/main_user/" + idString;
//        }
//
        @RequestMapping("/delete/{Nr_pracownika}")
        public String deleteEmp(@PathVariable(name = "Nr_pracownika") int Nr_pracownika) {
            daoPracownicy.delete(Nr_pracownika);

            return "redirect:/emp_management";
        }

//        @RequestMapping("/delete_stop/{idPrzystanku}")
//        public String deleteStop(@PathVariable(name = "idPrzystanku") int id) {
//            daoStop.deleteStop(id);
//
//            return "redirect:/stops_list";
//        }

        @RequestMapping("/delete_route/{idLinii}")
        public String deleteRoute(@PathVariable(name = "idLinii") int id) {
            daoTrasy.delete(id);

            return "redirect:/routes_list";
        }

//        @RequestMapping("/inspect_route/{idLinii}/delete_stop_from_route/{idPrzystanku}")
//        public String deleteStopFromRoute(@PathVariable(name = "idPrzystanku") int idPrzystanku, @PathVariable(name = "idLinii") int idLinii) {
//            daoKolejnosci.deletePrzystanekNaLinii(idPrzystanku);
//            String idLiniiString = Integer.toString(idLinii);
//            return "redirect:/inspect_route/" + idLiniiString;
//        }

//        @RequestMapping(value={"/routes_management"})
//        public String showRoutesManagementPage(Model model) { return "admin/routes_management"; }
//
//        @RequestMapping(value={"/stops_list"})
//        public String showStopsListPage(Model model) {
//            List<Stop> listPrzystanek = daoStop.list();
//            model.addAttribute("listPrzystanek", listPrzystanek);
//
//            return "admin/stops_list";
//        }

//        @RequestMapping(value={"/routes_list"})
//        public String showRoutesListPage(Model model) {
//            List<Trasy> listLinia = daoTrasy.list();
//            model.addAttribute("listLinia", listLinia);
//
//            return "admin/routes_list";
//        }
//
//        @RequestMapping(value={"/vehicles_management"})
//        public String showVehiclesManagementPage(Model model) { return "admin/vehicles_management"; }


    }



