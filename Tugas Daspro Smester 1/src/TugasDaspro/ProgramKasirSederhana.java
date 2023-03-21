package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramKasirSederhana {
    public static void main(String[] args) {
        int Pilihan, Umur, PilihanMenu = 0, Makanan = 0, Minuman, Snack, JmlPesanan = 0, Total = 0, Bayar = 0,Kembalian, loop;
        String Menu = "-";
        double Ipk;
        boolean running = true, running1 = true, running2 = true;
        while (running){
            String[] options = {"Menu Makanan & Minuman", "Voucher Makan Gratis", "Keluar"};
            Pilihan = JOptionPane.showOptionDialog(null, "Silahkan Pilih Menu", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[2]);
            if (Pilihan==0){
                while (running2){
                    String[] options1 = {"Makanan", "Minuman", "Snack"};
                    PilihanMenu = JOptionPane.showOptionDialog(null, "Silahkan Pilih Menu", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options1, options1[2]);
                    if (PilihanMenu==0){
                        running2 = false;
                        String[] optionsMakanan = {"1", "2", "3", "4", "5"};
                        while (running1) {
                            Makanan = JOptionPane.showOptionDialog(null, ">>> Daftar Menu Makanan\n\n1. Nasi Putih Rp. 12.000\n2. Ayam Chindo Rp. 22.000\n3. Sate India Rp. 15.000\n4. Bubur Ayam Rp. 17.000\n5. Bebek Padang Rp. 27.000\n\n>>> Pilih Menu", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                                    null, optionsMakanan, optionsMakanan[4]);
                            if (Makanan==0){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog(null,"Jumlah Pesanan : ","",JOptionPane.PLAIN_MESSAGE));
                                Total=12000*JmlPesanan;
                                Menu = "Nasi Putih";
                            }
                            else if (Makanan==1){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=22000*JmlPesanan;
                                Menu = "Ayam Chindo";
                            }
                            else if (Makanan==2){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=15000*JmlPesanan;
                                Menu = "Sate India";
                            }
                            else if (Makanan==3){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=17000*JmlPesanan;
                                Menu = "Bubur Ayam";
                            }
                            else if (Makanan==4){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=27000*JmlPesanan;
                                Menu = "Bebek Padang";
                            }
                            else {
                                loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                if (loop==1){
                                    running1=true;
                                }else {System.exit(0);}
                            }
                        }
                        System.out.println("===================> RINCIAN PESANAN <==================\nPILIHAN  : Makanan" + "\nMENU     : " + Menu + "\nJUMLAH   : " + JmlPesanan + "\nTOTAL    : " + Total);
                    }
                    else if (PilihanMenu==1){
                        running2 = false;
                        while (running1){
                            String[] optionsMinuman = {"1", "2", "3", "4", "5"};
                            Minuman = JOptionPane.showOptionDialog(null, ">>> Daftar Menu Minuman\n\n1. Es Kiamat Rp. 7.000\n2. Teh Tarik Rp. 6.000\n3. Kopi Susu Rp. 9.000\n4. Wedang Jahe Rp. 5.000\n5. Air Mineral Rp. 4.000\n\n>>> Pilih Menu", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                                    null, optionsMinuman, optionsMinuman[4]);
                            if (Minuman==0){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=7000*JmlPesanan;
                                Menu = "Es Kiamat";
                            }
                            else if (Minuman==1){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=6000*JmlPesanan;
                                Menu = "Teh Tarik";
                            }
                            else if (Minuman==2){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=9000*JmlPesanan;
                                Menu = "Kopi Susu";
                            }
                            else if (Minuman==3){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=5000*JmlPesanan;
                                Menu = "Wedang Jahe";
                            }
                            else if (Minuman==4){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=4000*JmlPesanan;
                                Menu = "Air Mineral";
                            }
                            else {
                                loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                                System.out.println(loop);
                                if (loop==1 || loop==-1){
                                    running1 = true;
                                }else {System.exit(0);}
                            }
                        }
                        System.out.println("===================> RINCIAN PESANAN <==================\nPILIHAN  : Minuman\nMENU     : " + Menu + "\nJUMLAH   : " + JmlPesanan + "\nTOTAL    : " + Total);
                    }
                    else if (PilihanMenu==2){
                        running2 = false;
                        while (running1){
                            String[] optionsSnack = {"1", "2", "3", "4", "5"};
                            Snack = JOptionPane.showOptionDialog(null, ">>> Daftar Menu Makanan Ringan\n\n1. Tahu Krispi Rp. 8.000\n2. Tahu Kerikil Rp. 8.000\n3. Lumpia Rp. 8.000\n4. Risole Rp. 10.000\n5. Pisang Keju Rp. 15.000\n\n>>> Pilih Menu", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                    null, optionsSnack, optionsSnack[4]);
                            if (Snack==0){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=8000*JmlPesanan;
                                Menu = "Tahu Krispi";
                            }
                            else if (Snack==1){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=8000*JmlPesanan;
                                Menu = "Tahu Kerikil";
                            }
                            else if (Snack==2){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=8000*JmlPesanan;
                                Menu = "Lumpia";
                            }
                            else if (Snack==3){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=10000*JmlPesanan;
                                Menu = "Risole";
                            }
                            else if (Snack==4){
                                running1 = false;
                                JmlPesanan = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                                Total=15000*JmlPesanan;
                                Menu = "Pisang Keju";
                            }
                            else {
                                loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                                if (loop == 1 || loop == -1){
                                    running1 = true;
                                }else {System.exit(0);}
                            }
                        }
                        System.out.println("===================> RINCIAN PESANAN <==================\nPILIHAN  : Snack\nMENU     : " + Menu + "\nJUMLAH   : " + JmlPesanan + "\nTOTAL    : " + Total);
                    }
                    else {
                        loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                        if (loop==1){
                            running2=true;
                        }else {System.exit(0);}
                    }
                }
                running2 = true;
                running1 = true;
                System.out.println("=================> RINCIAN PEMBAYARAN <=================");
                Bayar = Integer.parseInt(JOptionPane.showInputDialog("Bayar pesanan sebesar "+Total+" Ribu"));
                System.out.println("BAYAR      : Rp. "+Bayar);
                Kembalian = Bayar-Total;
                System.out.println("KEMBALIAN  : Rp. "+Kembalian);
                System.out.println("=====================> TERIMKASIH <=====================");
            }
            else if (Pilihan==1){
                System.out.print("================> VOUCHER MAKAN GRATIS <================\n");
                JOptionPane.showMessageDialog(null, "Voucher Makanan Gratis ini bisa di klaim dengan Syarat: \n\t1. Bagi Anda Yang berumur 18 Tahun\n\t2. Mahasiswa Dengan nilai IPK di atas 3.8\n");
                Umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur : "));
                System.out.println("Umur           : "+Umur);
                Ipk = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Ipk"));
                System.out.println("IPK            : "+Umur);
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
                loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (loop==1){
                    running=true;
                }else {System.exit(0);}
            }
        }
    }
}