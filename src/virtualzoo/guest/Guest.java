/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.guest;

import java.util.Stack;
import point.Point;
import virtualzoo.cage.Cage;
import virtualzoo.cell.facility.road.Road;
import virtualzoo.zoo.Zoo;

/**
 *
 * @author Muhammad Rizki Duwinanto (13515006)
 * @version 3.0
 */
public class Guest {
  private Point location;
    
  /**
   * Konstruktor default Guest.
   */
  public Guest() {
    location = new Point(0,0);
  }
  
  /**
   * Konstruktor Guest dengan parameter.
   * @param startPosition Merupakan posisi awal dari Guest
   */
  public Guest(Point startPosition) {
    location = new Point(startPosition.getX(), startPosition.getY());
  }
  
  /** 
   * Fungsi untuk mengecek apakah bisa bergerak ke arah kiri.
   * @param z Merupakan suatu Zoo
   * @return bool apakah dapat bergerak ke kiri
   */
  public boolean canGoLeft(Zoo z) {
    return (location.getX() - 1 >= 0 
            && z.getCell(new Point(location.getX() - 1, location.getY())) instanceof Road);
  }
    
  /** 
   * Fungsi untuk mengecek apakah bisa bergerak ke arah kanan.
   * @param z Merupakan suatu Zoo
   * @return bool apakah dapat bergerak ke kanan
   */
  public boolean canGoRight(Zoo z) {
    return (location.getX() + 1 < z.getKolom() 
            && z.getCell(new Point(location.getX() + 1,location.getY()))instanceof Road);
  }
  
  /** 
   * Fungsi untuk mengecek apakah bisa bergerak ke arah atas.
   * @param z Merupakan suatu Zoo
   * @return bool apakah dapat bergerak ke atas
   */
  
  public boolean canGoUp(Zoo z) {
    return (location.getY() - 1 >= 0
            && z.getCell(new Point(location.getX(), location.getY() -  1)) instanceof Road);
  }
    
  /** 
   * Fungsi untuk mengecek apakah bisa bergerak ke arah bawah.
   * @param z Merupakan suatu Zoo
   * @return bool apakah dapat bergerak ke bawah
   */
  public boolean canGoDown(Zoo z) {
    return (location.getY() - 1 < z.getBaris()
            && z.getCell(new Point(location.getX(), location.getY() + 1)) instanceof Road);
  }
   
  /**
   * Prosedur yang berguna untuk melakukan tour di dalam Zoo.
   * @param z Merupakan suatu Zoo
   */
  public void tour(Zoo z,Cage[] mycage,int nbcage) {
    location = new Point(z.getEntrance().getX(), z.getEntrance().getY());
    Stack<Point> stackOfPoint;
    stackOfPoint = new Stack();
    boolean [][] visited = new boolean[z.getBaris()][z.getKolom()];
    for (int i = 0; i < z.getBaris(); i++) {
      for (int j = 0; j < z.getKolom(); j++) {
        visited[i][j] = false;
      }
    }
    stackOfPoint.push(location);
    while (!stackOfPoint.empty() && !location.isEqual(z.getExit())) {
      location = stackOfPoint.pop();
      visited[location.getY()][location.getX()] = true;
      //Move players and push them to stack
      if (canGoUp(z)) { 
        if (!visited[location.getY() - 1][location.getX()]) {
          stackOfPoint.push(new Point(location.getX(), location.getY() - 1));
        }
      } else if (canGoLeft(z)) { 
        if (!visited[location.getY()][location.getX() - 1]) {
          stackOfPoint.push(new Point(location.getX() - 1, location.getY()));
        }
      } else if (canGoDown(z)) { 
        if (!visited[location.getY() + 1][location.getX()]) {
          stackOfPoint.push(new Point(location.getX(), location.getY() + 1));
        }
      } else if (canGoRight(z)) { 
        if (!visited[location.getY()][location.getX() + 1]) {
          stackOfPoint.push(new Point(location.getX() + 1, location.getY()));
        }
      }
      //Interact with animals
      for (int i = 0; i < nbcage; i++) {
        if (mycage[i].isUsedAnimalPosition(location)) {
          mycage[i].getAnimal(mycage[i].getAnimalId(location)).interact();
        }
      }
    }
  }
}
