Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan
harga barang}

Deklarasi:
harga, jumlah, jumlah_halaman_buku : int
dis, total, bayar, jmlDis : double
merk_buku : String

Deskripsi:
1. print "Masukkan merk buku"
2. read merk_buku
3. print "Masukkan harga barang yang dibeli”
4. read harga
5. print " Masukkan Jumlah jumlah barang yang dibeli”
6. read jumlah
7. print "Masukkan Jummlah Halaman Buku"
8. read jumlah_halaman_buku
9. print "Masukkan jumlah diskon"
10. read dis
11. total = harga *jumlah
12. jmlDis=total*dis
13. bayar=total-jmlDis
14. print “Diskon yang anda dapatkan adalah”
15. print jmlDiskon
16. print "Jumlah yang harus dibayar adalah”
17. print bayar