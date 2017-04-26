package mover;

import animal.Animal;
import animal.amphibi.kodok.Kodok;
import animal.landanimal.badakjawa.BadakJawa;
import animal.landanimal.singa.Singa;
import cell.habitat.Habitat;
import loader.Loader;
import mainmodel.ProfileModel;
import point.Point;
import zoo.Zoo;

/**
 * Created by Hishamlazuardi on 25/04/2017.
 */
public class AnimalThread extends Thread {

  private Animal hewan;
  private Zoo myZoo;
  private String nama;
  private boolean runnable = true;

  /**
   * Konstruktor Animal Thread.
   * @param name atribut nama untuk thread
   * @param myZoo atribut Zoo untuk pergerakan hewan
   * @param hewan atribut Animal
   */
  public AnimalThread(String name, Zoo myZoo, Animal hewan) {
    super(name);
    nama = name;
    this.hewan = hewan;
    this.myZoo = myZoo;
  }

  /**
   * Prosedur yang digunakan untuk menggerakkan hewan.
   * I.S. myZoo dan hewan terdefinisi
   * F.S. hewan berpindah cell dan atribut hewan pada cell yang lama di set null
   */
  public synchronized void threadMoveAnimal() {
    AnimalMover.moveAnimal(myZoo, hewan);
  }

  /**
   * Prosedur yang digunakan untuk menghentikan thread.
   * I.S. nilai runnable terdefinisi
   * F.S. nilai runnable di set menjadi false
   */
  public void kill() {
    runnable = false;
  }

  /**
   * Prosedur yang digunakan untuk memulai thread.
   */
  @Override
  public void run() {
    while (runnable) {
      threadMoveAnimal();
      System.out.println(hewan.getLocation());
      try {
        Thread.sleep(1000);
      } catch (Exception e) { }
    }
  }
}
