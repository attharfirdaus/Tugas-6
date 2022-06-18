package com.TugasPraktikum;

public class Pekerja extends Manusia{

    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String nip;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String nip) {
        super(nama, nik, jenisKelamin, statusMenikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStatus(){
        String kantorcab = null;
        String departemen = null;

        if (this.nip.substring(0,1).equals("1")){
            kantorcab = "Mondstadt";
        }else if (this.nip.substring(0,1).equals("2")){
            kantorcab = "Liyue";
        }else if (this.nip.substring(0,1).equals("3")){
            kantorcab = "Inazuma";
        }else if (this.nip.substring(0,1).equals("4")){
            kantorcab = "Sumeru";
        }else if (this.nip.substring(0,1).equals("5")){
            kantorcab = "Fontaine";
        }else if (this.nip.substring(0,1).equals("6")){
            kantorcab = "Natlan";
        }else if (this.nip.substring(0,1).equals("7")){
            kantorcab = "Snezhnaya";
        }

        if (this.nip.substring(6,7).equals("1")){
            departemen = "Pemasaran";
        }else if (this.nip.substring(6,7).equals("2")){
            departemen = "Humas";
        }else if (this.nip.substring(6,7).equals("3")){
            departemen = "Riset";
        }else if (this.nip.substring(6,7).equals("4")){
            departemen = "Teknologi";
        }else if (this.nip.substring(6,7).equals("5")){
            departemen = "Personalia";
        }else if (this.nip.substring(6,7).equals("6")){
            departemen = "Akademik";
        }else if (this.nip.substring(6,7).equals("7")){
            departemen = "Administrasi";
        }else if (this.nip.substring(6,7).equals("8")){
            departemen = "Operasional";
        }else if (this.nip.substring(6,7).equals("9")){
            departemen = "Pembangunan";
        }

        return String.format("%s, %s cabang %s", departemen, kantorcab, this.nip.charAt(2));
    }

    public String toString(){
        double bonus = 0;
        double bonusLibur = 0;
        double bonusLembur = 0;
        double pendapatan = 0;
        this.gaji = this.hariKerja * this.jamKerja * 15;
        if (this.hariKerja > 20){
            bonusLibur = (this.hariKerja - 20) * (this.jamKerja) * 35;
            if (this.jamKerja > 7){
                bonusLembur = 20 * (this.jamKerja - 7) * 22;
            }
            bonus = bonusLembur + bonusLibur;
        }else if (this.hariKerja <= 20){
            if (this.jamKerja > 7){
                bonusLembur = this.hariKerja * (this.jamKerja - 7) * 22;
            }
            bonus = bonusLembur + bonusLibur;
        }
        pendapatan = bonus + getGaji();

        String jk;
        if (isJenisKelamin() == true){
            jk = "Laki-laki";
        }else {jk = "Perempuan";}

        return String.format("Nama\t\t\t\t : %s\nNIK\t\t\t\t\t : %s\nJenis Kelamin\t\t : %s\nJumlah Pendapatan\t : %.1f$\nBonus\t\t\t\t : %.1f$\nGaji\t\t\t\t : %.1f$\nStatus\t\t\t\t : %s\n", getNama(), getNik(), jk, getPendapatan()+pendapatan, bonus, getGaji(), getStatus());
    }
}
