package com.mycompany.penilaian_mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String jurusan;
    private int angkatan;
    private String prodi;
    private List<MataKuliah> listMatakuliah;  // Menyimpan daftar mata kuliah
    private int jumlahMK = 0;  // Jumlah mata kuliah yang diambil

    // Konstruktor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String npm, String jurusan, int angkatan, String prodi) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
        this.prodi = prodi;
        this.listMatakuliah = new ArrayList<>();  // Menggunakan ArrayList agar lebih fleksibel
    }

    // Menambahkan mata kuliah ke daftar mata kuliah mahasiswa
    public void tambah(MataKuliah mk) {
        // Memastikan tidak ada duplikasi mata kuliah berdasarkan namaMatkul
        if (!listMatakuliah.contains(mk)) {
            listMatakuliah.add(mk);
            jumlahMK++;
        }
    }

    // Mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMK() {
        return jumlahMK;
    }

    // Mendapatkan daftar mata kuliah yang diambil
    public List<MataKuliah> getListMatakuliah() {
        return listMatakuliah;
    }

    // Mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Mendapatkan NPM mahasiswa
    public String getNpm() {
        return npm;
    }

    // Mendapatkan jurusan mahasiswa
    public String getJurusan() {
        return jurusan;
    }

    // Mendapatkan angkatan mahasiswa
    public int getAngkatan() {
        return angkatan;
    }

    // Mendapatkan program studi mahasiswa
    public String getProdi() {
        return prodi;
    }

    // Menghitung Indeks Prestasi Kumulatif (IPK) berdasarkan bobot dan SKS mata kuliah
    public double hitungIPK() {
        double totalBobot = 0;
        int totalSks = 0;

        // Menghitung total bobot dan total SKS
        for (MataKuliah mk : listMatakuliah) {
            totalBobot += mk.getBobot() * mk.getSks();  // Bobot x SKS
            totalSks += mk.getSks();  // Menambahkan SKS mata kuliah
        }

        // Menghitung IPK, jika total SKS 0 maka IPK adalah 0
        return (totalSks == 0) ? 0 : totalBobot / totalSks;
    }

    // Menampilkan informasi mahasiswa beserta mata kuliah yang diambil dan IPK
    public void tampilkanInformasi() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Angkatan: " + angkatan);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");

        for (MataKuliah mk : listMatakuliah) {
            System.out.println("- " + mk.getNamaMatkul() + " (" + mk.getSks() + " SKS)");
        }

        System.out.println("IPK: " + hitungIPK());
    }

    // Menambahkan metode untuk mengupdate dan menghapus mahasiswa, untuk operasi CRUD
}
