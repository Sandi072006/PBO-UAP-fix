package com.mycompany.penilaian_mahasiswa;

public class KomponenQuiz extends KomponenNilai {

    public KomponenQuiz(double persen) {
        super("Quiz", persen);  // Nama "Quiz" dan persentase kontribusinya
    }

    @Override
    public void setNilai(double nilai) {
        this.nilai = nilai;  // Menyimpan nilai quiz
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * persen / 100;  // Menghitung nilai akhir quiz berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Quiz: " + getNilai() + " (" + getPersen() + "%)";
    }
}
