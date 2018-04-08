package Test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author	Medhy35
 * 
 * void eclipseWorking()  test pour verifier le fonctionnement de eclipse et junit
 * testfindAllTirages()   test verification que le fichier est complet (on a bien 150 élément)
 * test_fake()            test de verification du nombre d'item dans le fichier (on doit pas avoir 151 element)
 * void filenotEmpty()    test de verification du nombre d'item dans le fichier (le fichier doit pas etre vide)
 * test_Boule1_Tirage0()  test de verification de la boule 1 au tirage 0 
 * test_Boule2_Tirage0()  test de verification de la boule 2 au tirage 0 
 * test_Etoile1_Tirage28() test de verification de l'etoile 1 au tirage 28 
 * test_Boule1_Tirage25()  test de verification de la boule 1 au tirage 25
 *
 *
 *
 */

import org.junit.Assert;
import org.junit.Test;

import treatement.CsvTirageDao;


public class CSVTirageDaoTest1 {
	/**
	 * @author 	Medhy
	 * 
	 * Test
	 * @param	lien euromillion
	 * @return 	Rien
	 * 
	 * 
	 * Certaint test ne seront pas lancer (les test fake) pour les tester ajouter @Test 
	 */
	
	private CsvTirageDao dao;
	private final String link;
	private final static String RESOURCES_PATH = "src/main/resources/";
    private final static String LOTO_FILE_NAME = "euromillions.csv";
	
	public CSVTirageDaoTest1() {
		
		link = RESOURCES_PATH + LOTO_FILE_NAME;
		dao = new CsvTirageDao(link);
	}
	
	@Test
	public void eclipseWorking() {

		Assert.assertEquals(1, 1);
	}
	
	@Test
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
	
	@Test
	public void filenotEmpty() {
		final boolean referencecontains = false;
		
		final boolean containsfile = dao.findAllTirages().isEmpty();
		
		Assert.assertEquals(referencecontains,containsfile);
	}
	
	@Test
	public void test_Boule1_Tirage0() {
		final int referenceBoule1 = 41;
		final int Boule1 = dao.findAllTirages().get(0).getBoule1();
		
		Assert.assertEquals(referenceBoule1,Boule1);
	}
	
	@Test
	public void test_Boule2_Tirage0() {
		final int referenceBoule2 = 6;
		final int Boule2 = dao.findAllTirages().get(0).getBoule2();
		
		Assert.assertEquals(referenceBoule2,Boule2);
	}
	
	
	@Test
	public void test_Etoile1_Tirage28() {
		final int referenceEtoile1 = 11;
		final int Etoile1 = dao.findAllTirages().get(28).getEtoile1();
		
		Assert.assertEquals(referenceEtoile1,Etoile1);
	}
	
	
	@Test
	public void test_Boule1_Tirage25() {
		final int referenceBoule1 = 46;
		final int Boule1 = dao.findAllTirages().get(25).getBoule1();
		
		Assert.assertEquals(referenceBoule1,Boule1);
	}
	
	@Test
	public void test_date_Tirage0() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "27-09-2016 00:00:00";
		Date date = sdf.parse(dateInString);
		//System.out.println(date);
		
		
		final Date date1 = dao.findAllTirages().get(0).getDate();
		
		
		Assert.assertEquals(date,date1);
	}
	
	@Test
	public void test_date_Tirage23() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "16-12-2016 00:00:00";
		Date date = sdf.parse(dateInString);
		//System.out.println(date);
		
		
		final Date date1 = dao.findAllTirages().get(23).getDate();
		
		
		Assert.assertEquals(date,date1);
	}
	
	
	@Test
	public void test_date_Tirage100() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "12-09-2017 00:00:00";
		Date date = sdf.parse(dateInString);
		
		
		
		final Date date1 = dao.findAllTirages().get(100).getDate();
		
		
		Assert.assertEquals(date,date1);
	}
	
	
	public void testfake_date_Tirage23() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "17-12-2016 00:00:00";
		Date date = sdf.parse(dateInString);
		
		
		
		final Date date1 = dao.findAllTirages().get(23).getDate();
		
		
		Assert.assertEquals(date,date1);
	}
	

}
