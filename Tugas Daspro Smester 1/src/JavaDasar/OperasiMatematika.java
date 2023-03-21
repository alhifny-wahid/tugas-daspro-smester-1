package JavaDasar;

import java.sql.SQLOutput;

public class OperasiMatematika {
    public static void main(String[] args) {

        /*

        Operasi Matematika

        Opreator         Keterangan
        +                Penjumlahan
        -                Pengurangan
        *                Perkalian
        /                Pembagian
        %                Sisa Pembagian

         */

        //Contoh

        byte a = 10;
        byte b = 20;
        byte c = 30;

        System.out.println("=====OPERASI MATEMATIKA=====");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();

        /*

        Augmented Assigments
        Operasi  ke dirinya sendiri atau ke variabelnya sendiri

        OPERASI MATEMATIKA          AUGMENTED ASSIGNMENTS
        a = a + 10                  a += 10
        a = a - 10                  a -= 10
        a = a * 10                  a *= 10
        a = a / 10                  a /= 10
        a = a % 10                  a %= 10

         */

        //Contoh Augmented Assigments
        System.out.println("=====AUGMENTED ASSIGNMENTS=====");
        int d = 10;
        d += 10;
        System.out.println(d);

        d -= 10;
        System.out.println(d);

        d *= 10;
        System.out.println(d);

        d /= 10;
        System.out.println(d);

        d %= 10;
        System.out.println(d);
        System.out.println();

        System.out.println("=====UNARY OPERATOR=====");
        /*

        Unary Operator
        - Operator yang di tempatkan di depan variabel

        OPERATOR        KETERANGAN
        ++              a = a + 1
        --              a = a - 1
        -               Negative
        +               Positive
        !               Boolean Kebalikan

         */

        //Contoh Unary Oprtaor
        int e = +100;
        int f = -10;

        e++;
        System.out.println(e);

        f--;
        System.out.println(f);

        System.out.println(!true);
        System.out.println();

    }
}
