import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PlayerGUI {
	
	private String playerName;

	private JLabel lblPlayerName;
	private JLabel lblCash;

	private JButton btnRoll;

	private JPanel panel;
	private JFrame frame;

	public PlayerGUI(String playerName){
		this.playerName=playerName;
		createForm();
		addButtons();
		addFields();

		frame.add(panel); 
		frame.setVisible(true);
	}

	public void createForm(){
		frame = new JFrame();
		frame.setTitle(playerName);	
		frame.setSize(200,1150);
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setLayout(null);
	}

	public void addFields(){
		lblPlayerName = new JLabel(playerName);
		lblPlayerName.setBounds(0,0, 100, 100);
		lblPlayerName.setBackground(Color.ORANGE);
		lblPlayerName.setOpaque(true);
		panel.add(lblPlayerName);

		lblCash = new JLabel("£");
		lblCash.setBounds(100,0, 100, 100);
		lblCash.setBackground(Color.ORANGE);
		lblCash.setOpaque(true);
		panel.add(lblCash);
	}

	public void addButtons(){
		btnRoll = new JButton ("Roll");
		btnRoll.setBounds(0,100,200,20);
		btnRoll.addActionListener(new RollHandler());
		//btnRoll.setToolTipText("Generates the Fine Letter for this Record");
		panel.add(btnRoll);
	}

	/*public static void main(String[] args) {
		new PlayerGUI();
	}*/

	class RollHandler implements ActionListener { 
		public void actionPerformed(ActionEvent event) {
		}

	}

}
