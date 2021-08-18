/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Conexion;
import entidad.Cursos;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PROPIETARIO
 */
@Controller
public class ControladorCurso {
    
     Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    int id;
    
    @RequestMapping("listarcurso.htm")
    public ModelAndView listarcurso(){
        String sql = "select * from cursos";
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("listarcurso");
        return modelAndView;
    }
    @RequestMapping(value = "agregarcurso.htm", method = RequestMethod.GET)
    public ModelAndView agregarcurso(){
        modelAndView.addObject(new Cursos());
        modelAndView.setViewName("agregarcurso");
        return modelAndView;
    }
 
    @RequestMapping(value = "agregarcurso.htm", method = RequestMethod.POST)
    public ModelAndView agregar(Cursos curso){
        String sql = "insert into cursos (Codigo, Curso, Docente, Estudiante) values (?,?,?,?)";
        this.jdbcTemplate.update(sql, curso.getCodigo(), curso.getCurso(),curso.getDocente(),curso.getEstudiante());
        return new ModelAndView("redirect:/listarcurso.htm");
    }
    @RequestMapping(value="editarcurso.htm", method = RequestMethod.GET)
    public ModelAndView EditarCursos(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from cursos where id = " + id;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editarcurso");
        return modelAndView;
    }
    
   
    @RequestMapping(value = "editarcurso.htm", method = RequestMethod.POST)
    public ModelAndView editarcursos(Cursos curso){
       
        String sql = "update cursos set Codigo=?, Curso=?, Docente=?, Estudiante=? where id=?";
        this.jdbcTemplate.update(sql, curso.getCodigo(), curso.getCurso(),curso.getDocente(),curso.getEstudiante(), curso.getId());
        return new ModelAndView("redirect:/listarcurso.htm");
    }
    @RequestMapping(value = "eliminarcurso.htm", method = RequestMethod.GET)
    public ModelAndView eliminarcurso(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from cursos where id = " + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/listarcurso.htm");
    }
    
}
