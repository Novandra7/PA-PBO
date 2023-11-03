package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ControllerDatabase implements InterfaceDatabase{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public ControllerDatabase(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan","root","");
            st = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NYALAKAN MYSQL DAHULU");
        }
    }
    
    @Override
    public ResultSet executeSelectQuery(String qq) throws SQLException{
        rs = st.executeQuery(qq);
        return rs;
    }
    
    @Override
    public void executeUpdateQuery(String query) throws SQLException{
        st.execute(query);
    }
}