package JavaDasar;

import java.util.Scanner;
public class NestedIf_KasirSederhana1 {
    public static void main(String hifny[]){
        Scanner input = new Scanner(System.in);
        String m1="AYAM GORENG", m2="RENDANG ", m3="RENDANG ", mi1="ES TEH", mi2="ES KELAPA", mi3="ES SUSU", s1="POTATO", s2="PISCOK", s3="KUPING GAJAH";
        for (String ul="y"; ul.equals("y"); ul.equals("Y")){
            System.out.println("==========MENU==========");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Snack");
            System.out.println();
            System.out.print("Pilih Menu : ");
            byte pilihan = input.nextByte();
            if (pilihan==1){
                System.out.println("==========MENU MAKANAN==========");
                System.out.println("1. AYAM GORENG    10.000");
                System.out.println("2. RENDANG        12.000");
                System.out.println("3. SOTO           15.000");
                System.out.println();
                System.out.print("Pilih Menu     : ");
                byte pilihan2 = input.nextByte();
                System.out.print("Jumlah Pesanan : ");
                int jumlah = input.nextInt();

                if (pilihan2==1) {
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + m1);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 10000 * jumlah);

                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 10000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==2){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + m2);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 12000*jumlah);

                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 12000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==3){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + m3);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 15000*jumlah);

                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 15000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
            }
            //====================================================================
            //====================================================================
            //====================================================================
            else if (pilihan==2){
                System.out.println("==========MENU MINUMAN==========");
                System.out.println("1. ES TEH         3.000");
                System.out.println("2. ES KELAPA      5.000");
                System.out.println("3. ES SUSU        4.000");
                System.out.println();
                System.out.print("Pilih Menu     : ");
                byte pilihan2 = input.nextByte();
                System.out.print("Jumlah Pesanan : ");
                byte jumlah = input.nextByte();
                if (pilihan2==1){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + mi1);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 3000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 3000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==2){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + mi2);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 5000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 5000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==3){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + mi3);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 4000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();


                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 4000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
            }
            //====================================================================
            //====================================================================
            //====================================================================
            else if (pilihan==3){
                System.out.println("==========MENU SNACK==========");
                System.out.println("1. POTATO         7.000");
                System.out.println("2. PISCOK         9.000");
                System.out.println("3. KUPING GAJAH   5.000");
                System.out.println();
                System.out.print("Pilih Menu     : ");
                byte pilihan2 = input.nextByte();
                System.out.print("Jumlah Pesanan : ");
                byte jumlah = input.nextByte();
                if (pilihan2==1){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + s1);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 7000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();
                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 7000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==2){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + s2);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 9000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();
                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 9000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
                else if (pilihan2==3){
                    System.out.println("==========MENU YG ANDA PILIH==========");
                    System.out.println("1. PESANAN     : " + s3);
                    System.out.println("2. JUMLAH      : " + jumlah);
                    System.out.println("3. TOTAL HARGA : " + 5000*jumlah);
                    System.out.println("==========PEMBAYARAN VIA==========");
                    System.out.println("1. TRANSFER BANK");
                    System.out.println("2. TUNAI");
                    System.out.print("Pilih Menu : ");
                    byte via = input.nextByte();
                    int bayar2 = 0;
                    if (via == 1) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.println("- Pilih metode pembayaran \"Bank Transfer\".");
                        System.out.println("- Pilih BANK BRI");
                        System.out.println("- Masukkan NO REK \"0855569124\"");
                        System.out.println("- Masukkan Nominal Pembayaran");
                        System.out.println("- Selesai");
                    } else if (via == 2) {
                        System.out.println("==========PEMBAYARAN YG ANDA PILIH==========");
                        System.out.print("Bayar Rp. : ");
                        bayar2 = input.nextInt();
                    }
                    int tt = 5000 * jumlah;
                    int kem = bayar2-tt;
                    System.out.println("Kembalian : " + kem);
                    System.out.println("Terimkasih Telah berbelanja di sini...");
                }
            }
            System.out.print("Ingin Berbelanja Lagi? y/n : ");
            ul = input.next();
        }
    }
}