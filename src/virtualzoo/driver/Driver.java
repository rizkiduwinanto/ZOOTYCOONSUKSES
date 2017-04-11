/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.driver;

import java.util.Scanner;
import point.Point;
import virtualzoo.animal.Animal;
import virtualzoo.animal.amphibi.kodok.Kodok;
import virtualzoo.animal.amphibi.pinguinemperor.PinguinEmperor;
import virtualzoo.animal.flyanimal.bangau.Bangau;
import virtualzoo.animal.flyanimal.beo.Beo;
import virtualzoo.animal.flyanimal.cendrawasih.Cendrawasih;
import virtualzoo.animal.flyanimal.elangbotak.ElangBotak;
import virtualzoo.animal.flyanimal.kasuari.Kasuari;
import virtualzoo.animal.flyanimal.kelelawarvampir.KelelawarVampir;
import virtualzoo.animal.flyanimal.macaw.Macaw;
import virtualzoo.animal.flyanimal.merak.Merak;
import virtualzoo.animal.landanimal.badakjawa.BadakJawa;
import virtualzoo.animal.landanimal.beruangmadu.BeruangMadu;
import virtualzoo.animal.landanimal.harimau.Harimau;
import virtualzoo.animal.landanimal.komodo.Komodo;
import virtualzoo.animal.landanimal.simpanse.Simpanse;
import virtualzoo.animal.landanimal.singa.Singa;
import virtualzoo.animal.landanimal.zebra.Zebra;
import virtualzoo.animal.wateranimal.anjinglaut.AnjingLaut;
import virtualzoo.animal.wateranimal.hiuputihbesar.HiuPutihBesar;
import virtualzoo.animal.wateranimal.lumbalumba.LumbaLumba;
import virtualzoo.animal.wateranimal.pauspembunuh.PausPembunuh;
import virtualzoo.animal.wateranimal.sapilaut.SapiLaut;
import virtualzoo.guest.Guest;
import virtualzoo.cage.Cage;
import virtualzoo.cell.habitat.Habitat;
import virtualzoo.zoo.Zoo;

/**
 * Kelas Driver bertanggung jawab mengelola driver.
 * @author AZIS ADI KUNCORO (13515120)
 */
public class Driver {
  
  /** Konstruktor kelas driver. */
  public Driver(){
    
  }
  
  /**
   * Menginisasi array of Cage.
   * @param z sebuah zoo 
   * @param mycage cage yg belum di alokasi
   * @return mengembalikan cage yg sudah di alokasi
   */
  public static Cage[] initCage(Zoo z,Cage[] mycage) {
    int nbcage = 0;
    Point start;
    Point end;
    end = new Point();
    int i = 0;
    int j = 0;
    int k = 0;
    int tempj = 0;
    int tempi = 0;
    for (i = 0; i < z.getBaris(); i++) {
      for (j = 0; j < z.getKolom(); j++) {
        tempj = j;
        tempi = i;
        if (z.getCell(new Point(j,i)) instanceof Habitat 
            && ((Habitat) z.getCell(new Point(j,i))).hasCage()) {
          for (k = 0; k < nbcage; k++) {
            if ((mycage[k].isInside(new Point(j,i)))) {
              break;
            }
          }
          if (k == nbcage) {
            
            start = new Point(j,i);
            while (z.getCell(new Point(j,i)) instanceof Habitat 
                  && ((Habitat) z.getCell(new Point(j,i))).hasCage()) {
              if (j + 1 < z.getKolom() && z.getCell(new Point(j + 1,i)) instanceof Habitat
                    && ((Habitat) z.getCell(new Point(j + 1,i))).hasCage()) {
                j++;
              } else if (i + 1 < z.getBaris() && z.getCell(new Point(j,i + 1)) instanceof Habitat
                      && ((Habitat) z.getCell(new Point(j,i + 1))).hasCage()) {
                i++;
              } else { 
                end = new Point(j,i);
                j++;
              }
            }
            mycage[nbcage] = new Cage(start,end);
            nbcage++;  
            
            
          }
        }
        i = tempi;
        j = tempj;
      }
    }
    return mycage;
  }
  
  /**
   * Menghasilkan jumlah cage.
   * @param z sebuah Zoo
   * @return Mengembalikan jumlah cage
   */
  
  public static int getNbCage(Zoo z) {
    int i = 0;
    int j = 0;
    int nbcage = 0;
    while (i < z.getBaris()) {
      while (j < z.getKolom()) {
        if (z.getCell(new Point(j,i)) instanceof Habitat
                && ((Habitat) z.getCell(new Point(j,i))).hasCage()) {
          while (z.getCell(new Point(j,i)) instanceof Habitat
                  && ((Habitat) z.getCell(new Point(j,i))).hasCage()) {
            if (j + 1 < z.getKolom() && z.getCell(new Point(j + 1,i)) instanceof Habitat
                    && ((Habitat) z.getCell(new Point(j + 1,i))).hasCage()) {
              j++;
            } else if (i + 1 < z.getBaris() && z.getCell(new Point(j,i + 1)) instanceof Habitat
                    && ((Habitat) z.getCell(new Point(j,i + 1))).hasCage()) {
              i++;
            } else { 
              j++;
            }
          }
          nbcage++;
        }
        j++;
      }
      i++;
      j = 0;
    }
    return nbcage;
  }
  
  /**
   * Memulai driver.
   */
  
  public void start() {
    final int Maxcage = 20;
    Guest tamu;
    Zoo myzoo = new Zoo();
    boolean reserved;
    Cage[] mycage;
    mycage = new Cage [Maxcage];
    int nbcage = 0;
    String namahewan;
    Animal newhewan;
    int idx = 0;
    int idhewan = 0;
    int absis = 0;
    int ordinat = 0;
    Scanner s = new Scanner(System.in);
    int op = -1;
    while (op != 0) {
      showMainMenu();
      System.out.print("Masukkan pilihan : ");
      op = s.nextInt();
      if (op == 1) { 
        // Pilihan == Zoo
        showZooMenu();
        System.out.print("Masukkan pilihan : ");
        op = s.nextInt();
        switch (op) {
          case 1: { 
            myzoo.loadZoo();// Load Zoo dari file eksternal
            mycage = initCage(myzoo,mycage);
            nbcage = getNbCage(myzoo);
            break;
          }
          case 2: {
            if (myzoo.isEmpty()) {
              System.out.println("Zoo masih kosong !");
            } else {
              myzoo.saveZoo();
            }
            // Save Zoo ke file eksternal
            break;
          }
          case 3: {
            myzoo.generateZoo();// Generate Zoo melalui mekanisme input user
            break;
          }
          case 4: {
            float sum = 0;
            for (int i = 0; i < nbcage; i++) {
              sum += mycage[i].getPorsiKandang();
            }
            System.out.println("Porsi total : " + sum);
            break;
          } // Menampilkan jumlah total makanan dibutuhkan oleh Zoo perhari
          case 5: {
            myzoo.displayZoo();// Menampilkan Zoo secara umum
            break;
          }
          case 6: {
            myzoo.displayZooPartial();// Menampilkan Zoo sebagian saja
            break;
          }
          case 7: { // Tur keliling Zoo
            tamu = new Guest(myzoo.getEntrance());
            tamu.tour(myzoo, mycage, nbcage);
            break;
          }
          default:
            break;
        }
      } else if (op == 2) { 
        // Pilihan == Cage
        showCageMenu();
        System.out.print("Masukkan pilihan : ");
        op = s.nextInt();
        switch (op) {
          case 1: { //Menambahkan cage baru
            if (nbcage < Maxcage) {
              System.out.print("Masukkan Starting point (x,y) : ");
              absis = s.nextInt();
              ordinat = s.nextInt();
              Point start = new Point(absis,ordinat);
              System.out.print("Masukkan Ending point (x,y) : ");
              absis = s.nextInt();
              ordinat = s.nextInt();
              reserved = false;
              Point end = new Point(absis,ordinat);
              for (int i = 0; i < nbcage && !reserved; i++) {
                if ((mycage[i].getStartPoint().getX() <= start.getX()
                    && start.getX() <= mycage[i].getEndPoint().getX())
                    && (mycage[i].getStartPoint().getY() <= start.getY()
                    && start.getY() <= mycage[i].getEndPoint().getY())
                    || (mycage[i].getStartPoint().getX() <= end.getX()
                    && end.getX() <= mycage[i].getEndPoint().getX())
                    && (mycage[i].getStartPoint().getY() <= end.getY()
                    && end.getY() <= mycage[i].getEndPoint().getY())) {
                  reserved = true;
                }
              }
              if (reserved) {
                System.out.println("Maaf, tidak bisa membuat cage pada range tsb"
                        + " karena sudah ada cage diatasnya");
              } else {
                mycage[nbcage] = new Cage(start,end);
                nbcage++;
              }
            } else {
              System.out.println("jumlah cage sudah maksimum");
            }
            break;
          }
            
          case 2: { //Menambahkan animal ke cage dari posisi tertentu
            System.out.print("Masukkan indeks cage : ");
            idx = s.nextInt();
            if (idx >= nbcage) {
              System.out.println("Maaf indeks yang dimasukkan invalid");
              break;
            }
            System.out.print("Masukkan hewan : ");
            namahewan = new String(s.nextLine());//Dummy
            namahewan = new String(s.nextLine());
            System.out.print("Masukkan posisi (x,y) : ");
            absis = s.nextInt();
            ordinat = s.nextInt();
            newhewan = new Kodok(absis,ordinat, (float) 0.2,false); //Default
            if (namahewan.equals("kodok")) {
              newhewan = new Kodok(absis,ordinat, (float) 0.2,false);
            } else if (namahewan.equals("pinguinemperor")) {
              newhewan = new PinguinEmperor(absis,ordinat, (float) 0.2,false);
            } else if (namahewan.equals("bangau")) {
              newhewan = new Bangau(absis,ordinat, (float) 0.2,false);
            } else if (namahewan.equals("beo")) {
              newhewan = new Beo(absis,ordinat,(float) 0.2,false);
            } else if (namahewan.equals("cendrawasih")) {
              newhewan = new Cendrawasih(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("elangbotak")) {
              newhewan = new ElangBotak(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("kasuari")) {
              newhewan = new Kasuari(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("kelelawarvampir")) {
              newhewan = new KelelawarVampir(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("macaw")) {
              newhewan = new Macaw(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("merak")) {
              newhewan = new Merak(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("badakjawa")) {
              newhewan = new BadakJawa(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("beruangmadu")) {
              newhewan = new BeruangMadu(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("harimau")) {
              newhewan = new Harimau(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("komodo")) {
              newhewan = new Komodo(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("simpanse")) {
              newhewan = new Simpanse(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("singa")) {
              newhewan = new Singa(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("zebra")) {
              newhewan = new Zebra(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("anjinglaut")) {
              newhewan = new AnjingLaut(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("hiuputihbesar")) {
              newhewan = new HiuPutihBesar(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("lumbalumba")) {
              newhewan = new LumbaLumba(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("pauspembunuh")) {
              newhewan = new PausPembunuh(absis,ordinat,(float) 0.2,false);      
            } else if (namahewan.equals("sapilaut")) {
              newhewan = new SapiLaut(absis,ordinat,(float) 0.2,false);      
            }
            mycage[idx].addAnimal(myzoo, newhewan);
            break;
          }
            
          case 3: { // Menghilangkan animal dari Cage pada posisi tertentu
            System.out.print("Masukkan indeks cage : ");
            idx = s.nextInt();
            if (idx >= nbcage) {
              System.out.println("Maaf indeks yang dimasukkan invalid");
              break;
            }
            System.out.print("Masukkan indeks hewan yang ingin di remove : ");
            idhewan = s.nextInt();
            mycage[idx].removeAnimal(idhewan);
            break;
          }
            
          case 4: { // Melakukan validasi apakah cell pada posisi tertentu member dari cage tersebut
            System.out.print("Masukkan indeks cage : ");
            idx = s.nextInt();
            if (idx >= nbcage) {
              System.out.println("Maaf indeks yang dimasukkan invalid");
              break;
            }
            System.out.print("Masukkan posisi (x,y) : ");
            absis = s.nextInt();
            ordinat = s.nextInt();
            if (mycage[idx].isUsedAnimalPosition(new Point(absis,ordinat))) {
              System.out.println("Cell posisi tersebut merupakan member dari cage tersebut");
            } else {
              System.out.println("Cell posisi tersebut BUKAN member dari cage tersebut");
            } 
            break;
          }
            
          case 5: { // Menampilkan semua Cage-Cage yang ada pada zoo 
            System.out.println("Jumlah cage yg ada : " + nbcage);
            for (int i = 0; i < nbcage; i++) {
              System.out.print("" + (i + 1) + ". " + "start point : <"
                      + mycage[i].getStartPoint().getX() + ","
                      + mycage[i].getStartPoint().getY() + ">");
              System.out.print(" endpoint : <" + mycage[i].getEndPoint().getX() + ","
                      + mycage[i].getEndPoint().getY() + ">");
              System.out.println(" berisi " + mycage[i].getNbHewan() + " hewan");
            }
            break;
          }
            
          case 6 : { //Menampilkan hewan pada cage ke indeks ke idx
            System.out.print("Masukkan indeks cage : ");
            idx = s.nextInt();
            if (idx >= nbcage) {
              System.out.println("Maaf indeks yang dimasukkan invalid");
              break;
            }
            mycage[idx].showAnimal();
            break;
          } 
          
          default:
            break;
        }
      }
    }
  }
  
  /**
   * Menampilkan menu tentang Zoo.
   */
  
  public void showZooMenu() {
    System.out.println("Menu Zoo : ");
    System.out.println("1. Load Zoo dari file eksternal");
    System.out.println("2. Save Zoo ke file eksternal");
    System.out.println("3. Generate Zoo dari input user");
    System.out.println("4. Menampilkan jumlah makanan yang dibutuhkan hewan total per hari");
    System.out.println("5. Menampilkan Zoo secara umum");
    System.out.println("6. Menampilkan Zoo sebagian saja");
    System.out.println("7. Tur keliling Zoo");
  }
  
  /**
   * Menampilkan menu tentang Cage.
   */
  
  public void showCageMenu() {
    System.out.println("Menu Cage : ");
    System.out.println("1. Menambahkan cage baru");
    System.out.println("2. Menambahkan animal ke cage pada posisi tertentu");
    System.out.println("3. Menghilangkan animal dari cage dari posisi tertentu");
    System.out.println("4. Mengecek apakah Cell pada posisi tertentu member dari cage");
    System.out.println("5. Menampilkan semua cage yang ada pada zoo");
    System.out.println("6. Menampilkan hewan pada cage indeks tertentu");
    
  }
  
  /**
   * Menampilka main menu.
   */
  
  public void showMainMenu() {
    System.out.println("Menu pilihan :");
    System.out.println("1. Zoo");
    System.out.println("2. Cage");
  }
    
  
}
