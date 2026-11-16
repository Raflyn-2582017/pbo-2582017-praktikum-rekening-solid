public class LaporanBank {

    public void cetakDaftar(String judul, Rekening[] daftar) {
        System.out.println("=== " + judul + " ===");
        for (Rekening r : daftar) {
            System.out.println(r);
            System.out.println("  " + r.getJenis());
        }
    }

    public void cetakTotal(Rekening[] daftar) {
        int total = 0;
        for (Rekening r : daftar) {
            total += r.getSaldo();
        }
        System.out.println("Total saldo bank : " + Rekening.rp(total));
    }
}
