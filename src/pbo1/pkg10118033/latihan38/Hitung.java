package pbo1.pkg10118033.latihan38;

public class Hitung {

    public double r;
    public double luas; //luas
    public double keliling; //keliling

    public double jariLingkaran(double diameter) {
        r = diameter / 2;
        return r;
    }

    public double luasLingkaran(double jarijari) {
        luas = Math.PI * jarijari * jarijari;
        return luas;
    }

    public double kelilingLingkaran(double jarijari) {
        keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}
