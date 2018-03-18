package gume;

/**
 * 
 * @author BrankoKrsmanovic
 * @version 1.0.0 Klasa koja opisuje automobilsku gumu atributima
 * 
 *          <ul>
 *          <li>markaModel</li>
 *          <li>precnik</li>
 *          <li>sirina</li>
 *          <li>visina</li>
 *
 *          </ul>
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
	 * @return naziv marke/modela
	 */
	
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda kojom se stavlja novu vrednost marke/modela
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese nedozvoljena vrednost
	 * @param marka/model
	 */

	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda koja vraca precnik
	 * 
	 * @return precnik
	 */
	
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost precnika
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese nedozvoljena vrednost
	 * @param precnik
	 */
	
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda koja vraca sirinu
	 * 
	 * @return sirina
	 */
	
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost sirine
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese nedozvoljena vrednost
	 * @param sirina
	 */
	
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Metoda koja vraca visinu
	 * 
	 * @return visina
	 */
	
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda kojom se stavlja nova vrednost visine
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako se unese nedozvoljena vrednost
	 * @param visina
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
	 * @return true/false
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
