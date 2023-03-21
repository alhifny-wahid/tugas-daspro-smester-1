package JavaDasar;

public class Variabel {

    public static void main(String[] args) {
        //JavaDasar.Variabel
        //- JavaDasar.Variabel adalah tempat untuk menyimpan data
        //- Java adalah bahasa static type, sehingga sebuah variabel hanya bisa di gunakan untuk menyimpan tipe data yang sama, tidak bisa berubah ubah tipe data seperti PHP atau JavaScript
        //- Untuk membuat variabel di java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variabelnya
        //- Nama variabel tidak boleh mengandung whitespace (spasi,enter,tab) dan tidak boleh seluruhnya number (jadi harus ada abjad)


        //Contoh program variabel

        String name, adress;
        name = "Alhifny Wahid";

        int age = 30;
        adress = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(adress);
        System.out.println();

        //Kata kunci var
        //- Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
        //- Namun perlu di ingat saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisiasi value atau nilai dari variable tersebut secara langsung

        //Contoh memakai var salah

        // var name; //eror
        // name = "Alhifny wahid";

        //Contoh memakai var Benar
        var ContohBenar = 4;
        var ContohBenar2 = "Indonesia";

        System.out.println(ContohBenar);
        System.out.println(ContohBenar2);

        //Kata kunci final
        //- Secara default, variabel di Java bisa di ubah ubah nilainya
        //- Jika kita ingin membuat sebuah variabel yang datanya tidak boleh di ubah setelah pertama kali di buat, kita bisa menggunakan kata kunci final
        //- Istilah variabel seperti ini, banyak juga yang menyebutnya konstan

        //contoh kata kunci final

        final String namee = "Alhifny Wahid";

        //namee = "Nama di ubah"; //error

    }
}
