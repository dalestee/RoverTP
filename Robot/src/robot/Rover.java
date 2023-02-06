package robot;

public class Rover {
	private Direction direction;
	private Position position;
	
	public Rover() {
		this.direction = Direction.NORTH;
		this.position = new Position(0,0);
	}
	
	public Rover(Direction direction, int i, int j) {
		this.direction = direction;
		this.position = new Position(i,j);
	}
	
	public Rover(Direction direction, Position position) {
		this.direction = direction;
		this.position = position;
	}
	
	public void move() {
		switch (this.getDirection()) {
		case NORTH:
			this.position.setY(this.position.getY()+1);
			break;
		case SOUTH:
			this.position.setY(this.position.getY()-1);
			break;
		case EAST:
			this.position.setX(this.position.getX()+1);
			break;
		case WEST:
			this.position.setX(this.position.getX()-1);
			break;
		default:
			System.out.println("input error");
			break;
			}
	}
	
	public void turnRight() {
		switch (this.getDirection()) {
		case NORTH:
			this.direction = Direction.EAST;
			break;
		case SOUTH:
			this.direction = Direction.WEST;
			break;
		case EAST:
			this.direction = Direction.SOUTH;
			break;
		case WEST:
			this.direction = Direction.NORTH;
			break;
		default:
			System.out.println("input error");
			break;
		}
	}
	
	public void turnLeft() {
		switch (this.getDirection()) {
		case NORTH:
			this.direction = Direction.WEST;
			break;
		case SOUTH:
			this.direction = Direction.EAST;
			break;
		case EAST:
			this.direction = Direction.NORTH;
			break;
		case WEST:
			this.direction = Direction.SOUTH;
			break;
		default:
			System.out.println("input error");
			break;
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}
