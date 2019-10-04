import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	
	@BeforeEach
	void setUp() throws Exception {
		
		fizzBuzz = new FizzBuzz(); // Reset Value Before enter each Test
	}
	
	@DisplayName("Actual1")
	@Test
	void ShouldBe1_Input1() {// expected =1
		fizzBuzz.FizzBuzzTesting(1);
		assertEquals(1,fizzBuzz.getNum());
	}
	
	@DisplayName("Actual2")
	@Test
	void ShouldBe2_Input2() {//��ͧ���º��º �� expected =2
		fizzBuzz.FizzBuzzTesting(2);
		assertEquals(2,fizzBuzz.getNum());
	}
	
	@DisplayName("Actual3")
	@Test
	void ShouldBeFizz_InputFizz() {
		fizzBuzz.FizzBuzzTesting(3);;
		assertEquals("Fizz", fizzBuzz.getText());
	}
	
	@DisplayName("Actual4")
	@Test
	void ShouldBe4_Input4() {
		fizzBuzz.FizzBuzzTesting(4);
		assertEquals(4, fizzBuzz.getNum());
	}
	
	@DisplayName("Actual5")
	@Test
	void ShouldBeBuzz_InputBuzz() {
		fizzBuzz.FizzBuzzTesting(5);;
		assertEquals("Buzz", fizzBuzz.getText());
	}
	
	@DisplayName("Actual6")
	@Test
	void ShouldBeFizz_Input6() {
		fizzBuzz.FizzBuzzTesting(6);;
		assertEquals("Fizz", fizzBuzz.getText());
	}
	
	@DisplayName("Actual7")
	@Test
	void ShouldBeFizz_Input7() {
		fizzBuzz.FizzBuzzTesting(7);;
		assertEquals(7, fizzBuzz.getNum());
	}
}
