import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MonopolyGUI {
	
	private GamePlay gamePlay;

	private Border b;
	
	private JLabel lblGO;
	private JLabel lblFreeParking;
	private JLabel lblJail;
	private JLabel lblVisit1;
	private JLabel lblVisit2;
	private JLabel lblGoToJail;
	private JLabel lblStrand;
	private JLabel lblChanceBlue;
	private JLabel lblFleetStreet;
	private JLabel lblTrafalgarSquare;
	private JLabel lblFenchurchSTStation;
	private JLabel lblLeicesterSquare;
	private JLabel lblCoventryStreet;
	private JLabel lblWaterWorks;
	private JLabel lblPiccadilly;
	private JLabel lblRegentStreet;
	private JLabel lblOxfordStreet;
	private JLabel lblComChestGreen;
	private JLabel lblBondStreet;
	private JLabel lblLiverpoolSTStation;
	private JLabel lblChanceRed;
	private JLabel lblParkLane;
	private JLabel lblSuperTax;
	private JLabel lblMayfair;
	private JLabel lblOldKentRoad;
	private JLabel lblComChestBrown;
	private JLabel lblWhitechapelRoad;
	private JLabel lblIncomeTax;
	private JLabel lblKingsCrossStation;
	private JLabel lblTheAngelIslington;
	private JLabel lblEustonRoad;
	private JLabel lblPentonvilleRoad;
	private JLabel lblPallMall;
	private JLabel lblElectricCompany;
	private JLabel lblWhitehall;
	private JLabel lblNorthumberlandAve;
	private JLabel lblMaryleboneStation;
	private JLabel lblBowStreet;
	private JLabel lblComChestOrange;
	private JLabel lblMarlboroughStreet;
	private JLabel lblVineStreet;
	
	private JTextField txtP1;
	private JTextField txtP2;
	private JTextField txtP3;
	private JTextField txtP4;
	
	private JButton btnStart;
	
	private JPanel panel;
	private JFrame frame;

	public static void main(String[] args) {
		new MonopolyGUI();
	}
	
	public MonopolyGUI(){
		b = BorderFactory.createLineBorder(Color.black);
		gamePlay = new GamePlay();
		
		createForm();
		addLabels();
		startGame();

		frame.add(panel); 
		frame.setVisible(true);
		
	}
	
	private void startGame() {
		txtP1 = new JTextField("Player1");
		txtP1.setBounds(400,500, 100, 20);
		txtP1.setBorder(b);
		txtP1.setBackground(Color.ORANGE);
		txtP1.setOpaque(true);
		panel.add(txtP1);
		
		txtP2 = new JTextField("Player2");
		txtP2.setBounds(600,500, 100, 20);
		txtP2.setBorder(b);
		txtP2.setBackground(Color.ORANGE);
		txtP2.setOpaque(true);
		panel.add(txtP2);
		
		txtP3 = new JTextField("Player3");
		txtP3.setBounds(400,600, 100, 20);
		txtP3.setBorder(b);
		txtP3.setBackground(Color.ORANGE);
		txtP3.setOpaque(true);
		panel.add(txtP3);
		
		txtP4 = new JTextField("Player4");
		txtP4.setBounds(600,600, 100, 20);
		txtP4.setBorder(b);
		txtP4.setBackground(Color.ORANGE);
		txtP4.setOpaque(true);
		panel.add(txtP4);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(500, 530, 100, 50);
		btnStart.addActionListener(new StartHandler());
		panel.add(btnStart);
	}
	
	class StartHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
			if (txtP1.getText().isEmpty()){
				
			}
		}

	}

	public void createForm(){ 
		frame = new JFrame();
		frame.setTitle("Monopoly");	
		frame.setSize(1150,1150);
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setLayout(null);
	}
	
	public void addLabels(){
		lblFreeParking = new JLabel("FreeParking");
		lblFreeParking.setBounds(0,0, 100, 100);
		lblFreeParking.setBorder(b);
		lblFreeParking.setBackground(Color.ORANGE);
		lblFreeParking.setOpaque(true);
		panel.add(lblFreeParking);

		lblGO = new JLabel("<--Go---");
		lblGO.setBounds(1000, 1000, 100, 100);
		lblGO.setBorder(b);
		lblGO.setBackground(Color.ORANGE);
		lblGO.setOpaque(true);
		panel.add(lblGO);

		lblGoToJail = new JLabel("Go to Jail");
		lblGoToJail.setBounds(1000, 0, 100, 100);
		lblGoToJail.setBorder(b);
		lblGoToJail.setBackground(Color.ORANGE);
		lblGoToJail.setOpaque(true);
		panel.add(lblGoToJail);

		lblJail = new JLabel("Jail");
		lblJail.setBounds(20, 1000, 80, 80);
		lblJail.setBorder(b);
		lblJail.setBackground(Color.ORANGE);
		lblJail.setOpaque(true);
		panel.add(lblJail);

		lblVisit1 = new JLabel("Visit");
		lblVisit1.setBounds(0, 1000, 20, 80);
		lblVisit1.setBorder(b);
		lblVisit1.setBackground(Color.cyan);
		lblVisit1.setOpaque(true);
		panel.add(lblVisit1);

		lblVisit2 = new JLabel("Jail");
		lblVisit2.setBounds(0, 1080, 100, 20);
		lblVisit2.setBorder(b);
		lblVisit2.setBackground(Color.cyan);
		lblVisit2.setOpaque(true);
		panel.add(lblVisit2);
		
		lblStrand = new JLabel("Strand");
		lblStrand.setBounds(100, 0, 100, 100);
		lblStrand.setBorder(b);
		lblStrand.setBackground(Color.red);
		lblStrand.setOpaque(true);
		panel.add(lblStrand);
		
		lblChanceBlue = new JLabel("Chance");
		lblChanceBlue.setBounds(200, 0, 100, 100);
		lblChanceBlue.setBorder(b);
		lblChanceBlue.setBackground(Color.red);
		lblChanceBlue.setOpaque(true);
		panel.add(lblChanceBlue);
		
		lblFleetStreet = new JLabel("Fleet Street");
		lblFleetStreet.setBounds(300, 0, 100, 100);
		lblFleetStreet.setBorder(b);
		lblFleetStreet.setBackground(Color.red);
		lblFleetStreet.setOpaque(true);
		panel.add(lblFleetStreet);
		
		lblTrafalgarSquare= new JLabel("Trafalgar Square");
		lblTrafalgarSquare.setBounds(400, 0, 100, 100);
		lblTrafalgarSquare.setBorder(b);
		lblTrafalgarSquare.setBackground(Color.red);
		lblTrafalgarSquare.setOpaque(true);
		panel.add(lblTrafalgarSquare);
		
		lblFenchurchSTStation= new JLabel("Fenchurch ST Station");
		lblFenchurchSTStation.setBounds(500, 0, 100, 100);
		lblFenchurchSTStation.setBorder(b);
		lblFenchurchSTStation.setBackground(Color.red);
		lblFenchurchSTStation.setOpaque(true);
		panel.add(lblFenchurchSTStation);
		
		lblLeicesterSquare= new JLabel("Leicester Square");
		lblLeicesterSquare.setBounds(600, 0, 100, 100);
		lblLeicesterSquare.setBorder(b);
		lblLeicesterSquare.setBackground(Color.red);
		lblLeicesterSquare.setOpaque(true);
		panel.add(lblLeicesterSquare);
		
		lblCoventryStreet= new JLabel("Coventry Street");
		lblCoventryStreet.setBounds(700, 0, 100, 100);
		lblCoventryStreet.setBorder(b);
		lblCoventryStreet.setBackground(Color.red);
		lblCoventryStreet.setOpaque(true);
		panel.add(lblCoventryStreet);
		
		lblWaterWorks= new JLabel("Water Works");
		lblWaterWorks.setBounds(800, 0, 100, 100);
		lblWaterWorks.setBorder(b);
		lblWaterWorks.setBackground(Color.red);
		lblWaterWorks.setOpaque(true);
		panel.add(lblWaterWorks);
		
		lblPiccadilly= new JLabel("Piccadilly");
		lblPiccadilly.setBounds(900, 0, 100, 100);
		lblPiccadilly.setBorder(b);
		lblPiccadilly.setBackground(Color.red);
		lblPiccadilly.setOpaque(true);
		panel.add(lblPiccadilly);
	}
	
	public boolean buyConfirm(String propertyName){

		boolean b=false;

		int n = JOptionPane.showConfirmDialog(frame, "Do you wish to buy"+propertyName+"?", "Buy a Property?", JOptionPane.YES_NO_OPTION);
		if(n == JOptionPane.YES_OPTION){
			b = true;
		}
		return b;
	}
		
}
