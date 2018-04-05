package research;

import java.util.ArrayList;
import java.util.Iterator;

import treatement.Tirage;


public class Tri {

	public static ArrayList<Tirage> tri_numero_tirage(ArrayList<Tirage> path, int num) {
		//On utilise la méthode itérator
		Iterator<Tirage> iterator = path.iterator();
		ArrayList<Tirage> result_liste_tir = null;
		while (iterator.hasNext()) {
			Tirage tri = iterator.next();
			if (tri.getNbTirage() == num) {
				result_liste_tir.add(tri);
			}
		}
		result_liste_tir.trimToSize();
		return result_liste_tir;
	}
}
