
public class Masaj extends TerapieHandler {

	@Override
	public void trateaza() {
		System.out.println("am masat!");
		if (operatiaUrmatoare!=null)
			operatiaUrmatoare.trateaza();
	}

}
