/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Conexion;
import entidad.Salon;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorSalon {
    
     Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int id;
    
    @RequestMapping("listasalones.htm")
    public ModelAndView listarsalon(){
        String sql = "select * from salon";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listasalones");
        
        return modelAndView;
    }
    @RequestMapping(value = "agregarsalon.htm", method = RequestMethod.GET)
    public ModelAndView agregarsalon(){
        modelAndView.addObject(new Salon());
        modelAndView.setViewName("agregarsalon");
        return modelAndView;
    }
 
    @RequestMapping(value = "agregarsalon.htm", method = RequestMethod.POST)
    public ModelAndView agregarsalon(Salon salon){
        String sql = "insert into salon (Codigo, Salon) values (?,?)";
        this.jdbcTemplate.update(sql, salon.getCodigo(), salon.getSalon());
        return new ModelAndView("redirect:/listasalones.htm");
    }
    @RequestMapping(value="editarsalon.htm", method = RequestMethod.GET)
    public ModelAndView EditarSalon(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from salon where id = " + id;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarsalon");
        return modelAndView;
    }
    
   
    @RequestMapping(value = "editarsalon.htm", method = RequestMethod.POST)
    public ModelAndView editarsalon(Salon salon){
       
        String sql = "update salon set Codigo=?, Salon=? where id=?";
        this.jdbcTemplate.update(sql, salon.getCodigo(), salon.getSalon(), salon.getId());
        return new ModelAndView("redirect:/listasalones.htm");
    }
    @RequestMapping(value = "eliminarsalon.htm", method = RequestMethod.GET)
    public ModelAndView eliminarsalon(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from salon where id = " + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listasalones.htm");
    }
    
}
