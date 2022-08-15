import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FrontGUI extends JFrame
{
	//Declare Labels
	JLabel lblNum1 = new JLabel("Enter the value of first number");
	JLabel lblNum2 = new JLabel("Enter the value of second number");
	JLabel lblNum3 = new JLabel("Enter the value of third number");
	JLabel lblSum = new JLabel("Sum is");
	JLabel lblProduct = new JLabel("Product is");
	
	//Declare Text field are inputs
	JTextField txtNum1 = new JTextField(10);
	JTextField txtNum2 = new JTextField(10);
	JTextField txtNum3 = new JTextField(10);
	JTextField txtSum = new JTextField(10);
	JTextField txtProduct = new JTextField(10);
	//Declare the buttons
	JButton btnCompute = new JButton("Calculate");
	JButton btnClear = new JButton("Clear");
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
		//setLayout(new FlowLayout());
		//Grid layout uses the rows and columns
		setLayout(new GridLayout(6,2));
		//add the components
		add(lblNum1);
		add(txtNum1);
		add(lblNum2);
		add(txtNum2);
		add(lblNum3);
		add(txtNum3);
		add(lblSum);
		add(txtSum);
		add(lblProduct);
		add(txtProduct);
		add(btnCompute);
		btnCompute.addActionListener(new HandleCalculations());
		add(btnClear);		
	}
	
	private class HandleCalculations implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			String strNum1, strNum2, strNum3;
			//collect the values from textfield
			strNum1 = txtNum1.getText();
			strNum2 = txtNum2.getText();
			strNum3 = txtNum3.getText();
			//Convert input strings to integers
			int num1, num2, num3, sum, product;
			
			num1 = Integer.parseInt(strNum1);
			num2 = Integer.parseInt(strNum2);
			num3 = Integer.parseInt(strNum3);
			//calculations
			sum = num1 + num2 + num3;
			product = num1 * num2 * num3;
			//Display the results
			txtSum.setText(String.valueOf(sum));
			txtProduct.setText(String.valueOf(product));			
		}
	}
	public static void main(String[]args)
	{
		FrontGUI gui = new FrontGUI();
		gui.setVisible(true);
	}
}