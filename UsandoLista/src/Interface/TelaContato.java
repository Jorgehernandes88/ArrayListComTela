package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import Contatos.Contatos;
import Contatos.Dados;
import Contatos.DadosEndereco;
import Contatos.EnderecoContato;

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
	private JTextField tfID;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfNome;
	
	private JTextField tfCEP;
	private JTextField tfCidade;
	private JTextField tfBairro;
	private JTextField tfEndereco;
	private JTextField tfComplemento;
	private JTextField tfNumero;
	
	Dados dados = new  Dados();
	DadosEndereco dadosEndereco = new DadosEndereco();
	
	Contatos c = new Contatos();
	EnderecoContato ec = new EnderecoContato();
	
	
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
		setBounds(100, 100, 593, 626);
		
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
				
				String cep = tfCEP.getText();
				String cidade = tfCidade.getText();
				String bairro = tfBairro.getText();
				String endereco = tfEndereco.getText();
				String complemento = tfComplemento.getText();
				String numero = tfNumero.getText();
				
				EnderecoContato ec = new EnderecoContato(id, cep, cidade, bairro, endereco, complemento, numero);
				
				dadosEndereco.CadastraEndereco(ec);

//limpar formulario
				tfID.setText("");
				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				tfCEP.setText("");
				tfCidade.setText("");
				tfBairro.setText("");
				tfEndereco.setText("");
				tfComplemento.setText("");
				tfNumero.setText("");
				
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
				
				tfCEP.setText(dadosEndereco.RetornaCEP(idSelecionado));
				tfCidade.setText(dadosEndereco.RetornaCidade(idSelecionado));
				tfBairro.setText(dadosEndereco.RetornaBairro(idSelecionado));
				tfEndereco.setText(dadosEndereco.RetornaEndereco(idSelecionado));
				tfComplemento.setText(dadosEndereco.RetornaComplemento(idSelecionado));
				tfNumero.setText(dadosEndereco.RetornaNumero(idSelecionado));
					
			}
		});
		
		JLabel lblNomeDosContatos = new JLabel("ID:");
		
		tfID = new JTextField();
		tfID.setEditable(false);
		tfID.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		
		tfCEP = new JTextField();
		tfCEP.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		
		tfComplemento = new JTextField();
		tfComplemento.setColumns(10);
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		
		JLabel lblComplemento = new JLabel("Complemento:");
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero:");
		
		JButton btLimpar = new JButton("Limpar Form");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfID.setText("");
				tfNome.setText("");
				tfEmail.setText("");
				tfTelefone.setText("");
				tfCEP.setText("");
				tfCidade.setText("");
				tfBairro.setText("");
				tfEndereco.setText("");
				tfComplemento.setText("");
				tfNumero.setText("");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(tfEmail, Alignment.TRAILING, 395, 395, 395)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(lblCep)
													.addComponent(lblTelefone)
													.addComponent(lblNmero)
													.addComponent(lblNome)
													.addComponent(lblEmail))
												.addGap(22))
											.addComponent(lblNomeDosContatos)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblBairro)
													.addComponent(lblCidade))
												.addGap(18)))
										.addComponent(lblEndereo))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblNmero_1)
											.addComponent(lblComplemento))
										.addGap(18)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(25)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
											.addComponent(btBusca, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(tfNumero, Alignment.TRAILING)
											.addComponent(tfComplemento, Alignment.TRAILING)
											.addComponent(tfTelefone, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
											.addComponent(tfCEP)
											.addComponent(tfCidade)
											.addComponent(tfBairro)
											.addComponent(tfEndereco)))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(380)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btLimpar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btSalvar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(90))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNmero)
						.addComponent(tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEndereo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblComplemento))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmero_1))
					.addGap(18)
					.addComponent(btSalvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btLimpar)
					.addGap(108)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDosContatos)
						.addComponent(btBusca))
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
