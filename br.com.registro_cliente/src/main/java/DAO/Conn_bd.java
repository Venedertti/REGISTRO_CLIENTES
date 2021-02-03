package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import VO.ClienteVO;
import validacao.Valid;

public class Conn_bd {
    Valid valid = new Valid();
    
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/registro_cliente";
        String user = "root";
        String pass = "123456";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet get(){
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM registro_cliente.clientes");
            ResultSet result = stmt.executeQuery();
                               
            System.out.println("ALL RECORDS HAVE BEEN SELECTED!");
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void insert(ClienteVO vo){
        String nome = vo.getNome();
        String numero = vo.getNumero();
        String email = vo.getEmail();
        String cep = vo.getCep();
        java.sql.Date nasci = valid.getSqlDateNasci(vo.getNasci());
        
        String query = "INSERT INTO registro_cliente.clientes(nome, numero, email, cep, dataNasci) values(?,?,?,?,?);";
        
        try{ 
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, nome);
            stmt.setString(2, numero);
            stmt.setString(3, email);
            stmt.setString(4, cep);
            stmt.setDate(5, nasci);
            
            stmt.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
}