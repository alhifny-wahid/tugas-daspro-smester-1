package JavaDasar;

public class TipeDataArray {

    public static void main(String[] args) {

        /*

        Tipe Data Array
        - Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        - Jumlah data di Srray tidak bisa berubah setelah pertama kali  di buat

         */

        //Contoh Array

        int[] IntBang;
        IntBang = new int[10];
        IntBang[0] = 10;
        IntBang[1] = 20;
        IntBang[2] = 30;
        IntBang[3] = 40;
        IntBang[4] = 50;


        char[] Nor = new char[3];
        Nor[0] = 'A';
        Nor[1] = 'K';
        Nor[2] = 'U';

        System.out.println(IntBang[0]);
        System.out.println(IntBang[1]);
        System.out.println(IntBang[2]);
        System.out.println(IntBang[3]);
        System.out.println(IntBang[4]);
        System.out.println();
        System.out.print(Nor[0]);
        System.out.print(Nor[1]);
        System.out.print(Nor[2]);

        //Array Initializer

        //Versi Simple
        String[] garutOne = new String[] {
                "\nI ", "Love ", "You\n"
        };
        System.out.print(garutOne[0]);
        System.out.print(garutOne[1]);
        System.out.print(garutOne[2]);

        //Versi Lebih Simple
        long[] dinah = {
                30, 12, 123, 443
        };
        System.out.println(dinah[0]);
        System.out.println(dinah[1]);
        System.out.println(dinah[2]);
        System.out.println(dinah[3]);

        /*

        Operasi Di Array

        Operasi                         Keterangan
        variabel[index]                 Mengambil data di array
        variabel[index] = value         Mengubah data di array
        variabel.length                 Mengambil panjang array

         */

        //Contoh Mengubah data di array

        int[] saldo = {
                12, 13, 14
        };

        saldo[0] = 9;

        System.out.println("index 0 : "+ saldo[0]);
        System.out.println("Panjang array : "+ saldo.length); //Mengambil panjang array
        System.out.println();

        //Cara Membuat Array di dalam Array

        String[][] aDa = {
                {"Agung ", "Satriawan"},
                {"Ahmad", "Torejo "},
                {"Zainal "}
        };
        System.out.println("Array di dalam Array");

        System.out.println(aDa[0][1]);
        System.out.println(aDa[1][0]);
        System.out.println(aDa[2][0]);


    }
}
