package TugasDaspro;
/**
 * @author alhifny wahid
 */
import java.util.*;
class ProgramTiketBioskopDenganDiskon{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int jumlahPesanan = 0, pilihTiket, hargaTiket, totalHarga=0, hT = 0, bayar = 0, kembalian = 0;
        String Lagi="y", judulFilm = null, bonus = null;
        boolean running = true;
        System.out.print("\n\n-----------------------------------------------------------------------\n" +
                "\t\t\t\t\t\t WELCOME TO CINEMA ID\n" +
                "-----------------------------------------------------------------------\n" +
                "\tFILM\t\t\t  HARGA\t\t\t\t\t\tBONUS\n" +
                "-----------------------------------------------------------------------\n" +
                "[1] Aquaman\t\t\tRp 35.000\t\t10% (min pembelian 4 tiket)\n" +
                "[2] Bumblebee\t\tRp 38.000\t\t1 Popcorn (min pembelian 5 tiket)\n" +
                "[3] Spiderman\t\tRp 22.000\t\ta. 1 Popcorn + 1 Pepsi\n\t\t\t\t\t\t\t\t\t   (min pembelian Rp 60.000-90.000)\n" +
                "\t\t\t\t\t\t\t\t\tb. 3 Popcorn + 2 Pepsi\n\t\t\t\t\t\t\t\t\t   (min pembelian Rp 90.000)\n" +
                "-----------------------------------------------------------------------\n");
        for (; Lagi.equalsIgnoreCase("y"); Lagi.equalsIgnoreCase("y")){
            while (running){
                System.out.print("Pilih Tiket  : ");pilihTiket = userInput.nextInt();
                if (pilihTiket==1){
                    System.out.print("Jumlah Tiket : ");jumlahPesanan = userInput.nextInt();
                    totalHarga = jumlahPesanan*22000;
                    judulFilm = "Aquaman";
                    hT = 35000;
                    hargaTiket = 35000*jumlahPesanan;
                    if (jumlahPesanan>=4){
                        totalHarga= (int) (hargaTiket*0.90);
                        System.out.println("Selamat! anda medapatkan diskon sebesar 10%" +
                                "\n-----------------------------------------------------------------------");
                        bonus = "Diskon 10%";
                    }
                    running=false;
                }
                else if (pilihTiket==2) {
                    System.out.print("Jumlah Tiket : ");jumlahPesanan = userInput.nextInt();
                    totalHarga = jumlahPesanan*22000;
                    judulFilm = "Bumblebee";
                    hT = 38000;
                    totalHarga = jumlahPesanan*38000;
                    if (jumlahPesanan>=5){
                        bonus = "1 Popcorn";
                    }
                    running=false;
                }
                else if (pilihTiket==3) {
                    System.out.print("Jumlah Tiket : ");jumlahPesanan = userInput.nextInt();
                    totalHarga = jumlahPesanan*22000;
                    judulFilm = "Spiderman";
                    hT = 22000;
                    if (totalHarga>=60000&&totalHarga<=89000){
                        bonus = "1 Popcorn + 1 Pepsi";
                    }
                    else if (totalHarga>=90000){
                        bonus = "3 Popcorn + 2 Pepsi";
                    }
                    running=false;
                }
                else {
                    System.out.println("Tiket yang anda pilih tidak ada!!! Silahkan pilih ulang");
                    running=true;}
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\tRINCIAN PESANAN" +
                    "\n-----------------------------------------------------------------------" +
                    "\nJudul Film   : " + judulFilm +
                    "\nHarga Tiket  : Rp " + hT +
                    "\nJumlah Tiket : " + jumlahPesanan + " Buah" +
                    "\nSub Total    : Rp " + totalHarga +
                    "\nBiaya Admin  : Rp 2500");
            totalHarga=totalHarga+2500;
            System.out.print("Total Harga  : Rp " + totalHarga +
                    "\nBonus        : " + bonus +
                    "\n-----------------------------------------------------------------------" +
                    "\n\t\t\t\t\t\t   RINCIAN PEMBAYARAN" +
                    "\n-----------------------------------------------------------------------" +
                    "\nBayar        : Rp ");
            bayar = userInput.nextInt();
            kembalian = bayar-totalHarga;
            System.out.println("Kembalian    : Rp " + kembalian +
                    "\n-----------------------------------------------------------------------" +
                    "\n\t\t\t\t\t\t\tTERIMAKASIH" +
                    "\n-----------------------------------------------------------------------\n\n");
            System.out.print("BELI LAGI? [Y/N] : ");
            Lagi = userInput.next();
        }
    }
}