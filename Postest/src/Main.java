import java.time.LocalDate;

class Vehicle {
    public void startEngine() {
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Mesin Motor Nyala");
    }
}

class License {
    private String licenseNumber;
    private LocalDate validUntil;

    public License(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        this.validUntil = LocalDate.now().plusYears(5);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }
}

class Driver {
    private String name;
    private Vehicle vehicle;
    private License license;

    public Driver(String name, Vehicle vehicle, String licenseNumber) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(licenseNumber);
    }

    public void displayInfo() {
        System.out.println("Nama Pengemudi: " + name);
        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        } else {
            System.out.println("Jenis Kendaraan: Tidak Diketahui");
        }
        System.out.print("Status Mesin: ");
        vehicle.startEngine();
        System.out.println("Nomor Lisensi: " + license.getLicenseNumber());
        System.out.println("Tanggal Berlaku Lisensi: " + license.getValidUntil());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Ali", new Car(), "CAR123");
        Driver d2 = new Driver("Budi", new Motorcycle(), "MOTO456");

        d1.displayInfo();
        d2.displayInfo();
    }
}
