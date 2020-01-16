//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Jojo = new Robot();
		Jojo.setSpeed(100);
		Jojo.setPenWidth(10);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 100; i++) {
			
		
		String Color =JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
if (Color.equalsIgnoreCase("blue")) {
	Jojo.setPenColor(0, 0, 100);
}else if (Color.equalsIgnoreCase("red")){
	Jojo.setPenColor(255, 0 ,0);
}else if (Color.equalsIgnoreCase("Yellow")){
	Jojo.setPenColor(255, 255 ,0);
}else if (Color.equalsIgnoreCase("green")){
	Jojo.setPenColor(0, 255 ,0);
}else if (Color.equalsIgnoreCase("purple")){
	Jojo.setPenColor(148, 0 ,211);
}else if (Color.equalsIgnoreCase("orange")){
	Jojo.setPenColor(255, 165 ,0);
}else if (Color.equalsIgnoreCase("white")){
	Jojo.setPenColor(255, 255 ,255);
}else if (Color.equalsIgnoreCase("black")){
	Jojo.setPenColor(0, 0 ,0);
}else if (Color.equalsIgnoreCase("Jojo")){
	Jojo.setPenColor(148,0,211);
	Jojo.turn(-90);	
	Jojo.move(100);
	Jojo.turn(180);
	Jojo.penDown();
	for (int j = 0; j < 90; j++) {
		Jojo.move(1);
		Jojo.turn(-1);
		
	}
	Jojo.move(100);
	Jojo.turn(-90);
	Jojo.move(45);
	Jojo.turn(180);
	Jojo.move(90);
	Jojo.penUp();
	Jojo.move(90);
	Jojo.turn(90);
	Jojo.move(155);
	Jojo.turn(-90);
	Jojo.penDown();
	for (int j = 0; j < 360; j++) {
		Jojo.move(1);
		Jojo.turn(-1);
	}
	Jojo.penUp();
	Jojo.move(90);
	Jojo.penDown();
	for (int j = 0; j < 90; j++) {
		Jojo.move(1);
		Jojo.turn(-1);
	}
	Jojo.move(55);
	Jojo.penUp();
	Jojo.move(30);
	Jojo.penDown();
	Jojo.move(5);
	Jojo.penUp();
	Jojo.turn(90);
	Jojo.move(135);
	Jojo.turn(90);
	Jojo.move(155);
	Jojo.turn(-90);
	Jojo.penDown();
	for (int j = 0; j < 360; j++) {
		Jojo.move(1);
		Jojo.turn(-1);
	}
	Jojo.penUp();
	Jojo.move(1000);
}else if (Color.equalsIgnoreCase("silver")){
	Jojo.setPenColor(127, 127 ,127);
}else if (Color.equalsIgnoreCase("black")){
	Jojo.setPenColor(0, 0 ,0);
}
        //6. If the user doesn’t enter anything, choose a random color
if (Color.equals("")){
	Jojo.setPenColor(148,0,211);
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	   //2. Make the robot draw a shape (this will take more than one line of code)
		if ((!Color.isEmpty())) {
Jojo.penDown();
Jojo.move(250);
Jojo.turn(90);
Jojo.move(250);
Jojo.turn(90);
Jojo.move(250);
Jojo.turn(90);
Jojo.move(250);
Jojo.penUp();
Jojo.move(250);
Jojo.turn(90);
Jojo.move(125);
Jojo.turn(90);
	}else{
Jojo.turn(-90);	
Jojo.move(100);
Jojo.turn(180);
Jojo.penDown();
for (int j = 0; j < 90; j++) {
	Jojo.move(1);
	Jojo.turn(-1);
	
}
Jojo.move(100);
Jojo.turn(-90);
Jojo.move(45);
Jojo.turn(180);
Jojo.move(90);
Jojo.penUp();
Jojo.move(90);
Jojo.turn(90);
Jojo.move(155);
Jojo.turn(-90);
Jojo.penDown();
for (int j = 0; j < 360; j++) {
	Jojo.move(1);
	Jojo.turn(-1);
}
Jojo.penUp();
Jojo.move(90);
Jojo.penDown();
for (int j = 0; j < 90; j++) {
	Jojo.move(1);
	Jojo.turn(-1);
}
Jojo.move(55);
Jojo.penUp();
Jojo.move(30);
Jojo.penDown();
Jojo.move(5);
Jojo.penUp();
Jojo.turn(90);
Jojo.move(135);
Jojo.turn(90);
Jojo.move(155);
Jojo.turn(-90);
Jojo.penDown();
for (int j = 0; j < 360; j++) {
	Jojo.move(1);
	Jojo.turn(-1);
}
Jojo.penUp();
Jojo.move(1000);
	}
	}
}}
