package JavaDasar;

public class TipeDataString {
    public static void main(String[] args) {
        //Tipe Data String
        //- Tipe data String adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks
        //- Di Java, tipe data String di representasikan dengan kata kunci String
        //- Untuk membuat String di Java, kita menggunakan karakter " (Petik dua) sebelumm dan setelah teksnya
        //- Default value untuk String adalah null atau tidak ada data

        //Contoh Program kode String
        String NamaDepan = "Alhifny ";
        String NamaBelakang = "Wahid";

        System.out.print(NamaDepan);
        System.out.print(NamaBelakang);

        //Contoh Menggabungkan kode String
        String NamaLengkap = NamaDepan + " " + NamaBelakang;
        System.out.println("\n"+NamaLengkap);
    }
}
