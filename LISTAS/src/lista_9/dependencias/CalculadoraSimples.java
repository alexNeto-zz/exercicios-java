package lista_9.dependencias;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculadoraSimples extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numero1 = new Texto(29, 25, 202, 30, 10).getTexto();
	private JTextField numero2 = new Texto(29, 64, 202, 30, 10).getTexto();
	private JButton soma = new Botao("+", 29, 108, 41, 30).getBotao();
	private JButton subtracao = new Botao("-", 82, 108, 41, 30).getBotao();
	private JButton multiplicacao = new Botao("×", 135, 108, 41, 30).getBotao();
	private JButton divisao = new Botao("÷", 190, 108, 41, 30).getBotao();
	private JLabel resultado = new JLabel("");
	Double resultadoConta = new Double(0.0);

	public CalculadoraSimples() {
		super("Calculadora simples");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 238);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.add(numero1);
		contentPane.add(numero2);

		contentPane.add(soma);
		contentPane.add(subtracao);
		contentPane.add(multiplicacao);
		contentPane.add(divisao);

		resultado = new JLabel("");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(30, 148, 202, 30);
		contentPane.add(resultado);

		soma.addActionListener(this);
		subtracao.addActionListener(this);
		multiplicacao.addActionListener(this);
		divisao.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(soma)) {

			try {
				resultadoConta = converteParaDouble(numero1.getText());
				resultadoConta += converteParaDouble(numero2.getText());
				resultado.setText(resultadoConta.toString());
			} catch (NumberFormatException exc) {
				resultado.setText("só aceitamos números");
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}
		if (e.getSource().equals(subtracao)) {
			try {
				resultadoConta = converteParaDouble(numero1.getText());
				resultadoConta -= converteParaDouble(numero2.getText());
				resultado.setText(resultadoConta.toString());
			} catch (NumberFormatException exc) {
				resultado.setText("só aceitamos números");
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}
		if (e.getSource().equals(multiplicacao)) {
			try {
				resultadoConta = converteParaDouble(numero1.getText());
				resultadoConta *= converteParaDouble(numero2.getText());
				resultado.setText(resultadoConta.toString());
			} catch (NumberFormatException exc) {
				resultado.setText("só aceitamos números");
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}
		if (e.getSource().equals(divisao)) {
			try {
				resultadoConta = converteParaDouble(numero1.getText());
				resultadoConta /= converteParaDouble(numero2.getText());
				if (resultadoConta.isInfinite()) {
					resultado.setText("∞");
				} else if (resultadoConta.isNaN()) {
					resultado.setText("Indefinido");
				} else {
					resultado.setText(resultadoConta.toString());
				}
			} catch (NumberFormatException exc) {
				resultado.setText("só aceitamos números");
			} catch (ArithmeticException exc) {
				resultado.setText("Indefinido");
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}
	}

	private Double converteParaDouble(String numero) throws NumberFormatException {
		Double valor = new Double(0.0);
		valor = Double.parseDouble(numero);
		return valor;
	}
}
