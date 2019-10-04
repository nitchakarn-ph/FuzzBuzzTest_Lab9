
public class FizzBuzz {
	private String Text;
	private int Num;
	public String getBuzz() { // ถ้า หาร 5 ลงตัวได้(%5==0) Buzz
		return "Buzz";
	}
	
	public String getFizz() { // ถ้า หาร 3 ลงตัวได้(%3==0) Buzz
		return "Fizz";
	}
	
	public String getFizzBuzz() { // ถ้า หาร 5 และ 3ลงตัวได้(%5==0 && %3==0) FizzBuzz
		return "FizzBuzz";
	}
	
	public String getText() {
		return Text;
	}

	public int getNum() {
		return Num;
	}
	public void FizzBuzzTesting(int input) {
		if(input%5==0 && input%3==0) 
		{
			Text=getFizzBuzz();
		}else if (input%5==0) 
		{
			Text=getBuzz();
		}else if (input%3==0) 
		{
			Text=getFizz();
		}else{
			Num=input;
		}
	}
}
