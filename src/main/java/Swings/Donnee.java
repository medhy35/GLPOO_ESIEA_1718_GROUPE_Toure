package Swings;

/**
 * @author Iynthurisha
 * 
 * @param utilise 7 parametres (7 boules du tirages)
 * @return 7 variables qui seront utilisés dans PythagorasTree
 */

public class Donnee {
	int depthLimit;
	float hue;
	float rotation;
	float squareH;
	float squareS;
	float tringleH;
	float tringleS;

	public Donnee(int pdepthLimit, float phue, float protation, float psquareH, float psquareS, float ptringleH,
			float ptringleS) {
		depthLimit = pdepthLimit;
		hue = phue;
		rotation = protation;
		squareH = psquareH;
		squareS = psquareS;
		tringleH = ptringleH;
		tringleS = ptringleS;
	}

	public int getDepthLimit() {
		return depthLimit;
	}

	public float getHue() {
		return hue;
	}

	public float getRotation() {
		return rotation;
	}

	public float getSquareH() {
		return squareH;
	}

	public float getSquareS() {
		return squareS;
	}

	public float getTringleH() {
		return tringleH;
	}

	public float getTringleS() {
		return tringleS;
	}

}