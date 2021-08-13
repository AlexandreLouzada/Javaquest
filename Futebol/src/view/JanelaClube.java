package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import dominio.Clube;

public class JanelaClube extends JFrame{

	private JFrame frame;
	private JTextField textClube;
	private JTextField textVitorias;
	private JTextField textDerrotas;
	private JTextField textEmpates;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaClube window = new JanelaClube();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaClube() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Clube");
		label.setBounds(24, 40, 82, 27);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Vitórias");
		lblNewLabel.setBounds(24, 83, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Derrotas");
		lblNewLabel_1.setBounds(24, 119, 69, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Empates");
		lblNewLabel_2.setBounds(24, 155, 69, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		textClube = new JTextField();
		textClube.setBounds(112, 41, 146, 26);
		frame.getContentPane().add(textClube);
		textClube.setColumns(10);
		
		textVitorias = new JTextField();
		textVitorias.setBounds(112, 80, 146, 26);
		frame.getContentPane().add(textVitorias);
		textVitorias.setColumns(10);
		
		textDerrotas = new JTextField();
		textDerrotas.setBounds(112, 116, 146, 26);
		frame.getContentPane().add(textDerrotas);
		textDerrotas.setColumns(10);
		
		textEmpates = new JTextField();
		textEmpates.setBounds(112, 155, 146, 26);
		frame.getContentPane().add(textEmpates);
		textEmpates.setColumns(10);
		
		JLabel lblJogos = new JLabel("jogos");
		lblJogos.setBounds(303, 44, 69, 20);
		frame.getContentPane().add(lblJogos);
		
		JLabel lblPontosGanhos = new JLabel("pontos ganhos");
		lblPontosGanhos.setBounds(303, 83, 110, 20);
		frame.getContentPane().add(lblPontosGanhos);
		
		JLabel lblPontosPerdidos = new JLabel("pontos perdidos");
		lblPontosPerdidos.setBounds(303, 119, 140, 20);
		frame.getContentPane().add(lblPontosPerdidos);
		
		JButton btnDesempenho = new JButton("Desempenho");
		btnDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textClube.getText();
				int vitorias = Integer.parseInt(textVitorias.getText());
				int derrotas = Integer.parseInt(textDerrotas.getText());
				int empates = Integer.parseInt(textEmpates.getText());
				
				Clube clube = new Clube(nome,vitorias,derrotas,empates);
				
				String jogos = String.valueOf(clube.obterJogos());
				String ganhos = String.valueOf(clube.obterPontosGanhos());		
				String perdidos = String.valueOf(clube.obterPontosPerdidos());
				
				lblJogos.setText(jogos);
				lblPontosGanhos.setText(ganhos);
				lblPontosPerdidos.setText(perdidos);
		
			}
		});
		btnDesempenho.setBounds(112, 199, 148, 29);
		frame.getContentPane().add(btnDesempenho);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVitorias.setText("");
				textDerrotas.setText("");
				textEmpates.setText("");
				lblJogos.setText("");
				lblPontosGanhos.setText("");
				lblPontosPerdidos.setText("");
				
			}
		});
		btnLimpar.setBounds(298, 199, 115, 29);
		frame.getContentPane().add(btnLimpar);

	}
}
