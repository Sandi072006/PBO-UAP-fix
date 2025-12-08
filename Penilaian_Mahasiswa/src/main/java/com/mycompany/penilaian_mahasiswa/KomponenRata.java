package com.mycompany.penilaian_mahasiswa;

public class KomponenRata extends KomponenNilai {

    private double totalTugas;  // Total nilai tugas
    private double totalQuiz;   // Total nilai quiz
    private int jumlahTugas;    // Jumlah tugas
    private int jumlahQuiz;     // Jumlah quiz

    public KomponenRata(String nama, double persen) {
        super(nama, persen);
        this.totalTugas = 0;
        this.totalQuiz = 0;
        this.jumlahTugas = 0;
        this.jumlahQuiz = 0;
    }

    // Menambahkan nilai tugas
    public void tambahNilaiTugas(double nilaiTugas) {
        this.totalTugas += nilaiTugas;
        this.jumlahTugas++;
    }

    // Menambahkan nilai quiz
    public void tambahNilaiQuiz(double nilaiQuiz) {
        this.totalQuiz += nilaiQuiz;
        this.jumlahQuiz++;
    }

    @Override
    public void setNilai(double nilai) {
        double rataTugas = this.jumlahTugas > 0 ? this.totalTugas / this.jumlahTugas : 0;
        double rataQuiz = this.jumlahQuiz > 0 ? this.totalQuiz / this.jumlahQuiz : 0;

        // Menghitung rata-rata tugas dan quiz
        this.nilai = (rataTugas + rataQuiz) / 2;
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * (persen / 100);  // Menghitung nilai akhir berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Rata-rata: Tugas = " + totalTugas / jumlahTugas + ", Quiz = " + totalQuiz / jumlahQuiz + " (" + getPersen() + "%)";
    }
}
