package nim_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class testForNimGame {

	@Test
	public void test() {
		int n = 4;
		assertFalse(Solution.canWinNim(n));
	}

}
