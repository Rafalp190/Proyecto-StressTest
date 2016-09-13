package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;

import java.awt.Component;

public class GUIStressTest {
	
	private Evaluation eval;
	private Sound sound;
	private Test exam;
	

	private JFrame frame;
	private JTextField textField;
	private JButton btnAceptar;
	private JButton btnEnviar;
	private JButton btnRetirarse;
	private JButton btnIniciar;
	private JButton btnSend;
	private JPanel InformedConsentPanel;
	private JPanel Instrucciones;
	private JPanel Test;
	private JPanel Comment;
	private JLabel lblTitle;
	private JTextPane tpnPremise;
	private Thread sounder;
	private JTextPane textPaneComment;
	
	private int answer;
	private Comment comment;
	private Timer displayTimer;
	private JPanel panel_3;
	private JLabel lblTime;
	//private int countdown;
	
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIStressTest window = new GUIStressTest();
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
	public GUIStressTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1020, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		InformedConsentPanel = new JPanel();
		frame.getContentPane().add(InformedConsentPanel, "Consentimiento Informado");
		InformedConsentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextPane txtpnTitulo = new JTextPane();
		txtpnTitulo.setEditable(false);
		txtpnTitulo.setToolTipText("");
		txtpnTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnTitulo.setText("\r\nDetecci\u00F3n de patrones en la escritura de estudiantes de la Universidad del Valle de Guatemala entre 18 y 22 a\u00F1os, bajo efectos de ansiedad y sobrecarga sensorial");
		InformedConsentPanel.add(txtpnTitulo);
		
		JTextPane txtpnProposito = new JTextPane();
		txtpnProposito.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnProposito.setText("Introducci\u00F3n y Prop\u00F3sito del estudio:\r\nEl prop\u00F3sito del siguiente estudio es determinar si existe una relaci\u00F3n entre los patrones de escritura de estudiantes de la universidad del Valle de Guatemala que han sido expuestos a est\u00EDmulos dise\u00F1ados para incrementar sus niveles de ansiedad y sobrecargar sus sentidos. \r\nEste estudio consiste en realizar una prueba corta por computadora sobre ling\u00FC\u00EDstica o razonamiento l\u00F3gico. Durante la prueba se presentaran distintos est\u00EDmulos visuales y auditivos para dificultar la resoluci\u00F3n del examen. Al finalizar, se solicitar\u00E1 que escriba un comentario corto (m\u00E1ximo de 100 palabras).  Puede utilizar papel y l\u00E1piz para resolver la prueba, pero su respuesta y comentario deben quedar registrados en la aplicaci\u00F3n.\r\n");
		txtpnProposito.setEditable(false);
		InformedConsentPanel.add(txtpnProposito);
		
		JTextPane txtpnRiesgos = new JTextPane();
		txtpnRiesgos.setEditable(false);
		txtpnRiesgos.setText("\u00BFCu\u00E1les son los riesgos de este estudio?\r\nEste estudio presenta riesgos leves a los participantes, principalmente puede experimentar molestias unos minutos despu\u00E9s de terminar la prueba pero no representa ning\u00FAn da\u00F1o o percance a su salud.\r\nAdvertencia: personas con historial de padecimiento de ansiedad, sobrecarga sensorial, estr\u00E9s cr\u00F3nico, epilepsia, problemas cardiacos y padecimientos inducibles por medio de luces parpadeantes y/o sonidos fuertes, ponen en riesgo su salud al participar en este estudio. Por lo que se recomienda indicar a su evaluador que no puede participar.\r\n");
		txtpnRiesgos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		InformedConsentPanel.add(txtpnRiesgos);
		
		JPanel panel_1 = new JPanel();
		InformedConsentPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(245, 222, 179));
		panel_1.add(lblNewLabel);
		
		btnAceptar = new JButton("Acepto participar en el Estudio");
		panel_1.add(btnAceptar);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		Instrucciones = new JPanel();
		frame.getContentPane().add(Instrucciones, "Instrucciones");
		Instrucciones.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnInstrucciones = new JTextPane();
		txtpnInstrucciones.setText("\r\n\r\nInstrucciones:");
		txtpnInstrucciones.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtpnInstrucciones.setEditable(false);
		Instrucciones.add(txtpnInstrucciones, BorderLayout.NORTH);
		
		JTextPane txtpnEnLaSiguiente = new JTextPane();
		txtpnEnLaSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEnLaSiguiente.setEditable(false);
		txtpnEnLaSiguiente.setText("En la siguiente ventana se le presentara un examen de razonamiento logico.\r\nDurante este examen puede usar los materiales proporcionados por el investigador para resolverlo. (Papel y lapiz)\r\nAntes de comenzar:\r\n-Asegurese que tiene como m\u00EDnimo 10 minutos para resolver el examen.\r\n-Coloquese los auriculares que se encuentran sobre la mesa.\r\nRecuerde:\r\n-Puede retirarse de la prueba en cualquier momento si usted asi lo desea\r\n\r\nAl finalizar el examen se le solicitar\u00E1 que escriba un comentario sobre la prueba realizada y como se sinti\u00F3 durante la misma. El comentario tiene un m\u00E1ximo de 100 palabras.\r\n\r\nSi est\u00E1 listo para comenzar presione el boton Iniciar\r\n");
		Instrucciones.add(txtpnEnLaSiguiente, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		Instrucciones.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnRetirarse = new JButton("Retirarse");
		btnRetirarse.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnRetirarse);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel.add(lblNewLabel_1);
		
		btnIniciar = new JButton("Iniciar\r\n");
		btnIniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnIniciar);
		
		Test = new JPanel();
		frame.getContentPane().add(Test, "Test");
		Test.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		Test.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblTitle = new JLabel("Title");
		panel_3.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setBackground(new Color(0, 0, 0));
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		lblTime = new JLabel("");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblTime);
		
		tpnPremise = new JTextPane();
		tpnPremise.setEditable(false);
		tpnPremise.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Test.add(tpnPremise, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		Test.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblRespuesta = new JLabel("Respuesta");
		panel_2.add(lblRespuesta);
		lblRespuesta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRespuesta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRespuesta.setVerticalAlignment(SwingConstants.BOTTOM);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_2.add(btnEnviar);
		
		Comment = new JPanel();
		frame.getContentPane().add(Comment, "Comentario");
		Comment.setLayout(new BorderLayout(0, 0));
		
		JLabel lblComment = new JLabel("Comentario:");
		lblComment.setFont(new Font("Tahoma", Font.BOLD, 30));
		Comment.add(lblComment, BorderLayout.NORTH);
		
		textPaneComment = new JTextPane();
		textPaneComment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Comment.add(textPaneComment, BorderLayout.CENTER);
		
		btnSend = new JButton("Enviar");
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 20));
		Comment.add(btnSend, BorderLayout.SOUTH);
		
		ManejadorEventos listener= new ManejadorEventos();
		TimerManager timeListener= new TimerManager();
		btnAceptar.addActionListener(listener);
		btnRetirarse.addActionListener(listener);
		btnIniciar.addActionListener(listener);
		btnEnviar.addActionListener(listener);
		btnEnviar.addActionListener(timeListener);
		btnSend.addActionListener(listener);
		displayTimer = new Timer(1000,timeListener);
		sounder = (new Thread(new Sound("C:/Users/miacompu/Documents/EHealthShizz/StressTest/Produce.wav")));
		Random rn = new Random();
		answer = rn.nextInt(16)+1;
		
		
	}
	private class ManejadorEventos implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			if (e.getSource()== btnAceptar){
				CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
				cl.next(frame.getContentPane());
			}
			if (e.getSource()==btnRetirarse){
				CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
				cl.first(frame.getContentPane());
			}
			if (e.getSource()==btnIniciar){
				CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
				cl.next(frame.getContentPane());
				displayTimer.start();
				
				
				if (answer<=2){
					String nombre = "Asientos disponibles";
					String respuesta = "Jane";
					String premise = "En la escuela los chicos se sientan en los pupitres numerados del 1 al 5 y las chicas se sientan detras de ellos en los numerados del 6 al 10 "
							+ "\n-La chica sentada junto a la chica detras del n.1 es Fiorela."
							+ "\n-Fiorela se sienta tres pupitres mas alla que Grace."
							+ "\n-Hilary esta atras de Colin."
							+ "\n-Eddy se sienta frente a la chica sentada junto a Hilary."
							+ "\n-Colin no esta en el centro, Alan si."
							+ "\n-David esta junto a Billy."
							+ "\n-Billy se sienta tres pupitres mas alla de Colin."
							+ "\n-Fiorela no esta en el centro, Indira si."
							+ "\n-Hilary esta tres pupitres mas alla de Jane."
							+ "\n-David se sienta frente a Grace."
							+ "\n-La chica que se sienta junto a la que está frente a Alan es Jane."
							+ "\n-Colin no se sienta en el pupitre N.5."
							+ "\n-Jane no se sienta en el pupitre n.10."
							+ "\n\n-Quien esta sentado a la derecha y contiguo a Indira?";
					
					lblTitle.setText(nombre);
					tpnPremise.setText(premise);
				}
				if (answer>2 && answer<=8){
					
					String nombre = "Asientos disponibles";
					String respuesta = "Jane";
					String premise = "En la escuela los chicos se sientan en los pupitres numerados del 1 al 5 y las chicas se sientan detras de ellos en los numerados del 6 al 10 "
							+ "\n-La chica sentada junto a la chica detras del n.1 es Fiorela."
							+ "\n-Fiorela se sienta tres pupitres mas alla que Grace."
							+ "\n-Hilary esta atras de Colin."
							+ "\n-Eddy se sienta frente a la chica sentada junto a Hilary."
							+ "\n-Colin no esta en el centro, Alan si."
							+ "\n-David esta junto a Billy."
							+ "\n-Billy se sienta tres pupitres mas alla de Colin."
							+ "\n-Fiorela no esta en el centro, Indira si."
							+ "\n-Hilary esta tres pupitres mas alla de Jane."
							+ "\n-David se sienta frente a Grace."
							+ "\n-La chica que se sienta junto a la que está frente a Alan es Jane."
							+ "\n-Colin no se sienta en el pupitre N.5."
							+ "\n-Jane no se sienta en el pupitre n.10."
							+ "\n\n-Quien esta sentado a la derecha y contiguo a Indira?";
					
					lblTitle.setText(nombre);
					tpnPremise.setText(premise);
					sounder.start();
				}
				if (answer>8 && answer<=10){
					String nombre = "Libertad";
					String respuesta = "A";
					String premise= "Un preso condenado a la pena de muerte, tiene una oportunidad de salvar su vida, si es capaz de resolver el siguiente problema. El Juez, mostrandole dos puertas, cada una cuidada por un guardia, le dijo:"
						+ "\nUna de estas puertas conduce a la libertad y la otra a la silla electrica; los guardias las conocen, solo que uno de ellos siempre miente y el otro guardia siempre dice la verdad. Tienes la opcion de hacer una sola pregunta a uno de ellos"
						+ "\nTras unos minutos de titubeo, el reo pregunto al guardia N:"
						+ "\n-Si le pregunto al guardia M, cual de las puertas A ó B conduce a la libertad, ¿que me respondera?."
						+ "\n-Te dira que la puerta B - respondio el custodio. Luego de oir la respuesta, el preso se encamino con toda seguridad hacia la puerta de la vida y salio libre."
						+ "\n\nPor cual de las puertas salio?"+"\n\n\n\n\n\nEscriba solamente la letra de la puerta por la que salió";
					
					lblTitle.setText(nombre);
					tpnPremise.setText(premise);
					
				 
				}
				if (answer>10 && answer<=16){
					String nombre = "Libertad";
					String respuesta = "A";
					String premise= "Un preso condenado a la pena de muerte, tiene una oportunidad de salvar su vida, si es capaz de resolver el siguiente problema. El Juez, mostrandole dos puertas, cada una cuidada por un guardia, le dijo:"
						+ "\nUna de estas puertas conduce a la libertad y la otra a la silla electrica; los guardias las conocen, solo que uno de ellos siempre miente y el otro guardia siempre dice la verdad. Tienes la opcion de hacer una sola pregunta a uno de ellos"
						+ "\nTras unos minutos de titubeo, el reo pregunto al guardia N:"
						+ "\n-Si le pregunto al guardia M, cual de las puertas conduce a la libertad, ¿que me respondera?."
						+ "\n-Te dira que la puerta B - respondio el custodio. Luego de oir la respuesta, el preso se encamino con toda seguridad hacia la puerta de la vida y salio libre."
						+ "\n\nPor cual de las puertas salio?"+"\n\n\n\n\n\nEscriba solamente la letra de la puerta por la que salió";
					
					lblTitle.setText(nombre);
					tpnPremise.setText(premise);
					sounder.start();
					
				}
			}
			if (e.getSource()==btnEnviar){
				CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
				cl.last(frame.getContentPane());
				displayTimer.stop();
				
				
			}
			if (e.getSource()==btnSend){
				CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
				String comentario = textPaneComment.getText();
				if (answer<=2 || (answer>8 && answer <=10 )){
				
					String subject = "Control";
					Comment comment = new Comment(comentario, subject);
					comment.insertComment();
				}
				else{
					String subject = "Stress";
					Comment comment = new Comment(comentario, subject);
					comment.insertComment();	
				}
				JOptionPane.showMessageDialog(frame,"Gracias por participar!");
				sounder.stop();
				cl.first(frame.getContentPane());
				frame.dispose();
				GUIStressTest window = new GUIStressTest();
				window.frame.setVisible(true);
				
				//System.exit(0);	
			}
		}
	}
	private class TimerManager implements ActionListener{
		long countdown = 300;
			
		public void actionPerformed(ActionEvent event){
			String ms= Long.toString(countdown);
			ms = String.format("%02d:%02d", TimeUnit.SECONDS.toMinutes(countdown),countdown - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(countdown)));
			lblTime.setText(ms);
			int cd= (int) countdown;
			if (cd > 0){
				if ((answer>2 &&answer<=8 )|| answer>10 ){
					if (cd%2==0){
						Font newFont = new Font("Tahoma", Font.ITALIC , 30);
						Font newFontText = new Font("Tahoma", Font.BOLD , 14);
						lblTitle.setBackground(Color.RED);
						lblTitle.setForeground(Color.WHITE);
						lblTime.setForeground(Color.WHITE);
						tpnPremise.setBackground(Color.RED);
						tpnPremise.setForeground(Color.WHITE);
						Test.setBackground(Color.RED);
						panel_3.setBackground(Color.RED);
						lblTitle.setFont(newFont);
						tpnPremise.setFont(newFontText);
						lblTime.setFont(newFont);
					}
					else{
						Font newFont = new Font("Tahoma", Font.BOLD , 30);
						Font newFontText = new Font("Tahoma", Font.ITALIC , 14);
						lblTitle.setBackground(Color.YELLOW);
						lblTitle.setForeground(Color.BLACK);
						lblTime.setForeground(Color.BLACK);
						tpnPremise.setBackground(Color.YELLOW);
						tpnPremise.setForeground(Color.BLACK);
						Test.setBackground(Color.YELLOW);
						panel_3.setBackground(Color.YELLOW);
						lblTitle.setFont(newFont);
						tpnPremise.setFont(newFontText);
						lblTime.setFont(newFont);
					}	
						
									}
				else{	
					}
				countdown--;
				}
				else{
					JOptionPane.showMessageDialog(frame, "SE ACABO EL TIEMPO");
					CardLayout cl = (CardLayout)(frame.getContentPane().getLayout());
					displayTimer.stop();
					cl.last(frame.getContentPane());
				}
				
			
		
				
				
			
				
			
			    
		}
	}	
}		
	
	


