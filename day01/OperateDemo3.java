class  OperateDemo3
{
	/*
	&,|,!,^能对boolean运算，但是if只能判断boolean
	*/
	public static void main(String[] args) 
	{
		int x=1,y=2;
		if((boolean)(x&y)){
			System.out.println("x&y");
		}
	
	/*	
		int x=1,y=2;
		if(x&&y){
			System.out.println("x&y");
		}
	*/
	}
}
