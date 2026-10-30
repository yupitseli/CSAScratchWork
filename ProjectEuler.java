public class ProjectEuler {
   
   public static int problem1() {
      int num = 0;
      int count = 0;
      for(num = 1; num < 1000; num++){
         if((num % 3 == 0) || (num % 5 == 0)) {
         count+=num;
         }
      }
      return count;
      
   }
   
   public static int problem2() {
      return 0;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}