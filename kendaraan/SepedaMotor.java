package kendaraan;

import mesin.Mesin;

public class SepedaMotor {
    private String bahanBakar;
    private Mesin mesin;
    private String jenisMotor;

    public String getBahanBakar() {
        return bahanBakar;
    }
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    public Mesin getMesin() {
        return mesin;
    }
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    public String getJenisMotor() {
        return jenisMotor;
    }
    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
}