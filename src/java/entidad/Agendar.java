/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author PROPIETARIO
 */
public class Agendar {
    private int id;
    private String codigo;
    private String salon;
    private String curso;
    private String docente;
    private String estudiante;
    private String fecha;
    private String horainicio;
    private String horafinal;
    
    
 
    public Agendar() {
    }
 
    public Agendar(int id, String codigo, String salon,String curso, String docente, String estudiante, String fecha,String horainicio,String horafinal) {
        this.id = id;
        this.codigo = codigo;
        this.salon = salon;
        this.curso = curso;
       this.docente = docente;
       this.estudiante = estudiante;
       this.fecha = fecha;
       this.horainicio = horainicio;
       this.horafinal = horainicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

}
