package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot robs[] = new Robot[10];
//		Robot ro = new Robot();
//		for (int i = 0; i < 36; i++) {
//			ro.miniaturize();
//			ro.setSpeed(30);
//			ro.penDown();
//			ro.move(30);
//			ro.turn(10);
//		}
//		for (int i = 1; i < 36; i++){
//			robs[0] = new Robot();
//			robs[0].move(10);
//			robs[0].turn(10);
//		}
		// 3. use a for loop to initialize the robots.
		Random ra = new Random();
		int s = ra.nextInt(20);
;		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();
			robs[i].setY(520);
			robs[i].miniaturize();
			robs[i].setSpeed(45);
			
		}
		
		

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		robs[0].setX(100);
		robs[1].setX(150);
		robs[2].setX(200);
		robs[3].setX(250);
		robs[4].setX(300);
		robs[5].setX(350);
		robs[6].setX(400);
		robs[7].setX(450);
		robs[8].setX(500);
		robs[9].setX(550);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
//		Random r = new Random();
//		for (int i = 0; i < robs.length; i++) {
//			int value = r.nextInt(50);
//			robs[i].move(value);
//		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
//		boolean finishLine = false;
//		while (finishLine == false) {
//			for (int i = 0; i < robs.length; i++) {
//				if (!finishLine) {
//					int value = r.nextInt(30);
//					robs[i].move(value);
//					if (robs[i].getY() <= 0) {
//						finishLine = true;
//					}
//				}
//			}
//
//		}
		Random r = new Random();
		boolean finishLine = false;
		while (finishLine == false) {
			for (int i = 0; i < robs.length; i++) {
				if (!finishLine) {
					int value = r.nextInt(30);
						robs[i].move(value);
						robs[i].turn(10);
					if (robs[i].getY() == 510 && robs[i].getX() <= 550 && robs[i].getX() >= 100) {
						finishLine = true;
					}
				}
			}

		}
		// 7. declare that robot the winner and throw it a party!
		Robot winner = new Robot();
		for (int i = 0; i < robs.length; i++) {
			if (robs[i].getY() == 510) {
				JOptionPane.showMessageDialog(null, "Winner!");
				robs[i] = winner;
				winner.setSpeed(50);
				winner.sparkle();
				winner.turn(360);
				
			}
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		
	}
}
