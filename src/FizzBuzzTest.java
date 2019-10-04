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
	
	@DisplayName("INPUT1")
	@Test
	void ShouldBe1_Input1() {// expected =1
		fizzBuzz.FizzBuzzTesting(1);
		assertEquals(1,fizzBuzz.getNum());
	}
	
	@DisplayName("INPUT2")
	@Test
	void ShouldBe2_Input2() {//��ͧ���º��º �� expected =2
		fizzBuzz.FizzBuzzTesting(2);
		assertEquals(2,fizzBuzz.getNum());
	}
	
	@DisplayName("INPUT3")
	@Test
	void ShouldBeFizz_Input3() {
		fizzBuzz.FizzBuzzTesting(3);;
		assertEquals("Fizz", fizzBuzz.getText());
	}
	
	@DisplayName("INPUT4")
	@Test
	void ShouldBe4_Input4() {
		fizzBuzz.FizzBuzzTesting(4);
		assertEquals(4, fizzBuzz.getNum());
	}
	
	@DisplayName("INPUT5")
	@Test
	void ShouldBeBuzz_Input5() {
		fizzBuzz.FizzBuzzTesting(5);;
		assertEquals("Buzz", fizzBuzz.getText());
	}
	
	@DisplayName("INPUT6")
	@Test
	void ShouldBeFizz_Input6() {
		fizzBuzz.FizzBuzzTesting(6);;
		assertEquals("Fizz", fizzBuzz.getText());
	}
	
	@DisplayName("INPUT7")
	@Test
	void ShouldBe7_Input7() {
		fizzBuzz.FizzBuzzTesting(7);;
		assertEquals(7, fizzBuzz.getNum());
	}
	
	@DisplayName("INPUT8")
	@Test
	void ShouldBe8_Input8() {
		fizzBuzz.FizzBuzzTesting(8);;
		assertEquals(8, fizzBuzz.getNum());
	}
	
	@DisplayName("INPUT9")
	@Test
	void ShouldBeFizz_Input9() {
		fizzBuzz.FizzBuzzTesting(9);;
		assertEquals("Fizz", fizzBuzz.getText());
	}
	
	@DisplayName("INPUT10")
	@Test
	void ShouldBeBuzz_Input10() {
		fizzBuzz.FizzBuzzTesting(10);;
		assertEquals("Buzz", fizzBuzz.getText());
	}
}
