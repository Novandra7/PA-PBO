package com.model;

import com.controller.ControllerDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class Member extends Account{
    
    private String statusMember;
    protected static ResultSet values;
    static final ControllerDatabase db = new ControllerDatabase();

    public Member(String statusMember,String userId, String password, String namaPengguna) {
        super(userId, password, namaPengguna);
        this.statusMember = statusMember;
        
    }

    public String getStatusMember() {
        return statusMember;
    }

    public void setStatusMember(String statusMember) {
        this.statusMember = statusMember;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getNamaPengguna() {
        return super.getNamaPengguna();
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }
    
    public static ResultSet getMemberAccount(String query) throws SQLException{
        values = db.executeSelectQuery(query);
        return values;
    }
    
    public static void setMemberAccount(String query) throws SQLException{
        db.executeUpdateQuery(query);
    }
}