import java.util.Date;

class Animal {
    protected HealthRecord healthRecord;

    public Animal() {
        this.healthRecord = new HealthRecord();
    }

    public void makeSound() {
        System.out.println("Suara hewan...");
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meong!");
    }
}

class HealthRecord {
    private static int recordCounter = 1000;
    private int recordNumber;
    private Date creationDate;

    public HealthRecord() {
        this.recordNumber = recordCounter++;
        this.creationDate = new Date();
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}

class Owner {
    private String name;
    private Animal pet;

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void showOwnerInfo() {
        System.out.println("Nama Pemilik: " + name);
        System.out.print("Suara Hewan Peliharaan: ");
        pet.makeSound();

        if (pet instanceof Dog) {
            System.out.println("Jenis Hewan: Anjing");
        } else if (pet instanceof Cat) {
            System.out.println("Jenis Hewan: Kucing");
        } else {
            System.out.println("Jenis Hewan: Tidak diketahui");
        }

        HealthRecord record = pet.getHealthRecord();
        System.out.println("Nomor Rekam Medis: " + record.getRecordNumber());
        System.out.println("Tanggal Pembuatan Rekam Medis: " + record.getCreationDate());
    }
}

public class PetSimulation {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Andi", new Dog());
        Owner owner2 = new Owner("Siti", new Cat());

        owner1.showOwnerInfo();
        owner2.showOwnerInfo();
    }
}
