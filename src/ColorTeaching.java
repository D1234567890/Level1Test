import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class ColorTeaching implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button0;
	JButton button1;
	JButton button2;

	public static void main(String[] args) {
		ColorTeaching colors = new ColorTeaching();
	}

	ColorTeaching() {
		frame = new JFrame("Computer Color Teacher");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		button = new JButton("?");
		button0 = new JButton("?");
		button1 = new JButton("?");
		button2 = new JButton("?");
		panel.add(button);
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		button.setBackground(Color.red);
		button.setOpaque(true);
		button0.setBackground(Color.green);
		button0.setOpaque(true);
		button1.setBackground(Color.yellow);
		button1.setOpaque(true);
		button2.setBackground(Color.blue);
		button2.setOpaque(true);
		button.addActionListener(this);
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setSize(500, 75);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			speak("red");
		}
		if (e.getSource() == button0) {
			speak("green");
		}
		if (e.getSource() == button1) {
			speak("yellow");
		}
		if (e.getSource() == button2) {
			speak("blue");
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
