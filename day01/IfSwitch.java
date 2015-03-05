class  IfSwitch
{
	/*
	byte ,short,char,int string  Switch(expression) 类型可以是这些类型。
	*/
	public static void main(String[] args) 
	{
		int socker = 10;
		if(socker<0||socker>100){
				System.out.println("Invalid socker!");
				return;
		}
		int compSocker = socker/10;
		switch(compSocker){
			case 10:
			case 9:
				System.out.println("Perfact");
				break;
			case 8:
				System.out.println("Good!");
				break;
			case 7:
			case 6:
				System.out.println("KeYi");
				break;
			default:
				System.out.println("Bad");
			
		}
		
		char haha = 'h';
		switch(haha){
			case 'h':
			case 'H':
					System.out.println("World");
					break;
			default:
					System.out.println("...");
			
		}
	}
}
