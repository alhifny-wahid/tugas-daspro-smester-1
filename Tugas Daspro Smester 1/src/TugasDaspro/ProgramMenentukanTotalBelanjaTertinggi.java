package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramMenentukanTotalBelanjaTertinggi {
    public static void main(String[] args) {
        int loop, suang = 0, repeat, j = 1, daftarMenu, kembalian=0, bayar = 0, total=0, sotoAyam = 0, pecelLele = 0, gadoGado = 0, esDegan = 0, esCampur = 0, i=1;
        boolean runing = true, running1 = true, running4 = true;
        String namaPembeli, snama = null;
        System.out.println("==============================================================");
        System.out.println("|         PROGRAM MENAMPILKAN DATA PEMBELI TERBANYAK         |");
        System.out.println("==============================================================");
        while (runing){
            namaPembeli = JOptionPane.showInputDialog("Masukkan Nama : ");
            System.out.println("\n> Pembeli ke - " + j);
            System.out.println("> Nama\t: " + namaPembeli);
            System.out.println("> Menu yang dipesan : \n\n\t-----------------------------------------\n\t| No |\t\tDaftar Menu\t|\tHarga Menu\t|\n\t-----------------------------------------");
            j++;
            running1 = true;
            while (running1){
                String[] options = {"1", "2", "3", "4", "5", "Bayar"};
                daftarMenu = JOptionPane.showOptionDialog(null, "=====> DAFTAR MENU <=====\n1. Soto Ayam Rp 15.000\n2. Pecel Lele Rp 12.000\n3. Gado Gado Rp 12.000\n4. Es Degan Rp 10.000\n5. Es Campur Rp 15.000\n>>> Pilih Menu : ", "DAFTAR MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[4]);
                if (daftarMenu==0){
                    System.out.println("\t| "+i+". |\t\t" + "Soto Ayam\t|\tRp.15.000\t|");
                    daftarMenu = 15000;
                    sotoAyam+=daftarMenu;}
                else if (daftarMenu==1){
                    System.out.println("\t| "+i+". |\t\t" + "Pecel Lele\t|\tRp.12.000\t|");
                    daftarMenu = 12000;
                    pecelLele+=daftarMenu;}
                else if (daftarMenu==2){
                    System.out.println("\t| "+i+". |\t\t" + "Gado Gado\t|\tRp.12.000\t|");
                    daftarMenu = 12000;
                    gadoGado+=daftarMenu;}
                else if (daftarMenu==3){
                    System.out.println("\t| "+i+". |\t\t" + "Es Degan\t|\tRp.10.000\t|");
                    daftarMenu = 10000;
                    esDegan+=daftarMenu;}
                else if (daftarMenu==4){
                    System.out.println("\t| "+i+". |\t\t" + "Es Campur\t|\tRp.15.000\t|");
                    daftarMenu = 15000;
                    esCampur+=daftarMenu;}
                else if (daftarMenu==5){
                    System.out.println("\t-----------------------------------------");
                    total = sotoAyam + pecelLele + gadoGado + esDegan + esCampur;
                    System.out.println("\tTotal          : " + total);
                    while (running4){
                        try {
                            running4 = false;
                            bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                        }catch (Exception e){

                        }
                        if (bayar<total){
                            JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                        }
                        else {
                            running4 = false;
                        }
                    }
                    running4 = true;
                    System.out.println("\tUang Anda      : " + bayar);
                    kembalian = bayar-total;
                    System.out.println("\tKembalian Anda : " + kembalian);
                    System.out.println("\t-----------------------------------------");
                    repeat = JOptionPane.showConfirmDialog(null, "TAMBAH PEMBELI?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (total > suang){
                        suang = total;
                        snama = namaPembeli;
                    }
                    if (repeat==0){
                        sotoAyam =0; pecelLele =0; gadoGado =0; ; esCampur = 0; running1=false;
                    }
                    else {
                        System.out.println("\n> PEMBELIAN TERTINGGI : " + snama + "\n> DENGAN TOTAL        : " + suang);
                        System.out.println("\n==============================================================");
                        System.out.println("|           TERIMAKASIH TELAH MEMBELI DI TOKO KAMI           |");
                        System.out.println("==============================================================");
                        System.exit(0);
                    }
                    i = 0;
                }
                else {
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop == 1) {
                        runing = true;
                    } else {
                        System.exit(0);
                    }
                }
                i++;
            }
        }
    }
}
