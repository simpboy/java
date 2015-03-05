class LineHalf 
{
	/*
	
	*/
	public static void main(String[] args) 
	{
		int line = 3000;
		int day = 0;
		/*
		while(line>5){
			day++;
			line /= 2;
		}
		System.out.println("line="+line+"day="+day);
		*/
		for(;line>5;){
			day++;
			line /=2;
		}
		System.out.println("line="+line+"day="+day);
	}
}