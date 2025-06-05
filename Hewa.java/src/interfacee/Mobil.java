package interfacee;

public class Mobil implements Kendaraan {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan.");
    }
    @Override
    public void matikanMesin() {
        System.out.println("Mesin mobil dimatikan.");
    }
    
}
