public class Main {
    public static void main(String[] args) {
        System.out.println("HP MAKSIMAL: " + Karakter.HP_MAKSIMAL);
        System.out.println();

        Ksatria arthur = new Ksatria("Arthur", 120, 15);
        Penyihir merlin = new Penyihir("Merlin");

        System.out.println("--- STATUS AWAL ---");
        arthur.tampilkanStatus();
        System.out.println();
        merlin.tampilkanStatus();
        System.out.println();

        BisaMenyerang penyerang = arthur;
        BisaMenyerang pesulap = merlin;

        int damageKsatria = penyerang.serang(merlin);
        System.out.println(arthur.getNama() + " menyerang " + merlin.getNama() + " sebesar " + damageKsatria);

        int damagePenyihir = pesulap.serang(arthur);
        System.out.println(merlin.getNama() + " menyerang " + arthur.getNama() + " sebesar " + damagePenyihir);
        System.out.println();

        BisaMenyembuhkan penyembuh = merlin;
        penyembuh.sembuhkan(20);
        System.out.println(merlin.getNama() + " menyembuhkan diri sebesar 20");
        System.out.println();

        BisaBertahan pertahanan = arthur;
        int nilaiBertahan = pertahanan.bertahan();
        System.out.println(arthur.getNama() + " bertahan dengan nilai " + nilaiBertahan);
        System.out.println();

        System.out.println("+++ STATUS AKHIR +++");
        arthur.tampilkanStatus();
        System.out.println();
        merlin.tampilkanStatus();
    }
}
