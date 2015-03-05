/*
需求：练习+-* /%几种操作
+ 连字符，会转型。 System.out.println("5+5="(5+5));
/ 整数除会保存整数部分。计算结果转型。
++ i++与++i不同

3.9默认为双精度型。float num1 = 3.9f;

short s2 = (short)3;  short保存int型数据需要转型。
(short)类型强转需要本身可以兼容才行

*/
class OperateDemo2{
	public static void main(String[] s){
		int i = 0;
		i += 2;
		System.out.println("i+=2,i="+i);
		
		//(short)s = (short)3; //short)类型强转需要本身可以兼容才行
		short s2 = (short)3;
		s = (short)(s+4);
		System.out.println("s="+s);
			
		  
	}
}