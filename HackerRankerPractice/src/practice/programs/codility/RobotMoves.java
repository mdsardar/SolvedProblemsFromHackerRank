package practice.programs.codility;

import java.util.Scanner;


/*
 * Create the class Robot. Do not use the public access modifier in your class declaration.
 */
 
 class Robot {
     int currentX, currentY, previousX, previousY;
     char lastMoveFlag = 'x';
     
     Robot(){
         this.currentX = 0;
         this.currentY = 5;  
     }
     Robot(int x, int y){
         this.currentX = x;
         this.currentY = y;         
     }
     
     void moveX(int dx){
         previousX = currentX;
         currentX = currentX + dx; 
         lastMoveFlag = 'x' ;  
     }
     
     void moveY(int dy){
         previousY = currentY;
         currentY = currentY + dy;  
         lastMoveFlag = 'y' ; 
     }
     
     void printCurrentCoordinates()
     {
         System.out.println(currentX + " " + currentY);
     }
     
     void printLastCoordinates()
     {
         System.out.println(previousX + " " + previousY);
     }
     
     void printLastMove(){
         if(lastMoveFlag == 'x')
         System.out.println("x" + " " + (currentX-previousX));
         else
         System.out.println("x" + " " + (currentY-previousY));
     }
 }

public class RobotMoves {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		int dx = scan.nextInt();
		int dy = scan.nextInt();
		
		Robot firstRobot = new Robot();
	    firstRobot.printCurrentCoordinates();
	    
	    Robot secondRobot = new Robot(x, y);
	    secondRobot.printCurrentCoordinates();
	    
	    for (int i = 1; i < 3; i++) {
	        secondRobot.moveX(dx);
	        secondRobot.printLastMove();
	        secondRobot.printCurrentCoordinates();
	        secondRobot.moveY(dy);
	        secondRobot.printLastCoordinates();

	        dx += i * i;
	        dy -= i * i;
	    }		
	}
}
