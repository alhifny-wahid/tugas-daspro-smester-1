package TugasDaspro;
/**
 * @author alhifny wahid
 */
import javax.swing.JOptionPane;
public class ProgramMenghitungNilaiMahasiswa{
    public static void main(String[] args) {
        String namaMahasiswa, namaPelajaran;
        int jumlahPelajaran, i=1, j=1, looping;
        double nilaiPelajaran, rataRataNilai=0;
        boolean runing = true;
        System.out.println("-------------------------------------------------------------");
        System.out.println("|              PROGRAM PERHITUNGAN NILAI SISWA              |");
        System.out.println("-------------------------------------------------------------\n");
        while (runing) {
            System.out.println("\n==================> Data Mahasiswa ke - "+j+" <==================\n");
            namaMahasiswa = JOptionPane.showInputDialog("Nama Mahasiswa : ");
            System.out.println("> Nama Mahasiswa\t: " + namaMahasiswa);
            jumlahPelajaran = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pelajaran : "));
            System.out.println("> Jumlah Pelajaran\t: " + jumlahPelajaran);
            for (;i<=jumlahPelajaran; i++){
                namaPelajaran = JOptionPane.showInputDialog("Nama Pelajaran ke - "+i);
                nilaiPelajaran = Integer.parseInt(JOptionPane.showInputDialog("Nilai Pelajaran " + namaPelajaran));
                System.out.println("> "+namaPelajaran + "\t: " + nilaiPelajaran);
                rataRataNilai +=nilaiPelajaran;
            }
            rataRataNilai = rataRataNilai/jumlahPelajaran;
            System.out.println("\n-------------------------------------------------------------\n> Nilai Rata - Rata\t: "+rataRataNilai);
            if (rataRataNilai>65){
                System.out.println("> "+namaMahasiswa+" Dinyatakan lulus");
            }
            else if (rataRataNilai>=50&&rataRataNilai<=65){
                System.out.println("> "+namaMahasiswa+" Dinyatakan harus ikut ujian perbaikan");
            }
            else {
                System.out.println("> "+namaMahasiswa+" Dinyatakan tidak lulus");
            }
            System.out.println("-------------------------------------------------------------");
            looping = JOptionPane.showConfirmDialog(null, "Ulangi Program?", "Dialog Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (looping==0){
                runing=true;
            }else {runing=false;}
            j++;
        }
    }
}