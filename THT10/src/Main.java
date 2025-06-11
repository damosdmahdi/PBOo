abstract class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tahunProduksi;

    public Kendaraan(String platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo() {
        System.out.println("Plat Nomor     : " + platNomor);
        System.out.println("Merk           : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }

    public abstract double hitungBiayaSewa(int hari);

    public abstract boolean perluSupir();
}

interface DapatDisewa {
    double hitungBiayaSewa(int hari);

    boolean perluSupir();
}

interface Muatan {
    double kapasitasMuatan();
}

class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 250_000;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}

class Bus extends Kendaraan implements DapatDisewa {
    public Bus(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 750_000;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}

class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double kapasitas;

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 1_000_000;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B1234XYZ", "Toyota", 2022);
        Kendaraan bus = new Bus("D5678ABC", "Mercedes", 2020);
        Truk truk = new Truk("F9012JKL", "Isuzu", 2018, 5000.0);

        System.out.println("== Mobil Pribadi ==");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari : Rp" + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu Supir       : " + mobil.perluSupir());

        System.out.println("\n== Bus ==");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa 2 hari : Rp" + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir       : " + bus.perluSupir());

        System.out.println("\n== Truk ==");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa 5 hari : Rp" + truk.hitungBiayaSewa(5));
        System.out.println("Perlu Supir       : " + truk.perluSupir());
        System.out.println("Kapasitas Muatan  : " + truk.kapasitasMuatan() + " kg");
    }
}
