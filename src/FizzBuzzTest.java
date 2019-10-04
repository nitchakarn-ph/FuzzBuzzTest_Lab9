import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	
	@BeforeEach
	void setUp() throws Exception {
		fizzBuzz = new FizzBuzz(); //ทำการ reset ค่าก่อนเข้า แต่ละ test
	}
	
	@DisplayName("Actual1")
	@Test
	void ShouldBe1_Input1() {// expected =1
		fizzBuzz.FizzBuzzTesting(1);
		assertEquals(1,fizzBuzz.getNum());
	}
	
	@DisplayName("Actual2")
	@Test
	void ShouldBe2_Input2() {//ต้องเปรียบเทียบ เป็น expected =2
		fizzBuzz.FizzBuzzTesting(2);
		assertEquals(2,fizzBuzz.getNum());
	}
	

}
