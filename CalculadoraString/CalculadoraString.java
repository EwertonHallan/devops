package CalculadoraString;

public class CalculadoraString {

	public CalculadoraString () {
		
	}
	
	public String adicionar (String numeros) {
		String[] aux;
		int soma = 0;

		if (numeros.isEmpty()) {
			return "0";
		} 	
		
		aux = numeros.split(",");
		
		for (int i = 0; i < aux.length; i++) {
			soma += Integer.parseInt(aux[i].toString().trim());
		}
		return ""+soma;
	}
}
