package TUGAS1;

import java.util.Scanner;

public class java{
    public static void main(String[] args){
        String nama;
      

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ini Tugas 1");

            System.out.println("Nama : ");
            nama = scanner.nextLine();
        }
        System.out.println("----------------");
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat: Jepara");
        System.out.println("NIM: L200210015");
        System.out.println("Umur: 19");
    }
}