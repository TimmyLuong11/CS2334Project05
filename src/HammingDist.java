import javax.swing.JFrame;

public class HammingDist extends JFrame
{
	public HammingDist()
	{
		initFrame();
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
