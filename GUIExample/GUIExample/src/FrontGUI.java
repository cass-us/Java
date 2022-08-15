import javax.swing.JFrame;
public class FrontGUI extends JFrame
{
	public FrontGUI()
	{
		//set title of our GUI
		setTitle("First GUI");
		//GUI location in X and Y
		setLocation(10,150);
		//set a GUI to closable
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set size of the window
		setSize(600, 450);
		//set the layout manager - 
		//setLayout("layout manager");
	}
	
	public static void main(String[]args)
	{
		FrontGUI gui = new FrontGUI();
		gui.setVisible(true);
	}
}