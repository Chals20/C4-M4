package ahorcado;

public class FuncionesAhorcado {
	
	final private String[] palabras = {"piña", "hola", "lija", "cerdo", "pugil", "queso", "muerta", "liston", "ahorcado", "pigmeo"};
	private int intentos;
	private int vidas;
	
	
	public FuncionesAhorcado() {

		//generamos aleatoriamente la palabra a adivinar
		int i = (int) Math.floor(Math.random() * (palabras.length)); 
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
	
	
	

}
