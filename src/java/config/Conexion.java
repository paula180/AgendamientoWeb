/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
public class Conexion {
 
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       // dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mvc1?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_mvc1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Bogota");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
 
}
