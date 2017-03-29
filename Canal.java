import java.util.ArrayList;

public class Canal{
	private ArrayList<Donativo> listaDonativos;

	public Canal(){
		listaDonativos = new ArrayList<>();
	}
	
	public void registarDonativo(Donativo donativo){
		if(!listaDonativos.contains(donativo)){
			listaDonativos.add(donativo);
		}
	}

	public double totalMontante(){
		double somatorio = 0;
		for(int i=0; i<listaDonativos.size(); i++){
			Donativo don = listaDonativos.get(i);
			somatorio += don.getQuantidade();
		}
		return somatorio;
	}

	public double maiorMontante(){
		double maior = 0;
		for(int i=0; i<listaDonativos.size(); i++){
			Donativo don = listaDonativos.get(i);
			double montante = don.getQuantidade();
			
			if(montante > maior){
				maior = montante;
			}
		}
		return maior;
	}

	public void listarDonativos(){
		for(int i=0; i<listaDonativos.size(); i++){
			Donativo don = listaDonativos.get(i);
			System.out.println("Nº Telespetador: " + don.getTelespetador().getNumTelefone() + "|Montante: " + don.getQuantidade()); 
		}
	}
}