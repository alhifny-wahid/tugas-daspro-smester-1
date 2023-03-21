package TugasDone;

import java.util.Scanner;
public class PerulanganBintangDanAngka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ulang;
        byte Pilihan;
        int baris, i, j, k;

        for (ulang = "y"; ulang.equals("y"); ulang.equals("Y")){
            System.out.println("==========> LIST PROGRAM <==========");
            System.out.println("1.  SEGITIGA BOLONG TENGAH BINTANG");
            System.out.println("2.  SEGITIGA BOLONG TENGAH ANGKA");
            System.out.println("3.  KOTAK BOLONG TENGAH BINTANG");
            System.out.println("4.  KOTAK BOLONG TENGAH ANGKA");
            System.out.println("5.  TRAPESIUM BINTANG");
            System.out.println("6.  TRAPESIUM ANGKA");
            System.out.println("7.  TANDA + BINTANG");
            System.out.println("8.  TANDA + ANGKA");
            System.out.println("9.  BENTUK 8 BINTANG");
            System.out.println("10. BENTUK 8 ANGKA");
            System.out.println("11. BELAH KETUPAT BINTANG");
            System.out.println("12. BELAH KETUPAT ANGKA");
            System.out.println("13. SEGITIGA TERBALIK BINTANG");
            System.out.println("14. SEGITIGA TERBALIK ANGKA");
            System.out.println("=====================================");
            System.out.print("PILIH  PROGRAM : ");
            Pilihan = sc.nextByte();
            System.out.println("==============> INPUT <==============");
            if (Pilihan==1){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i <= baris; i++) {
                    for (j = baris; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (k = i; k >= 1; k--) {

                        if (i == 1 || i == baris || k == i || k == 1){
                            System.out.print("   *");
                        }else {
                            System.out.print("    ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }
            else if (Pilihan==2){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i <= baris; i++) {
                    for (j = baris; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (k = i; k >= 1; k--) {

                        if (i == 1 || i == baris || k == i || k == 1){
                            System.out.print("   "+i);
                        }else {
                            System.out.print("    ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }
            else if (Pilihan==3){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i=1; i<=baris; i++){
                    for (j=1; j<=baris; j++){
                        if (i==1 || i==baris || j==1 || j==baris){
                            System.out.print("*  ");
                        }
                        else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==4){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i=1; i<=baris; i++){
                    for (j=1; j<=baris; j++){
                        if (i==1 || i==baris || j==1 || j==baris){
                            System.out.print(i+"  ");
                        }
                        else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==5){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i<=baris; i++){
                    for (j = 1; j <= (baris-i); j++){
                        System.out.print(" ");
                    }
                    for (k = 1; k<=i*2+3; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==6){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i<=baris; i++){
                    for (j = 1; j <= (baris-i); j++){
                        System.out.print(" ");
                    }
                    for (k = 1; k<=i*2+3; k++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==7){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i<=baris; i++){
                    for (j = 1; j <= baris; j++){
                        if (i==baris || j==baris){
                            System.out.print(" *");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for (i = baris-1; i>=1; i--){
                    for (j = 1; j <= baris; j++){
                        if (i==baris || j==baris){
                            System.out.print(" *");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==8){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i<=baris; i++){
                    for (j = 1; j <= baris; j++){
                        if (i==baris || j==baris){
                            System.out.print(" "+i);
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for (i = baris-1; i>=1; i--){
                    for (j = 1; j <= baris; j++){
                        if (i==baris || j==baris){
                            System.out.print(" "+i);
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==9){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i <= baris; i++) {
                    for (j = 1; j <= baris; j++) {
                        if (i == 1 || i == baris || j == 1 || j == baris) {
                            System.out.print("*  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                for (i = baris-1; i >= 1; i--) {
                    for (j = 1; j <= baris; j++) {
                        if (i == baris || i==1 || j == 1 || j == baris) {
                            System.out.print("*  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==10){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = 1; i <= baris; i++) {
                    for (j = 1; j <= baris; j++) {
                        if (i == 1 || i == baris || j == 1 || j == baris) {
                            System.out.print(i + "  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                for (i = baris-1; i >= 1; i--) {
                    for (j = 1; j <= baris; j++) {
                        if (i == baris || i==1 || j == 1 || j == baris) {
                            System.out.print(i + "  ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==11){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for ( i = 0; i <= baris; i++){
                    for ( j = i; j <= baris; j++){
                        System.out.print("  ");
                    }
                    for ( k = i; k <= (i*2)-1; k++){
                        System.out.print("   *");
                    }
                    System.out.println();
                }
                for ( i = baris-1; i >= 1 ; i--) {
                    for ( j = baris; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for ( k = i; k >= 1; k--) {
                        System.out.print("   *");
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==12){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (int I = 0; I <= baris; I++){
                    for (int J = I; J <= baris; J++){
                        System.out.print("  ");
                    }
                    for (int K = I; K <= (I*2)-1; K++){
                        System.out.print("   "+I);
                    }
                    System.out.println();
                }
                for (int I = baris-1; I >= 1 ; I--) {
                    for (int J = baris; J >= I; J--) {
                        System.out.print("  ");
                    }
                    for (int K = I; K >= 1; K--) {
                        System.out.print("   "+I);
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==13){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = baris; i >= 1 ; i--) {
                    for (j = baris; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (k = i; k >= 1; k--) {
                        System.out.print("   *");
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else if (Pilihan==14){
                System.out.print("MASUKKAN JUMLAH BARIS : ");
                baris = sc.nextInt();
                System.out.println("=============> OUT-PUT <=============");
                for (i = baris; i >= 1 ; i--) {
                    for (j = baris; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (k = i; k >= 1; k--) {
                        System.out.print("   "+i);
                    }
                    System.out.println();
                }
                System.out.println("=============> SELESAI <=============");
            }else {
                System.out.println("COBA LAGI");
            }

            System.out.print("ULANGI PRGRAM [Y/N] : ");
            ulang = sc.next();
            System.out.println("=========> PROGRAM SELESAI <=========");
        }
    }
}