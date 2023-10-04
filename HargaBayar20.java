import java.util.Scanner;

public class HargaBayar20{
    public static void main(String[] args) {
        
    Scanner input =new Scanner(System.in);
    
    int harga, jumlah, jumlah_halaman_buku;
    double dis, total, bayar, jumlahdiskon;
    String merek_buku;

    System.out.println("Masukkan Merek Buku ");
    merek_buku = input.next();

    System.out.println("Masukkan harga barang yang dibeli ");
    harga = input.nextInt();

    System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
    jumlah = input.nextInt();

    System.out.println("Masukkan Jumlah Halaman Buku ");
    jumlah_halaman_buku = input.nextInt();

    System.out.println("Masukkan Jumlah Diskon");
    dis = input.nextDouble();

    total = harga*jumlah;
    jumlahdiskon = total*dis;
    bayar = total-jumlahdiskon;
    
    System.out.println("Merek buku anda adalah " + merek_buku);
    System.out.println("Jumlah halaman buku anda adalah" + jumlah_halaman_buku);
    System.out.println("Diskon yang anda dapatkan adalah " + jumlahdiskon);
    System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    
    }
}
