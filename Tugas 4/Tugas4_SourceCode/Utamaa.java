/*
Nama             : Arfandi Hadi Kusuma
Nim              : 13020220150
Kelas            : A4 
Hari/Tanggal     :Jum'at, 29 Maret 2024
*/

package pertemuan2.modul4.user;
import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Fandi";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "13020220150"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class Utamaa {
    public static void main(String[] args) {
        // Memanggil method info() dari kelas Orang
        Orang.info();
        
        // Memanggil method info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}