package cage;

import cell.habitat.Habitat;
import java.util.LinkedList;
import java.util.Queue;
import point.Point;
import zoo.Zoo;


/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Cage {

  private Cage(){

  }

  public static void addCage(Zoo myZoo, Point p) {
    assert (myZoo.getCell(p) instanceof Habitat) : "Maaf, cell ini bukan turunan habitat";
    assert (!((Habitat) myZoo.getCell(p)).getCageStatus()) : "Maaf, cell ini sudah diberi cage";
    ((Habitat) myZoo.getCell(p)).setCageStatus(true);
  }

  public static void getLuasCage(Zoo myZoo, Point p) {
    assert (myZoo.getCell(p) instanceof Habitat) : "Maaf, cell ini bukan turunan habitat";
    assert (((Habitat) myZoo.getCell(p)).getCageStatus()) : "Maaf, habitat ini belum diberi cage";
    boolean[][] visited = new boolean[myZoo.getBaris()][myZoo.getKolom()];
    for (int i = 0; i < myZoo.getBaris(); i++) {
      for (int j = 0; j < myZoo.getKolom(); j++) {
        visited[i][j] = false;
      }
    }
    Queue<Point> myQueue = new LinkedList<Point>();
    myQueue.add(new Point(p));
    visited[p.getY()][p.getX()] = true;
    int luas = 0;

    while (!myQueue.isEmpty()) {
      p = (Point) myQueue.poll();
      luas++;
      Point padd = new Point(p.getX(),p.getY() - 1);
      if (padd.getX() >= 0 && padd.getY() >= 0
          && (padd.getX() < myZoo.getKolom() && padd.getY() < myZoo.getBaris())
          && (myZoo.getCell(padd) instanceof Habitat)
          && ((Habitat) myZoo.getCell(padd)).getCageStatus()
          && !visited[padd.getY()][padd.getX()]
          && myZoo.getCell(padd).getClass() == myZoo.getCell(p).getClass())  {
        visited[padd.getY()][padd.getX()] = true;
        myQueue.add(new Point(padd));
      }
      padd = new Point(p.getX() - 1,p.getY());
      if (padd.getX() >= 0 && padd.getY() >= 0
          && (padd.getX() < myZoo.getKolom() && padd.getY() < myZoo.getBaris())
          && (myZoo.getCell(padd) instanceof Habitat)
          && ((Habitat) myZoo.getCell(padd)).getCageStatus()
          && !visited[padd.getY()][padd.getX()]
          && myZoo.getCell(padd).getClass() == myZoo.getCell(p).getClass())  {
        visited[padd.getY()][padd.getX()] = true;
        myQueue.add(new Point(padd));
      }
      padd = new Point(p.getX(),p.getY() + 1);
      if (padd.getX() >= 0 && padd.getY() >= 0
          && (padd.getX() < myZoo.getKolom() && padd.getY() < myZoo.getBaris())
          && (myZoo.getCell(padd) instanceof Habitat)
          && ((Habitat) myZoo.getCell(padd)).getCageStatus()
          && !visited[padd.getY()][padd.getX()]
          && myZoo.getCell(padd).getClass() == myZoo.getCell(p).getClass())  {
        visited[padd.getY()][padd.getX()] = true;
        myQueue.add(new Point(padd));
      }
      padd = new Point(p.getX() + 1,p.getY());
      if (padd.getX() >= 0 && padd.getY() >= 0
          && (padd.getX() < myZoo.getKolom() && padd.getY() < myZoo.getBaris())
          && (myZoo.getCell(padd) instanceof Habitat)
          && ((Habitat) myZoo.getCell(padd)).getCageStatus()
          && !visited[padd.getY()][padd.getX()]
          && myZoo.getCell(padd).getClass() == myZoo.getCell(p).getClass())  {
        visited[padd.getY()][padd.getX()] = true;
        myQueue.add(new Point(padd));
      }
    }
    System.out.println("Luasnya : " + luas);
  }
}
