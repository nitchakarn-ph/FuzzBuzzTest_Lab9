import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();
	String output = fizzBuzz.getBuzz(1);
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@DisplayName("Actual1")
	@Test
	void ShouldBe1_Input1() {// expected =1
		assertEquals(1, output);
	}
	
	@DisplayName("Actual2")
	@Test
	void ShouldBe2_Input2() {//��ͧ���º��º �� expected =2
		assertEquals(2, output);
	}
	

}
