package com.mycompany.penilaian_mahasiswa;

public class KomponenTugas extends KomponenNilai {

    public KomponenTugas(double persen) {
        super("Tugas", persen);  // Nama "Tugas" dan persentase kontribusinya
    }

    @Override
    public void setNilai(double nilai) {
        this.nilai = nilai;  // Menyimpan nilai tugas
    }

    @Override
    public double hitungNilaiAkhir() {
        return nilai * persen / 100;  // Menghitung nilai akhir tugas berdasarkan persentase
    }

    @Override
    public String toString() {
        return "Tugas: " + getNilai() + " (" + getPersen() + "%)";
    }
}
