package hellworld;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {// makes sure that the program runs on the specific thread

			@Override
			public void run() {
				new MainFrame(); // instantiates the JFrame and creates the title for the JFrame
				
			}});


	}

}
