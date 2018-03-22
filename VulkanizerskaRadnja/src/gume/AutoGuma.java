package gume;

/**
 * Klasa koja opisuje automobilsku gumu atributima
 * 
 * <ul>
 * <li>markaModel</li>
 * <li>precnik</li>
 * <li>sirina</li>
 * <li>visina</li>
 * </ul>
 * 
 * @author BrankoKrsmanovic
 * @version 1.0.0
 */

public class AutoGuma {

	/**
	 * Atribut koji prikazuje marku/model gume
	 */

	private String markaModel = null;

	/**
	 * Atribut koji prikazuje precnik gume
	 */

	private int precnik = 0;

	/**
	 * Atribut koji prikazuje sirinu gume
	 */

	private int sirina = 0;

	/**
	 * Atribut koji prikazuje visinu gume
	 */

	private int visina = 0;

	/**
	 * Metoda koja vraca marku/model
	 * 
	 * @return markaModel kao String
	 */

	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda koja stavlja novu vrednost marke/modela
	 * 
	 * @param markaModel
	 *            novi naziv za atribut markaModel
	 * 
	 * @throws java.lang.RuntimeException
	 *             unet null ili String kraci od 3 karaktera za naziv atributa
	 *             markaModel
	 */

	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda koja vraca precnik gume
	 * 
	 * @return precnik
	 */

	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost precnika
	 * 
	 * @param precnik
	 *            nova vrednost atributa precnik
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je uneta vrednost precnika manja od 13 ili veca od 23
	 */

	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda koja vraca sirinu gume
	 * 
	 * @return sirina
	 */

	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost sirine
	 * 
	 * @param sirina
	 *            nova vrednost atributa sirina
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese sirina manja od 135 ili veca od 355
	 */

	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Metoda koja vraca visinu gume
	 * 
	 * @return visina
	 */

	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost visine
	 * 
	 * @param visina
	 *            nova vrednost atributa sirina
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese visina manja od 25 ili veca od 95
	 */

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Metoda koja vraca klasu kao String
	 * 
	 * @return string svih atributa
	 */

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Metoda koja poredi dva objekta klase AutoGuma
	 * 
	 * @return true ako su atributi: markaModel, precnik, sirina i visina obe
	 *         AutoGume jednaki, u suprotnom vraca false
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;

		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
