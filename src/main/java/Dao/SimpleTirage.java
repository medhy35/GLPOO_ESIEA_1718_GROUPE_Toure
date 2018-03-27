package Dao;

/**
 * @author	Medhy35
 * 
 * 
 * 
 *
 */

public class SimpleTirage implements Tirage {
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile1;
	private int etoile2;
	
	
	public SimpleTirage() {

	}

	
	// getter & setter boule 1	
	
	public int getBoule1() {
		return boule1;
	}

	public void setBoule1(int boule1) {
		this.boule1 = boule1;
	}

	
	// getter & setter boule 2
	
	public int getBoule2() {
		return boule2;
	}

	public void setBoule2(int boule2) {
		this.boule2 = boule2;
	}

	
	// getter & setter boule 3
	
	
	public int getBoule3() {
		return boule3;
	}

	public void setBoule3(int boule3) {
		this.boule3 = boule3;
	}

	
	// getter & setter boule 4
	
	
	public int getBoule4() {
		return boule4;
	}

	public void setBoule4(int boule4) {
		this.boule4 = boule4;
	}

	
	
	// getter & setter boule 5 
	
	
	public int getBoule5() {
		return boule5;
	}

	public void setBoule5(int boule5) {
		this.boule5 = boule5;
	}
	
	
	// getter & setter Etoile 1

	public int getEtoile1() {
		return etoile1;
	}

	public void setEtoile1(int etoile1) {
		this.etoile1 = etoile1;
	}

	
	// getter & setter Etoile 2
	
	public int getEtoile2() {
		return etoile2;
	}

	public void setEtoile2(int etoile2) {
		this.etoile2 = etoile2;
	}
	
	
	@Override
	public String toString() {
		return "SimpleTirage [boule1=" + boule1 + ", boule2=" + boule2 + ", boule3=" + boule3 + ", boule4=" + boule4 + ", boule5=" + boule5 + ", etoile1=" + etoile1
				+ ", etoile2=" + etoile2 + "]";
	}

}
