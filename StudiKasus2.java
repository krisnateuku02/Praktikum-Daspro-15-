import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen = 0, peringkat = 0, statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenisKegiatan = sc.nextLine().toUpperCase();

        if (jenisKegiatan.equals("BELMAWA")
                || jenisKegiatan.equals("BAKORMA")
                || jenisKegiatan.equals("Mandiri")) {

            System.out.print("peringkat juara : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {

                System.out.print("Jumlah dokumen : ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Status : MENDAPATKAN DANA PENGHARGAAN");
                    System.out.println("Alasan : Juara 1/2/3 dan dokumen lengkap.");
                } else {
                    System.out.println("Status : TIDAK MENDAPATKAN DANA");
                    System.out.println("Dokumen tidak lengkap (Kurang " + (4 - jumlahDokumen)
                            + " Dokumen). Dana penghargaan tidak di berikan");
                }

            } else {
                System.out.println("Status : TIDAK MENDAPATKAN DANA");
                System.out.println("Alasan : Bukan Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equals("PKM")) {

            System.out.print("Status pendanaan PKM: ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                System.out.println("LOLOS");
            } else {
                System.out.println("Tidak LOLOS.");
            }

        } else {
            System.out.println("Status dana : TIDAK MENDAPATKAN DANA");
            System.out.println("Alasan : Kegiatan termasuk kategori Lainnya.");
        }

        sc.close();
    }
}