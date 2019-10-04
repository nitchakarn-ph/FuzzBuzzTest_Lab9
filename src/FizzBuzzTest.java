import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();
	String output = fizzBuzz.getBuzz(1);
	
	@Test
	void test_when_input_1() {
		assertEquals("Buzz", output);
	}
	
	

}
