class OperateTest 
{
	/*
	(1<<3) = 8
	(2<<3) = 16
	*/
	public static void main(String[] args) 
	{
			System.out.println(1<<3);
			
			int a=3,b=5;
			
			/*
			int temp;
			temp = a;
			a = b;
			b = temp;
			*/
			/*
			a = a+b;
			b = a-b;
			a = a-b;
			*/
			a = a^b;
			b = a^b;
			a = a^b;
			
			
			System.out.println("a="+a+"b="+b);
			
			
	}
}