import java.util.Scanner;
public class Toes {
public static void  main(String[] args) {

int numberOfClassMates;
double avgNumberOfStinkyToes;
boolean eliasHasToesThatSmellNice;
String digitusPedis;

digitusPedis = "True or False, Elias doesnt have stinky toes";
System.out.print(digitusPedis);
Scanner scanner = new Scanner(System.in);
eliasHasToesThatSmellNice = scanner.nextBoolean();
numberOfClassMates = 32;
if(eliasHasToesThatSmellNice == true ) {
   avgNumberOfStinkyToes = (numberOfClassMates - 1) * 10;
   System.out.print( "There are " );
   System.out.print( avgNumberOfStinkyToes );
   System.out.print( " " );
   System.out.println( "stinky toes" );
   System.out.println( "Elias's toes smell so tasty" );
}else {
   avgNumberOfStinkyToes = numberOfClassMates * 10;
   System.out.print( "There are " );
   System.out.print( avgNumberOfStinkyToes );
   System.out.print( " " );
   System.out.println( "stinky toes" );
   System.out.println( "Oooh so naughty, Elias has stinky toes!" );
   }
}
}
