/*
需求：练习+-* /%几种操作
+ 连字符，会转型。 System.out.println("5+5="(5+5));
/ 整数除会保存整数部分。计算结果转型。
++ i++与++i不同

3.9默认为双精度型。float num1 = 3.9f;

*/
class OperateDemo{
	public static void main(String[] s){
			int i;
			i = 1;
			i = i+3;
			System.out.println("1"+i+3);
			i = i-30;
			System.out.println("i-30="+i);
			i = -5;
			i = i * 2;
			System.out.println("i * 2="+i);
			i = 5;
			i = i/2;
			System.out.println("i/2="+i);
			i = 5;
			i = i%3;
			System.out.println("i%3="+i);
			i=5;
			System.out.println(++i);
			System.out.println(i++);
			
			float num1=3.9f,num2 = 1.3f,res;
			res = num1/num2;
			System.out.println("num1/num2="+res);
			
		  
	}
}