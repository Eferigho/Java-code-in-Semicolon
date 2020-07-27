package turtle;

import java.math.BigDecimal;

public class Turtle {
	private Pen turtlePen;
	private int xCoordinate;
	private int yCoordinate;
	private Compass direction = Compass.EAST;
	
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public Pen getTurtlePen() {
		return turtlePen;
	}
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}
	
	public Compass getDirection() {
		return direction;
	}
	public void setDirection(Compass direction) {
		this.direction = direction;
	}
	public void moveForward(int numberOfSteps, int[][] canvas) {
		
		if(this.getDirection() == Compass.EAST) {
			for(int i = yCoordinate; i < BigDecimal.ONE.intValue(); i++) {
				for(int j = xCoordinate; j < numberOfSteps; j++) {
					canvas[i][j] = BigDecimal.ONE.intValue();
				}
			}
			this.xCoordinate += numberOfSteps-1;
		}else if(this.getDirection() == Compass.SOUTH) {
			for(int i = yCoordinate; i < numberOfSteps; i++) {
				canvas[i][xCoordinate] = BigDecimal.ONE.intValue();
			}
			this.yCoordinate += numberOfSteps-1;
		}else if(this.getDirection() == Compass.WEST) {
			for(int i = yCoordinate; i <= yCoordinate; i++) {
				for(int j = xCoordinate; j >= BigDecimal.ZERO.intValue(); j--) {
					canvas[i][j] = BigDecimal.ONE.intValue();
				}
			}
			this.xCoordinate -= numberOfSteps-1;
		}else if(this.getDirection() == Compass.NORTH) {
			for(int i = yCoordinate; i >= BigDecimal.ZERO.intValue(); i--) {
				canvas[i][xCoordinate] = BigDecimal.ONE.intValue();
			}
			this.yCoordinate -= numberOfSteps-1;
		}
		
	}
	
	public void turnRight() {
		if(this.getDirection() == null) {
			throw new NullPointerException("Turtle compass is currently null");
		}
		if(this.getDirection() == Compass.EAST) {
			this.setDirection(Compass.SOUTH);
		}else if(this.getDirection() == Compass.SOUTH) {
			this.setDirection(Compass.WEST);
		}else if(this.getDirection() == Compass.WEST) {
			this.setDirection(Compass.NORTH);
		}else if(this.getDirection() == Compass.NORTH){
			this.setDirection(Compass.EAST);
		}
	}
}
