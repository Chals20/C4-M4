package ahorcado;

import java.awt.Button;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ahorcado extends JFrame {

	private JPanel contentPane;
	private JTextField textField_PalabraSecreta;
	FuncionesAhorcado aux = new FuncionesAhorcado();
	FuncionesAhorcado newGame;

	private JButton btnResolver;
	private JButton btnA = new JButton("A");
	private JButton btnB = new JButton("B");
	private JButton btnC = new JButton("C");
	private JButton btnD = new JButton("D");
	private JButton btnE = new JButton("E");
	private JButton btnF = new JButton("F");
	private JButton btnG = new JButton("G");
	private JButton btnH = new JButton("H");
	private JButton btnI = new JButton("I");
	private JButton btnJ = new JButton("J");
	private JButton btnK = new JButton("K");
	private JButton btnL = new JButton("L");
	private JButton btnM = new JButton("M");
	private JButton btnN = new JButton("N");
	private JButton btnNY = new JButton("Ñ");
	private JButton btnO = new JButton("O");
	private JButton btnP = new JButton("P");
	private JButton btnQ = new JButton("Q");
	private JButton btnR = new JButton("R");
	private JButton btnS = new JButton("S");
	private JButton btnT = new JButton("T");
	private JButton btnU = new JButton("U");
	private JButton btnV = new JButton("V");
	private JButton btnW = new JButton("W");
	private JButton btnX = new JButton("X");
	private JButton btnY = new JButton("Y");
	private JButton btnZ = new JButton("Z");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ahorcado frame = new Ahorcado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Ahorcado() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(23, 12, 70, 15);
		contentPane.add(lblMenu);

		JButton btnIniciarJuego = new JButton("Iniciar Juego");
		btnIniciarJuego.setBounds(23, 31, 117, 25);
		contentPane.add(btnIniciarJuego);

		btnResolver = new JButton("Resolver");
		btnResolver.setBounds(23, 68, 117, 25);
		contentPane.add(btnResolver);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton.setBounds(23, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton);

		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setEnabled(false);
		tglbtnNewToggleButton_1.setBounds(77, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_1);

		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setEnabled(false);
		tglbtnNewToggleButton_2.setBounds(132, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_2);

		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setEnabled(false);
		tglbtnNewToggleButton_3.setBounds(187, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_3);

		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("");
		tglbtnNewToggleButton_4.setEnabled(false);
		tglbtnNewToggleButton_4.setBounds(248, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_4);

		JLabel lblPalabraSecreta = new JLabel("Palabra Secreta");
		lblPalabraSecreta.setBounds(23, 216, 144, 25);
		contentPane.add(lblPalabraSecreta);

		textField_PalabraSecreta = new JTextField();
		textField_PalabraSecreta.setEditable(false);
		textField_PalabraSecreta.setBounds(26, 238, 242, 41);
		contentPane.add(textField_PalabraSecreta);
		textField_PalabraSecreta.setColumns(10);

		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setBounds(23, 338, 70, 15);
		contentPane.add(lblTeclado);

		btnA.setBounds(23, 365, 49, 35);
		contentPane.add(btnA);
		btnA.setEnabled(false);

		btnB.setBounds(77, 365, 49, 35);
		contentPane.add(btnB);
		btnB.setEnabled(false);

		btnC.setBounds(132, 365, 49, 35);
		contentPane.add(btnC);
		btnC.setEnabled(false);

		btnD.setBounds(193, 365, 49, 35);
		contentPane.add(btnD);
		btnD.setEnabled(false);

		btnE.setBounds(248, 365, 49, 35);
		contentPane.add(btnE);
		btnE.setEnabled(false);

		btnF.setBounds(23, 402, 49, 35);
		contentPane.add(btnF);
		btnF.setEnabled(false);

		btnG.setBounds(77, 402, 49, 35);
		contentPane.add(btnG);
		btnG.setEnabled(false);

		btnH.setBounds(132, 402, 49, 35);
		contentPane.add(btnH);
		btnH.setEnabled(false);

		btnI.setBounds(193, 402, 49, 35);
		contentPane.add(btnI);
		btnI.setEnabled(false);

		btnJ.setBounds(248, 402, 49, 35);
		contentPane.add(btnJ);
		btnJ.setEnabled(false);

		btnK.setBounds(23, 436, 49, 35);
		contentPane.add(btnK);
		btnK.setEnabled(false);

		btnL.setBounds(77, 436, 49, 35);
		contentPane.add(btnL);
		btnL.setEnabled(false);

		btnM.setBounds(132, 436, 49, 35);
		contentPane.add(btnM);
		btnM.setEnabled(false);

		btnN.setBounds(193, 441, 49, 35);
		contentPane.add(btnN);
		btnN.setEnabled(false);

		btnNY.setBounds(248, 441, 49, 35);
		contentPane.add(btnNY);
		btnNY.setEnabled(false);

		btnO.setBounds(23, 470, 49, 35);
		contentPane.add(btnO);
		btnO.setEnabled(false);

		btnP.setBounds(77, 470, 49, 35);
		contentPane.add(btnP);
		btnP.setEnabled(false);

		btnQ.setBounds(132, 470, 49, 35);
		contentPane.add(btnQ);
		btnQ.setEnabled(false);

		btnR.setBounds(193, 470, 49, 35);
		contentPane.add(btnR);
		btnR.setEnabled(false);

		btnS.setBounds(248, 470, 49, 35);
		contentPane.add(btnS);
		btnS.setEnabled(false);

		btnT.setBounds(23, 512, 49, 35);
		contentPane.add(btnT);
		btnT.setEnabled(false);

		btnU.setBounds(77, 512, 49, 35);
		contentPane.add(btnU);
		btnU.setEnabled(false);

		btnV.setBounds(132, 512, 49, 35);
		contentPane.add(btnV);
		btnV.setEnabled(false);

		btnW.setBounds(193, 512, 49, 35);
		contentPane.add(btnW);
		btnW.setEnabled(false);

		btnX.setBounds(248, 512, 49, 35);
		contentPane.add(btnX);
		btnX.setEnabled(false);

		btnY.setBounds(23, 559, 49, 35);
		contentPane.add(btnY);
		btnY.setEnabled(false);

		btnZ.setBounds(77, 559, 49, 35);
		contentPane.add(btnZ);
		btnZ.setEnabled(false);

		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("");
		tglbtnNewToggleButton_5.setEnabled(false);
		tglbtnNewToggleButton_5.setBounds(384, 31, 343, 516);
		contentPane.add(tglbtnNewToggleButton_5);

		
		
		tglbtnNewToggleButton_5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/ImagenInicial.png"))));
		//tglbtnNewToggleButton_5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("../Leon.png"))));


		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnA);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}
			}

		});

		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(aux.getPalabraSec());
				accionBoton(btnB);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnC);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnD);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnE);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnF);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnG);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnH);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnI);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnJ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnK);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnL);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnM);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnN);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnNY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnNY);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnO);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnP);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnQ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnR);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnS);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnT);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnU);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnV);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnW);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnX);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnY);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnZ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras();
				}

			}
		});

		btnIniciarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newGame = new FuncionesAhorcado();
				textField_PalabraSecreta.setText(aux.iniciarLabelSecreta());
				activarBotonesLetras();
				btnIniciarJuego.setEnabled(false);

			}
		});

		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aux.getVidas() > 1) {
					aux.damepista(textField_PalabraSecreta.getText());
					btnResolver.setEnabled(false);
					aux.quitaVida();
				} else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas");
				}
			}
		});

	}

	// Cada vez que pulsamos una letra
	public void accionBoton(JButton boton1) {
		// Actualizamos el Label con la palabra codificada H*L*
		String nuevaPalabra = aux.contieneLetra(boton1.getText(), aux.getPalabraSec(),
				textField_PalabraSecreta.getText());
		textField_PalabraSecreta.setText(nuevaPalabra);
		boton1.setEnabled(false); // Desactivamos el botón para no volver a usar esa letra.

		if (aux.ComprobarIntentos()) { // Si te quedas sin intentos Pone una nueva palabra.
			textField_PalabraSecreta.setText(aux.nuevaVida()); //
			if (aux.getVidas()==0) {
				desactivarBotonesLetras();
			}
			else {
				activarBotonesLetras();
			}
		} else if (aux.getVidas() < 1) {
			JOptionPane.showMessageDialog(null, "Se acabaron las vidas");
		}

	}

	// Activa los botones de las letras.
	private void activarBotonesLetras() {
		btnA.setEnabled(true);
		btnB.setEnabled(true);
		btnC.setEnabled(true);
		btnD.setEnabled(true);
		btnE.setEnabled(true);
		btnF.setEnabled(true);
		btnG.setEnabled(true);
		btnH.setEnabled(true);
		btnI.setEnabled(true);
		btnJ.setEnabled(true);
		btnK.setEnabled(true);
		btnL.setEnabled(true);
		btnM.setEnabled(true);
		btnN.setEnabled(true);
		btnNY.setEnabled(true);
		btnO.setEnabled(true);
		btnP.setEnabled(true);
		btnQ.setEnabled(true);
		btnR.setEnabled(true);
		btnS.setEnabled(true);
		btnT.setEnabled(true);
		btnU.setEnabled(true);
		btnV.setEnabled(true);
		btnW.setEnabled(true);
		btnX.setEnabled(true);
		btnY.setEnabled(true);
		btnZ.setEnabled(true);
	}
	
	private void desactivarBotonesLetras() {
		btnA.setEnabled(false);
		btnB.setEnabled(false);
		btnC.setEnabled(false);
		btnD.setEnabled(false);
		btnE.setEnabled(false);
		btnF.setEnabled(false);
		btnG.setEnabled(false);
		btnH.setEnabled(false);
		btnI.setEnabled(false);
		btnJ.setEnabled(false);
		btnK.setEnabled(false);
		btnL.setEnabled(false);
		btnM.setEnabled(false);
		btnN.setEnabled(false);
		btnNY.setEnabled(false);
		btnO.setEnabled(false);
		btnP.setEnabled(false);
		btnQ.setEnabled(false);
		btnR.setEnabled(false);
		btnS.setEnabled(false);
		btnT.setEnabled(false);
		btnU.setEnabled(false);
		btnV.setEnabled(false);
		btnW.setEnabled(false);
		btnX.setEnabled(false);
		btnY.setEnabled(false);
		btnZ.setEnabled(false);
		btnResolver.setEnabled(false);
		textField_PalabraSecreta.setText("");
	}

}
