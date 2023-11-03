package com.model;

import com.controller.ControllerDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account extends ControllerDatabase{
    public String namaPengguna, password,userId;

    public Account(String userId, String password,String namaPengguna) {
        this.userId = userId;
        this.password = password;
        this.namaPengguna = namaPengguna;
    } 

    public String getUserId() {
        return userId;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void executeUpdateQuery(String query) throws SQLException {
        super.executeUpdateQuery(query);
    }

    @Override
    public ResultSet executeSelectQuery(String qq) throws SQLException {
        return super.executeSelectQuery(qq); 
    }
    
}