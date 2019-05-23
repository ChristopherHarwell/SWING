package hellworld;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private JButton btn;
	
	
	
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout()); // sets the Layout and BorderLayout() allows us to add components
		
		btn = new JButton("Click Me!"); // creates the button
		textPanel = new TextPanel();
		
		
		btn.addActionListener(new ActionListener() {  // make an action listener so the button has functionality
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n"); // adds the text in parenthesis to the screen everytime you click the button
			}
		}); 
		
		
		add(textPanel, BorderLayout.CENTER); // allows you to add text to the center of the window
		add(btn, BorderLayout.SOUTH); // Puts the button at the bottom of the JFrame
		
		setSize(800,700); // sets the default size of the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates the application when you press the X in the window
		setVisible(true); // makes the JFrame Visible on the screen
		
	}

}
