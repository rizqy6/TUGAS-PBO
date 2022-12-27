package com.tutorial;

// import java library
import java.io.IOException;
import java.util.Scanner;

// import CRUD library
import CRUD.Operasi;
import CRUD.Utility;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            Utility.clearScreen();
            System.out.println("My List\n");
            System.out.println("1.\tLihat seluruh List");
            System.out.println("2.\tCari My List");
            System.out.println("3.\tTambah My List");
            System.out.println("4.\tUbah My List");
            System.out.println("5.\tHapus My List");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=================");
                    System.out.println("SELURUH MY LIST");
                    System.out.println("=================");
                    Operasi.tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI MY LIST");
                    System.out.println("=========");
                    Operasi.cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH MY LIST");
                    System.out.println("================");
                    Operasi.tambahData();
                    Operasi.tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH MY LIST");
                    System.out.println("==============");
                    Operasi.updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS MY LIST");
                    System.out.println("===============");
                    Operasi.deleteData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
            }

            isLanjutkan = CRUD.Utility.getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }

}