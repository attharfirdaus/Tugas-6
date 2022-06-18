package com.TugasPraktikum;

public class MahasiswaFilkom extends Manusia{

    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, String nik, boolean jenisKelamin, boolean statusMenikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, statusMenikah);
        this.nim = nim;
        this.ipk = ipk;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus(){
        if (this.nim.substring(6,7).equals("2") ){
            return "Teknik Meniup Gelembung, 20" + this.nim.substring(0,2);
        }else if (this.nim.substring(6,7).equals("3")){
            return "Teknik Berburu Ubur Ubur, 20" + this.nim.substring(0,2);
        }else if (this.nim.substring(6,7).equals("4")){
            return "Sistem Perhamburgeran, 20" + this.nim.substring(0,2);
        }else if (this.nim.substring(6,7).equals("6")){
            return "Pendidikan Chum Bucket, 20" + this.nim.substring(0,2);
        }else if (this.nim.substring(6,7).equals("7")){
            return "Teknologi Telepon Kerang, 20" + this.nim.substring(0,2);
        }
        return null;
    }

    public double getBeasiswa(){
        if (this.ipk >= 3 && this.ipk < 3.5){
            return 50 +getTunjangan();
        }else if (this.ipk >= 3.5 && this.ipk <= 4){
            return 75 + getTunjangan();
        }
        return getTunjangan();
    }

    public String toString(){
        String jk;
        if (isJenisKelamin() == true){
            jk = "Laki-laki";
        }else {jk = "Perempuan";}
        return String.format("Nama\t\t\t\t : %s\nNIK\t\t\t\t\t : %s\nJenis Kelamin\t\t : %s\nJumlah Pendapatan\t : %d$\nIPK\t\t\t\t\t : %.2f\nNIM\t\t\t\t\t : %s\nStatus\t\t\t\t : %s\n", getNama(), getNik(), jk, (int)getBeasiswa(), getIpk(), getNim(), getStatus());
    }
}
