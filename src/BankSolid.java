public class BankSolid {
    public static void main(String[] args) {
        Tabungan ari = new Tabungan(101, "Ari", 1_000_000, 2.5);
        Tabungan citra = new Tabungan(102, "Citra", 300_000, 2.0);
        Giro budi = new Giro(201, "Budi", 200_000, 500_000);
        Deposito dewi = new Deposito(301, "Dewi", 5_000_000, 4.0);

        Rekening[] semua = { ari, citra, budi, dewi };
        BerBunga[] berbunga = { ari, citra, dewi };

        LaporanBank laporan = new LaporanBank();
        ProsesAkhirBulan proses = new ProsesAkhirBulan();

        laporan.cetakDaftar("REKENING AWAL", semua);
        System.out.println();

        proses.potongAdmin(semua);
        System.out.println();
        proses.tambahBunga(berbunga);
        System.out.println();
        proses.autodebet(semua, 50_000);
        System.out.println();

        laporan.cetakDaftar("REKENING AKHIR", semua);
        System.out.println();
        laporan.cetakTotal(semua);
    }
}
