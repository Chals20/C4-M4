package ahorcado;

public class FuncionesAhorcado {
	
	final private String[] palabras = {"piña", "hola", "lija", "cerdo", "pugil", "queso", "muerta", "liston", "ahorcado", "pigmeo"};
	private int intentos;
	private int vidas;
	private String palabraSec;
	
	
	public FuncionesAhorcado() {

		//generamos aleatoriamente la palabra a adivinar
		int i = (int) Math.floor(Math.random() * (palabras.length));
		palabraSec = palabras[i];
		vidas = 5;
		intentos = 10;
	}

	//Getters y setters
	public int getIntentos() {
		return intentos;
	}


	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}


	public int getVidas() {
		return vidas;
	}


	public void setVidas(int vidas) {
		this.vidas = vidas;
	}


	public String[] getPalabras() {
		return palabras;
	}
	
	
	public String getPalabraSec() {
		return palabraSec;
	}

	//Recorre la palabra y comprara cada una de sus letras con la letra introducida
	public String contieneLetra(String letra, String palabraSecreta) {
		String nuevaPalabraCodificada= "";
		for(int i=0; i < palabraSecreta.length(); i++) {
			// MANZANA    Letra: M
			//M -----  M_ ----- M__
			if(palabraSecreta.charAt(i) == letra.charAt(0)) {
				nuevaPalabraCodificada = nuevaPalabraCodificada + letra;
			}
			else {
				nuevaPalabraCodificada = nuevaPalabraCodificada + "_";
			}
		}
		return nuevaPalabraCodificada;
	}
	

}
