package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import Contatos.Contatos;
import Contatos.Dados;

import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTree;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaContato extends JFrame {

	private JPanel contentPane;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfNome;
	private JTextField tfID;
	
	Dados dados = new  Dados();
	Contatos c = new Contatos();
	JComboBox comboBox = new JComboBox();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContato frame = new TelaContato();
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
	public TelaContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 419);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdicionarContato = new JMenu("Contato");
		menuBar.add(mnAdicionarContato);
		
		JMenu mnAdicionar = new JMenu("Visualizar");
		mnAdicionarContato.add(mnAdicionar);
		contentPane = new JPanel();

		setContentPane(contentPane);
		

		
		JLabel lblNome = new JLabel("Nome:");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JButton btSalvar = new JButton("Salvar Contato");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Integer id = 0;
				id = dados.NumeroContatos() + 1;
				
				String nome = tfNome.getText();
				String email= tfEmail.getText();
				String celular= tfTelefone.getText();
				
				
				
				
				Contatos c = new Contatos(id,nome, email, celular);
				
				
				dados.CadastraContato(c);
				

				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				
				
				//list.add(c.getNome()+ " - " + c.getEmail()+ " - " + c.getCelular());
				comboBox.addItem(c.getId());
				
			}
		});		
		
		JButton btBusca = new JButton("Buscar Contato");
		btBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer idSelecionado = Integer.parseInt(comboBox.getSelectedItem().toString());

				tfID.setText(dados.RetornaID(idSelecionado)+"");
				tfNome.setText(dados.RetornaNome(idSelecionado)+"");
				tfEmail.setText(dados.RetornaEmail(idSelecionado)+"");
				tfTelefone.setText(dados.RetornaCelular(idSelecionado)+"");
				
			}
		});
		
		JLabel lblNomeDosContatos = new JLabel("Nome dos Contatos");
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNmero)
						.addComponent(lblNome)
						.addComponent(lblEmail)
						.addComponent(lblTelefone))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeDosContatos)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfEmail, 395, 395, 395)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btSalvar))
							.addComponent(tfTelefone, Alignment.LEADING, 398, 398, 398)))
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(109)
					.addComponent(btBusca, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addGap(308))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmero)
						.addComponent(btSalvar))
					.addGap(18)
					.addComponent(lblNomeDosContatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btBusca)
					.addGap(93))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
