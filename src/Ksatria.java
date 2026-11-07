public class Ksatria extends Karakter implements BisaMenyerang, BisaBertahan {
    private int energi;

    public Ksatria(String nama) {
        this(nama, 120, 15);
    }

    public Ksatria(String nama, int hp, int kekuatanDasar) {
        super(nama, hp, kekuatanDasar);
        this.energi = 50;
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }

    @Override
    public int serang(Karakter target) {
        if (energi >= 20) {
            energi = energi - 20;
            int damage = hitungKekuatan() + 5;
            target.setHp(target.getHp() - damage);
            return damage;
        } else {
            energi = energi + 10;
            return 0;
        }
    }

    @Override
    public int bertahan() {
        if (energi >= 10) {
            energi = energi - 10;
            return hitungKekuatan() * 2;
        } else {
            return hitungKekuatan();
        }
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("Energi: " + energi);
    }
}
