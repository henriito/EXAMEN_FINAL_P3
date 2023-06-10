
package com.progra2.examen_final_p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionaNeo4j {
    private final String USER = "neo4j";
    private final String PASSWORD = "12345678";
    
    public Connection conexion()
    {
    Connection c = null;
    try{
        Class.forName("org.neo4j.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:neo4j:http://localhost:7474",USER,PASSWORD);
        
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
    return c;
}
}

