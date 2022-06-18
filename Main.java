package com.TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Atthar", "1234567", true, true);
        Manusia man2 = new Manusia("Mujair", "7654321", false, true);
        Manusia man3 = new Manusia("Zainal", "7890123", true, false);
        System.out.println("================ MANUSIA ================");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);

        MahasiswaFilkom mhsw1 = new MahasiswaFilkom("Baso", "2342354656757", true, false, "215150700111014", 4);
        MahasiswaFilkom mhsw2 = new MahasiswaFilkom("Steven", "23576273577", true, true, "215150200111011", 3.75);
        MahasiswaFilkom mhsw3 = new MahasiswaFilkom("Nata", "325783553568", false, true, "195150301111010", 2.0);
        System.out.println("================ MAHASISWA ================");
        System.out.println(mhsw1);
        System.out.println(mhsw2);
        System.out.println(mhsw3);

        Pekerja pekerja1 = new Pekerja("Arif", "543324676756", true, true, 9, 28, "2157777777777");
        Pekerja pekerja2 = new Pekerja("Siti", "234776346546", false, false, 10, 26, "102777200000");
        Pekerja pekerja3 = new Pekerja("Amirah", "235767346567", false, true, 7, 26, "701777500000");
        System.out.println("================ PEKERJA ================");
        System.out.println(pekerja1);
        System.out.println(pekerja2);
        System.out.println(pekerja3);

        Manajer manajer1 = new Manajer("Andi", "3257865435", true, false, 7, 20, "21577777777777", 3);
        Manajer manajer2 = new Manajer("Mahmud", "453264237483", true, false, 9, 20, "50277790000", 7);
        Manajer manajer3 = new Manajer("Mursid", "64356566327", true, true, 9, 25, "20577780000", 4);
        System.out.println("================ MANAJER ================");
        System.out.println(manajer1);
        System.out.println(manajer2);
        System.out.println(manajer3);

        System.out.println("Total manusia   = 12");
        System.out.println("Total mahasiswa = 3");
        System.out.println("Total pekerja   = 6");
        System.out.println("Total manajer   = 3");
    }
}
