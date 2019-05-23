package hellworld;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	public TextPanel() { // create the text area
		textArea = new JTextArea();
		setLayout(new BorderLayout());// set the layout for the text area
		
		add(new JScrollPane(textArea), BorderLayout.CENTER); // make the text appear on the center of the screen and add a scroll bar
	}
		 public void appendText(String text) { // append text to the text area
			textArea.append(text);
		}
		
	}


