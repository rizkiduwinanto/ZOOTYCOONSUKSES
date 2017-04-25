import loader.Loader;
import point.Point;
import zoo.Zoo;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Driver {

  public Driver() {
  }

  public void mainMenu() {

  }

  public static void main(String[] args) {
    System.out.println(System.getProperty("user.dir"));
    Zoo myZoo;

    myZoo = Loader.loadZoo();
    myZoo.display();
    //Saver.saveZoo(myZoo);
    //Cage.getLuasCage(myZoo,new Point(1,1));
  }
}
