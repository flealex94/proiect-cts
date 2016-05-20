
public abstract class TerapieHandler {
	
	private String denumire;
	private Integer durata;
	protected TerapieHandler operatiaUrmatoare;
	
	
	
	public TerapieHandler getOperatiaUrmatoare() {
		return operatiaUrmatoare;
	}

	public void setOperatiaUrmatoare(TerapieHandler operatiaUrmatoare) {
		this.operatiaUrmatoare = operatiaUrmatoare;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}

	public abstract void trateaza();
}
