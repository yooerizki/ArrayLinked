package keg2;

public class Linklist {

    Node head = null;      
    Node tail = null;       

    public void add(String data) {

        Node newNode = new Node(data); 

        if(head == null) {          // jika data pertama kosong 
            head = newNode;        // tambah data 
            tail = newNode;
        }
        else {                      
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void tampil() {      // menampilkan data sebelum dan sesudah
        Node current = head;
        if(head == null) {          // jika node data index kosong selesai
            System.out.println("array kosong");
            return;
        }

        while(current != null) {     // data node tidak kosong  tampilkan data
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void shorting() {
        Node current = head, index = null; 
        if(head == null) {   
            return;
        }
        else {
            while(current != null) {            // looping data node tidak sama dengan kosong
                index = current.next;           // simpan sementara 

                while(index != null) {          // looping index
                    if(current.data.compareTo(index.data) > 0 ) {  
                        String temp = current.data;     // data penampung swap 
                        current.data = index.data;      // tukar data indek pertama dengan data index kedua
                        index.data = temp;              
                    }
                    index = index.next;
                }
                current = current.next;        
            }
        }
    }

}
