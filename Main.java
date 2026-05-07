import kendaraan.Mobil;
import kendaraan.SepedaMotor;
import mesin.Mesin;

public class Main {
    public static void main(String[] args) {
        Mesin mesinMotor = new Mesin();
        mesinMotor.jml_silinder = 1;
        mesinMotor.kap_silinder = 150.0;
        mesinMotor.langkah = "4-tak";

        Mesin mesinMobil = new Mesin();
        mesinMobil.jml_silinder = 4;
        mesinMobil.kap_silinder = 1500.0;
        mesinMobil.langkah = "4-tak";

        SepedaMotor motor = new SepedaMotor();
        motor.setBahanBakar("Pertamax");
        motor.setMesin(mesinMotor);
        motor.setJenisMotor("Matic");

        Mobil mobil = new Mobil();
        mobil.setBahanBakar("Pertalite");
        mobil.setMesin(mesinMobil);
        mobil.setWarna("Merah");

        System.out.println("=== Informasi Sepeda Motor ===");
        System.out.println("Jenis Motor         : " + motor.getJenisMotor());
        System.out.println("Bahan Bakar         : " + motor.getBahanBakar());
        System.out.println("Jumlah Silinder     : " + motor.getMesin().jml_silinder);
        System.out.println("Kapasitas Silinder  : " + motor.getMesin().kap_silinder);
        System.out.println("Tipe Langkah        : " + motor.getMesin().langkah);
        System.out.println();

        System.out.println("=== Informasi Mobil ===");
        System.out.println("Warna               : " + mobil.getWarna());
        System.out.println("Bahan Bakar         : " + mobil.getBahanBakar());
        System.out.println("Jumlah Silinder     : " + mobil.getMesin().jml_silinder);
        System.out.println("Kapasitas Silinder  : " + mobil.getMesin().kap_silinder);
        System.out.println("Tipe Langkah        : " + mobil.getMesin().langkah);
    }
}