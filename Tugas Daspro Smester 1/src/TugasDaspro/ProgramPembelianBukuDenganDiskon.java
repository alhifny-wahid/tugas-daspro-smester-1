package TugasDaspro;
/**
 * @author alhifny wahid
 */
import java.util.*;
class ProgramPembelianBukuDenganDiskon{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pilihMerek, jumlahBuku=0, hargaBuku=0, totalHarga=0, bayar = 0, kembalian;
        String sidu,KyKy,Mirage,Joyko,Kenko,FaberCastel,Steadler,Lagi="y",merkBuku="";
        boolean running1 = true, running = true, running4 = true;
        while (running){
            System.out.print("\n\n-----------------------------------------\n" +
                    "\t\t MENU PILIHAN MEREK BUKU\n" +
                    "-----------------------------------------\n" +
                    "BARANG\t\t\t\t\t\tHARGA\n" +
                    "-----------------------------------------\n" +
                    "[1] Sidu\t\t\t\t\tRp 3.000/Buah\n" +
                    "[2] KyKy\t\t\t\t\tRp 3.500/Buah\n" +
                    "[3] Mirage\t\t\t\t\tRp 1.500/Buah\n" +
                    "[4] Joyko\t\t\t\t\tRp 1.700/Buah\n" +
                    "[5] Kenko\t\t\t\t\tRp 1.600/Buah\n" +
                    "[6] Faber Castel\t\t\tRp 1.800/Buah\n" +
                    "[7] Steadler\t\t\t\tRp 2.000/Buah\n" +
                    "-----------------------------------------\n");
            running1=true;
            while (running1){
                System.out.print("Pilih Merek Buku : ");
                pilihMerek = userInput.nextInt();
                switch (pilihMerek){
                    case 1: merkBuku = "Sidu"; hargaBuku = 3000; running1 = false; break;
                    case 2: merkBuku = "KyKy"; hargaBuku = 3500; running1 = false; break;
                    case 3: merkBuku = "Mirage"; hargaBuku = 1500; running1 = false; break;
                    case 4: merkBuku = "Joyko"; hargaBuku = 1700; running1 = false; break;
                    case 5: merkBuku = "Kenko"; hargaBuku = 1600; running1 = false; break;
                    case 6: merkBuku = "Faber Castel"; hargaBuku = 1800; running1 = false; break;
                    case 7: merkBuku = "Steadler"; hargaBuku = 2000; running1 = false; break;
                    default: System.out.println(">>> Buku yang anda pilih tidak ada! Pilih ulang menu...\n");
                        running1 = true; break;
                }
            }
            System.out.print("Jumlah Buku \t : ");jumlahBuku = userInput.nextInt();
            totalHarga = hargaBuku*jumlahBuku;
            System.out.println("-----------------------------------------\n" +
                    "\t\t\tRINCIAN PESANAN\n" +
                    "-----------------------------------------\n" +
                    "Merek Buku  : " + merkBuku +
                    "\nHarga Buku  : " + hargaBuku +
                    "\nJumlah Buku : " + jumlahBuku +
                    "\nTotal Harga : " + totalHarga +
                    "\n-----------------------------------------");
            if (jumlahBuku >= 12 && jumlahBuku < 20){
                System.out.println(" Selamat!!! Anda Mendapatkan Diskon 10%");
                totalHarga = (int) (totalHarga*0.9);
            }
            else if (jumlahBuku >= 20){
                System.out.println(" Selamat!!! Anda Mendapatkan Diskon 15%");
                totalHarga = (int) (totalHarga*0.85);
            }
            else {
                System.out.println("Anda Suka Diskon?\nSAYA AKAN BERIKAN ITU Jika anda\n1. Belanja lebih dari 1 lusin mendapatkan\n   diskon 10%\n2. Belanja lebih dari 1 kodi mendapatkan\n   diskon 15%\n-----------------------------------------");
            }
            System.out.print("-----------------------------------------\n" +
                    "\t\t   RINCIANN PEMBAYARAN\n" +
                    "-----------------------------------------\n" +
                    "Total Akhir : Rp " + totalHarga);
            while (running4){
                System.out.print("\nBayar       : Rp ");
                bayar = userInput.nextInt();
                if (bayar<totalHarga){
                    System.out.println("Nominal yang anda masukkan kurang dari total, Silahkan lakukan pembayaran ulang");
                }
                else {
                    running4 = false;
                }
            }
            running4 = true;
            kembalian = bayar-totalHarga;
            System.out.println("Kembalian   : Rp " + kembalian + "" +
                    "\n-----------------------------------------" +
                    "\n               TERIMAKASIH" +
                    "\n-----------------------------------------\n\n");
            System.out.print("BELI LAGI? [Y/N] : ");
            Lagi = userInput.next();
            if (Lagi.equalsIgnoreCase("y")){
                System.out.print("\033[H\033[2J");
                running=true;
            }
            else {System.exit(0);}
        }
    }
}