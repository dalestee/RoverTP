package robot;

public class Main {
	public static void main(String[] args) {
		Rover viper = new Rover();
		System.out.println("viper is actualy : ");
		System.out.println(viper.getDirection());
		System.out.println(viper.getPosition());
		System.out.println("---------------------------------");
		
		Rover python = new Rover(Direction.EAST, new Position(5,10));
		System.out.println("python is actualy : ");
		System.out.println(python.getDirection());
		System.out.println(python.getPosition());
		System.out.println("---------------------------------");
		
		Rover anaconda = new Rover(Direction.SOUTH,20,30);
		System.out.println("anaconda is actualy : ");
		System.out.println(anaconda.getDirection());
		System.out.println(anaconda.getPosition());
		System.out.println("---------------------------------");
		
		System.out.println("---------------------------------");
		System.out.println("Test cases about turn left");
		System.out.println("---------------------------------");
		
		System.out.println(viper.getDirection()+" "+viper.getPosition());
		viper.move();
		for (int i=0;i<4;i++) {
			System.out.println(viper.getDirection()+" "+viper.getPosition());
			viper.turnLeft();
			viper.move();
		}
		System.out.println(viper.getDirection()+" "+viper.getPosition());
		
		System.out.println("---------------------------------");
		System.out.println("Test cases about turn right");
		System.out.println("---------------------------------");
		
		System.out.println(viper.getDirection()+" "+viper.getPosition());
		viper.move();
		for (int i=0;i<4;i++) {
			System.out.println(viper.getDirection()+" "+viper.getPosition());
			viper.turnRight();
			viper.move();
		}
		System.out.println(viper.getDirection()+" "+viper.getPosition());
		
	}
}
