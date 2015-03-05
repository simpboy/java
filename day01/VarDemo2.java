/*
数据类型
byte
short
int
long  L可以大写也可以小写。只有long需要转型。
float
double
boolean
char

short a=1,d=3,s;
s = a+d; 会损失精度，需要int接收
*/
class VarDemo2{
	public static void main(String[] args){
			byte b = 3;
			b = (byte)(b + 200);//强制类型转换。
			
			System.out.println(Integer.MAX_VALUE+1);
			System.out.println(Integer.MAX_VALUE);
	}
}