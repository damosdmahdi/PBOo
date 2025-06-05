public class Kucing extends Animal {
    Kucing (String nama) {
        super(nama);
    }
    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
    @Override
    public void makan() {
        System.out.println("Kucing sedang makan ikan.");
    }

}
