package com.controller;

import com.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public final class ControllerAccount{
    // Menyimpan data dari database menjadi objek didalam ArrayList
    final static ArrayList<Account> dataAccount = new ArrayList<>();
    
    public static boolean radioAdminSelected(String txtUserId, String txtPassword) throws SQLException{
        ResultSet data = Admin.getAdminAccount("SELECT * FROM admin");
        while (data.next()) {            
            String userId = data.getString("user_id");
            String password = data.getString("password");
            String adminName = data.getString("nama_admin");
            String noTelp = data.getString("no_telepon");
            dataAccount.add(new Admin(noTelp,userId, password,adminName));
            
        }
        for (Account account : dataAccount) {
            if (account instanceof Admin dataAdmin) {
                if (dataAdmin.getUserId().equals(txtUserId) && dataAdmin.getPassword().equals(txtPassword)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean radioMemberSelected(String txtUserId, String txtPassword) throws SQLException{
        ResultSet data = Member.getMemberAccount("SELECT * FROM member");
        while (data.next()) {            
            String user_id = data.getString("user_id");
            String password = data.getString("password");
            String memberName = data.getString("nama_member");
            String statusMember = data.getString("status_member");
            dataAccount.add(new Member(statusMember, user_id, password, memberName));
            
        }
        for (Account account : dataAccount) {
            if (account instanceof Member dataMember ) {
                if (dataMember.getUserId().equals(txtUserId) && dataMember.getPassword().equals(txtPassword)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void registerAccount(String newUserId, String newPassword, String name,String statusMember) throws SQLException{
        Account newAccount = new Account(newUserId, newPassword, name);
        dataAccount.add(newAccount);
        newAccount.executeUpdateQuery(String.format("INSERT INTO akun VALUES ('%s','%s','%s')",
                newAccount.getUserId(),newAccount.getPassword(),newAccount.getNamaPengguna()));
        Member newMember = new Member(statusMember, newUserId, newPassword, name);
        dataAccount.add(newMember);
        Member.setMemberAccount(String.format("INSERT INTO member VALUES ('%s','%s','%s','%s')",
                newMember.getUserId(),newMember.getPassword(),newMember.getNamaPengguna(),newMember.getStatusMember()));
    }
    
//    public static boolean updateRiwayatPeminjaman(String id,String judulBuku) throws SQLException {
//        for (Account account : dataAccount) {
//            if (account instanceof Member dataMember) {
//                if (dataMember.getUserId().equals(id)) {
//                    if (dataMember.getJudulBukuDipinjam() == null) {
//                        dataMember.setJudulBukuDipinjam(judulBuku);
//                        Member.setMemberAccount(String.format("UPDATE member SET buku_dipinjam = '%s' WHERE user_id = '%s'",
//                                judulBuku,id));
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}