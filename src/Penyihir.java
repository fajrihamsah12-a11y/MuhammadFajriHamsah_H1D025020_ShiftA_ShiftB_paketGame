public class Penyihir extends Karakter implements BisaMenyerang, BisaMenyembuhkan {
    private int mana;

    public Penyihir(String nama) {
        this(nama, 90, 18);
    }

    public Penyihir(String nama, int hp, int kekuatanDasar) {
        super(nama, hp, kekuatanDasar);
        this.mana = 60;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int serang(Karakter target) {
        if (mana >= 25) {
            mana = mana - 25;
            int damage = hitungKekuatan() * 2;
            target.setHp(target.getHp() - damage);
            return damage;
        } else {
            mana = mana + 15;
            int damage = hitungKekuatan();
            target.setHp(target.getHp() - damage);
            return damage;
        }
    }

    @Override
    public void sembuhkan(int jumlah) {
        if (mana >= 15) {
            mana = mana - 15;
            setHp(Math.min(getHp() + jumlah, HP_MAKSIMAL));
        } else {
            mana = mana + 5;
        }
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Mana: " + mana);
    }
}
