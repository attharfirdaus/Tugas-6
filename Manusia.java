package com.TugasPraktikum;

public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean statusMenikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean statusMenikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.statusMenikah = statusMenikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }

    public double getTunjangan(){
        if (this.statusMenikah == true){
            if (this.jenisKelamin == true){
                return 25;
            }else if (this.jenisKelamin == false){
                return 20;
            }
        }
        else return 15;
        return 0;
    }

    public double getPendapatan(){
        double pendapatan = 0;
        return pendapatan + getTunjangan();
    }

    public String toString(){
        String jk;
        if (this.jenisKelamin == true){
            jk = "Laki-laki";
        }else {jk = "Perempuan";}
        return String.format("Nama\t\t\t\t : %s\nNIK\t\t\t\t\t : %s\nJenis Kelamin\t\t : %s\nJumlah Pendapatan\t : %d$\n", getNama(), getNik(), jk, (int)getPendapatan());
    }
}
