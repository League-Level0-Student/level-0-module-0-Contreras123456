import java.awt.AWTException;
import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[]args) throws AWTException {
		
	Robot apple =new Robot();
apple.setSpeed(5);
apple.penDown();
apple.move(210);
apple.turn(180);
apple.move(105);
apple.turn(270);
apple.move(180);
apple.turn(270);
apple.move(105);
apple.turn(180);
apple.move(210);

		
	
	}
	
}
