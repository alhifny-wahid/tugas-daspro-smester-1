/**
 * @author alhifny wahid
 */
package TugasDaspro;
import javax.swing.JOptionPane;
public class ProgramTiketBioskopSederhana {
    public static void main(String hifny[]){
        int PilihFilm,PilihJenis,PilihJam,Harga = 0,JmlTiket, Total, Bayar = 0, Kembalian, loop;
        String Jenis = "-", Jam = "-", Judul="-";
        boolean running = true, running1 = true, running2 = true, running3 = true, running4 = true;
        while (running) {
            while (running1){
                String[] options = {"BUMBLEEBEE", "AQUAMAN", "SPIDERMAN", "STARWARS XIII", "Keluar"};
                PilihFilm = JOptionPane.showOptionDialog(null, "Pilih Film", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[4]);
                switch (PilihFilm) {
                    case 0:
                        Judul = options[0];
                        running1 = false;
                        break;
                    case 1:
                        Judul = options[1];
                        running1 = false;
                        break;
                    case 2:
                        Judul = options[2];
                        running1 = false;
                        break;
                    case 3:
                        Judul = options[3];
                        running1 = false;
                        break;
                    default:
                        loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                        if (loop == 1) {
                            running1 = true;
                        } else {
                            System.exit(0);}
                }
            }
            while (running3){
                String[] options = {"2D Rp 35,000", "3D Rp 45,000"};
                PilihJenis = JOptionPane.showOptionDialog(null, "Pilih Jenis Bioskop", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[1]);
                if (PilihJenis == 0) {
                    Jenis = "Bioskop 2D";
                    Harga = 35000;
                    while (running2){
                        String[] options1 = {"11:35 AM", "04:30 PM"};
                        PilihJam = JOptionPane.showOptionDialog(null, "Pilih Jam Tayang", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, options1, options1[1]);
                        if (PilihJam == 0) {
                            Jam = "11:35 AM";
                            running3 = false;
                            running2 = false;
                        } else if (PilihJam == 1) {
                            Jam = "04:30 PM";
                            running3 = false;
                            running2 = false;
                        } else {
                            loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (loop == 1) {
                                running2 = true;
                            } else {
                                System.exit(0);}
                        }
                    }
                } else if (PilihJenis == 1) {
                    Jenis = "Bioskop 3D";
                    Harga = 45000;
                    while (running2){
                        String[] options1 = {"01:30 PM", "06:40 PM"};
                        PilihJam = JOptionPane.showOptionDialog(null, "Pilih Jam Tayang", "KONFIRMASI PILIHAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, options1, options1[1]);
                        if (PilihJam == 0) {
                            Jam = "01:30 PM";
                            running3 = false;
                            running2 = false;
                        } else if (PilihJam == 1) {
                            Jam = "06:40 PM";
                            running3 = false;
                            running2 = false;
                        } else {
                            loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                            if (loop == 1) {
                                running2 = true;
                            } else {
                                System.exit(0);}
                        }
                    }
                } else {
                    loop = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (loop == 1) {
                        running3 = true;
                    } else {
                        System.exit(0);}
                }
            }
            running3=true;
            running1=true;
            running2=true;
            running=true;
            JmlTiket = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Tiket :"));
            Total = JmlTiket * Harga;
            System.out.print("\n========> RINCIAN PESANAN <========\n" +
                    "\nJUDUL FILM    : " + Judul +
                    "\nJENIS BIOSKOP : " + Jenis +
                    "\nJUMLAH TIKET  : " + JmlTiket +
                    "\nJAM TAYANG    : " + Jam +
                    "\nHARGA         : " + Harga +
                    "\nTOTAL         : " + Total +
                    "\n\n=======> RINCIAN PEMBAYARAN <======\n");
            while (running4){
                Bayar  = Integer.parseInt(JOptionPane.showInputDialog("Bayar Pesanan Sebesar : Rp "+Total));
                if (Bayar<Total){
                    JOptionPane.showMessageDialog(null, "Nominal yang anda masukkan kurang dari total,\nSilahkan lakukan pembayaran ulang");
                }
                else {
                    running4 = false;
                }
            }
            running4 = true;
            Kembalian = Bayar - Total;
            System.out.println("BAYAR         : RP "+ Bayar);
            System.out.println("KEMBALIAN     : RP " + Kembalian + "\n\n==========> TERIMAKASIH <==========");
        }
    }
}
