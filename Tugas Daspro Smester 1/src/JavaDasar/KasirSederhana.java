package JavaDasar;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Pilihan, Umur, PilihanMenu, Makanan, Minuman, Snack, JmlPesanan, Total = 0, Bayar = 0,Kembalian;
        String Menu = "-", Lagi;
        double Ipk;
        for (Lagi="y"; Lagi.equalsIgnoreCase("y"); Lagi.equalsIgnoreCase("Y")){
            Pilihan = Integer.parseInt(JOptionPane.showInputDialog("==========> DAFTAR PILIHAN <==========\n1. Menu Makanan & Minuman\n2. Voucher Makan Gratis\n====================================\n\nMasukkan Pilihan"));
            if (Pilihan==1){
                PilihanMenu = Integer.parseInt(JOptionPane.showInputDialog("==========> MENU  <==========\n1. Makanan\n2. Minuman\n3. Snack\n=============================\n\nPilih Menu"));
                if (PilihanMenu==1){
                    Makanan = Integer.parseInt(JOptionPane.showInputDialog("==========> MAKANAN <==========\n1. Nasi Putih  Rp. 12,000\n2. Ayam Chindo  Rp. 22,000\n3. Sate India   Rp. 15,000\n4. Bubur Ayam   Rp. 17,000\n5. Bebek Padang Rp. 27,000\n================================\n\nPilih Makanan"));
                    JmlPesanan =  Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan"));
                    if (Makanan==1){
                        Total=12000*JmlPesanan;
                        Menu = "Nasi Putih";
                    }
                    else if (Makanan==2){
                        Total=22000*JmlPesanan;
                        Menu = "Ayam Chindo ";
                    }
                    else if (Makanan==3){
                        Total=15000*JmlPesanan;
                        Menu = "Sate India";
                    }
                    else if (Makanan==4){
                        Total=17000*JmlPesanan;
                        Menu = "Bubur Ayam";
                    }
                    else if (Makanan==5){
                        Total=27000*JmlPesanan;
                        Menu = "Bebek Padang";
                    }
                    else {
                        System.out.println("========================================================\nMohon Coba Kembali!\n========================================================\n");
                    }
                    System.out.println("===================> RINCIAN PESANAN <==================\nPILIHAN  : Makanan" + "\nMENU     : " + Menu + "\nJUMLAH   : " + JmlPesanan + "\nTOTAL    : " + Total);
                }
                else if (PilihanMenu==2){
                    Minuman = Integer.parseInt(JOptionPane.showInputDialog("==========> MINUMAN <==========\n1. Es Kiamat\tRp. 7,000\n2. Teh Tarik\tRp. 6,000\n3. Kopi Susu\tRp. 9,000\n4. Wedang Jahe\tRp. 5,000\n5. Air Mineral\tRp. 4,000\n====================================\n\nPilih Minuman"));
                    System.out.print("Jumlah Pesanan   : ");
                    JmlPesanan =  Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan"));
                    if (Minuman==1){
                        Total=7000*JmlPesanan;
                        Menu = "Es Kiamat";
                    }
                    else if (Minuman==2){
                        Total=6000*JmlPesanan;
                        Menu = "Teh Tarik";
                    }
                    else if (Minuman==3){
                        Total=9000*JmlPesanan;
                        Menu = "Kopi Susu";
                    }
                    else if (Minuman==4){
                        Total=5000*JmlPesanan;
                        Menu = "Wedang Jahe";
                    }
                    else if (Minuman==5){
                        Total=4000*JmlPesanan;
                        Menu = "Air Mineral";
                    }
                    else {
                        System.out.println("========================================================\nMohon Coba Kembali!\n========================================================\n");
                    }
                    System.out.println("===================> RINCIAN PESANAN <==================" +
                            "\nPILIHAN  : Minuman" +
                            "\nMENU     : " + Menu +
                            "\nJUMLAH   : " + JmlPesanan +
                            "\nTOTAL    : " + Total);
                }
                else if (PilihanMenu==3){
                    System.out.print("=======================> SNACK <========================" +
                            "\n[1] " +
                            "\n[2] " +
                            "\n[3] " +
                            "\n[4] " +
                            "\n[5] " +
                            "\n========================================================" +
                            "\nPilih Menu       : ");
                    Snack = Integer.parseInt(JOptionPane.showInputDialog("> SNACK\n[1] Tahu Krispi\tRp.  8,000\tRp. 7,000\n[2] Tahu Kerikil\tRp.  8,000\tRp. 6,000\n[3] Lumpia\tRp.  8,000\n[4] Risole\tRp. 10,000\n[5] Pisang Keju\t Rp. 15,000\n\nPilih Snack"));
                    JmlPesanan =  Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan"));
                    if (Snack==1){
                        Total=8000*JmlPesanan;
                        Menu = "Tahu Krispi";
                    }
                    else if (Snack==2){
                        Total=8000*JmlPesanan;
                        Menu = "Tahu Kerikil";
                    }
                    else if (Snack==3){
                        Total=8000*JmlPesanan;
                        Menu = "Lumpia ";
                    }
                    else if (Snack==4){
                        Total=10000*JmlPesanan;
                        Menu = "Risole";
                    }
                    else if (Snack==5){
                        Total=15000*JmlPesanan;
                        Menu = "Pisang Keju";
                    }
                    else {
                        System.out.println("========================================================\nMohon Coba Kembali!\n========================================================\n");
                    }
                    System.out.println("===================> RINCIAN PESANAN <==================" +
                            "\nPILIHAN  : Snack" +
                            "\nMENU     : " + Menu +
                            "\nJUMLAH   : " + JmlPesanan +
                            "\nTOTAL    : " + Total);
                }
                else {
                    System.out.println("========================================================\nMohon Coba Kembali!\n========================================================\n");
                }
                System.out.println("=================> RINCIAN PEMBAYARAN <=================");
                System.out.print("BAYAR      : Rp. ");
                Bayar = input.nextInt();
                Kembalian = Bayar-Total;
                System.out.println("KEMBALIAN  : Rp. "+Kembalian);
                System.out.println("=====================> TERIMKASIH <=====================");
            }
            else if (Pilihan==2){
                System.out.print("================> VOUCHER MAKAN GRSTIS <================" +
                        "\nVoucher Makanan Gratis ini bisa di klaim dengan Syarat: " +
                        "\n\t1. Bagi Anda Yang berumur 18 Tahun" +
                        "\n\t2. Mahasiswa Dengan nilai IPK di atas 3.8" +
                        "\n\nMasukkan Umur  : ");
                Umur = input.nextInt();
                System.out.print("Masukkan IPK   : ");
                Ipk = input.nextDouble();
                System.out.println("========================================================");
                if (Umur==18 && Ipk>=3.8){
                    System.out.println("Selamat! anda mendapatkan voucher makanan Gratis");
                }
                else {
                    System.out.println("Maaf, Anda belum memenuhi Syarat Voucher Makanan Gratis!");
                }
                System.out.println("========================================================");
            }
            else {
                System.out.println("========================================================\nMohon Coba Kembali!\n========================================================\n");
            }
            Lagi =  (JOptionPane.showInputDialog("Pesan Lagi? [Y/N]"));
        }
    }
}