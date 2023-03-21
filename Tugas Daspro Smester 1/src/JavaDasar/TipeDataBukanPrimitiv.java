package JavaDasar;

public class TipeDataBukanPrimitiv {

    public static void main(String[] args) {

        /*

        Tipe Data Bukan Primitif
        - Tipe data primitiv adalah tipe bawaan di dalam bahasa pemerograman. Tipe data primitiv tidak bisa di ubah lagi
        - Tipe data nuber, char, boolean, adalah tipe data primitiv. Tipe data primitif selalu memiliki default value
        - Tipe data String bukan tipe data primitif, tipe data buka primitif tidak memiliki default value dan bisa beernilai null atau tidak ada data
        - Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya

        Representasi Tipe data primitif 1

        Primitif              Bukan primitif
        byte                  Byte
        short                 Short
        int                   Integer
        long                  Long
        float                 FLoat
        double                Double

        Representasi Tipe data primitif 2

        Primitif              Bukan primitif
        char                  Character
        boolean               Boolean
         */

        //Contoh Tipe data bukan primitif

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; //null
        iniShort = 100;

        //Contoh konversi dari primitif ke bukan primitif

        int aku = 100;
        Integer kamu = aku; // konversi dari primitif ke bukan primitif
        int akuagain = kamu; //balik ke primitif lagi

        //Contoh konversi dari primitif ke bukan primitif ke tipe data yang berbeda

        Integer iniObect = 100;
        short iniAge = iniObect.shortValue();
        long iniLong3 = iniObect.longValue();
        byte iniByte2 = iniObect.byteValue();


    }
}
