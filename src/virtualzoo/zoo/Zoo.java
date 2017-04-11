/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.zoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import point.Point;
import virtualzoo.cell.Cell;
import virtualzoo.cell.facility.park.Park;
import virtualzoo.cell.facility.restaurant.Restaurant;
import virtualzoo.cell.facility.road.Road;
import virtualzoo.cell.facility.road.entrance.Entrance;
import virtualzoo.cell.facility.road.exit.Exit;
import virtualzoo.cell.habitat.airhabitat.AirHabitat;
import virtualzoo.cell.habitat.landhabitat.LandHabitat;
import virtualzoo.cell.habitat.waterhabitat.WaterHabitat;



/**
 * Kelas Zoo.
 * @author Muhammad Rizki Duwinanto (13515006)
 * @version 3.0 
 */
public class Zoo {
  private static final int DEFAULTBARIS = 100;
  private static final int DEFAULTKOLOM = 100;
  private int baris;
  private int kolom;
  private Point entrance;
  private Point exit;
  private final Cell[][] cc;
  
  /**
   * Konstruktor Zoo Default.
   */
  public Zoo() {
    baris = 0;
    kolom = 0;
    cc = new Cell[DEFAULTBARIS][DEFAULTKOLOM];
    entrance = new Point();
    exit = new Point();
  }
  
  /**
   * Konstruktor Zoo dengan Parameter.
   * @param baris untuk inisialisasi baris
   * @param kolom untuk inisialisasi kolom
   */
  public Zoo(int baris, int kolom) {
    this.baris = baris;
    this.kolom = kolom;
    cc = new Cell[baris][kolom];
    this.entrance = new Point();
    this.exit = new Point();
  }
  
  /**
   * Setter Baris suatu Zoo.
   * @param baris Merupakan baris baru untuk Zoo
   */
  public void setBaris(int baris) {
    this.baris = baris;
  }
  
  /**
   * Setter Kolom suatu Zoo.
   * @param kolom merupakan kolom baru untuk Zoo
   */
   
  public void setKolom(int kolom) {
    this.kolom = kolom;
  }
  
  /**
   * Setter entrance suatu Zoo.
   * @param p merupakan posisi baru untuk entrance
   */
  
  public void setEntrance(Point p) {
    entrance = new Point(p.getX(), p.getY());
  }
  
  /**
   * Setter exit suatu Zoo.
   * @param p merupakan posisi baru untuk exit
   */
  
  public void setExit(Point p) {
    exit = new Point(p.getX(), p.getY());
  }
  
  /**
   * Setter Cell Type tiap elemen matriks suatu Zoo.
   * @param p merupakan lokasi cell
   * @param type merupakan char type cell tersebut
   */
  public void setCellType(Point p, char type) {
    switch (type) {
      case 'X' : { 
        cc[p.getY()][p.getX()] = new LandHabitat(new Point(p.getX(),p.getY()),true);
        break;
      }
      case 'x' : { 
        cc[p.getY()][p.getX()] = new LandHabitat(new Point(p.getX(),p.getY()),false);
        break;
      }
      case 'W' : { 
        cc[p.getY()][p.getX()] = new WaterHabitat(new Point(p.getX(),p.getY()),true);
        break;
      }
      case 'w' : { 
        cc[p.getY()][p.getX()] = new WaterHabitat(new Point(p.getX(),p.getY()),false);
        break;
      }
      case 'A' : { 
        cc[p.getY()][p.getX()] = new AirHabitat(new Point(p.getX(),p.getY()),true);
        break;
      }
      case 'a' : {
        cc[p.getY()][p.getX()] = new AirHabitat(new Point(p.getX(),p.getY()),false);
        break;
      }
      case '.' : {
        cc[p.getY()][p.getX()] = new Road(new Point(p.getX(),p.getY()));
        break;
      }
      case '#' : { 
        cc[p.getY()][p.getX()] = new Park(new Point(p.getX(),p.getY()));
        break;
      }
      case 'R' : { 
        cc[p.getY()][p.getX()] = new Restaurant(new Point(p.getX(),p.getY()));
        break;
      }
      case 'I' : { 
        cc[p.getY()][p.getX()] = new Entrance(new Point(p.getX(),p.getY()));
        setEntrance(new Point(p.getX(),p.getY()));
        break;
      }
      case 'O' : { 
        cc[p.getY()][p.getX()] = new Exit(new Point(p.getX(),p.getY()));
        setExit(new Point(p.getX(),p.getY()));
        break;
      }
      default:
        break;
    }
  }
  
  /**
   * Getter Baris suatu Zoo.
   * @return Mengembalikan Baris
   */
  public int getBaris() {
    return baris;
  }
  
  /**
   * Getter Kolom suatu Zoo.
   * @return Mengembalikan Kolom
   */
  public int getKolom() {
    return kolom;
  }
  
  /**
   * Getter Entrance suato Zoo.
   * @return entrance
   */
  public Point getEntrance() {
    return entrance;
  }
    
  /**
   * Getter Exit suatu Zoo.
   * @return exit
   */
  public Point getExit() {
    return exit;
  }
    
  /**
   * Getter Cell suatu Zoo.
   * @param p Merupakan koordinat cell di zoo
   * @return Mengembalikan Cell
   */
  public Cell getCell(Point p) {
    return cc[p.getY()][p.getX()];
  }
    
  /** Predikat apakah Zoo kosong.
   * 
   * @return Mengembalikan predikat apakah zoo tsb kosong.
   */
  public boolean isEmpty() {
    return (kolom == 0 && baris == 0);
  }
    
  /** 
   * Prosedur untuk menginisiasi Zoo.
   */
  public void loadZoo() {
    BufferedReader map = null;
    int newBaris = 0;
    int newKolom = 0;
    int i = 0; 
    int j = 0;
    char tipe;
    System.out.print("Masukkan nama file load : ");
    Scanner name = new Scanner(System.in);
    String filename = name.nextLine();
    try {
      map = new BufferedReader(new FileReader("../loadfile/" + filename + ".txt"));
      newBaris = newKolom = 0;
      do {
        tipe = (char) map.read(); //konversi 0..9
        if (tipe != ' ') {
          newBaris = newBaris * 10 + (int) tipe - 48;
        }
      } while (tipe != ' ');
      tipe = (char) map.read();
      while (tipe != '\n' && tipe != '\r') {
        newKolom = newKolom * 10 + (int) tipe - 48;
        tipe = (char) map.read(); //konversi 0..9
      } 
      setBaris(newBaris);
      setKolom(newKolom);
      while (i < getBaris()) {
        while (j < getKolom()) {
          tipe = (char) map.read();
          if (tipe != '\n' && tipe != '\r') {
            setCellType(new Point(j,i), tipe);
            j++;
          }
        }
        i++;
        j = 0;
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      try {
        if (map != null) {
          map.close();
        }
      } catch (IOException ex) {
        Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
  
  /** 
   * Prosedur untuk menampilkan Zoo kepada pengguna.
   * Menampilkan zoo berdasarkan format yang ada dengan menggunakan warna.
   */
  public void displayZoo() {
    for (int i = 0; i < getBaris(); i++) {
      for (int j = 0; j < getKolom(); j++) {
        System.out.print(getCell(new Point(j,i)).render());
        if (j < getKolom() - 1) {
          System.out.print(" ");
        } else {
          System.out.println("\n");
        }
      }
    }
  }
  
  /** 
   * Prosedur untuk menampilkan Zoo kepada pengguna sebagian saja.
   * Menampilkan zoo berdasarkan format yang ada dengan menggunakan warna sebagian saja
   */
  public void displayZooPartial() {
    int locX = 0;
    int locY = 0;
    Scanner input = new Scanner(System.in);
    String stream;
    System.out.print("Masukkan batas kiri peta: ");
    locX = input.nextInt();
    locY = input.nextInt();
    System.out.print("Masukkan batas kanan peta: ");
    locX = input.nextInt();
    locY = input.nextInt();
    Point end = new Point(locX, locY);
    Point start = new Point(locX, locY);
    for (int i = start.getX(); i <= end.getX(); i++) {
      for (int j = start.getY(); j <= end.getY(); j++) {
        System.out.print(getCell(new Point(j,i)).render());
        if (j < end.getY()) {
          System.out.print(" ");
        } else {
          System.out.println("\n");
        }
      }
    }
  }
  
  /** 
   * Prosedur untuk menyimpan Zoo kepada pengguna
   * Menyimpan zoo berdasarkan format yang ada ke txt.
   */
  public void saveZoo() {
    System.out.print("Masukkan nama file save : ");
    Scanner name = new Scanner(System.in);
    String filename = name.nextLine();
    try {
      PrintWriter os = new PrintWriter("../loadfile/" + filename + ".txt");
      os.println(getBaris() + " " + getKolom());
      for (int i = 0; i < getBaris(); i++) {
        for (int j = 0; j < getKolom(); j++) {
          os.print(getCell(new Point(j,i)).render());
        }
        os.println("");
      }
      os.close();
    } catch (FileNotFoundException e) {
      System.out.println("terdapat kesalahan");
    }
  }
    
  /** 
   * Prosedur untuk Generate Zoo melalui mekanisme input user.
   */
  public void generateZoo() {
    Scanner input = new Scanner(System.in);
    int newBaris = 0;
    int newKolom = 0;
    System.out.print("Masukkan ukuran zoo (baris x kolom) : ");
    newBaris = input.nextInt();
    newKolom = input.nextInt();
    String stream;
    stream = new String(input.nextLine()); //Dummy
    setBaris(newBaris);
    setKolom(newKolom);
    System.out.println("stringnya :");
    for (int i = 0; i < getBaris(); i++) {
      stream = new String(input.nextLine());
      for (int j = 0; j < getKolom(); j++) {
        setCellType(new Point(j,i), stream.charAt(j));
      }
    } 
  }
}
