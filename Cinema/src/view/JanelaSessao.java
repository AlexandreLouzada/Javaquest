package view;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ControleJanelaSessao;

public class JanelaSessao extends JFrame{

	private JPanel contentPane;
	private JTextField textSala;
	private JTextField textData;
	private JTextField textHora;
	private JTextField textFilme;
	private ControleJanelaSessao cjs = 
			new ControleJanelaSessao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaSessao frame = new JanelaSessao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaSessao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeSesses = new JLabel("CADASTRO DE SESS\u00D5ES");
		lblCadastroDeSesses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeSesses.setBounds(40, 11, 198, 24);
		contentPane.add(lblCadastroDeSesses);
		
		JLabel lblSala = new JLabel("SALA:");
		lblSala.setBounds(10, 49, 46, 14);
		contentPane.add(lblSala);
		
		JLabel lblData = new JLabel("DATA:");
		lblData.setBounds(10, 74, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblHora = new JLabel("HORA:");
		lblHora.setBounds(10, 99, 46, 14);
		contentPane.add(lblHora);
		
		JLabel lblFilme = new JLabel("FILME:");
		lblFilme.setBounds(10, 129, 46, 14);
		contentPane.add(lblFilme);
		
		textSala = new JTextField();
		textSala.setBounds(50, 46, 46, 20);
		contentPane.add(textSala);
		textSala.setColumns(10);
		
		textData = new JTextField();
		textData.setBounds(50, 71, 86, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		
		textHora = new JTextField();
		textHora.setBounds(50, 99, 86, 20);
		contentPane.add(textHora);
		textHora.setColumns(10);
		
		textFilme = new JTextField();
		textFilme.setBounds(50, 126, 200, 20);
		contentPane.add(textFilme);
		textFilme.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sala = Integer.parseInt(textSala.getText());
				String data = textData.getText();
				String hora = textHora.getText();
				String filme = textFilme.getText();
				
				cjs.incluirSessao(sala, data, hora, filme);
				
				JOptionPane.showMessageDialog(null, 
						"Sessão cadastrada com sucesso!");
				
				textSala.setText("");
				textData.setText("");
				textHora.setText("");
				textFilme.setText("");
			}
		});
		btnCadastrar.setBounds(47, 154, 119, 23);
		contentPane.add(btnCadastrar);
	}
}
