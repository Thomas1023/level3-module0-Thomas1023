package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot robs[] = new Robot[100];
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.
for (int i=0; i<robs.length;i++) {
	robs[i] = new Robot("formersecretaryofstatecondoleezzarice");
}
			//4. make each robot start at the bottom of the screen, side by side, facing up
for (int i=0; i<robs.length;i++) {
	robs[i].setY(500);
	robs[i].setX(i*100+50);
	robs[i].setSpeed(10);
}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.


for (int i=0; i<robs.length;i++) {
	
		Random rand = new Random();
		
		robs[i].move(rand.nextInt(50));
		
}



		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
int r=0;
boolean done=true;
while(done){
for (int i=0; i<robs.length;i++) {
	
		Random rand = new Random();
		if(robs[i].getY()<0) {
		robs[i].move(rand.nextInt(50));
		}else if(robs[i].getY()>=0) {
			done=true;
			while(true) {
			for (int j=0; j<robs.length;j++) {
				robs[j].setAngle(rand.nextInt(360));
				robs[j].setY(rand.nextInt(800));
				robs[j].setX(rand.nextInt(800));
			}
			}
		}
}

}


	}
}
