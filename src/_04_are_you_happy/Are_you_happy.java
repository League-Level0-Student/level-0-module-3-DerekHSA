package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	String Answer1=JOptionPane.showInputDialog("Are you happy?");
	if(Answer1.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
	}else if(Answer1.equalsIgnoreCase("No")) {
		String Answer2=JOptionPane.showInputDialog("Do you want to be happy?");
	if(Answer2.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
	}else if(Answer2.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
