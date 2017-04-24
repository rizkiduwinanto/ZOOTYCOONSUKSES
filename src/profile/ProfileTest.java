package profile;

import java.util.ArrayList;
import junit.framework.TestCase;
import profile.model.ProfileModel;

import org.junit.Test;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class ProfileTest extends TestCase {
  private ArrayList<String> acv = new ArrayList<String>();
  private ProfileModel testProfile = new ProfileModel("Azis",1000,"Ciburbur",10,acv);

  @Test
  public void testGetNamaPemilik() throws Exception {
    assertEquals("Azis",testProfile.getNamaPemilik());
  }
  @Test
  public void testGetUang() throws Exception {
    assertEquals(1000,testProfile.getUang());
  }
  @Test
  public void testGetNamaZoo() throws Exception {
    assertEquals("Ciburbur",testProfile.getNamaZoo());
  }
  @Test
  public void testGetJumlahAnimal() throws Exception {
    assertEquals(10,testProfile.getJumlahAnimal());
  }
  @Test
  public void testGetAchievement() throws Exception {
    assertEquals(acv,testProfile.getAchievement());
  }
  @Test
  public void testIncreaseUang() throws Exception {
    testProfile.increaseUang(200);
    assertEquals(1200,testProfile.getUang());
  }
  @Test
  public void testDecreaseUang() throws Exception {
    testProfile.decreaseUang(200);
    assertEquals(800,testProfile.getUang());
  }
  @Test
  public void testAddAchievement() throws Exception {
    testProfile.addAchievement("Lalala");
    testProfile.addAchievement("Lilili");
    int size = testProfile.getAchievement().size();
    testProfile.addAchievement("AcvBaru");
    assertEquals(size + 1,testProfile.getAchievement().size()); //Cek apakah sizenya bertambah
    assertEquals("AcvBaru",testProfile.getAchievement().get(size)); // Cek apakah yang ditambahkan sama
  }



}