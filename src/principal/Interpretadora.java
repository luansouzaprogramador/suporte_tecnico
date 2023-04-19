package principal;

import java.util.HashSet;

public class Interpretadora {
	private HashSet<String> palavrasChave;
	
	public Interpretadora() {
		palavrasChave = new HashSet<String>();
	}

	public void interpreta(String problema) {
		String[] palavras = problema.split(" ");
		
		for (String palavra: palavras)
			palavrasChave.add(palavra);
	}

	public HashSet<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(HashSet<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
}
