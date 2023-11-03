package com.model;

import com.controller.ControllerDatabase;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class Admin extends Account{
    
    protected final String noTelp;
    protected static ResultSet values;
    static final ControllerDatabase db = new ControllerDatabase();

    public Admin(String noTelp, String userId, String password, String namaPengguna) {
        super(userId, password, namaPengguna);
        this.noTelp = noTelp;
    }

    public static ResultSet getAdminAccount(String query) throws SQLException{
        values = db.executeSelectQuery(query);
        return values;
    }
}
//    private void setAdminAccount(String query) throws SQLException{
//        db.executeUpdateQuery(query);
//    }
//}
