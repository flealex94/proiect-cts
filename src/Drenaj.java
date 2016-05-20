
public class Drenaj extends TerapieHandler {

	@Override
	public void trateaza() {
		System.out.println("am drenat!");
		if (operatiaUrmatoare!=null)
			operatiaUrmatoare.trateaza();
	}

}
