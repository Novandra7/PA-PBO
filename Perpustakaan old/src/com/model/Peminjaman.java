package com.model;

import com.controller.ControllerDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class Peminjaman {
    
    protected final String idPeminjaman, userId, kodeBuku, tanggalPeminjaman;
    protected final Object idKaryawan;
    protected static ResultSet values;
    static final ControllerDatabase db = new ControllerDatabase();

    public Peminjaman(String idPeminjaman, String userId, String kodeBuku, String tanggalPeminjaman,Object idKaryawan) {
        this.idPeminjaman = idPeminjaman;
        this.userId = userId;
        this.kodeBuku = kodeBuku;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.idKaryawan = idKaryawan;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getUserId() {
        return userId;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public Object getIdKaryawan() {
        return idKaryawan;
    }
    public static ResultSet getPeminjaman(String query) throws SQLException{
        values = db.executeSelectQuery(query);
        return values;
    }
    
    public static void setPeminjaman(String query) throws SQLException{
        db.executeUpdateQuery(query);
    }
}
