package com.mycompany.penilaian_mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {

    public static Connection getConnection() throws SQLException {
        // URL koneksi ke database MySQL (pastikan nama database, username, dan password sesuai)
        String url = "jdbc:mysql://localhost:3306/db_penilaian";  // Gantilah sesuai dengan database Anda
        String username = "root";  // Gantilah dengan username database Anda
        String password = "";  // Gantilah dengan password database Anda
        
        // Coba untuk mendapatkan koneksi
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        // Menguji koneksi ke database
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Koneksi berhasil!");
            } else {
                System.out.println("Koneksi gagal! Koneksi tidak terhubung.");
            }
        } catch (SQLException e) {
            // Menangkap dan menampilkan error jika koneksi gagal
            System.err.println("Gagal koneksi ke database: " + e.getMessage());
            e.printStackTrace();  // Menampilkan stack trace untuk detail kesalahan
        }
    }
}
