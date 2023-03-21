package TugasDaspro; /**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramTokoBuku {
    public static void main(String[] args) {
        boolean running = true,running1 = true, running2 = true, running4 = true;
        int pilihan, daftarBuku, loop, hargaBuku, beliBuku = 0, jumlah=0, total=0, bayar=0, kembalian=0;
        String  ulang;
        System.out.println("----------------------------------");
        System.out.println("\b\tPRORAM TOKO BUKU SEDERHANA\t\b");
        System.out.println("----------------------------------");
        while (running){
            running1=true;
            running2=true;
            String[] options = {"Daftar Buku", "Harga Buku", "Beli Buku", "Keluar"};
            pilihan = JOptionPane.showOptionDialog(null, "PRORAM TOKO BUKU SEDERHANA",
                    "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[3]);
            switch (pilihan){
                case 0:
                    while (running1) {
                        String[] options1 = {"Kembali", "Keluar"};
                        daftarBuku = JOptionPane.showOptionDialog(null, "========> DAFTAR BUKU <========\n- Buku Statistik\n- Buku Ekonom\n- Buku Pendidikan\n- Buku Sains\n- Buku Matematika\n- Buku Fisika\n",
                                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, options1, options1[1]);
                        if (daftarBuku == 0) {
                            running = true;
                            running1 = false;
                        }
                        else {
                            loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (loop==1){
                                running=true;
                            }else {System.exit(0);}
                        }
                    }
                    break;
                case 1:
                    while (running1) {
                        String[] options1 = {"Kembali", "Keluar"};
                        hargaBuku = JOptionPane.showOptionDialog(null, "========> HARGA BUKU <========\n- Buku Statistik Rp 5000\n- Buku Ekonomi Rp 4000\n- Buku Pendidikan Rp 5500\n- Buku Sains Rp 6000\n- Buku Matematika Rp 5000\n- Buku Fisika Rp 4500\n",
                                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, options1, options1[1]);
                        if (hargaBuku == 0) {
                            running = true;
                            running1 = false;
                        } else {
                            loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (loop == 1) {
                                running = true;
                            } else {
                                System.exit(0);
                            }
                        }
                    }
                    break;
                case 2:
                    running=false;
                    while (running2) {
                        String[] options1 = {"1", "2", "3", "4", "5", "6", "Kembali", "Keluar"};
                        beliBuku = JOptionPane.showOptionDialog(null, "========> HARGA BUKU <========\n1. Buku Statistik Rp 5000\n2. Buku Ekonomi Rp 4000\n3. Buku Pendidikan Rp 5500\n4. Buku Sains Rp 6000\n5. Buku Matematika Rp 5000\n6. Buku Fisika Rp 4500\n",
                                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, options1, options1[1]);
                        running4=true;
                        if (beliBuku == 0) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*5000;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Statistik");
                            System.out.println("Harga buku = Rp 5000");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 1) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*4000;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Ekonomi");
                            System.out.println("Harga buku = Rp 4000");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 2) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*5500;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Pendidikan");
                            System.out.println("Harga buku = Rp 5500");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 3) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*6000;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Sains");
                            System.out.println("Harga buku = Rp 6000");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 4) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*5000;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Matematika");
                            System.out.println("Harga buku = Rp 5000");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 5) {
                            jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pesanan : "));
                            total = jumlah*4500;
                            while (running4){
                                bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+total));
                                if (bayar<total){
                                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                                }
                                else {
                                    running4 = false;
                                }
                            }
                            kembalian = bayar-total;
                            System.out.println("Nama Buku  = Buku Fisika");
                            System.out.println("Harga buku = Rp 4500");
                            System.out.println("Jumlah     = " + jumlah);
                            System.out.println("Uang bayar = Rp " + bayar +
                                    "\nKembalian  = " + kembalian);
                            System.out.println("----------------------------------");
                        }
                        else if (beliBuku == 6) {
                            running = true;
                            running2 = false;
                        }
                        else {
                            loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (loop == 1) {
                                running = true;
                            }
                            else {
                                System.exit(0);
                            }
                        }
                    }
                    break;
                default:
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop == 1) {
                        running = true;
                    }
                    else {
                        System.exit(0);
                    }
            }
        }
    }
}