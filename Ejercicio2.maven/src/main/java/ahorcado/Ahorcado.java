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

public class Ahorcado extends JFrame {

	private JPanel contentPane;
	private JTextField textField_PalabraSecreta;
	FuncionesAhorcado aux = new FuncionesAhorcado();
	
	private JButton btnA = new JButton("A");
	private JButton btnB = new JButton("B");
	private JButton btnC = new JButton("C");




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

		JButton btnResolver = new JButton("Resolver");
		btnResolver.setBounds(23, 68, 117, 25);
		contentPane.add(btnResolver);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBounds(23, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton);

		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setBounds(77, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_1);

		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		tglbtnNewToggleButton_2.setBounds(132, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_2);

		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		tglbtnNewToggleButton_3.setBounds(187, 158, 49, 35);
		contentPane.add(tglbtnNewToggleButton_3);

		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("");
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

		btnB.setBounds(77, 365, 49, 35);
		contentPane.add(btnB);

		btnC.setBounds(132, 365, 49, 35);
		contentPane.add(btnC);

		JButton btnD = new JButton("D");
		btnD.setBounds(193, 365, 49, 35);
		contentPane.add(btnD);

		JButton btnE = new JButton("E");
		btnE.setBounds(248, 365, 49, 35);
		contentPane.add(btnE);

		JButton btnF = new JButton("F");
		btnF.setBounds(23, 402, 49, 35);
		contentPane.add(btnF);

		JButton btnG = new JButton("G");
		btnG.setBounds(77, 402, 49, 35);
		contentPane.add(btnG);

		JButton btnH = new JButton("H");
		btnH.setBounds(132, 402, 49, 35);
		contentPane.add(btnH);

		JButton btnI = new JButton("I");
		btnI.setBounds(193, 402, 49, 35);
		contentPane.add(btnI);

		JButton btnJ = new JButton("J");
		btnJ.setBounds(248, 402, 49, 35);
		contentPane.add(btnJ);

		JButton btnK = new JButton("K");
		btnK.setBounds(23, 436, 49, 35);
		contentPane.add(btnK);

		JButton btnL = new JButton("L");
		btnL.setBounds(77, 436, 49, 35);
		contentPane.add(btnL);

		JButton btnM = new JButton("M");
		btnM.setBounds(132, 436, 49, 35);
		contentPane.add(btnM);

		JButton btnN = new JButton("N");
		btnN.setBounds(193, 441, 49, 35);
		contentPane.add(btnN);

		JButton btnNY = new JButton("Ñ");
		btnNY.setBounds(248, 441, 49, 35);
		contentPane.add(btnNY);

		JButton btnO = new JButton("O");
		btnO.setBounds(23, 465, 49, 35);
		contentPane.add(btnO);

		JButton btnP = new JButton("P");
		btnP.setBounds(77, 470, 49, 35);
		contentPane.add(btnP);

		JButton btnQ = new JButton("Q");
		btnQ.setBounds(132, 470, 49, 35);
		contentPane.add(btnQ);

		JButton btnR = new JButton("R");
		btnR.setBounds(193, 470, 49, 35);
		contentPane.add(btnR);

		JButton btnS = new JButton("S");
		btnS.setBounds(248, 470, 49, 35);
		contentPane.add(btnS);

		JButton btnT = new JButton("T");
		btnT.setBounds(23, 512, 49, 35);
		contentPane.add(btnT);

		JButton btnU = new JButton("U");
		btnU.setBounds(77, 512, 49, 35);
		contentPane.add(btnU);

		JButton btnV = new JButton("V");
		btnV.setBounds(132, 512, 49, 35);
		contentPane.add(btnV);

		JButton btnW = new JButton("W");
		btnW.setBounds(193, 512, 49, 35);
		contentPane.add(btnW);

		JButton btnX = new JButton("X");
		btnX.setBounds(248, 512, 49, 35);
		contentPane.add(btnX);

		JButton btnY = new JButton("Y");
		btnY.setBounds(23, 559, 49, 35);
		contentPane.add(btnY);

		JButton btnZ = new JButton("Z");
		btnZ.setBounds(77, 559, 49, 35);
		contentPane.add(btnZ);


		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("");
		tglbtnNewToggleButton_5.setEnabled(false);
		tglbtnNewToggleButton_5.setBounds(384, 31, 343, 516);
		contentPane.add(tglbtnNewToggleButton_5);

		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnA);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}
			}

		});

		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(aux.getPalabraSec());
				accionBoton(btnB);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnC);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnD);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnE);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnF);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnG);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnH);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnI);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnJ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnK);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnL);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnM);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnN);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnNY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnNY);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnO);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnP);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnQ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnR);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnS);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnT);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnU);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnV);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnW);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnX);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnY);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});

		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnZ);
				if (aux.getPalabraacertada()) {
					activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
							btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				}

			}
		});
		
		btnIniciarJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuncionesAhorcado newGame = new FuncionesAhorcado();
				textField_PalabraSecreta.setText(aux.iniciarLabelSecreta());
				activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
						btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);

				
			}
		});
		
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (aux.getVidas() > 1) {
				aux.resolver();
				activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
						btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
				
				}
				else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas");
				}
			}
		});
	}

	public void accionBoton(JButton boton1) {
		String nuevaPalabra = aux.contieneLetra(boton1.getText(), aux.getPalabraSec(),
				textField_PalabraSecreta.getText());
		textField_PalabraSecreta.setText(nuevaPalabra);
		boton1.setEnabled(false);
		if (aux.ComprobarIntentos()) {
			textField_PalabraSecreta.setText(aux.nuevaVida());
			activarBotonesLetras(btnA, btnB, btnC);
			//activarBotonesLetras(btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM,
			//		btnN, btnNY, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ);
		}
	}
	
	

	//Activa los botones de las letras.
	private void activarBotonesLetras(JButton btnA, JButton btnB, JButton btnC, JButton btnD, JButton btnE,
			JButton btnF, JButton btnG, JButton btnH, JButton btnI, JButton btnJ, JButton btnK, JButton btnL,
			JButton btnM, JButton btnN, JButton btnNY, JButton btnO, JButton btnP, JButton btnQ, JButton btnR,
			JButton btnS, JButton btnT, JButton btnU, JButton btnV, JButton btnW, JButton btnX, JButton btnY,
			JButton btnZ) {
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

}
