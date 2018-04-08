package display;



public class Donnee {
	
	/**
	 * @author Iynthurisha
	 * 
	 * Fonction d'affichage
	 * @param	etoile,hue,rotation,squareH,triangleH,triangleS
	 * @return 	Rien
	 **/
	
	Float depthLimit;
	float hue,rotation,squareH,squareS,tringleH,tringleS;
	
	
	public Donnee(Float etoile1, float phue, float protation, float psquareH, float psquareS, float ptringleH,
			float ptringleS) {
		depthLimit = etoile1;
		hue = phue;
		rotation = protation;
		squareH = psquareH;
		squareS = psquareS;
		tringleH = ptringleH;
		tringleS = ptringleS;
	}

	/*public Donnee(ArrayList<Tirage> path) {
		depthLimit = path.get(0).getEtoile1();
		hue = (float) (path.get(0).getBoule1()*0.01);
		rotation = (float) (path.get(0).getEtoile2()*0.1);
		squareH = (float) (path.get(0).getBoule2()*0.01);
		squareS = path.get(0).getBoule3();
		tringleH =(float) (path.get(0).getBoule4()*0.01);
		tringleS = path.get(0).getBoule5();
		System.out.println("C'est bon");
	}*/

	public float getDepthLimit() {
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
