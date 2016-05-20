
public class ClientBuilder implements IClientBuilder {

	Client client;
	
	public ClientBuilder (){
		client = new Client();
	}
	
	public ClientBuilder Nume(String nume){
		client.setNume(nume);
		return this;
	}
	
	public ClientBuilder OraInceput(Integer ora){
		client.setOraInceput(ora);
		return this;
	}
	
	public ClientBuilder OraSfarsit(Integer ora){
		client.setOraSfarsit(ora);
		return this;
	}
	
	public ClientBuilder Terapie(TerapieHandler terapie){
		client.setTerapie(terapie);
		return this;
	}
	
	@Override
	public Client build() {
		return client;
	}

}
