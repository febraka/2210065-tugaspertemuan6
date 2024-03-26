package objekkelas;

public class Segitiga {
    double alas;
    double tinggi;
    double sisi;
    
    public Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }

    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + tinggi + sisi;
    }

    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
    
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Segitiga 1:");
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());

        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());

        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
}

