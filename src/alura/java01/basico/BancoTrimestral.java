package alura.java01.basico;

public class BancoTrimestral {
	
	public static void main (String args[]){
		
		int gastosJaneiro = 15000;
		
		int gastosFevereiro = 23000;
		
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		double numeroDeMeses = 3.0;
		
		double mediaMensal = gastosTrimestre / numeroDeMeses;
		
		
		System.out.println("Soma dos Gastos do Trimestre: " + gastosTrimestre + "\nValor da média mensal = " + mediaMensal);
	}

}
