/*

*/
class IfDemo{
	public static void main(String[] args){
		int x = 1;
		if(false)
		{
		
			if(x<1)	
			{
			
				System.out.println("yes");	
				
			}
		}
		System.out.println("over");
		
		
		
		if(x>1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		int z=1,y=7,max;
		max = z>y?z:y;
		System.out.println("Max="+max);
		
		
	}
}
