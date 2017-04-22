package profile;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Profile {
  private String namaPemilik;
  private long uang;
  private String namaZoo;
  private int jumlahAnimal;
  private String[] achievement;

  /**
   * Konstruktor parameter dari kelas Profile
   * @param namaPemilik nama dari pemilik zoo
   * @param uang jumlah uang yang dimiiliki
   * @param namaZoo nama dari sebuah zoo
   * @param jumlahAnimal jumlah animal yang dimiliki
   * @param achievement achievement - achievement yang dimiliki
   */
  public Profile (String namaPemilik, long uang, String namaZoo, int jumlahAnimal, String[] achievement){
    this.namaPemilik = namaPemilik;
    this.uang = uang;
    this.namaZoo = namaZoo;
    this.jumlahAnimal = jumlahAnimal;
    this.achievement = achievement;
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
  public String[] getAchievement() {
    return achievement;
  }
}
