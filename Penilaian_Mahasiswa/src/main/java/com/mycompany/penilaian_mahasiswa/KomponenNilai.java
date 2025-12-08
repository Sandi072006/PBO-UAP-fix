package com.mycompany.penilaian_mahasiswa;

public abstract class KomponenNilai {

    protected String nama;    // Nama komponen (misalnya: Absensi, Tugas, Ujian)
    protected double nilai;   // Nilai yang diberikan untuk komponen ini
    protected double persen;  // Persentase kontribusi komponen ini terhadap nilai akhir

    // Konstruktor untuk inisialisasi nama komponen dan persentase kontribusinya
    public KomponenNilai(String nama, double persen) {
        this.nama = nama;
        this.persen = persen;
    }

    // Metode abstrak untuk mengatur nilai komponen
    public abstract void setNilai(double nilai);

    // Metode abstrak untuk menghitung nilai akhir berdasarkan kontribusi persentase komponen ini
    public abstract double hitungNilaiAkhir();

    // Mendapatkan nama komponen
    public String getNama() {
        return nama;
    }

    // Mendapatkan nilai yang diberikan pada komponen
    public double getNilai() {
        return nilai;
    }

    // Mendapatkan persentase kontribusi komponen ini terhadap nilai akhir
    public double getPersen() {
        return persen;
    }
}
