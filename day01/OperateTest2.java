class OperateTest2 
{
	/*
	(1<<3) = 8
	(2<<3) = 16
	0011 1101 原数据
	1101 0011 完成后  
	l:1101
	h:11 0000  
	
	对一个字节，完成高四位与低四位互换。
	>>>无符号右移
	*/
	public static void main(String[] args) 
	{
		int num = 61;
		int l = num&15;
		int h = num&(15<<4);
		
		num = l<<4|h>>4;    
		System.out.println(l);
		System.out.println(h);
		System.out.println(num);
	}
}