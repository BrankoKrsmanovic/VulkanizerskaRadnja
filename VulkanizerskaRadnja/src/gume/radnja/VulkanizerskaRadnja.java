package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * @author BrankoKrsmanovic
 * @version 1.0.0 Klasa sadrzi
 *          <ul>
 *          <li>Listu objekata AutoGuma</li>
 *          <li>Metodu za dodavanje guma</li>
 *          <li>Metodu za pronalazenje guma</li>
 *          </ul>
 */
public class VulkanizerskaRadnja {

	/**
	 * Lista objekata klase AutoGuma
	 */

	public LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Klasa koja dodaje gumu u listu ako objekat nije null ili vec postoji
	 * 
	 * @param a
	 *            autoGuma
	 * @throws java.lang.NullPointerException
	 *             Ako je guma null
	 * @throws java.lang.RuntimeException
	 *             Ako guma vec postoji
	 */

	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Klasa koja pronalazi gumu u listi
	 * 
	 * @param markaModel
	 *            vraca marku
	 * @return novaLista lista objekata
	 */

	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++) {
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		}

		if (novaLista.size() == 0)
			return null;
		else
			return novaLista;
	}

}
