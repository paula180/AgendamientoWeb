/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import config.Conexion;
import entidad.Agendar;
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
public class ControladorAgendar {
    
     Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView modelAndView =  new ModelAndView();
    List datos;
    
    int id;
    
    @RequestMapping("agendar.htm")
    public ModelAndView agendar(){
        
        String sqlSalon = "select * from salon";
        List datosSalon = this.jdbcTemplate.queryForList(sqlSalon);
        modelAndView.addObject("listaSalones", datosSalon);
       
        
        String sqlCurso = "select * from cursos";
        List datosCurso = this.jdbcTemplate.queryForList(sqlCurso);
        modelAndView.addObject("listaCursos", datosCurso);
        
        String sql = "select case when  DATE_FORMAT(NOW(),'%Y-%m-%d')< agendar.fecha then 0 when  DATE_FORMAT(NOW(),'%Y-%m-%d') > agendar.fecha then 1 else 2  end as estado, "
                + "agendar.* ,cursos.docente as nombredocente,cursos.estudiante as nombreestudiante, salon.salon as nombresalon,cursos.curso as nombrecurso from agendar \n" +
                     "inner join cursos on cursos.id =agendar.curso\n" +
                     "inner join salon on salon.id=agendar.salon";
        datos = this.jdbcTemplate.queryForList(sql); 
        
        
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("agendar");
        
        return modelAndView;
    }
    
    @RequestMapping(value = "agendarsalon.htm", method = RequestMethod.GET)
    public ModelAndView agendarsalon(){
        modelAndView.addObject(new Agendar());
        modelAndView.setViewName("agendarsalon");
        return modelAndView;
    }
 
    @RequestMapping(value = "agendarsalon.htm", method = RequestMethod.POST)
    public ModelAndView agregaragenda(Agendar agendar){
        
        //VAlIDAR REGISTROS
        String query = "select * from agendar WHERE Fecha="+ agendar.getFecha() +" AND Salon="+ agendar.getSalon() +" AND Horainicio>= '"+agendar.getHorainicio()+"' AND Horafinal>='"+ agendar.getHorafinal()+"'";
        List datosExiste = this.jdbcTemplate.queryForList(query);
        
        if (datosExiste.isEmpty()) {
            
            String sql = "insert into agendar (Codigo, Salon, Curso, Docente, Estudiante, Fecha,Horainicio,Horafinal) values (?,?,?,?,?,?,?,?)";
            this.jdbcTemplate.update(sql, agendar.getCodigo(), agendar.getSalon(), agendar.getCurso(), agendar.getDocente(), agendar.getEstudiante(), agendar.getFecha(), agendar.getHorainicio(), agendar.getHorafinal());
            
            return new ModelAndView("redirect:/agendar.htm");    
            
        } else {
         
            modelAndView.addObject("data", datosExiste);
            modelAndView.addObject("error", "Ya se encuentra agendado el salon");
            return new ModelAndView("redirect:/agendarsalon.htm");
  
        }
        
       
        
    }
    @RequestMapping(value="editaragenda.htm", method = RequestMethod.GET)
    public ModelAndView EditarAgenda(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from agendar where id = " + id;
        datos = this.jdbcTemplate.queryForList(sql);
        modelAndView.addObject("lista", datos);
        modelAndView.setViewName("editaragenda");
        return modelAndView;
    }
    
 
    @RequestMapping(value = "editaragenda.htm", method = RequestMethod.POST)
    public ModelAndView editaragenda(Agendar agendar){
       
        String sql = "update agendar set Codigo=?, Salon=?, Curso=?, Docente=?, Estudiante=?, Fecha=?, Horainicio=?, Horafinal=? where id=?";
        this.jdbcTemplate.update(sql, agendar.getCodigo(), agendar.getSalon(), agendar.getCurso(),agendar.getDocente(),agendar.getEstudiante(), agendar.getFecha(),agendar.getHorainicio(),agendar.getHorafinal(),agendar.getId());
        return new ModelAndView("redirect:/agendar.htm");
    }
    @RequestMapping(value = "eliminaragenda.htm", method = RequestMethod.GET)
    public ModelAndView eliminaragenda(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from agendar where id = " + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/agendar.htm");
    }
    
}