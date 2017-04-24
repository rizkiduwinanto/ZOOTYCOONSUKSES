package profile.model;

import java.util.ArrayList;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class ProfileModel {
  private String namaPemilik;
  private long uang;
  private String namaZoo;
  private int jumlahAnimal;
  private ArrayList<String> achievement;

  /**
   * Konstruktor parameter dari kelas Profile
   * @param namaPemilik nama dari pemilik zoo
   * @param uang jumlah uang yang dimiiliki
   * @param namaZoo nama dari sebuah zoo
   * @param jumlahAnimal jumlah animal yang dimiliki
   * @param achievement achievement - achievement yang dimiliki
   */
  public ProfileModel (String namaPemilik, long uang, String namaZoo, int jumlahAnimal, ArrayList<String> achievement){
    this.namaPemilik = namaPemilik;
    this.uang = uang;
    this.namaZoo = namaZoo;
    this.jumlahAnimal = jumlahAnimal;
    this.achievement = new ArrayList<String>(achievement);
  }

  /**
   * Getter nama pemilik
   * @return namaPemilik
   */
  public String getNamaPemilik() {
    return namaPemilik;
  }

  /**
   * Getter uang
   * @return uang
   */
  public long getUang() {
    return uang;
  }

  /**
   * Getter nama zoo
   * @return namaZoo
   */
  public String getNamaZoo() {
    return namaZoo;
  }

  /**
   * Getter jumlah animal
   * @return jumlahAnimal
   */
  public int getJumlahAnimal() {
    return jumlahAnimal;
  }

  /**
   * Getter achievement
   * @return achievement
   */
  public ArrayList<String> getAchievement() {
    return achievement;
  }

  /**
   * Menambah uang sekarang sebanyak nominalIncrease
   * @param nominalIncrease jumlah uang yang akan ditambah
   */
  public void increaseUang(int nominalIncrease) {
    uang += nominalIncrease;
  }

  /**
   * Mengurangi uang sekarang sebanyak nominalDecrease
   * @param nominalDecrease jumlah uang yang akan dikurangi
   */
  public void decreaseUang(int nominalDecrease) {
    uang -= nominalDecrease;
  }

  /**
   * Menambahkan achievement baru
   * @param newAchievement achievement baru yang akan ditambahkan
   */
  public void addAchievement(String newAchievement) {
    achievement.add(newAchievement);
  }

}
