package visitor;

import cell.facility.road.Road;
import cell.habitat.Habitat;
import java.util.Stack;
import point.Point;
import zoo.Zoo;

public class Visitor {
  private Point location;
    
  /**
   * Konstruktor default Guest.
   */
  public Visitor() {
    location = new Point(0,0);
  }
  
  /**
   * Konstruktor Guest dengan parameter.
   * @param startPosition Merupakan posisi awal dari Guest
   */
  public Visitor(Point startPosition) {
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
    return (location.getY() + 1 < z.getBaris()
            && z.getCell(new Point(location.getX(), location.getY() + 1)) instanceof Road);
  }
   
  /**
   * Prosedur yang berguna untuk melakukan tour di dalam Zoo.
   * I.S. Zoo terdefinisi
   * F.S. Visitor dapat melakukan tour di dalam zoo
   * @param z Merupakan suatu Zoo
   */
  // Versi 01 Edit Tour
  public void tour(Zoo z) {
    // Inisiasi Tour di dalam Zoo dengan 
    location = new Point(z.getEntrance().getX(), z.getEntrance().getY());
    Stack<Point> stackOfPoint = new Stack<>();
    boolean[][] visited = new boolean[z.getBaris()][z.getKolom()];
    for (int i = 0; i < z.getBaris(); i++) {
      for (int j = 0; j < z.getKolom(); j++) {
        visited[i][j] = false;
      }
    }
    // Tour di dalam Zoo dengan Algoritma DFS
    stackOfPoint.push(location);
    while (!stackOfPoint.empty() && !location.isEqual(z.getExit())) {
      location = stackOfPoint.pop();
      visited[location.getY()][location.getX()] = true;
      // Move players and push them to stack
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
      
      if (z.getCell(new Point(location.getX() + 1, location.getY())) instanceof Habitat
          && location.getX() + 1 < z.getKolom()) {
        if (((Habitat) z.getCell(new Point(location.getX() + 1, location.getY()))).getHewan()
            != null) {
    		  ((Habitat) z.getCell(new Point(location.getX() + 1, location.getY()))).getHewan()
              .interact();
        }
      }
      if (z.getCell(new Point(location.getX() - 1, location.getY())) instanceof Habitat
          && location.getX() - 1 >= 0) {
    	  if (((Habitat) z.getCell(new Point(location.getX() - 1, location.getY()))).getHewan()
            != null) {
    		  ((Habitat) z.getCell(new Point(location.getX() - 1, location.getY()))).getHewan()
              .interact();
    	  }
      }
      if (z.getCell(new Point(location.getX(), location.getY() + 1)) instanceof Habitat
          && location.getY() + 1 < z.getBaris()) {
    	  if (((Habitat) z.getCell(new Point(location.getX(), location.getY() + 1))).getHewan()
            != null) {
    		  ((Habitat) z.getCell(new Point(location.getX(), location.getY() + 1))).getHewan()
              .interact();
    	  }
      }
      if (z.getCell(new Point(location.getX(), location.getY() - 1)) instanceof Habitat
          && location.getY() - 1 >= 0) {
    	  if (((Habitat) z.getCell(new Point(location.getX(), location.getY() - 1))).getHewan()
            != null) {
    		  ((Habitat) z.getCell(new Point(location.getX(), location.getY() - 1))).getHewan()
              .interact();
    	  }
      }
    }
  }
}
