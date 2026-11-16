public class ProsesAkhirBulan {

    public void potongAdmin(Rekening[] daftar) {
        System.out.println("=== BIAYA ADMIN ===");
        for (Rekening r : daftar) {
            int biaya = r.potongBiayaAdmin();
            System.out.println(r.getNomor() + " Biaya admin : " + Rekening.rp(biaya));
        }
    }

    public void tambahBunga(BerBunga[] daftar) {
        System.out.println("=== BUNGA ===");
        for (BerBunga b : daftar) {
            Rekening r = (Rekening) b; // semua Berbunga di sini adalah Rekening
            int hasil = b.tambahBunga();
            System.out.println(r.getNomor() + " Bunga : " + Rekening.rp(hasil));
        }
    }

    public void autodebet(Rekening[] daftar, int jumlah) {
        System.out.println("=== AUTODEBET PREMI ===");
        for (Rekening r : daftar) {
            if (r.tarik(jumlah)) {
                System.out.println(r.getNomor() + " Autodebet : " + Rekening.rp(jumlah));
            } else {
                System.out.println(r.getNomor() + " Autodebet : gagal");
            }
        }
    }
}
