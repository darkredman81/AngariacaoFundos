public class Teste{
	public static void main(String[] args){
		Telespetador tel1 = new Telespetador(91);	//Criamos um Telespetador
		Telespetador tel2 = new Telespetador(92);	//Criamos um Telespetador
		Telespetador tel3 = new Telespetador(93);	//Criamos um Telespetador

		Donativo don1 = new Donativo(10 , tel1);        //O tel1 faz uma doacao de 10 
		Donativo don2 = new Donativo(5.2 , tel1);       //O tel1 faz uma doacao de 5.2
		Donativo don3 = new Donativo(7.9 , tel2);       //O tel2 faz uma doacao de 7.9
		
		Canal rtp = new Canal();                        //Criamos um Canal para poder trabalhar com os donativos
	
		rtp.registarDonativo(don1);                     //Registamos o don1
		rtp.registarDonativo(don2);                     //Registamos o don2
		rtp.registarDonativo(don3);                     //Registamos o don3

		System.out.println("Montante total angariado: " + rtp.totalMontante());
		System.out.println("Maior donativo: " + rtp.maiorMontante());
		rtp.listarDonativos();
	}
}