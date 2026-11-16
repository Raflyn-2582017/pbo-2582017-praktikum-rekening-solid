public class Deposito extends Rekening implements BerBunga {
    private double bunga; // persen per bulan

    public Deposito(int nomor, String pemilik, int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public double getBunga() { return bunga; }

    @Override
    public int tambahBunga() {
        int hasil = (int) (saldo * bunga / 100);
        saldo += hasil;
        return hasil;
    }

    // Deposito tidak bisa ditarik sebelum jatuh tempo.
    // Sesuai kontrak tarik: kembalikan false, jangan lempar exception (LSP).
    @Override
    public boolean tarik(int jumlah) {
        return false;
    }

    @Override
    public int biayaAdminBulanan() {
        return 0;
    }

    @Override
    public String getJenis() {
        return "Deposito, bunga " + String.format("%.2f", bunga) + " per bulan";
    }
}
