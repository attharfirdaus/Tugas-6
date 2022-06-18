package com.TugasPraktikum;

public class Manajer  extends Pekerja{

    private int lamaKerja;

    public Manajer(String nama, String nik, boolean jenisKelamin, boolean statusMenikah, int jamKerja, int hariKerja, String nip, int lamaKerja) {
        super(nama, nik, jenisKelamin, statusMenikah, jamKerja, hariKerja, nip);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        double bonus = 0;
        double bonusLibur = 0;
        double bonusLembur = 0;
        setGaji(getHariKerja() * getJamKerja() * 15);
        if (getHariKerja() > 20){
            bonusLibur = (getHariKerja() - 20) * (getJamKerja()) * 35;
            if (getJamKerja() > 7){
                bonusLembur = 20 * (getJamKerja() - 7) * 22;
            }
            bonus = bonusLembur + bonusLibur + (0.3 * (bonusLembur + bonusLibur));
        }else if (getHariKerja() <= 20){
            if (getJamKerja() > 7){
                bonusLembur = getHariKerja() * (getJamKerja() - 7) * 22;
            }
            bonus = bonusLembur + bonusLibur + (0.3 * (bonusLembur + bonusLibur));
        }
        double pendapatan = bonus + getGaji() + 15;

        String jk;
        if (isJenisKelamin() == true){
            jk = "Laki-laki";
        }else {jk = "Perempuan";}

        return String.format("Nama\t\t\t\t : %s\nNIK\t\t\t\t\t : %s\nJenis Kelamin\t\t : %s\nJumlah Pendapatan\t : %.1f$\nBonus\t\t\t\t : %.1f$\nGaji\t\t\t\t : %.1f$\nStatus\t\t\t\t : %s\nLama Kerja\t\t\t : %d tahun\n", getNama(), getNik(), jk, getPendapatan()+pendapatan, bonus, getGaji(), getStatus(), getLamaKerja());
    }
}
