package turtle;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleTest {

	private Turtle myTurtle;
	private SketchPad sketchPad;
	private Logger logger = Logger.getLogger(TurtleTest.class.getName());
	
	@BeforeEach
	void setUp() throws Exception {
		myTurtle = new Turtle();
		Pen biro = new Pen();
		myTurtle.setTurtlePen(biro);
		
		sketchPad = new SketchPad();
	}

	@Test
	void turtleReadyTest() {
		assertNotNull(myTurtle);
		assertNotNull(myTurtle.getTurtlePen());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getPosition());
		assertEquals(Compass.EAST, myTurtle.getDirection());
	}
	
	@Test
	void penPositionChangeTest() {
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getPosition());
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getPosition());
	}
	
	@Test
	void turtleMoveForwardTest() {
		assertEquals(0, myTurtle.getxCoordinate());
		myTurtle.moveForward(7, sketchPad.getFloor());
		assertEquals(6, myTurtle.getxCoordinate());
	}

	@Test
	void turnRightFromEastTest() {
		assertEquals(Compass.EAST, myTurtle.getDirection());
		myTurtle.turnRight();
		assertEquals(Compass.SOUTH, myTurtle.getDirection());
	}
	
	@Test
	void turnRightFromSouthTest() {
		myTurtle.setDirection(Compass.SOUTH);
		assertEquals(Compass.SOUTH, myTurtle.getDirection());
		myTurtle.turnRight();
		assertEquals(Compass.WEST, myTurtle.getDirection());
	}
	
	@Test
	void turnRightFromWestTest() {
		myTurtle.setDirection(Compass.WEST);
		assertEquals(Compass.WEST, myTurtle.getDirection());
		myTurtle.turnRight();
		assertEquals(Compass.NORTH, myTurtle.getDirection());
	}
	
	@Test
	void turnRightFromNorthTest() {
		myTurtle.setDirection(Compass.NORTH);
		assertEquals(Compass.NORTH, myTurtle.getDirection());
		myTurtle.turnRight();
		assertEquals(Compass.EAST, myTurtle.getDirection());
	}
	
	@Test
	void turnRightWithNoDirectionTest() {
		myTurtle.setDirection(null);
			Assertions.assertThrows(NullPointerException.class, () -> {
			myTurtle.turnRight();;
		});
	}
	
	@Test
	void drawWithEastDirectionTest() {
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		int numberOfSteps = 5;
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(Compass.EAST, myTurtle.getDirection());
		assertEquals(numberOfSteps-1, myTurtle.getxCoordinate());
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < numberOfSteps; j++) {
				assertEquals(1, sketchPad.getFloor()[i][j]);
			}
		}
		
		for(int i = 0; i < 1; i++) {
			for(int j = numberOfSteps; j < sketchPad.getFloor().length; j++) {
				assertEquals(0, sketchPad.getFloor()[i][j]);
			}
		}
	}
	
	@Test
	void drawWithSouthDirectionTest() {
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		myTurtle.setDirection(Compass.SOUTH);
		myTurtle.setxCoordinate(11);
		assertEquals(0, myTurtle.getyCoordinate());
		int numberOfSteps = 12;
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(Compass.SOUTH, myTurtle.getDirection());
		assertEquals(numberOfSteps-1, myTurtle.getyCoordinate());
		
		for(int i = 0; i < numberOfSteps; i++) {
			assertEquals(1, sketchPad.getFloor()[i][myTurtle.getxCoordinate()]);
		}
		
		for(int i = numberOfSteps; i < sketchPad.getFloor().length; i++) {
			for(int j = numberOfSteps; j < 1; j++) {
				assertEquals(0, sketchPad.getFloor()[i][myTurtle.getxCoordinate()]);
			}
		}
	}
	
	@Test
	void drawWithWestDirectionTest() {
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		myTurtle.setxCoordinate(11);
		int numberOfSteps = 12;
		myTurtle.setDirection(Compass.WEST);
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(Compass.WEST, myTurtle.getDirection());
		assertEquals(0, myTurtle.getxCoordinate());
		
		for(int i = 0; i < 1; i++) {
			for(int j = myTurtle.getxCoordinate(); j >= 0; j--) {
				assertEquals(1, sketchPad.getFloor()[i][j]);
			}
		}
	}
	
	@Test
	void drawWithNorthDirectionTest() {
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		myTurtle.setDirection(Compass.NORTH);
		myTurtle.setyCoordinate(11);
		assertEquals(0, myTurtle.getxCoordinate());
		int numberOfSteps = 12;
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(Compass.NORTH, myTurtle.getDirection());
		assertEquals(0, myTurtle.getyCoordinate());
		
		for(int i = numberOfSteps-1; i >= 0; i--) {
			assertEquals(1, sketchPad.getFloor()[i][myTurtle.getxCoordinate()]);
		}
	}
	
	@Test
	void drawSquareTest() {
		myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
		int numberOfSteps = 12;
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(Compass.EAST, myTurtle.getDirection());
		assertEquals(numberOfSteps-1, myTurtle.getxCoordinate());
		assertEquals(BigDecimal.ZERO.intValue(), myTurtle.getyCoordinate());
		
		myTurtle.turnRight();
		assertEquals(Compass.SOUTH, myTurtle.getDirection());
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(numberOfSteps-1, myTurtle.getxCoordinate());
		assertEquals(numberOfSteps-1, myTurtle.getyCoordinate());
		
		myTurtle.turnRight();
		assertEquals(Compass.WEST, myTurtle.getDirection());
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(0, myTurtle.getxCoordinate());
		assertEquals(numberOfSteps-1, myTurtle.getyCoordinate());
		
		myTurtle.turnRight();
		assertEquals(Compass.NORTH, myTurtle.getDirection());
		myTurtle.moveForward(numberOfSteps, sketchPad.getFloor());
		assertEquals(0, myTurtle.getxCoordinate());
		assertEquals(0, myTurtle.getyCoordinate());
		
		for(int i = 0; i < sketchPad.getFloor().length; i++) {
			for(int j = 0; j < sketchPad.getFloor().length; j++) {
				int value = sketchPad.getFloor()[i][j];
				if(value == BigDecimal.ONE.intValue()) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
