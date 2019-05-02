import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class HammingDist extends JFrame
{
	private JPanel panel0 = new JPanel(new BorderLayout()); 
	private JPanel panel1 = new JPanel(null); 
	private JButton showStation = new JButton("Show Station");
	private JButton calHD = new JButton("Calculate HD");
	private JButton addStation = new JButton("Add Station");
	private JSlider slider = new JSlider(1,4);	
	private JLabel enterHD = new JLabel("Enter Hamming Dist:");
	private JLabel compare = new JLabel("Compare with:");
	private JLabel distLabel0 = new JLabel("Distance 0");
	private JLabel disLabel1 = new JLabel("Distance 1");
	private JLabel disLabel2 = new JLabel("Distance 2");
	private JLabel disLabel3 = new JLabel("Distance 3");
	private JLabel disLabel4 = new JLabel("Distance 4");
	
	public HammingDist()
	{
		initFrame();
		setButton();
		setSlider();
		setText();
		panel1.add(showStation);
		panel1.add(calHD);
		panel1.add(addStation);
		panel1.add(slider);
		panel1.add(enterHD);
		panel1.add(compare);
		panel1.add(distLabel0);
		panel1.add(disLabel1);
		panel1.add(disLabel2);
		panel1.add(disLabel3);
		panel1.add(disLabel4);
		panel0.add(panel1);	
		this.add(panel0);	
	}
	private void setText() 
	{
		enterHD.setBounds(10, 8, 120, 10);
		compare.setBounds(10, 415, 120, 10);
		distLabel0.setBounds(15, 500, 120, 10);
		disLabel1.setBounds(15, 545, 120, 10);
		disLabel2.setBounds(15, 585, 120, 10);
		disLabel3.setBounds(15, 625, 120, 10);
		disLabel4.setBounds(15, 665, 120, 10);
	}
	
	private void setSlider() 
	{
		slider.setBounds(10, 25, 200, 50);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setPaintLabels(true);
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
