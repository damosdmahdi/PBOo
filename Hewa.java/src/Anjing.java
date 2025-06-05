public class Anjing extends Animal {
    Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Guk guk");
    }

    @Override
    public void makan() {
        System.out.println("Anjing sedang makan tulang.");
    }
    
}
