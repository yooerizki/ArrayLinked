package keg1;

import java.util.ArrayList;

public class KegiatanSatu {
    public static void kegiatanSatu(){
        ArrayList arr = new ArrayList();
        arr.add("Lala");
        arr.add("Shani");
        arr.add("Garcia");                                          // Create Array
        arr.add("Kyla");
        arr.add("Gio");
        System.out.println("Data Pertama : " + arr);

        arr.remove(3);
        arr.add(3, "Gina");                                         // hapus indek array yg ke 3 dan add gina
        System.out.println("Data Kedua : " + arr);

        arr.add(1,"Dhaniel");
        arr.add(3,"Rusli");                                         // tambah index 1 dan 3 
        System.out.println("Data Ketiga : " + arr);

        arr.remove("Shani");
        arr.remove("Rusli");
        arr.remove("Garcia");                                       // hapus index 1 , 2 dan 3 
        System.out.println("Data keempat : " + arr);
        
        System.out.println("Jumlah Elemen Array : " + arr.size());  // jumlah elemen array
        System.err.println("Index Lala : " + arr.indexOf("Lala"));  // hasil index dari lala & gina
        System.out.println("Index Gina : " + arr.indexOf("Gina"));
    }
}
