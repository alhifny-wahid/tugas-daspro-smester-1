package TugasDaspro; /**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramMenghitungLuasBangunDatar {
    public static  void main(String[] args) {
        int loop, pilihProgrram,panjang, luas, lebar, alas = 0, tinggi = 0,d1 , d2 ;
        double luas2,keliling;
        boolean running = true;
        System.out.println("-------------------------------------------------------------");
        System.out.println("              PROGRAM PERHITUNGAN LUAS BANGUN DATAR ");
        System.out.println("-------------------------------------------------------------\n");
        while (running){
            String[] options = {"Persegi Panjang", "Segitiga", "Layang - Layang", "keluar"};
            pilihProgrram = JOptionPane.showOptionDialog(null, "Silahkan Pilih Menu", "DAFTAR MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[3]);
            switch (pilihProgrram) {
                case 0:
                    System.out.println("\n=================> PROGRAM PERSEGI PANJANG <=================\n");
                    panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukan Panjang : "));
                    lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukan Lebar : "));
                    luas = panjang * lebar;
                    System.out.println("Panjang Persegi  : " + panjang + " cm");
                    System.out.println("Lebar persegi    : " + lebar + " cm");
                    System.out.println("\n==========================> HASIL <==========================\n");
                    System.out.println("Luas Persegi     : " + luas + " cm");
                    break;
                case 1:
                    System.out.println("\n====================> PROGRAM SEGITIGA <=====================\n");
                    alas = Integer.parseInt(JOptionPane.showInputDialog("Masukan Alas : "));
                    tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tinggi : "));
                    luas2 = 0.5 * alas * tinggi;
                    System.out.println("Panjang Persegi  : " + alas);
                    System.out.println("Lebar persegi    : " + tinggi);
                    System.out.println("\n==========================> HASIL <==========================\n");
                    System.out.println("Luas Persegi     : " + luas2);
                    break;
                case 2:
                    System.out.println("\n=================> PROGRAM LAYANG - LAYANG <=================\n");
                    d1 = Integer.parseInt(JOptionPane.showInputDialog("Diagonal 1 : "));
                    d2 = Integer.parseInt(JOptionPane.showInputDialog("Diagonal 2 : "));
                    luas2 = d1 * d2 / 2;
                    int sisiA, sisiB;
                    sisiA = Integer.parseInt(JOptionPane.showInputDialog("Sisi A : "));
                    sisiB = Integer.parseInt(JOptionPane.showInputDialog("Sisi B : "));
                    keliling = 2 * sisiA + 2 * sisiB;
                    System.out.println("Diagonal 1 : " + keliling);
                    System.out.println("Diagonal 2 : " + luas2);
                    System.out.println("Sisi A     : " + keliling);
                    System.out.println("Sisi B     : " + luas2);
                    System.out.println("\n==========================> HASIL <==========================\n");
                    System.out.println("Keliling   : " + keliling);
                    System.out.println("Luas       : " + luas2);
                    break;
                default:
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop==1){
                        running=true;
                    }else {System.exit(0);}
            }
        }

    }
}