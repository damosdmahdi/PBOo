package week9.agregasi;

import java.util.ArrayList;

class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

class Universitas {
    String namaUniv;
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    Universitas(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    void tampilkanMahasiswa() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.nama);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Adri");
        Mahasiswa mhs2 = new Mahasiswa("Damos");

        Universitas uper = new Universitas("Universitas Pertamina");
        uper.tambahMahasiswa(mhs1);
        uper.tambahMahasiswa(mhs2);

        uper.tampilkanMahasiswa();
    }
}
