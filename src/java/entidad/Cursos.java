/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Cursos {
 
    private int id;
    private String codigo;
    private String curso;
    private String docente;
    private String estudiante;
    
 
    public Cursos() {
    }
 
    public Cursos(int id, String codigo, String curso, String docente, String estudiante) {
        this.id = id;
        this.codigo = codigo;
        this.curso = curso;
       this.docente = docente;
       this.estudiante = estudiante;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
