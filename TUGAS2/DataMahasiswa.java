package TUGAS2;

import java.util.Scanner;

public class DataMahasiswa extends Mahasiswa {
    String nama, nim, alamat;
    int umur;

    public void input(){
        Scanner scanner = new Scanner(System.in);

        try(scanner){
            System.out.println("Masukan Nama: ");
            this.nama = scanner.nextLine();
            System.out.println("Masukan NIM: ");
            this.nim = scanner.nextLine();
            System.out.println("Masukan Alamat: ");
            this.alamat = scanner.nextLine();
            System.out.println("Masukan Umur: ");
            this.umur = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Input Salah");
            return;
        }
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public int getUmur(){
        return this.umur;
    }

    public void printMahasiswa(){
        System.out.println("Fakultas: " + Mahasiswa.fakultas + "\nJurusan: "+ Mahasiswa.jurusan + "\nAngkatan: " + Mahasiswa.angkatan);
    }
}
