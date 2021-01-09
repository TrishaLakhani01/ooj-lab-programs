import Pack1.*;
import Pack2.*;
import java.util.Scanner;
class test2_3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
Pack1.Sum_Difference obj1=new Pack1.Sum_Difference();
Pack2.mul_div obj2=new Pack2.mul_div();
obj1.sum(a,b);
obj1.diff(a,b);
obj2.multiplication(a,b);
obj2.division(a,b);
}
}