package _05_horoscope;

import javax.swing.JOptionPane;
//else if(sign.equalsIgnoreCase("")) {JOptionPane.showMessageDialog(null, "");}
public class Horoscope {
public static void main(String[] args) {
	String sign=JOptionPane.showInputDialog("What is your star sign?");
	if(sign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "Today you will be able to see the good in everyone and the positive in every situation, meaning you can find solutions to issues.");
	}else if(sign.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Use your confidence to get you what you want and to where you want to be today, do not play it down.");
	}else if(sign.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "The power of some well placed kind words could save you from others thinking you are arrogant today.");
	}else if(sign.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "When you spend time with friends today, be prepared for things to have changed.");
	}else if(sign.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "Energy in your house today could kick start a change you have been waiting for, but do not be impatient.");
	}else if(sign.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "Engage your brain before you speak today if you want to avoid saying something you regret later.");
	}else if(sign.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Use your confidence today to move forward with plans in your work life and finances, you have motivation.");
	}else if(sign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Do not apologise for who you are and what you have done if someone is jealous of you today.");
	}else if(sign.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Today the focus is on your health where an issue is tied to your emotions and you need to heal both areas.");
	}else if(sign.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You will feel that some who you thought were on your side arent, but how much of this is true and how much paranoia?");
	}else if(sign.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Something will need all your focus today and you can't do it alone, so gather others around and work as a team.");
	}else if(sign.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "Communication is foggy today and you will feel like you do not understand what people are trying to say to you.");
	}else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
}
}
