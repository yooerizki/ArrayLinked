package keg2;

public class App {
    public static void main(String[] args) {        // driver class main method

        Linklist list = new Linklist();

        list.add("Kevin");
        list.add("Dian");
        list.add("Sebastian");
        list.add("Budi");
        list.add("Ahmad");
        System.out.print("Sebelum Sorting : ");
        list.tampil();

        list.shorting();
        System.out.print("Setelah Sorting : ");
        list.tampil();

    }
    
}
