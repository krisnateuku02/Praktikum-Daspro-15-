import java.util.Scanner;
public class studiKasus115{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup=18000;
        int jumlahCup,uangBayar;
        int totalHarga,diskon,totalBayar;
        int uangSisa,kurang;
        int potongan;
        
        System.out.print("massukkan jumlah cup ");
        jumlahCup=sc.nextInt();
        System.out.print("massukkan jumlah uang bayar ");
        uangBayar=sc.nextInt();
        totalHarga=jumlahCup*hargaPerCup;
        
        if (totalHarga>=100000) {
        potongan=totalHarga*10/100;
        }else{
        potongan=0;
        
        totalBayar=totalHarga-potongan;
        System.out.println("Tampilkan total harga : " +totalHarga );
        System.out.println("Tampilkan potongan : " +potongan );
        System.out.println("Tampilkan total bayar : " +totalBayar );

        if (uangBayar>=totalBayar) {
        uangSisa=uangBayar-totalBayar;
        System.out.print("Tampilkan kembalian : " + uangSisa );
        }else{
        kurang=totalBayar-uangBayar;
        System.out.print("Uang tidak cukup, kurang Rp " +kurang );

        sc.close();


        }
    }
  }
}