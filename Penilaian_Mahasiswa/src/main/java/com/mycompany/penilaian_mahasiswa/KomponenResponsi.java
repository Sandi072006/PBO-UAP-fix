package com.mycompany.penilaian_mahasiswa;

public class KomponenResponsi extends KomponenNilai {

    public KomponenResponsi(double persen) {
        super("Responsi", persen);  // Nama "Responsi" dan persentase kontribusinya
    }

    @Override
    public void setNilai(double nilai) {
        this.nilai = nilai;  // Menyimpan nilai responsi
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * persen / 100;  // Menghitung nilai akhir responsi berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Responsi: " + getNilai() + " (" + getPersen() + "%)";
    }
}
