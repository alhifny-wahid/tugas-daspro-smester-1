package JavaDasar;

public class JOptionPane {
    public static void main(String[] args){
        /*

        Beberapa Variasi OutPut
        Ada beberapa bentuk JavaDasar.JOptionPane.showMessageDialog :
        1.  INFORMATION_MESSAGE
            JavaDasar.JOptionPane.showMessageDialog(null, "Selamat Datang", Judul, JavaDasar.JOptionPane.INFORMATION_MESSAGE);
        2.  WARING_MESSAGE
            JavaDasar.JOptionPane.showMessageDialog(null, "Selamat Datang", Judul, JavaDasar.JOptionPane.WARNING_MESSAGE);
        3.  ERROR_MESSAGE
            JavaDasar.JOptionPane.showMessageDialog(null, "Selamat Datang", Judul, JavaDasar.JOptionPane.ERROR_MESSAGE);

        -   Input yang diperoleh dari JavaDasar.JOptionPane.showInputDialog(".....") memiliki tipe data String
        -   Jika ingin mengolah data input tersebut menjadi tipe data lain maka harus dikonversi / di-parse dari String ke tipe data tujuan, misal :

            String input = JavaDasar.JOptionPane.showInputDialog("Masukkan Angka : ");
            int angka1 = Integer.parseInt(input);
            double angka2 = Double.parseDouble(input);

        -   Parse String ke Tipe Data Lain

            TIPE DATA TUJUAN            KODE PROGRAM
            byte                        Byte.parseByte()
            short                       Short.parseShort()
            int                         Integer.parseInt()
            long                        Long.parseLong()
            float                       Float.parseFloat()
            double                      Double.parseDouble()
            boolean                     Boolean.parseBoolean()


         */
    }
}
