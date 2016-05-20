
public class TerapieFactory {
	
	private static TerapieFactory instanta;
	
	public static TerapieFactory getInstanta() {
		if (instanta == null)
			instanta = new TerapieFactory();
		
		return instanta;
	}

	public static TerapieHandler createTerapie (Class <? extends TerapieHandler> type){
		if (type==Masaj.class)
			return new Masaj();
		else if (type==Drenaj.class)
			return new Drenaj();
		throw new IllegalStateException("Cannot create instance of "+type.toString()+".");
	}

}
