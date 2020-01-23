
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot jojo = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
jojo.setX(170);
jojo.setSpeed(100);
jojo.setPenWidth(30);
		// 2. Make the robot draw a star shape. Hint: 144.
jojo.penDown();
jojo.turn(90);
for (int i = 0; i < 5; i++) {
	jojo.move(100);
	jojo.turn(144);
	jojo.move(100);
	jojo.turn(-72);
}
jojo.penUp();
jojo.move(300);
jojo.penDown();
for (int k = 0; k < 5; k++) {
	jojo.move(100);
	jojo.turn(144);
	jojo.move(100);
	jojo.turn(-72);
}
jojo.penUp();
jojo.move(300);
jojo.penDown();
for (int k = 0; k < 5; k++) {
	jojo.move(100);
	jojo.turn(144);
	jojo.move(100);
	jojo.turn(-72);
}
jojo.penUp();
jojo.move(175);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
