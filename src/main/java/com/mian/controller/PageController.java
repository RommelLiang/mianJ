package com.mian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * com.mian.controller
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/17.
 */
@Controller
public class PageController {
    //no
    @RequestMapping(value = "/appoint_interface",method = RequestMethod.GET)
    public ModelAndView appoint_interface() {
        ModelAndView modelAndView = new ModelAndView("appoint_interface");
        return modelAndView;
    }

    //ok
    @RequestMapping(value = "/baed_dlc",method = RequestMethod.GET)
    public ModelAndView baed_dlc() {
        ModelAndView modelAndView = new ModelAndView("baed_dlc");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/baed_wdl",method = RequestMethod.GET)
    public ModelAndView baed_wdl() {
        ModelAndView modelAndView = new ModelAndView("baed_wdl");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/baed_wdy",method = RequestMethod.GET)
    public ModelAndView baed_wdy() {
        ModelAndView modelAndView = new ModelAndView("baed_wdy");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/demand_admin",method = RequestMethod.GET)
    public ModelAndView demand_admin() {
        ModelAndView modelAndView = new ModelAndView("demand_admin");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/demand_admin_close",method = RequestMethod.GET)
    public ModelAndView demand_admin_close() {
        ModelAndView modelAndView = new ModelAndView("demand_admin_close");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/demand_collect",method = RequestMethod.GET)
    public ModelAndView demand_collect() {
        ModelAndView modelAndView = new ModelAndView("demand_collect");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/demand_person_ctr",method = RequestMethod.GET)
    public ModelAndView demand_person_ctr() {
        ModelAndView modelAndView = new ModelAndView("demand_person_ctr");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/demand_serch",method = RequestMethod.GET)
    public ModelAndView demand_serch() {
        ModelAndView modelAndView = new ModelAndView("demand_serch");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/evaluate",method = RequestMethod.GET)
    public ModelAndView evaluate() {
        ModelAndView modelAndView = new ModelAndView("evaluate");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/gappointment",method = RequestMethod.GET)
    public ModelAndView gappointment() {
        ModelAndView modelAndView = new ModelAndView("gappointment");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/gpay",method = RequestMethod.GET)
    public ModelAndView gpay() {
        ModelAndView modelAndView = new ModelAndView("gpay");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/gperson",method = RequestMethod.GET)
    public ModelAndView gperson() {
        ModelAndView modelAndView = new ModelAndView("gperson");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/gperson_chg",method = RequestMethod.GET)
    public ModelAndView gperson_chg() {
        ModelAndView modelAndView = new ModelAndView("gperson_chg");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/gu",method = RequestMethod.GET)
    public ModelAndView gu() {
        ModelAndView modelAndView = new ModelAndView("gu");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/gwith",method = RequestMethod.GET)
    public ModelAndView gwith() {
        ModelAndView modelAndView = new ModelAndView("gwith");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/head_chg",method = RequestMethod.GET)
    public ModelAndView head_chg() {
        ModelAndView modelAndView = new ModelAndView("head_chg");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/list_demond",method = RequestMethod.GET)
    public ModelAndView list_demond() {
        ModelAndView modelAndView = new ModelAndView("list_demond");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/m_appointment",method = RequestMethod.GET)
    public ModelAndView m_appointment() {
        ModelAndView modelAndView = new ModelAndView("m_appointment");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/m_appointment_j",method = RequestMethod.GET)
    public ModelAndView m_appointment_j() {
        ModelAndView modelAndView = new ModelAndView("m_appointment_j");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/m_appointment_shouzhi",method = RequestMethod.GET)
    public ModelAndView m_appointment_shouzhi() {
        ModelAndView modelAndView = new ModelAndView("m_appointment_shouzhi");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/notice",method = RequestMethod.GET)
    public ModelAndView notice() {
        ModelAndView modelAndView = new ModelAndView("notice");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/orderpay",method = RequestMethod.GET)
    public ModelAndView orderpay() {
        ModelAndView modelAndView = new ModelAndView("orderpay");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/orderpay_chg",method = RequestMethod.GET)
    public ModelAndView orderpay_chg() {
        ModelAndView modelAndView = new ModelAndView("orderpay_chg");
        return modelAndView;
    }
    //no
    @RequestMapping(value = "/private",method = RequestMethod.GET)
    public ModelAndView privates() {
        ModelAndView modelAndView = new ModelAndView("private");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/release",method = RequestMethod.GET)
    public ModelAndView release() {
        ModelAndView modelAndView = new ModelAndView("release");
        return modelAndView;
    }
    //ok
    @RequestMapping(value = "/require_list",method = RequestMethod.GET)
    public ModelAndView require_list() {
        ModelAndView modelAndView = new ModelAndView("require_list");
        return modelAndView;
    }

    @RequestMapping(value = "/withdrawals",method = RequestMethod.GET)
    public ModelAndView withdrawals() {
        ModelAndView modelAndView = new ModelAndView("withdrawals");
        return modelAndView;
    }
}
