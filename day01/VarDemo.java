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
class VarDemo{
	public static void main(String[] args){
		 byte b = 3;
		 short s = 300;
		 int i = 3;
		 long l = 3L;
		 long l2 = 3l;
		 float f = (float)3.1;
		 double d = 3.1;
		 boolean bl = true;
		 char c = 97;
		 short a=1,e=3;
		 int x=1,y=2;
		 i = x+y;
		 
		 
		 int iNum = 1;
		 byte bNum = 2;
		 iNum = iNum+bNum;
		 System.out.println("int+byt="+iNum);
		 
		 
		 	{
				int z = 9;
				System.out.println(z);
		  }
		  
		  //System.out.println(z); //代码块中的变量为局部变量
		  for(int count = 0; count<10; count++){
		  	int subInt = 0;   //count与subInt 都是局部变量
		  }
		  //System.out.println(count);
	}
}