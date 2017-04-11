/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author AZIS ADI KUNCORO (13515120)
 */
public class Point {
  
  private int x;
  private int y;
  
  /**
   * Konstruktor Point, melakukan inisialisasi dengan absis = ordinat = 0
   */
  public Point(){
    x = 0;
    y = 0;
  }
  
  /**
   * Konstruktor Point dengan parameter 
   * @param _x nilai absis untuk suatu point
   * @param _y nilai ordinat untuk suatu point
   */
  public Point(int _x, int _y){
    x = _x;
    y = _y;
  }
  
  /**
   * Setter Absis 
   * @param _x nilai baru untuk absis yang akan di set
   */
  public void setX(int _x){
    x = _x;
  }
  
  /**
   * Setter Ordinat 
   * @param _y nilai baru untuk ordinat yang akan di set
   */
  public void setY(int _y){
    y = _y;
  }
  
  /**
   * Setter
   * @param _x nilai baru untuk absis yang akan di set
   * @param _y nilai baru untuk ordinat yang akan di set
   */
  public void setPoint(int _x, int _y){
    x = _x;
    y = _y;
  }
  
  /**
   * Getter Absis 
   * @return Mengembalikan nilai absis
   */
  public int getX(){
    return x;
  }
  
  /**
   * Getter Ordinat 
   * @return Mengembalikan nilai ordinat
   */
  public int getY(){
    return y;
  }
  
  /** 
   * Memeriksa apakah kedua point tersebut sama
   * @param P2 Point kedua yang akan dibandingkan
   * @return isEqual
   */
  public boolean isEqual(Point P2){
    return (getX()==P2.getX() && getY()==P2.getY());
  }
}
