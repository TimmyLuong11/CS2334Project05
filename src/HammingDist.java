import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HammingDist extends JFrame
{
	private JPanel panel0 = new JPanel(new BorderLayout()); 
	private JPanel panel1 = new JPanel(null); 
	private JButton showStation = new JButton("Show Station");
	private JButton calHD = new JButton("Calculate HD");
	private JButton addStation = new JButton("Add Station");
	
	public HammingDist()
	{
		initFrame();
		setButton();
		panel1.add(showStation);
		panel1.add(calHD);
		panel1.add(addStation);
		panel0.add(panel1);	
		this.add(panel0);	
	}
	
	private void setButton() 
	{
		showStation.setBounds(17, 100, 115, 25);
		calHD.setBounds(17, 450, 115, 25);
		addStation.setBounds(17, 700, 115, 25);
	}	
	
	private void initFrame() 
	{
		setTitle("Hamming Distance");
		setSize(775, 775);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		HammingDist hd = new HammingDist();
		hd.revalidate();
	}
}
