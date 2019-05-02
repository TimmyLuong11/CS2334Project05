import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
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
	private JLabel distBox0 = new JLabel();
	private JLabel distBox1 = new JLabel();	
	private JLabel distBox2 = new JLabel();
	private JLabel distBox3 = new JLabel();
	private JLabel distBox4 = new JLabel();
	private JLabel valueTextField = new JLabel();
	private Color lightBlue = new Color(51,153,225);
	
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
		panel1.add(distBox0);
		panel1.add(distBox1);
		panel1.add(distBox2);
		panel1.add(distBox3);
		panel1.add(distBox4);
		panel1.add(valueTextField);
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
		
		distBox0.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		distBox0.setBounds(150, 495, 100, 20);
		
		distBox1.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		distBox1.setBounds(150, 535, 100, 20);
		
		distBox2.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		distBox2.setBounds(150, 575, 100, 20);
		
		distBox3.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		distBox3.setBounds(150, 615, 100, 20);
		
		distBox4.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		distBox4.setBounds(150, 660, 100, 20);
	}
	
	private void setSlider() 
	{
		slider.setBounds(10, 25, 200, 50);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setPaintLabels(true);
		valueTextField.setBorder(BorderFactory.createLineBorder(lightBlue, 1));
		valueTextField.setBounds(130, 5, 100, 20);
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
