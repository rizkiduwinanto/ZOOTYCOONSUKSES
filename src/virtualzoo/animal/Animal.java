/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal;

import point.Point;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public abstract class Animal {
  /** Atribut lokasi hewan di dalam Zoo.
   */
  protected Point loc;
  /** Atribut berat badan hewan.
   */
  protected float beratBadan;
  /** Atribut flag buas hewan.
   */
  protected boolean buas;
  /** Atribut flag untuk LandAnimal.
   */
  protected boolean land;
  /** Atribut flag untuk WaterAnimal.
   */
  protected boolean water;
  /** Atribut flag untuk FlyAnimal.
   */
  protected boolean fly;
  /** Atribut flag untuk hewan herbivora.
   */
  protected boolean herbivor;
  /** Atribut flag untuk hewan karnivora.
   */
  protected boolean karnivor;
  /** Variabel static untuk mengetahui porsi makanan semua hewan.
   */
  protected static float porsiSemuaHewan;
  
  /** Getter.
   * Fungsi mengembalikan lokasi hewan di dalam Zoo
   * @return loc
   */
  public Point getLocation() {
    return loc;
  }
  
  /** Getter.
   * Fungsi mengembalikan berat badan hewan
   * @return beratBadan
   */
  public float getBeratBadan() {
    return beratBadan;
  } 
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan itu buas atau tidak
   * @return buas
   */
  public boolean isBuas() {
    return buas;
  }
  
  /** Getter.
   * Fungsi mengembalikan porsi makanan suatu hewan
   * @return porsiMakanan
   */
  public float getPorsiMakanan() {
    return (float) (0.05 * beratBadan);
  }
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan tersebut LandAnimal atau tidak
   * @return land
   */
  public boolean isLandAnimal() {
    return land;
  }
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan tersebut WaterAnimal atau tidak
   * @return water
   */
  public boolean isWaterAnimal() {
    return water;
  }
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan tersebut FlyAnimal atau tidak
   * @return fly
   */
  public boolean isFlyAnimal() {
    return fly;
  }
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan tersebut hewan herbivora atau tidak
   * @return herbivor
   */
  public boolean isHerbivor() {
    return herbivor;
  }
  
  /** Getter.
   * Fungsi mengembalikan apakah hewan tersebut hewan karnivora atau tidak
   * @return karnivor
   */
  public boolean isKarnivor() {
    return karnivor;
  }
  
  /** Getter Static.
   * Fungsi mengembalikan porsi makanan semua hewan di dalam Zoo
   * @return porsiSemuaHewan
   */
  public static float getPorsiMakananSemuaHewan() {
    return porsiSemuaHewan;
  }
  
  /** Prosedur abstrak interact yang akan diimplementasikan di kelas riil hewan.
   */
  public abstract void interact();
}
