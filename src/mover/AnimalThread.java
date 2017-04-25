package mover;

import animal.Animal;
import animal.amphibi.kodok.Kodok;
import animal.landanimal.badakjawa.BadakJawa;
import animal.landanimal.singa.Singa;
import cell.habitat.Habitat;
import loader.Loader;
import point.Point;
import zoo.Zoo;

/**
 * Created by Hishamlazuardi on 25/04/2017.
 */
public class AnimalThread extends Thread {
  private Animal hewan;
  private Zoo mZoo;
  private String nama;

  public AnimalThread(String name, Zoo myZoo, Animal hewan) {
    super(name);
    nama = name;
    System.out.println(name + "created");
    this.hewan = hewan;
    mZoo = myZoo;
    ((Habitat) myZoo.getCell(
        new Point(hewan.getLocation().getX(), hewan.getLocation().getY()))).addHewan(hewan);
  }

  public AnimalThread(Animal hewan) {
    this.hewan = hewan;
  }

  public synchronized void threadMoveAnimal() {
    AnimalMover.moveAnimal(mZoo, hewan);
  }

  @Override
  public void run() {
    while (true) {
      threadMoveAnimal();
      System.out.println(nama);
      System.out.println(hewan.getLocation());
      try {
        Thread.sleep(1000);
      }
      catch (Exception e) {}
    }
  }

  public static void main(String[] args) {
    Animal hewan1 = new Kodok(2, 2, 15, false);
    Animal hewan2 = new BadakJawa(1, 1, 150, false);
    Animal hewan3 = new Singa(9, 1, 100, true);
    Zoo myZoo = Loader.loadZoo();
    AnimalThread T1 = new AnimalThread("T1", myZoo, hewan1);
    AnimalThread T2 = new AnimalThread("T2", myZoo, hewan2);
    //AnimalThread T3 = new AnimalThread("T3", myZoo, hewan3);
    T1.start();
    T2.start();
    //T3.start();

    try {
      T1.join();
      T2.join();
      //T3.join();
    }
    catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
