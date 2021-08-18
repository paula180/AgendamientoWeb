/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Salon {
 
    private int id;
    private String codigo;
    private String salon;
    
    
 
    public Salon() {
    }
 
    public Salon(int id, String codigo, String salon) {
        this.id = id;
        this.codigo = codigo;
        this.salon = salon;
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
}
