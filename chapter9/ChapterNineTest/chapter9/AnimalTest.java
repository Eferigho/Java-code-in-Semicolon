package chapter9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Bird pepeye = new Bird();
		pepeye.setName("Philemon");
		pepeye.setWeight(3);
		pepeye.setColor(Color.BLACK);
		pepeye.setLeftWing(Wing.LEFT_SMALL_WING);
		pepeye.setRightWing(Wing.RIGHT_SMALL_WING);
		
		assertNotEquals("Homosapiens",pepeye.getName());
	}

	@Test
	void polymorphismTest() {
		Animal eyele = new Pigeon();
		Bird anotherPigeon = new Pigeon();
		Pigeon myPigeon = new Pigeon();
		
		Animal bingo = new Dog();
	}
}
