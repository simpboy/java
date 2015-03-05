/*
do while 使用
*/
class DoWhileDemo{
	public static void main(String[] args){
		/*
			无论如何都执行一次。
		*/
		int i = 0;
		do{
			i++;
			System.out.println(i);
		}while(i<10);
		System.out.println(i);
		/*
			条件满足才会执行。
		*/
		i=0;
		while(i<10){
			i++;
			System.out.println(i);
		}
		System.out.println(i);
		
	}
}