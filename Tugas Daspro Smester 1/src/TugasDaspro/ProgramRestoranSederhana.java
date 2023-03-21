package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
class ProgramRestoranSederhana{
    public static void main(String[] args) {
        int daftarMenu, kembalian=0, bayar, total=0, nasiGoreng = 0, nasiRawon = 0, nasiGudeg = 0, esJeruk = 0, i=1;
        boolean runing = true;
        System.out.println("-------------------------------------------------------------");
        System.out.println("|           SELAMAT DATANG DI RUMAH MAKAN UNITOMO           |");
        System.out.println("-------------------------------------------------------------\n");
        while (runing=true){
            String[] options = {"Nasi Goreng", "Nasi Rawon", "Nasi Gudeg", "Jus Jeruk", "Hitung Total", "Keluar"};
            daftarMenu = JOptionPane.showOptionDialog(null, "Silahkan Pilih Menu", "DAFTAR MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[5]);
            if (daftarMenu==0){
                System.out.println("\tPesanan Ke - "+i+" : "+options[0]);
                daftarMenu = 15000;
                nasiGoreng+=daftarMenu;}
            else if (daftarMenu==1){
                System.out.println("\tPesanan Ke - "+i+" : "+options[1]);
                daftarMenu = 15000;
                nasiRawon+=daftarMenu;}
            else if (daftarMenu==2){
                System.out.println("\tPesanan Ke - "+i+" : "+options[2]);
                daftarMenu = 15000;
                nasiGudeg+=daftarMenu;}
            else if (daftarMenu==3){
                System.out.println("\tPesanan Ke - "+i+" : "+options[3]);
                daftarMenu = 15000;
                esJeruk+=daftarMenu;}
            else if (daftarMenu==4){
                System.out.println("\tAnda Memilih   : " + options[4]);
                total = nasiGoreng + nasiRawon + nasiGudeg + esJeruk;
                System.out.println("\tTotal          : " + total);
                bayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumalah Pembayaran sebesar : Rp "+total));
                System.out.println("\tUang Anda      : " + bayar);
                kembalian = bayar-total;
                System.out.println("\tKembalian Anda : " + kembalian);
                System.out.println("-------------------------------------------------------------");
                i = 0;
                nasiGoreng =0;
                nasiRawon=0;
                nasiGudeg=0;
                esJeruk=0;}
            else {
                System.out.println("\tAnda Memilih   : " + options[5]);
                System.out.println("\n-------------------------------------------------------------");
                System.out.println("|          TERIMAKASIH TELAH MEMBELI DI TOKO KAMI           |");
                System.out.println("-------------------------------------------------------------");
                System.exit(0);}
            i++;
        }
    }
}