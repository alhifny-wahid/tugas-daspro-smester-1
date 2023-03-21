package TugasDaspro;

import javax.swing.JOptionPane;
class ProgramPengembalianPeminjamBuku{
    public static void main(String[] args) {
        String  lagi="y", namaPeminjam = "", namaBuku;
        int lambatPengembalian, subTotal = 0, ketBuku, bukuDiterima = 0, status, total = 0, jmlBuku, harga = 0, denda = 0, tanggalPinjam, bulanPinjam, tajunPinjam, tanggalPengembalian, bulanPengembalian, tahunPengembalian,dendaHilang=0;
            System.out.println("\n\n===============> RINICIAN PENGEMBALIAN <==============\n");
            namaPeminjam = JOptionPane.showInputDialog(null, "Nama Peminjam : ", "Confirmation", JOptionPane.QUESTION_MESSAGE);
            String[] options = {"Member", "Non Member",};
            status = JOptionPane.showOptionDialog(null, "Status Pemijam",
                    "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[1]);
            tanggalPinjam = Integer.parseInt(JOptionPane.showInputDialog("Tanggal Pinjam : "));
            bulanPinjam = Integer.parseInt(JOptionPane.showInputDialog("Bulan Pinjam : "));
            tajunPinjam = Integer.parseInt(JOptionPane.showInputDialog("Tahun Pinjam : "));
            tanggalPengembalian = Integer.parseInt(JOptionPane.showInputDialog("Tanggal Pengembalian : "));
            bulanPengembalian = Integer.parseInt(JOptionPane.showInputDialog("Bulan Pengembalian : "));
            tahunPengembalian = Integer.parseInt(JOptionPane.showInputDialog("Tahun Pengembalian : "));
            jmlBuku = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Buku yang Dipinjam : "));
            harga = 7 * 10000 * jmlBuku;
            if (status == 0){
                System.out.println("Nama Peminjam             : " + namaPeminjam);
                System.out.println("Status                    : Member");
                if (jmlBuku>2){
                    harga = (int)(harga-(harga*0.1));}}
            else {
                System.out.println("Nama Peminjam             : Anonymous");
                System.out.println("Status                    : Non Member");}
            System.out.println("Tanggal Pinjam            : " + tanggalPinjam + "/" + bulanPinjam + "/" + tajunPinjam);
            System.out.println("Tanggal Pengembalian      : " + tanggalPengembalian + "/" + bulanPengembalian + "/" + tahunPengembalian);
            System.out.println("Jumlah Buku Yang Dipinjam : " + jmlBuku + " Buku");
            lambatPengembalian = (tanggalPengembalian+bulanPengembalian+tahunPengembalian) - (tanggalPinjam+bulanPinjam+tajunPinjam)-7;
            for (int i = 1; i <= jmlBuku; i++) {
                namaBuku = JOptionPane.showInputDialog("Nama Buku ke - " + i);
                System.out.println("\n\tNama Buku Ke - " + i + "      : " + namaBuku);
                String[] options1 = {"Diterima", "Hilang/Rusak",};
                ketBuku = JOptionPane.showOptionDialog(null, "Keterangan Buku",
                        "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options1, options1[1]);
                if (ketBuku == 1){
                    System.out.println("\tKeterangan Buku       : Hilang/Rusak");
                    subTotal+=ketBuku;
                    bukuDiterima = jmlBuku-subTotal;
                    dendaHilang = subTotal*200000;}
                else {
                    System.out.println("\tKeterangan Buku       : Diterima");}}
            denda = (lambatPengembalian*15000*jmlBuku)+dendaHilang;
            total = denda + harga;
            System.out.println("\nLambat Pengembalian       : "+lambatPengembalian+" Hari");
            System.out.println("Buku Hilang/Rusak         : "+subTotal);
            System.out.println("Buku Diterima             : "+bukuDiterima);
            System.out.println("Denda                     : "+denda);
            System.out.println("Total                     : "+total);
            System.out.println("\n====================> TERIMAKASIH <===================\n\n");
    }
}