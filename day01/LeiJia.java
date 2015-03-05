class LeiJia 
{
	/*
	
	*/
	public static void main(String[] args) 
	{
		/*
		需求：求1~100中6的倍数的和。并将各个数打印出来。
		
		思路：需要取得1-100中的数，如果%6==0则累加。需要一个累加器。
		
				需要一个变量，不停的加一，遍历1~100之间的数
		步骤：
			定义一个累加器，一个循环初始变量；
			遍历1~100之间的数。
			如果%6==0加入累加器中。打印出来。
		*/
		
		int i=0,sum=0;
		for(i=0;i<100;i++){
			if(i%6==0){
				sum += i;
				System.out.println("i="+i);
			}
		}
		System.out.println(sum);
	}
}