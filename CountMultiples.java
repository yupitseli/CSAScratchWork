public class CountMultiples {
   public static int countMultiples(int i, int k){
   int multiples = 0;
   for (int s = 1; s<=i; s++) {
      if(s % k == 0) {
      multiples++;
      }
      else {
      multiples+=0;
      }
   }
   return multiples;
   }
   public static void main(String[] args) {
   
   System.out.println(countMultiples(17, 3));
   }
   
}