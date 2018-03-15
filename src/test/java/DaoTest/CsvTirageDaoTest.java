package DaoTest;
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
	
	
	@Test
	public void testfindAllTirages() {
		final int referenceSize =150;
		
		final int rowSize = dao.findAllTirages().size();
		
		Assert.assertEquals(referenceSize,rowSize);
	}
	
	@Test
	public void test_fake() {
		final int referenceSize =151;
		
		final int rowSize = dao.findAllTirages().size();
		
		Assert.assertEquals(referenceSize,rowSize);
	}
	
	
	

}