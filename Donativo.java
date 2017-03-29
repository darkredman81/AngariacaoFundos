public class Donativo{
	private double quantidade;
	private Telespetador telespetador;

	public Donativo(){
	}

	public Donativo(double quantidade,Telespetador telespetador){
		this.quantidade = quantidade;
		this.telespetador = telespetador;
	}
	
	public void setQuantidade(double quantidade){
 		this.quantidade = quantidade;
	}

	public void setTelespetador(Telespetador telespetador){
		this.telespetador = telespetador;
	}
	
	public double getQuantidade(){
		return quantidade;
	}

	public Telespetador getTelespetador(){
		return telespetador;
	}
}