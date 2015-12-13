import java.io.IOException;
import javax.swing.JOptionPane;

public class Robot {

	public static void main(String[] args) {
		boolean qq = true;
		while (qq) {
			speak("Hello!  Do you require assistance?");
			String a = JOptionPane.showInputDialog("");
			while (!a.equalsIgnoreCase("no") && !a.equals("yes")) {
				speak("Please say your answer so that I can comprehend!");
				a = JOptionPane.showInputDialog("");
			}
			if (a.equalsIgnoreCase("yes")) {
				qq = false;
				speak("What subject?  Math, Science, History, or English?");
			} else if (a.equalsIgnoreCase("no")) {
				speak("OK!  Bye!");
				qq = false;
			}
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}