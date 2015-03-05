/*
do while 使用
*/
class ForTest{
	public static void main(String[] args){
		//For累加
		int sum = 0;
		for(int i=0; i<=10 ;i++){
			sum += i;
		}
		System.out.println(sum);
		
		//While,For,Do...while...打印1~10
		int i = 1;
		while(i<=10){
			System.out.println("i="+i);
			i++;
		}
		
		
		i=1;
		do{
			System.out.println("i="+i);
			i++;
		}while(i<=10);
		
		
		i=1;
		for(;i<=10;i++){
			System.out.println("i="+i);
		}
		
	}
}
