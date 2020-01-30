package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class robot {
	static Robot Jojo = new Robot("batman");
public static void main(String[] args) {
	Jojo.setSpeed(1000);
	drawSquare();
	

	
}
public static void drawSquare() {
	Jojo.penDown();
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
}

}
