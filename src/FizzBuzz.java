
public class FizzBuzz {
	
	private String Text;
	private int Num;
	public String getBuzz() { // moduluswith5(%5==0) Buzz
	return "Buzz";
	}

	public String getFizz() { // moduluswith3(%3==0) Buzz
	return "Fizz";
	}

	public String getFizzBuzz() { // moduluswith5 and moduluswith3(%5==0 && %3==0)FizzBuzz
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
