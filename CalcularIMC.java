package Interface;

import javax.swing.*;
import java.awt.*;


public class CalcularIMC extends JFrame {
	
	private JTextField campoPeso;
	private JTextField campoAltura;
	private JLabel resultado;
	private JLabel classificacao;
	
	public void calcularIMC() {
		setTitle("Calculadora de IMC");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true);
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(7, 1, 10, 10));
		painel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
		painel.setBackground(new Color(240, 245, 250));
		
		JLabel titulo = new JLabel("Calculadora IMC", SwingConstants.CENTER);
		
		titulo.setFont(new Font("Arial", Font.BOLD, 22));
		
		JLabel labelPeso = new JLabel("Peso (kg)");
		campoPeso = new JTextField();
		campoPeso.setToolTipText("Exemplo: 70.0");
		
		JLabel labelAltura = new JLabel("Altura (m)");
		campoAltura = new JTextField();
		campoAltura.setToolTipText("Exemplo: 1.60");
		
		JButton botaoCalcular = new JButton("Calcular IMC");
		
		botaoCalcular.setBackground(new Color(17, 99, 239));
		botaoCalcular.setForeground(Color.WHITE);
		botaoCalcular.setFocusPainted(false);
		
		resultado = new JLabel("IMC: ", SwingConstants.CENTER);
		resultado.setFont(new Font("Arial", Font.BOLD, 18));
	
		
		
	}
	
}
