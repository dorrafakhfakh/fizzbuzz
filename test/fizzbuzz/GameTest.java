package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {
	Game game;
	
	@BeforeEach
	void setUp() {
		game= new Game();
	}
	
	@Test
	void firstRoundTest() {
        assertEquals("1", game.next());
    }
}
