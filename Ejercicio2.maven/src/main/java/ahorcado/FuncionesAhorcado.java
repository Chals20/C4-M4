package ahorcado;

import java.io.IOException;

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
		this.palabraSec = palabras[i].toUpperCase();
		this.vidas = 5;
		this.intentos = 10;
	}

	public void siguientePalabra() {
		int i = (int) Math.floor(Math.random() * (palabras.length));
		this.palabraSec = palabras[i].toUpperCase();
		this.vidas = getVidas() - 1;
		this.intentos = 10;
	}

	public void nuevaPalabraSecreta() {
		int i = (int) Math.floor(Math.random() * (palabras.length));
		this.palabraSec = palabras[i].toUpperCase();
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

	public int getContadorPalabrasAcertadas() {
		return contadorPalabrasAcertadas;
	}

	// Recorre la palabra y comprara cada una de sus letras con la letra introducida
	// y resta un intento si fallas.
	public String contieneLetra(String letra, String palabraSecreta, String palabraLabel) {
		String nuevaPalabraCodificada = "";
		boolean contieneLetra = false;
		for (int i = 0; i < palabraSecreta.length(); i++) {
			// MANZANA Letra: M
			// M ----- M_ ----- M__
			if (palabraSecreta.charAt(i) == letra.charAt(0)) { // Coincide la letra.
				contieneLetra = true;
				nuevaPalabraCodificada = nuevaPalabraCodificada + letra;
			} else if (palabraLabel.charAt(i) != '*') { // Letra acertada en jugada anterior, para no sobreescribirla
				nuevaPalabraCodificada = nuevaPalabraCodificada + palabraSecreta.charAt(i);
			} else { // Letra no correcta
				nuevaPalabraCodificada = nuevaPalabraCodificada + "*";
			}
		}
		if (!contieneLetra) {
			this.intentos = (this.intentos - 1);
		}

		if (!nuevaPalabraCodificada.contains("*")) { // Si la palbra del label NO contiene "*" Has ganado.
			System.out.println("Palabra completada");
			this.intentos = 10;
			this.palabraacertada = true;
			JOptionPane.showMessageDialog(null, "Palabra acertada!!!: " + getPalabraSec());
			setPalabraacertada(true);
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

	public boolean ComprobarIntentos() {
		System.out.println(this.intentos);
		if (this.intentos == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String nuevaVida() {
		JOptionPane.showMessageDialog(null, "Se acabaron los intentos\n La palabra secreta era: " + getPalabraSec());
		quitaVida();
		nuevaPalabraSecreta();
		setIntentos(10);
		return iniciarLabelSecreta();
	}

	public void resolver() {
		JOptionPane.showMessageDialog(null, "La palabra secreta era: " + getPalabraSec());
		this.vidas = this.vidas - 1;
		this.intentos = 10;

		// Dar nueva palabra secreta
	}
	
	//Quita una vida.
	public void quitaVida() {
		setVidas(getVidas()-1);
	}

	public void damepista(String palabraLabel) {
		//getPalabraSec() ---> buscar primera letra no acertada.
		for (int i = 0; i< palabraLabel.length(); i++) {
			if (palabraLabel.charAt(i) == '*') {
				JOptionPane.showMessageDialog(null, "La primera letra que te falta es la " + getPalabraSec().charAt(i));
				return;
			}
		} 
	}

	public String dameImagenAhorcado() {
		int intentos = getIntentos();
		switch (intentos) {
		case 10:
			return "/ImagenInicial.png";
		case 9:
			return "/Imagen1.png";
		case 8:
			return "/Imagen2.png";
		case 7:
			return "/Imagen3.png";
		case 6:
			return "/Imagen4.png";
		case 5:
			return "/Imagen5.png";
		case 4:
			return "/Imagen6.png";
		case 3:
			return "/Imagen7.png";
		case 2:
			return "/Imagen8.png";
		case 1:
			return "/Imagen9.png";
		case 0:
			return "/Imagen10.png";
		default:
			break;
		}
		return null;
	}

	public String dameImagenVidas() {
		//Bombilla_vida // Bombilla_Muerte
		return null;
	}

	public void mensajeFinPartida() {
		JOptionPane.showMessageDialog(null, "Fin de la partida!\n Has acertado un total de: " +contadorPalabrasAcertadas + " palabras.\n");
	}

}
