package TUGAS2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        DataMahasiswa data = new DataMahasiswa();

        data.input();
        System.out.println("--------------------------------");
        System.out.println("Nama: " + data.getNama() + "\nNIM: " + data.getNim() + "\nAlamat: " + data.getAlamat() + "\nUmur: Tahun"+ data.getUmur());

        data.printMahasiswa();
    }
}
