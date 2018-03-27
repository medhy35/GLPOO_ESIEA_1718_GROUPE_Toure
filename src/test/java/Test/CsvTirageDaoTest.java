package Test;



/**
 * @author	Medhy35
 * 
 * void eclipseWorking()
 * testfindAllTirages()
 * test_fake()
 * void filenotEmpty()
 * 
 *
 */
import org.junit.Assert;
import org.junit.Test;
import Dao.CsvTirageDao;


public class CsvTirageDaoTest {
	
	private CsvTirageDao dao;
	private final String link;
	private final static String RESOURCES_PATH = "src/main/resources/";
    private final static String LOTO_FILE_NAME = "euromillions.csv";
	
	public CsvTirageDaoTest() {
		
		link = RESOURCES_PATH + LOTO_FILE_NAME;
		dao = new CsvTirageDao(link);
	}
	
	@Test // test pour savoir si eclipse fonctionne
	public void eclipseWorking() {

		Assert.assertEquals(1, 1);
	}
	
	@Test // test qu'il ya 150 elements dans les fichier CSV
	public void testfindAllTirages() {
		final int referenceSize =150;
		
		final int rowSize = dao.findAllTirages().size();
		
		Assert.assertEquals(referenceSize,rowSize);
	}
	
	
	public void test_fake() {
		final int referenceSize =151;
		
		final int rowSize = dao.findAllTirages().size();
		
		Assert.assertEquals(referenceSize,rowSize);
	}
	
	@Test // Test que le fichier n'est pas vide
	public void filenotEmpty() {
		final boolean referencecontains = false;
		
		final boolean containsfile = dao.findAllTirages().isEmpty();
		
		Assert.assertEquals(referencecontains,containsfile);
	}
	
	@Test // Test que le fichier n'est pas vide
	public void test_Boule1_Tirage0() {
		final int referenceBoule1 = 6;
		final int Boule1 = dao.findAllTirages().get(0).getBoule1();
		
		Assert.assertEquals(referenceBoule1,Boule1);
	}
	
	@Test // Test que le fichier n'est pas vide
	public void test_Boule2_Tirage0() {
		final int referenceBoule2 = 9;
		final int Boule2 = dao.findAllTirages().get(0).getBoule2();
		
		Assert.assertEquals(referenceBoule2,Boule2);
	}
	
	
	@Test // Test que le fichier n'est pas vide Ligne30
	public void test_Etoile1_Tirage28() {
		final int referenceEtoile1 = 1;
		final int Etoile1 = dao.findAllTirages().get(28).getEtoile1();
		
		Assert.assertEquals(referenceEtoile1,Etoile1);
	}
	
	
	
	
	
	
	
	
	

}
