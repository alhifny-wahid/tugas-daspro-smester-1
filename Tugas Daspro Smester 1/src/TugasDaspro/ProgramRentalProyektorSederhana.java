package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramRentalProyektorSederhana {
    public static void main(String[] args) {
        boolean running = true, running1 = true, running2 = true, running0= true, running3 = true, running4 = true;
        int i = 1,repeatProgram, daftarJenisBarang, jumlah = 0, total, harga = 0, hargaPerPcs = 0, subTotal, loop, jenisJaminan, tambahan, bayar = 0, kembalian, benq = 0, panasonic = 0, infocus = 0, mitachi = 0, epson = 0;
        String nama = "-", alamat = "-", jenisJaminan1 = null, namaBarang = null;

        System.out.println("===================================================");
        System.out.println("      SELAMAT DATANG DI TOKO RENTAL PROYEKTOR");
        while (running){
            while (running0){
                System.out.println("===================================================");
                System.out.println("                  RINCIAN PEMBELI");
                System.out.println("===================================================");
                running0 =  false;
            }
            System.out.println(">>> Pembelian ke - " + i);
            while (running){
                String[] options = {"1", "2", "3", "4", "5", "Keluar" };
                daftarJenisBarang = JOptionPane.showOptionDialog(null, "=====> PROYEKTOR <=====\n1. BenQ Rp 100.000\n2. Panasonic Rp 125.000\n3. Infocus Rp 150.000\n4. Mitachi Rp 175.000\n5. Epson Rp 200.000", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[5]);
                if (daftarJenisBarang==0){
                    jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah yang ingin di sewa"));
                    namaBarang = "BenQ";
                    harga = 100000*jumlah;
                    hargaPerPcs = 100000;
                    running = false;
                    benq+=harga;
                }
                else if (daftarJenisBarang==1){
                    jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah yang ingin di sewa"));
                    namaBarang = "Panasonic";
                    harga = 125000*jumlah;
                    hargaPerPcs = 125000;
                    running = false;
                    panasonic+=harga;

                }
                else if (daftarJenisBarang==2){
                    jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah yang ingin di sewa"));
                    namaBarang = "Infocus";
                    harga = 150000*jumlah;
                    hargaPerPcs = 150000;
                    running = false;
                    infocus+=harga;
                }
                else if (daftarJenisBarang==3){
                    jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah yang ingin di sewa"));
                    namaBarang = "Mitachi";
                    harga = 175000*jumlah;
                    hargaPerPcs = 175000;
                    running = false;
                    mitachi+=harga;
                }
                else if (daftarJenisBarang==4){
                    jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah yang ingin di sewa"));
                    namaBarang = "Epson";
                    harga = 200000*jumlah;
                    hargaPerPcs = 200000;
                    running = false;
                    epson+=harga;
                }
                else {
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop==1){
                        running=true;
                    }
                    else {System.exit(0);
                    }
                }
                i++;
            }
            running = true;
            while (running2){
                nama = JOptionPane.showInputDialog("Masukkan Nama anda");
                alamat = JOptionPane.showInputDialog("Masukkan Alamat anda");
                running2 = false;
            }
            String[] options1 = {"KTP", "SIM", "KK" };
            while (running1){
                jenisJaminan = JOptionPane.showOptionDialog(null, "JENIS JAMINAN", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,null, options1, options1[2]);
                if (jenisJaminan==0){
                    jenisJaminan1 = "KTP";
                    running1 = false;
                }
                else if (jenisJaminan==1){
                    jenisJaminan1 = "SIM";
                    running1 = false;
                }
                else if (jenisJaminan==2){
                    jenisJaminan1 = "KK";
                    running1 = false;
                }
                else {
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop==1){
                        running=true;
                    }
                    else {System.exit(0);
                    }
                }
            }
            total = benq+panasonic+infocus+mitachi+epson;
            while (running3){
                System.out.println("Nama Penyewa  : " + nama);
                System.out.println("Alamat        : " + alamat);
                System.out.println("Jenis Jaminan : " + jenisJaminan1);
                running3 = false;
            }
            System.out.println("Nama Barang   : " + namaBarang);
            System.out.println("Harga         : Rp " + hargaPerPcs);
            System.out.println("Jumlah Barang : " + jumlah + " Unit");
            System.out.println("Sub Total     : Rp " + harga);
            System.out.println("===================================================");
            tambahan = JOptionPane.showConfirmDialog(null, "Apakah ada tambahan?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (tambahan==0){
                running=true;
                running2 = false;
                running3 = false;
                running0 = false;
            }
            else if (tambahan==1){
                System.out.println("Total         : Rp " + total);
                System.out.println("===================================================");
                System.out.println("                 RINCIAN PEMBAYARAN          ");
                System.out.println("===================================================");
                while (running4){
                    bayar = Integer.parseInt(JOptionPane.showInputDialog("Bayar sewaan sebesar Rp " + total));
                    if (bayar<total){
                        JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                    }
                    else {
                        running4 = false;
                    }
                }
                kembalian = bayar-total;
                System.out.println("Uang Anda     : " + bayar);
                System.out.println("Kembalian     : " + kembalian);
                repeatProgram = JOptionPane.showConfirmDialog(null, "ULANGI PROGRAM?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (repeatProgram==1){
                    System.out.println("===================================================");
                    System.out.println("          TERIMAKASIH ATAS KEDATANGAN ANDA         ");
                    System.out.println("===================================================");
                    System.exit(0);
                }
                else {
                    i = 1;
                    running=true;
                    running2=true;
                    running0=true;
                }
            }
            else {
                loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (loop==1){
                    running=true;
                }
                else {System.exit(0);
                }
            }
        }
    }
}