public class BooleanPractice {
   
   public static void main(String [] args){
   //Boolean Operator(Evaluates Down to True or False)
   //Equal to?
   System.out.println(6==7);
   //Not Equal to?
   System.out.println(6!=7);
   //Less Than, Add = to make it <=
   System.out.println(6<7);
   //Great Than, Add = to make it >=
   System.out.println(6>7);
   //The Remainder After Division (Num%2 will tell you if it is even if it prints a 1)
   System.out.println(8%2);
   //if and else statements
   int num=47;
   if (num<47) {
      System.out.println("Num is less than 47!");
   }
   else if (num==47) {
      System.out.println("Num is 47!");
   }
   else {
      System.out.println("Num is greater than 47!");
   }
   //Boolean opperator (&&: both true) (||:one or both are true)
   if ((3>2)&&(9<10)) {
      System.out.println("A");
   }
   else {
      System.out.println("B");
   }
   
   
   }
}