package JavaDasar;

public class KonversiTipeDataNumber {

    public static void main(String[] args) {

        //Konversi tipe data number
        //- Widening Casting (Otomatis): byte -> Short -> int -> long -> float -> double
        //- Narrowing Casting (Manual): double -> float -> long -> int -> char -> short -> byte

        //Contoh

        //widening casting atau otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        //narrowing casting atau manual
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;



    }
}
