/*
do while ʹ��
*/
class ForTest{
	public static void main(String[] args){
		//For�ۼ�
		int sum = 0;
		for(int i=0; i<=10 ;i++){
			sum += i;
		}
		System.out.println(sum);
		
		//While,For,Do...while...��ӡ1~10
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
