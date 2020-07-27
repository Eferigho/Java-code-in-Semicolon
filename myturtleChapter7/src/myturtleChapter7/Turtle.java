package myturtleChapter7;

public class Turtle {
	
	private Pen turtlePen;
	private Direction turtleDirection;

	public Pen getTurtlePen() {
		return turtlePen;
	}

	public void setTurtlePenUp() {
		if(turtlePen == Pen.DOWN) {
			this.turtlePen = Pen.UP;
		}
		
	}
	public void setTurtlePenDown() {
		if(turtlePen == Pen.UP) {
			this.turtlePen = Pen.DOWN;
		}
	}

	public Direction getTurtleDirection() {
		return turtleDirection;
	}
	public void setTurtleDirectionToEast() {
		if(turtleDirection == null) {
			turtleDirection = Direction.EAST;
		}
		
	}
	public void setTurtleDirectionToSouth() {
		if(turtleDirection == Direction.EAST) {
			turtleDirection = Direction.SOUTH;	
	    }
	}
	public void setTurtleDirectionToWest() {
		if(turtleDirection == Direction.SOUTH) {
			turtleDirection = Direction.WEST;
		}
	}
	public void setTurtleDirectionToNorth() {
		if(turtleDirection == Direction.WEST) {
			turtleDirection = Direction.NORTH;
		}
	}
	public void setTurtleDirectionToNEast() {
		if(turtleDirection == Direction.NORTH) {
			turtleDirection = Direction.EAST;
		}
	}
}
