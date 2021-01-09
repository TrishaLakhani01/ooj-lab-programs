import java.util.*;

class test2_1 {

	   public static <T1,T2,T3> 
                  void print(T1 value1,T2 value2,T3 value3){
		System.out.println("The value is of data " + value1.getClass().getName() + " value : " + value1);
		System.out.println("The value is of data " + value2.getClass().getName() + " value : " + value2);
		System.out.println("The value is of data " + value3.getClass().getName() + " value : " + value3);
	   }
		public static void main(String[] args){
		  print(2, "Trisha", 4.55);
	}
}