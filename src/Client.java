
public class Client {
	private String nume;
	private Integer oraInceput;
	private Integer oraSfarsit;
	private TerapieHandler terapie;
	
	
	public Client() {
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Integer getOraInceput() {
		return oraInceput;
	}
	public void setOraInceput(Integer oraInceput) {
		this.oraInceput = oraInceput;
	}
	public Integer getOraSfarsit() {
		return oraSfarsit;
	}
	public void setOraSfarsit(Integer oraSfarsit) {
		this.oraSfarsit = oraSfarsit;
	}
	public TerapieHandler getTerapie() {
		return terapie;
	}
	public void setTerapie(TerapieHandler terapie) {
		this.terapie = terapie;
	}
	@Override
	public String toString() {
		return "Ma numesc " + nume + " si vreau " + terapie.getDenumire() + " intre " + oraInceput.toString() + " si " + oraSfarsit.toString();
	}
	
	
}
