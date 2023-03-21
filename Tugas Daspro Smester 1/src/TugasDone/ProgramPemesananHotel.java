package TugasDone;

import java.util.Scanner;
public class ProgramPemesananHotel {
    public static void main(String[] args){
        Byte KelasKamar;
        int  TotalServe = 0, TotalLayananWifi = 0, JmlKamar=0, LamaMenginap=0, TotalKamar, TotalHari, TotalKeseluruhan;
        long Bayar, Kembalian;
        String Serve, LayananWifi = null;
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("=====> WELCOME TO HOTEL BANG JARWO <=====");
        System.out.println("=========================================\n");
        System.out.println("=============> KELAS KAMAR <=============");
        System.out.println("[1] PRESIDEN    RP 800,000 / KAMAR\n" +
                "                RP 400,000 / HARI\n" +
                "[2] EKSKLUSIF   RP 500,000 / KAMAR\n" +
                "                RP 300,000 / HARI\n" +
                "[3] REGULER     RP 200,000 / KAMAR\n" +
                "                RP 100,000 / HARI");
        System.out.println("==========> PROSES PEMESSANAN <==========");
        System.out.print("PILIH KELAS   : ");
        KelasKamar  =   input.nextByte();

        if (KelasKamar==1){
            System.out.print("JUMLAH KAMAR  : ");
            JmlKamar     =   input.nextInt();
            System.out.print("LAMA MENGINAP : ");
            LamaMenginap =   input.nextInt();
            TotalKamar   =   800000*JmlKamar;
            TotalHari    =   400000*LamaMenginap;
            TotalKeseluruhan = TotalKamar+TotalHari;
            System.out.println("===========> RINCIAN PESANAN <===========");
            System.out.println("KELAS         : PRESIDEN");
            System.out.println("JUMLAH KAMAR  : "+JmlKamar+" KAMAR RP "+TotalKamar);
            System.out.println("LAMA MENGINAP : "+LamaMenginap+" HARI RP "+TotalHari);
            System.out.println("TOTAL         : RP "+TotalKeseluruhan);
            System.out.println("==========> RINCIAN PEMBAYARAN <==========");
            System.out.print("BAYAR RP      : ");
            Bayar   =   input.nextLong();
            Kembalian = Bayar-TotalKeseluruhan;
            System.out.println("KEMBALIAN     : RP "+Kembalian);
        }
        else if (KelasKamar==2){
            System.out.print("JUMLAH KAMAR  : ");
            JmlKamar     =   input.nextInt();
            System.out.print("LAMA MENGINAP : ");
            LamaMenginap =   input.nextInt();
            TotalKamar   =   500000*JmlKamar;
            TotalHari    =   300000*LamaMenginap;

            System.out.print("SARAPAN PAGI? [Y/N] : ");
            Serve = input.next();
            System.out.println("===========> RINCIAN PESANAN <===========");
            System.out.println("KELAS         : EKSKLUSIF");
            System.out.println("JUMLAH KAMAR  : "+JmlKamar+" KAMAR RP "+TotalKamar);
            System.out.println("LAMA MENGINAP : "+LamaMenginap+" HARI RP "+TotalHari);
            switch (Serve) {
                case "y":
                    TotalServe = 40000 * LamaMenginap;
                    System.out.println("SARAPAN PAGI  : RP "+TotalServe+" "+LamaMenginap+" HARI");
                    break;
                case "Y":
                    TotalServe = 40000 * LamaMenginap;
                    System.out.println("SARAPAN PAGI  : RP "+TotalServe+" "+LamaMenginap+" HARI");
                    break;
                default:
                    System.out.println("SARAPAN PAGI  : -");
            }
            TotalKeseluruhan = TotalKamar+TotalHari+TotalServe;
            System.out.println("TOTAL         : RP "+TotalKeseluruhan);
            System.out.println("==========> RINCIAN PEMBAYARAN <==========");
            System.out.print("BAYAR RP      : ");
            Bayar   =   input.nextLong();
            Kembalian = Bayar-TotalKeseluruhan;
            System.out.println("KEMBALIAN     : RP "+Kembalian);
        }
        else if (KelasKamar==3){
            System.out.print("JUMLAH KAMAR  : ");
            JmlKamar     =   input.nextInt();
            System.out.print("LAMA MENGINAP : ");
            LamaMenginap =   input.nextInt();
            TotalKamar   =   200000*JmlKamar;
            TotalHari    =   100000*LamaMenginap;

            System.out.print("LAYANAN WIFI?\n" +
                    "[Y/N]         : ");
            LayananWifi = input.next();
            System.out.print("SARAPAN PAGI?\n" +
                    "[Y/N]         : ");
            Serve = input.next();
            System.out.println("===========> RINCIAN PESANAN <===========");
            System.out.println("KELAS         : REGULER");
            System.out.println("JUMLAH KAMAR  : "+JmlKamar+" KAMAR RP "+TotalKamar);
            System.out.println("LAMA MENGINAP : "+LamaMenginap+" HARI RP "+TotalHari);
            switch (LayananWifi) {
                case "y":
                    TotalLayananWifi = 20000 * LamaMenginap;
                    System.out.println("LAYANAN WIFI  : RP "+TotalLayananWifi+" "+LamaMenginap+" HARI");
                    break;
                case "Y":
                    TotalLayananWifi = 20000 * LamaMenginap;
                    System.out.println("LAYANAN WIFI  : RP "+TotalLayananWifi+" "+LamaMenginap+" HARI");
                    break;
                default:
                    System.out.println("LAYANAN WIFI  : -");
            }
            switch (Serve) {
                case "y":
                    TotalServe = 25000 * LamaMenginap;
                    System.out.println("SARAPAN PAGI  : RP "+TotalServe+" "+LamaMenginap+" HARI");
                    break;
                case "Y":
                    TotalServe = 25000 * LamaMenginap;
                    System.out.println("SARAPAN PAGI  : RP "+TotalServe+" "+LamaMenginap+" HARI");
                    break;
                default:
                    System.out.println("SARAPAN PAGI  : -");
            }
            TotalKeseluruhan = TotalKamar+TotalHari+TotalServe+TotalLayananWifi;
            System.out.println("TOTAL         : RP "+TotalKeseluruhan);
            System.out.println("==========> RINCIAN PEMBAYARAN <=========");
            System.out.print("BAYAR         : RP ");
            Bayar   =   input.nextLong();
            Kembalian = Bayar-TotalKeseluruhan;
            System.out.println("KEMBALIAN     : RP "+Kembalian);
        }
        System.out.println("=========================================");
        System.out.println("=============> TERIMAKASIH <=============");
        System.out.println("=========================================");
    }

}