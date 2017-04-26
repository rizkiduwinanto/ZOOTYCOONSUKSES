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
  
  /**
  * Ctor Thread Animal
  * @param name nama hewan.
  * @param myZoo zoo aktif
  * @param hewan objek hewan
  */
  public AnimalThread(String name, Zoo myZoo, Animal hewan) {
    super(name);
    nama = name;
    System.out.println(name + "created");
    this.hewan = hewan;
    this.myZoo = myZoo;
    ((Habitat) myZoo.getCell(
        new Point(hewan.getLocation().getX(), hewan.getLocation().getY()))).addHewan(hewan);
  }

  public AnimalThread(Animal hewan) {
    this.hewan = hewan;
  }

  public synchronized void threadMoveAnimal() {
    AnimalMover.moveAnimal(myZoo, hewan);
  }

  @Override
  public void run() {
    while (true) {
      threadMoveAnimal();
      System.out.println(nama);
      System.out.println(hewan.getLocation());
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println("No Sleep");
      }
    }
  }
  
  /**
   * main method driver thread.
   * @param args null
   */
  public static void main(String[] args) {
    Animal hewan1 = new Kodok(2, 2, 15, false);
    Animal hewan2 = new BadakJawa(1, 1, 150, false);
    Animal hewan3 = new Singa(9, 1, 100, true);
    Zoo myZoo = Loader.loadZoo(ProfileModel.getProfileName());
    AnimalThread t1 = new AnimalThread("T1", myZoo, hewan1);
    AnimalThread t2 = new AnimalThread("T2", myZoo, hewan2);
    //AnimalThread T3 = new AnimalThread("T3", myZoo, hewan3);
    t1.start();
    t2.start();
    //T3.start();
    try {
      t1.join();
      t2.join();
      //T3.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
