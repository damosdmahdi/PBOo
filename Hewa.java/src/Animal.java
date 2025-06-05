
abstract class Animal{
    String nama;
    Animal(String nama){
        this.nama=nama;
    }

    void makan(){
        System.out.println(nama+" sedang makan.");
    }
    abstract void bersuara();
}