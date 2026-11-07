public abstract class Karakter {
    public static final int HP_MAKSIMAL = 200;
    private String nama;
    private int hp;
    private final int kekuatanDasar;

    public Karakter(String nama) {
        this(nama, HP_MAKSIMAL, 10);
    }

    public Karakter(String nama, int hp, int kekuatanDasar) {
        this.nama = nama;
        this.hp = hp;
        this.kekuatanDasar = kekuatanDasar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getKekuatanDasar() {
        return kekuatanDasar;
    }

    public int hitungKekuatan() {
        return kekuatanDasar + (hp / 10);
    }

    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        System.out.println("Kekuatan dasar: " + kekuatanDasar);
    }

    public abstract int serang(Karakter target);
}
