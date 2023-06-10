package com.progra2.examen_final_p3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Envio_de_Datos {
    public static void main(String[] args) {
        String codigo = "";
        String codigo2 = "";
        String codigo3 = "";
        
        codigo+= "CREATE (fernanda:person {name:'Fernanda'})";
        codigo2+="match (fernanda:person {name:'Fernanda'}) set fernanda.name = 'Yessica' return fernanda";
        codigo3+="match (fernanda:person {name:'Yessica'}) detach delete fernanda";
        ConexionaNeo4j con = new ConexionaNeo4j();
        Connection cone = con.conexion();
        try{
            PreparedStatement pst = cone.prepareStatement(codigo3);
            pst.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
