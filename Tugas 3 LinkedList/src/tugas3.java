import java.util.LinkedList;

public class tugas3 {
    public static void main(String[] args) throws Exception {
        System.out.println("------Tugas 2 SDA------");
        System.out.println("Nama : Nurul Insan");
        System.out.println("NIM : 2111522013");
        System.out.println("----------------\n");

        //Membuat variabel linkedlist
        LinkedList <Integer> nim = new LinkedList<>();
        LinkedList <String> nama = new LinkedList<>(); 
        LinkedList <String> alamat = new LinkedList<>();

        nim.add(2111522013);
        nama.add("Nurul Insan");
        alamat.add("Padang");
        System.out.println("NO Bp (NIM) \t= "+nim);
        System.out.println("Nama Mahasiswa \t= "+nama);
        System.out.println("Alamat \t= "+alamat);

        

        //add
           System.out.println("\n---------- MENAMBAH DATA ----------");
           nim.addFirst(2111522010);
           nim.addLast(2111522015);
           nim.add(2111522011);
           nim.add(2111522012);
   
           nama.addFirst("Rahmat");
           nama.addLast("Hakim");
           nama.add("Kevin");
           nama.add("Aulia");
   
           alamat.addFirst("Bukittinggi");
           alamat.addLast("Agam");
           alamat.add("Solok");
           alamat.add("Bengkulu");
   
           System.out.println("No Bp (NIM) \t= "+nim+"\t Size = "+nim.size());
           System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
           System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());
   
        //set
            System.out.println("\n---------- MENYISIPKAN DATA ----------");
            nama.set(2,"Ilham");
            nama.set(4,"Aulia");
            alamat.set(2,"Pariaman");
            alamat.set(4,"Pasaman");

            System.out.println("No Bp (NIM) \t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t Size = "+nim.size());

        //remove
            System.out.println("\n---------- MENGHAPUSKAN DATA ----------");

            nim.remove(2);
            nama.remove(2);
            alamat.remove(2);

            System.out.println("No Bp (NIM) \t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());

        //pop
            System.out.println("\n---------- POP ----------");
            nim.pop();
            nama.pop();
            alamat.pop();
            System.out.println("No Bp (NIM) \t= "+nim+"\t\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());

        //push
            System.out.println("\n---------- PUSH ----------");
            nim.push(2111522017);   
            nama.push("Asraf");
            alamat.push("Aceh");

            System.out.println("No Bp (NIM) \t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());

        //get
            System.out.println("\n---------- MENCARI DATA ----------");
            //mencari mahasiswa pertama
            System.out.println("Nama Mahasiswa Pertama          :\t" +nama.getFirst());
            System.out.println("Nomor Induk Mahasiswa Pertama   :\t" +nim.getFirst());
            System.out.println("Alamat Mahasiswa Pertama        :\t" +alamat.getFirst());
            System.out.println("");

            //mencari mahasiswa terakhir
            System.out.println("Nama Mahasiswa Terakhir         :\t" +nama.getLast());
            System.out.println("Nomor Induk Mahasiswa Terakhir  :\t" +nim.getLast());
            System.out.println("Alamat Mahasiswa Terakhir       :\t" +alamat.getLast());
            System.out.println("");

        //isEmpty()
            System.out.println("\n---------- PENGECEKAN DATA (isEmpty)----------");

            System.out.println("Apakah data nim ada yang kosong?\t"+nim.isEmpty());
            System.out.println("Apakah data nama ada yang kosong?\t"+nama.isEmpty());
            System.out.println("Apakah data alamat ada yang kosong?\t"+alamat.isEmpty());

        //indexof
            System.out.println("\n---------- PENGECEKAN DATA (indexof)----------");

            System.out.println("NIM 2111522017 index ke = \t"+nim.indexOf(2111522017));
            System.out.println("Nama Asraf index ke     = \t"+nama.indexOf("Asraf"));
            System.out.println("Alamat Aceh index ke    = \t"+alamat.indexOf("Aceh"));
        
    }
}
