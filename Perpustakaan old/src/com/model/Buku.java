package com.model;

import com.controller.ControllerDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class Buku {
    
    protected String kodeBuku, judulBuku, penulisBuku, statusPeminjaman;
    protected static ResultSet values;
    static final ControllerDatabase db = new ControllerDatabase();

    public Buku(String kodeBuku, String judulBuku, String penulisBuku, String statusPeminjaman) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.statusPeminjaman = statusPeminjaman;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulisBuku() {
        return penulisBuku;
    }

    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }
    
    
    public static ResultSet getBuku(String query) throws SQLException{
        values = db.executeSelectQuery(query);
        return values;
    }
    
    public void setBuku(String query) throws SQLException{
        db.executeUpdateQuery(query);
    }
}