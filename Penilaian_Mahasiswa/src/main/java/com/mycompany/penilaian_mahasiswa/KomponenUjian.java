package com.mycompany.penilaian_mahasiswa;

public class KomponenUjian extends KomponenNilai {

    public KomponenUjian(double persen) {
        super("Ujian", persen);  // Nama "Ujian" dan persentase kontribusinya
    }

    @Override
    public void setNilai(double nilai) {
        this.nilai = nilai;  // Menyimpan nilai ujian
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * persen / 100;  // Menghitung nilai akhir ujian berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Ujian: " + getNilai() + " (" + getPersen() + "%)";
    }
}
