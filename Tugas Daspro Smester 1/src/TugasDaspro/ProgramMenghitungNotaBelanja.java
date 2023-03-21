package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramMenghitungNotaBelanja {
    public static void main(String[] args) {
        String namaBarang = "";
        boolean running = true;
        int subTotal, total = 0, loop, jumlahNota, jumlahItem, hargaBarang = 0, daftarBarang, jumlahPesanan = 0, kemeja = 0, kaos = 0, celana = 0, sepatu = 0;
        System.out.println("==========>NOTA BELANJA<==========");
        jumlahNota = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Nota yang Dicetak : "));
        jumlahItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Item yang Dibeli : "));
        while (running){
            for (int i = 1; i<=jumlahItem; i++){
                String[] options = {"1", "2", "3", "4", "Keluar"};
                daftarBarang = JOptionPane.showOptionDialog(null, "=====> DAFTAR BARANG <=====\n1. Kemeja\n2. Kaos\n3. Celana\n4. Sepatu\nPiilih Barang : ", "Pesanan Ke " + i,
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[4]);
                if (daftarBarang==0){
                    jumlahPesanan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pesanan ke - " + i));
                    namaBarang = "Kemeja";
                    hargaBarang = 125000;
                    subTotal = hargaBarang*jumlahPesanan;
                    kemeja+=subTotal;
                }
                else if (daftarBarang==1){
                    jumlahPesanan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pesanan : " + i));
                    namaBarang = "Kaos";
                    hargaBarang = 75000;
                    subTotal = hargaBarang*jumlahPesanan;
                    kaos+=subTotal;
                }
                else if (daftarBarang==2){
                    jumlahPesanan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pesanan : " + i));
                    namaBarang = "Celana";
                    hargaBarang = 150000;
                    subTotal = hargaBarang*jumlahPesanan;
                    celana+=subTotal;
                }
                else if (daftarBarang==3){
                    jumlahPesanan = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pesanan : " + i));
                    namaBarang = "Sepatu";
                    hargaBarang = 200000;
                    subTotal = hargaBarang*jumlahPesanan;
                    sepatu+=subTotal;
                }
                else {
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop == 1) {
                        running = true;
                    } else {
                        System.exit(0);
                    }
                }
                for (int j = 1; j <= jumlahNota; j++){
                    total = hargaBarang*jumlahPesanan;
                    System.out.println("\n>>>Item ke - "+i);
                    System.out.println("Harga " + namaBarang + "  : " + hargaBarang);
                    System.out.println("Jumlah Barang : " + jumlahPesanan);
                    System.out.println("Total Harga   : " + total);
                    }
                if (i==jumlahItem){
                    total = kemeja+kaos+celana+sepatu;
                    System.out.println("\n==================================");
                    System.out.println("Total Keseluruhan : " + total);
                    System.out.println("==================================");
                }
            }
        }
    }
}