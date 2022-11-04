package ahorcado;

import java.awt.Button;
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
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ahorcado extends JFrame {

	private JPanel contentPane;
	private JTextField textField_PalabraSecreta;
	FuncionesAhorcado aux = new FuncionesAhorcado();


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
		textField_PalabraSecreta.setText(aux.iniciarLabelSecreta());
		textField_PalabraSecreta.setColumns(10);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setBounds(23, 338, 70, 15);
		contentPane.add(lblTeclado);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(23, 365, 49, 35);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(77, 365, 49, 35);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
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
		
		
		tglbtnNewToggleButton_5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/ImagenInicial.png"))));
		//tglbtnNewToggleButton_5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("../Leon.png"))));

		
		
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnA);
			}
		});
		
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnB);

			}
		});
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnC);

			}
		});
		
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnD);

			}
		});
		
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnE);

			}
		});
		
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnF);

			}
		});
		
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnG);

			}
		});
		
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnH);

			}
		});
		
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnI);

			}
		});
		
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnJ);

			}
		});
		
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnK);

			}
		});
		
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnL);

			}
		});
		
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnM);

			}
		});
		
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnN);

			}
		});
		
		btnNY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnNY);

			}
		});
		
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnO);

			}
		});
		
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnP);

			}
		});
		
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnQ);

			}
		});
		
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnR);

			}
		});
		
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnS);

			}
		});
		
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnT);

			}
		});
		
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnU);

			}
		});
		
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnV);

			}
		});
		
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnW);

			}
		});
		
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnX);

			}
		});
		
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnY);

			}
		});
		
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionBoton(btnZ);

			}
		});
	}
	
	public void accionBoton(JButton boton1) {
		String nuevaPalabra = aux.contieneLetra(boton1.getText(), aux.getPalabraSec(), textField_PalabraSecreta.getText());
		textField_PalabraSecreta.setText(nuevaPalabra);
		boton1.setEnabled(false);
		//ComprobarIntentos();
	}
	
	
	
	
}
