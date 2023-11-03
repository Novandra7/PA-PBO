package com.controller;

import com.model.Buku;
import com.model.Karyawan;
import com.model.Peminjaman;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class ControllerAdmin {
    
    final static ArrayList<Object> dataBukudanKaryawandanPeminjaman = new ArrayList<>();
    final static ArrayList<Peminjaman> dataPeminjaman = new ArrayList<>();
    
    public static ArrayList<Object> createTableContent(String tableName) throws SQLException{
        dataBukudanKaryawandanPeminjaman.clear();
        ResultSet values = Buku.getBuku("SELECT * FROM "+tableName);
        if (tableName.equals("buku")) {
            while (values.next()) {
                String kodeBuku = values.getString("kode_buku");
                String judulBuku = values.getString("judul_buku");
                String penulisBuku = values.getString("penulis_buku");
                String statusPeminjaman = values.getString("status_peminjaman");
                dataBukudanKaryawandanPeminjaman.add(new Buku(kodeBuku, judulBuku, penulisBuku, statusPeminjaman));
           
            }return dataBukudanKaryawandanPeminjaman;
        }else if (tableName.equals("karyawan")) {
            while(values.next()){
                String idKaryawan = values.getString("id_karyawan");
                String namaKaryawan = values.getString("nama_karyawan");
                String idKaryawanPenanggungJawab = values.getString("id_karyawan_penanggungjawab");
                dataBukudanKaryawandanPeminjaman.add(new Karyawan(idKaryawan, namaKaryawan, idKaryawanPenanggungJawab));
           
            }return dataBukudanKaryawandanPeminjaman;
        }else if (tableName.equals("peminjaman")) {
            while(values.next()){
                String idPeminjaman = values.getString("id_peminjaman");
                String userId = values.getString("user_id");
                String kodeBuku = values.getString("kode_buku");
                String tanggalPeminjaman = values.getString("tanggal_peminjaman");
                String idKaryawan = values.getString("id_karyawan");
                dataBukudanKaryawandanPeminjaman.add(new Peminjaman(idPeminjaman, userId, kodeBuku, tanggalPeminjaman, idKaryawan));
            
            }return dataBukudanKaryawandanPeminjaman;
        }else{
            values.close();
            JOptionPane.showMessageDialog(null, "TABEL TIDAK DITEMUKAN (CONTROLLER 35)");
        }
        return null;
    }
    
    public static ArrayList<String[]> showTableContent(ArrayList<Object> tableContent){
        ArrayList<String[]> rows = new ArrayList<>();
        
        for (Object data : tableContent) {
            if (data instanceof Buku books) {
                String kodeBuku = books.getKodeBuku();
                String judulBuku = books.getJudulBuku();
                String penulisBuku = books.getPenulisBuku();
                String statusPeminjaman = books.getStatusPeminjaman();
                String dataBuku[]= {kodeBuku,judulBuku,penulisBuku,statusPeminjaman};
                rows.add(dataBuku);  
                
            }else if (data instanceof Karyawan employees) {
                String idKaryawan = employees.getIdKaryawan();
                String namaKaryawan = employees.getNamaKaryawan();
                Object idKaryawanPenanggungJawab = employees.getIdPenanggungJawab();
                String dataKaryawan[] = {idKaryawan,namaKaryawan,String.valueOf(idKaryawanPenanggungJawab)};
                rows.add(dataKaryawan);
                
            }else if (data instanceof Peminjaman borrowers) {
                String idPeminjaman = borrowers.getIdPeminjaman();
                String userId = borrowers.getUserId();
                String kodeBuku = borrowers.getKodeBuku();
                String tanggalPeminjaman = borrowers.getTanggalPeminjaman();
                Object idKaryawan = borrowers.getIdKaryawan();
                String dataPeminjaman[] = {idPeminjaman,userId,kodeBuku,tanggalPeminjaman,String.valueOf(idKaryawan)};
                rows.add(dataPeminjaman);
            }
        }return rows;
    }
    
    public static boolean insertDataBuku (String kodeBuku,String judulBuku,String penulisBuku, String statusPeminjaman){
        try {
            Buku newBook = new Buku(kodeBuku, judulBuku, penulisBuku,statusPeminjaman);
            dataBukudanKaryawandanPeminjaman.add(newBook);
            newBook.setBuku(String.format("INSERT INTO buku VALUES ('%s','%s','%s','%s')",
                    newBook.getKodeBuku(),newBook.getJudulBuku(),newBook.getPenulisBuku(),newBook.getStatusPeminjaman()));
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "KODE BUKU SUDAH ADA, HARAP MASUKKAN YANG LAIN");
        }
        return false;
    }
    
    public static void deleteDataBuku (Object selectedRow) throws SQLException{
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Buku databuku = (Buku) object;
            if (databuku.getKodeBuku().equals(selectedRow)) {
                dataBukudanKaryawandanPeminjaman.remove(object);
                databuku.setBuku(String.format( "DELETE FROM buku WHERE kode_buku = '%s'", databuku.getKodeBuku()));
                break;
            }
        }
    }
    
    public static void deleteDataKaryawan (Object selectedRow) throws SQLException{
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Karyawan dataKaryawan = (Karyawan) object;
            if (dataKaryawan.getIdKaryawan().equals(selectedRow)) {
                dataBukudanKaryawandanPeminjaman.remove(object);
                dataKaryawan.setkaryawan(String.format( "DELETE FROM karyawan WHERE id_karyawan = '%s'", dataKaryawan.getIdKaryawan()));
                break;
            }
        }
    }
    
    public static String[] setTextFieldBuku (Object selectedRow){
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Buku databuku = (Buku) object;
            if (databuku.getKodeBuku().equals(selectedRow)) {
                String[] rowData = {databuku.getKodeBuku(),databuku.getJudulBuku(),databuku.getPenulisBuku(),databuku.getStatusPeminjaman()};
                return rowData;
            }
        }
        return null;
    }
    
    public static String[] setTextFieldKaryawan (Object selectedRow){
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Karyawan dataKaryawan = (Karyawan) object;
            if (dataKaryawan.getIdKaryawan().equals(selectedRow)) {
                String[] rowData = {dataKaryawan.getIdKaryawan(),dataKaryawan.getNamaKaryawan(),String.valueOf(dataKaryawan.getIdPenanggungJawab())};
                return rowData;
            }
        }
        return null;
    }
    
    public static void updateDataBuku (String kodeBuku,String judulBuku,String penulisBuku, String statusPeminjaman) throws SQLException{
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Buku databuku = (Buku) object;
            if (databuku.getKodeBuku().equals(kodeBuku)) {
                databuku.setJudulBuku(judulBuku);
                databuku.setPenulisBuku(penulisBuku);
                databuku.setStatusPeminjaman(statusPeminjaman);
                databuku.setBuku(String.format("UPDATE buku SET judul_buku = '%s', penulis_buku = '%s', status_peminjaman = '%s' WHERE kode_buku = '%s'",
                        databuku.getJudulBuku(),databuku.getPenulisBuku(),databuku.getStatusPeminjaman(),databuku.getKodeBuku()));
                break;
            }
        }
    }
    
    public static void updateDataKaryawan (String idKaryawan,String namaKaryawan,Object idPenanggungjawab) throws SQLException{
        for (Object object : dataBukudanKaryawandanPeminjaman) {
            Karyawan dataKaryawan = (Karyawan) object;
            if (dataKaryawan.getIdKaryawan().equals(idKaryawan)) {
                dataKaryawan.setIdKaryawan(idKaryawan);
                dataKaryawan.setNamaKaryawan(namaKaryawan);
                dataKaryawan.setIdPenanggungJawab(idPenanggungjawab);
                dataKaryawan.setkaryawan(String.format("UPDATE karyawan SET nama_karyawan = '%s', id_karyawan_penanggungjawab = '%s'  WHERE id_karyawan = '%s'",
                        dataKaryawan.getNamaKaryawan(),dataKaryawan.getIdPenanggungJawab(),dataKaryawan.getIdKaryawan()));
                break;
            }
        }
    }
    
    public static boolean insertDataKaryawan (String idKaryawan,String namaKaryawan,Object idPenanggungJawab){
        try {
            Karyawan newEmployee = new Karyawan(idKaryawan, namaKaryawan, idPenanggungJawab);
            dataBukudanKaryawandanPeminjaman.add(newEmployee);
            newEmployee.setkaryawan(String.format("INSERT INTO karyawan VALUES ('%s','%s','%s')",
                    newEmployee.getIdKaryawan(),newEmployee.getNamaKaryawan(),newEmployee.getIdPenanggungJawab()));
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "KODE KARYAWAN SUDAH ADA, HARAP MASUKKAN YANG LAIN");
        }
        return false;
    }
    
    public static ArrayList<String> setRadioId() throws SQLException{
        ResultSet idValues = Karyawan.getKaryawan("SELECT id_karyawan FROM karyawan");
        ArrayList<String> idPenanggungJawab = new ArrayList<>();
        while (idValues.next()) {            
            String id = idValues.getString("id_karyawan");
            idPenanggungJawab.add(id);
        }return idPenanggungJawab;
    }

    
    public static int getIdPeminjaman() throws SQLException{
        ArrayList<Integer> arrayId = new ArrayList<>();
        ResultSet idPeminjaman = Peminjaman.getPeminjaman("SELECT * FROM peminjaman");
        while (idPeminjaman.next()) {            
            int id = idPeminjaman.getInt("id_peminjaman");
            arrayId.add(id);
        }
        if (arrayId.isEmpty()) {
            return 0;
        }else{
            int lastIndex = arrayId.size() ;
            return lastIndex;
        } 
    }
    
    public static void createRiwayatPeminjaman(String kodeBuku,String userId, Object karyawan) throws SQLException{
        LocalDate currentDate = LocalDate.now();
        String formatCurrent = currentDate.format(DateTimeFormatter.ISO_DATE);
        int idPeminjaman = ControllerAdmin.getIdPeminjaman() + 1;
        Peminjaman peminjaman = new Peminjaman(String.valueOf(idPeminjaman), userId, kodeBuku, formatCurrent, karyawan);
        dataPeminjaman.add(peminjaman);
        dataBukudanKaryawandanPeminjaman.add(peminjaman);
        Peminjaman.setPeminjaman(String.format("INSERT INTO peminjaman VALUES ('%s','%s','%s','%s','%s')",
                peminjaman.getIdPeminjaman(),peminjaman.getUserId(),peminjaman.getKodeBuku(),peminjaman.getTanggalPeminjaman(),peminjaman.getIdKaryawan()));
    }
    
    public static ArrayList<Object[]> getRiwayatById(String userId) throws SQLException{
        dataPeminjaman.clear();
        ArrayList<Object[]> row = new ArrayList<>();
        String query = String.format("SELECT * FROM peminjaman WHERE user_id = '%s'", userId);
        ResultSet rs = Peminjaman.getPeminjaman(query);
        while (rs.next()) {            
            String idPeminjaman = rs.getString("id_peminjaman");
            String idUser = rs.getString("user_id");
            String kodeBuku = rs.getString("kode_buku");
            String tanggalPeminjaman = rs.getString("tanggal_peminjaman");
            String idKaryawan = rs.getString("id_karyawan");
            Peminjaman peminjamById = new Peminjaman(idPeminjaman, idUser, kodeBuku, tanggalPeminjaman, idKaryawan);
            dataPeminjaman.add(peminjamById);
            Object[] rowData = {peminjamById.getIdPeminjaman(),peminjamById.getUserId(),peminjamById.getKodeBuku(),peminjamById.getTanggalPeminjaman(),peminjamById.getIdKaryawan()};
            row.add(rowData);
        }return row;
    }
}
