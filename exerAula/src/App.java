package exe;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		int valorPalavra = 0;
		String frase = "Hello woRld";
		char[] letras = frase.toCharArray();
		Map<Character, Integer> buraco = new HashMap<>();
		buraco.put('a', 1);
		buraco.put('A', 1);
		buraco.put('b', 1);
		buraco.put('B', 2);
		buraco.put('d', 1);
		buraco.put('D', 1);
		buraco.put('o', 1);
		buraco.put('O', 1);
		buraco.put('P', 1);
		buraco.put('p', 1);
		buraco.put('q', 1);
		buraco.put('Q', 1);
		buraco.put('R', 1);
		buraco.put('e', 1);
		buraco.put('g', 1);
		
		
		for(char letra:letras) {
			if(buraco.containsKey(letra)) {
				valorPalavra += buraco.get(letra);
				
			}
		}
		
	System.out.println(valorPalavra);
		
	}
	
}

