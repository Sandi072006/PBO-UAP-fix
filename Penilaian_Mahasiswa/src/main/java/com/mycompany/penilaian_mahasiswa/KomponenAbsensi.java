package com.mycompany.penilaian_mahasiswa;

public class KomponenAbsensi extends KomponenNilai {

    public KomponenAbsensi(double persen) {
        super("Absensi", persen);  // Nama "Absensi" dan persentase kontribusinya
    }

    @Override
    public void setNilai(double nilai) {
        this.nilai = nilai;  // Menyimpan nilai absensi
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * persen / 100;  // Menghitung nilai akhir absensi berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Absensi: " + getNilai() + " (" + getPersen() + "%)";
    }
}
