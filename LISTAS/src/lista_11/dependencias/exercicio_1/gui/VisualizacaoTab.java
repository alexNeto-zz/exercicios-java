package lista_11.dependencias.exercicio_1.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lista_11.dependencias.exercicio_1.AdicionarContato;
import lista_11.dependencias.exercicio_1.AppMan;
import lista_11.dependencias.exercicio_1.Contato;

@SuppressWarnings("serial")
public class VisualizacaoTab extends WidgetsComuns implements Serializable {

	protected JPanel visualizacaoPane = new JPanel();
	private JButton atualizarButton = new JButton("Visualizar");
	private JButton adicionarButton = new JButton("Adicionar");
	private JButton deletarButton = new JButton("Deletar");
	private JButton salvarButton = new JButton("Salvar");
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JLabel nome = new JLabel("Nome: ");
	private JLabel email = new JLabel("Email: ");
	private JLabel telefone = new JLabel("Telefone: ");
	private AppMan app;

	public VisualizacaoTab() {
		app = new AppMan();
		visualizacaoPane.setLayout(null);

		dataLabel.setBounds(15, 15, 140, 40);
		visualizacaoPane.add(dataLabel);

		JPanel panel = new JPanel(new BorderLayout());
		panel.setBounds(20, 60, 750, 300);

		tabela = new JTable(modelo);
		modelo.addColumn("Nome");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
		JScrollPane barraRolagemScroll = new JScrollPane(tabela);
		panel.add(barraRolagemScroll);
		visualizacaoPane.add(panel);

		nome.setBounds(20, 400, 300, 30);
		visualizacaoPane.add(nome);

		telefone.setBounds(20, 450, 300, 30);
		visualizacaoPane.add(telefone);

		email.setBounds(20, 500, 300, 30);
		visualizacaoPane.add(email);

		sairButton.setBounds(650, 540, 115, 30);
		visualizacaoPane.add(sairButton);

		atualizarButton.setBounds(20, 540, 115, 30);
		visualizacaoPane.add(atualizarButton);

		adicionarButton.setBounds(135, 540, 115, 30);
		visualizacaoPane.add(adicionarButton);

		deletarButton.setBounds(250, 540, 115, 30);
		visualizacaoPane.add(deletarButton);

		salvarButton.setBounds(365, 540, 115, 30);
		visualizacaoPane.add(salvarButton);

		new Thread(new MostraSelecionado()).start();

		atualizarButton.addActionListener(this);
		adicionarButton.addActionListener(this);
		deletarButton.addActionListener(this);
		salvarButton.addActionListener(this);
		sairButton.addActionListener(this);
		this.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(atualizarButton)) {
			atualizarButton.setText("Atualizar");

			try {
				modelo.setNumRows(0);
				Set<Contato> contatos = app.getContatos();
				TreeSet<Contato> treeSet = new TreeSet<Contato>();
				treeSet.addAll(contatos);
				for (Contato contato : treeSet) {
					modelo.addRow(new Object[] { contato.getNome() });
				}
			} catch (NumberFormatException err) {

			}
		}
		if (e.getSource().equals(adicionarButton)) {
			Contato contato = AdicionarContato.adicionarContato();

			app.adicionarContato(contato);
		}
		if (e.getSource().equals(deletarButton)) {
			modelo.getDataVector().elementAt(tabela.getSelectedRow());
			String nome = modelo.getDataVector().elementAt(tabela.getSelectedRow()).toString();
			nome = nome.replace("]", "");
			nome = nome.replace("[", "");
			System.out.println(nome);
			Set<Contato> contatos = app.getContatos();
			for (Iterator<Contato> it = contatos.iterator(); it.hasNext();) {
				Contato f = it.next();
				if (f.getNome().equals(new String(nome))) {
					app.removeContato(nome);
				}
			}
		}
		if (e.getSource().equals(salvarButton)) {
			app.salvar();
		}
		if (e.getSource().equals(sairButton)) {
			System.exit(1);
		}
	}

	public JPanel getVisualizacaoPane() {
		return visualizacaoPane;
	}

	private class MostraSelecionado implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					atualiza();
					Thread.sleep(1000L);
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public void atualiza() {
			String nomeLocal = modelo.getDataVector().elementAt(tabela.getSelectedRow()).toString();
			nomeLocal = nomeLocal.replace("]", "");
			nomeLocal = nomeLocal.replace("[", "");
			Set<Contato> contatos = app.getContatos();
			for (Iterator<Contato> it = contatos.iterator(); it.hasNext();) {
				Contato f = it.next();
				if (f.getNome().equals(new String(nomeLocal))) {
					nome.setText("Nome: " + f.getNome());
					telefone.setText("E-mail: " + f.getEmail());
					email.setText("Telefone: " + f.getTelefone());
				}
			}
		}
	}
}
