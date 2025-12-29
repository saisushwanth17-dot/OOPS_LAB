public class Operations2
{
public static void main(String[] args)
{
int Num1=55, Num2=56, Num3=62,Num4=6;
boolean Num5=true;
int Num;
//ARITHMETIC OPERATOR
Num=(Num1*Num2)-Num3%2;
System.out.println(Num);
//UNARY OPERATOR
System.out.println(Num1--);
//RELATIONAL OPERATOR
System.out.println(Num3!=Num1+Num2);
System.out.println(Num2>Num1);
//LOGICAL OPERATOR
System.out.println((Num2<Num3)||(Num1>Num3));
System.out.println(!Num5);
}
}