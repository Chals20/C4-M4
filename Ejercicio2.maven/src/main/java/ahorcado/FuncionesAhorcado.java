package ahorcado;

import javax.swing.JOptionPane;

public class FuncionesAhorcado {

	final private String[] palabras = { "piña", "hola", "lija", "cerdo", "pugil", "queso", "muerta", "liston",
			"ahorcado", "pigmeo" };
	private int intentos;
	private int vidas;
	private String palabraSec;
	private int contadorPalabrasAcertadas = 0;
	private boolean palabraacertada = false;

	public FuncionesAhorcado() {

		// generamos aleatoriamente la palabra a adivinar
		int i = (int) Math.floor(Math.random() * (palabras.length));
		palabraSec = palabras[i].toUpperCase();
		vidas = 5;
		intentos = 10;
	}

	// Getters y setters
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

	public boolean getPalabraacertada() {
		return palabraacertada;
	}

	public void setPalabraacertada(boolean palabraacertada) {
		this.palabraacertada = palabraacertada;
	}

	public String[] getPalabras() {
		return palabras;
	}

	public String getPalabraSec() {
		return palabraSec;
	}

	// Recorre la palabra y comprara cada una de sus letras con la letra introducida
	// y resta un intento si fallas.
	public String contieneLetra(String letra, String palabraSecreta, String palabraLabel) {
		String nuevaPalabraCodificada = "";
		boolean contieneLetra = false;
		boolean palabraresuelta = false;
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// MANZANA Letra: M
			// M ----- M_ ----- M__
			if (palabraSecreta.charAt(i) == letra.charAt(0)) { // Coincide la letra.
				contieneLetra = true;
				nuevaPalabraCodificada = nuevaPalabraCodificada + letra;
			} else if (palabraLabel.charAt(i) != '*') { // Letra acertada en jugada anterior, para no sobreescribirla
				nuevaPalabraCodificada = nuevaPalabraCodificada + palabraSecreta.charAt(i);
			} else { //Letra no correcta
				nuevaPalabraCodificada = nuevaPalabraCodificada + "*";
			}
		}
		if (!contieneLetra){
			this.intentos = (this.intentos-1);
			
			// cambiarImagenAhorcado()
			
		}
		
		if (!nuevaPalabraCodificada.contains("*")){ //Si la palbra del label NO contiene "*" Has ganado.
			System.out.println("Palabra completada");
			this.intentos = 10;
			this.palabraacertada = true;
			// Set Imagen ahorcado a la primera
			// nueva palabraSecreta
			// Botones enable
			contadorPalabrasAcertadas++;
		}
		return nuevaPalabraCodificada;
	}

	public String iniciarLabelSecreta() {
		String label = "";
		for (int i = 0; i < this.palabraSec.length(); i++) {
			label = label + "*";
		}
		return label;
	}

	public void ComprobarIntentos() {
		System.out.println(this.intentos);
		if (this.intentos == 0) {
			JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
			//QuitarVida() //Nueva palabra. //ShowMessage La palabra era: XXXXX
		}
	}
	
	public void enableBotones() {
		
	}

}
