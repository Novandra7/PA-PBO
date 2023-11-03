package com.model;

import com.controller.ControllerDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class Karyawan {
    
    protected String idKaryawan, namaKaryawan;
    protected Object idPenanggungJawab;
    protected static ResultSet values;
    static final ControllerDatabase db = new ControllerDatabase();

    public Karyawan(String idKaryawan, String namaKaryawan, Object idPenanggungJawab) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.idPenanggungJawab = idPenanggungJawab; 
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public Object getIdPenanggungJawab() {
        return idPenanggungJawab;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public void setIdPenanggungJawab(Object idPenanggungJawab) {
        this.idPenanggungJawab = idPenanggungJawab;
    }
    
    public static ResultSet getKaryawan(String query) throws SQLException{
        values = db.executeSelectQuery(query);
        return values;
    }
    
    public void setkaryawan(String query) throws SQLException{
        db.executeUpdateQuery(query);
    }
}