/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Tamagotchi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBConnection {
    private static final String URL = ("jdbc:mysql://localhost:3308/tamagotchi");
    private static final String USER = ("root");
    private static final String PASS = ("");
    
    public static Connection getConnection() {
        try {
            System.out.println("Conexão realizada com êxito.");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException e) {
            System.err.println("Houve um erro ao fazer a conexão.");
            throw new RuntimeException(e);
        }
    }
    
    public static void create(Tamagotchi t) {
        String query = "INSERT INTO tamagotchi(nome, idade, comida, energia, bem_estar) VALUES (?, ?, ?, ?, ?)";
        
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, t.getNome());
            stmt.setInt(2, t.getIdade());
            stmt.setInt(3, t.getComida());
            stmt.setInt(4, t.getEnergia());
            stmt.setInt(5, t.getBem_estar());
            
            stmt.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    public static ArrayList<Tamagotchi> readAll() {
        ArrayList<Tamagotchi> listaTamagotchis = new ArrayList();
        String query = "SELECT * FROM tamagotchi";
        
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                listaTamagotchis.add(new Tamagotchi(rs.getInt("id_tamagotchi"), rs.getString("nome"), rs.getInt("idade"), rs.getInt("comida"), 
                        rs.getInt("energia"), rs.getInt("bem_estar")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return listaTamagotchis;
    }
}