package com.mycompany.penilaian_mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah {

    private String namaMatkul;  // Nama mata kuliah
    private int sks;  // SKS mata kuliah
    private double bobot;  // Bobot nilai mata kuliah
    private ArrayList<KomponenNilai> komponenNilai;  // List untuk menyimpan komponen nilai
    private double nilaiAkhir;
    private String huruf;

    // Konstruktor untuk MataKuliah
    public MataKuliah(String namaMatkul, int sks, double bobot) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.bobot = bobot;
        this.komponenNilai = new ArrayList<>();
    }

    // Menambahkan komponen nilai (UAS, UTS, Tugas, Absensi, dll)
    public void tambah(KomponenNilai komponen) {
        komponenNilai.add(komponen);
    }

    // Menghitung nilai akhir berdasarkan komponen-komponen nilai
    public void prosesNilai() {
        double totalNilai = 0;
        double totalPersen = 0;
        
        // Menghitung total nilai berdasarkan persentase kontribusi komponen
        for (KomponenNilai komponen : komponenNilai) {
            totalNilai += komponen.hitungNilaiAkhir();  // Menjumlahkan nilai akhir dari setiap komponen
            totalPersen += komponen.getPersen();  // Menambahkan persentase kontribusi
        }

        // Memastikan bahwa total persentase tidak lebih dari 100%
        if (totalPersen > 100) {
            totalNilai = 0;  // Jika total persentase melebihi 100%, nilai menjadi 0
        }
        
        this.nilaiAkhir = totalNilai;  // Menyimpan total nilai akhir
        setHuruf();  // Menghitung huruf berdasarkan nilai akhir
    }

    // Menghitung huruf berdasarkan nilai akhir
    private void setHuruf() {
        if (nilaiAkhir >= 85) {
            huruf = "A";
        } else if (nilaiAkhir >= 80) {
            huruf = "A-";
        } else if (nilaiAkhir >= 75) {
            huruf = "B+";
        } else if (nilaiAkhir >= 70) {
            huruf = "B";
        } else if (nilaiAkhir >= 65) {
            huruf = "B-";
        } else if (nilaiAkhir >= 60) {
            huruf = "C+";
        } else if (nilaiAkhir >= 55) {
            huruf = "C";
        } else {
            huruf = "D";
        }
    }

    // Getter untuk nama mata kuliah
    public String getNamaMatkul() {
        return namaMatkul;
    }

    // Getter untuk SKS mata kuliah
    public int getSks() {
        return sks;
    }

    // Getter untuk bobot mata kuliah
    public double getBobot() {
        return bobot;
    }

    // Getter untuk nilai akhir mata kuliah
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    // Getter untuk huruf mata kuliah
    public String getHuruf() {
        return huruf;
    }

    // Menambahkan metode untuk menyimpan data ke database atau menampilkannya di UI
    // Ini bisa berupa metode untuk menambahkan mata kuliah, mengupdate, atau menghapus data dari database.
}
