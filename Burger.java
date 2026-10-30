public class Burger {
   private int numBites;
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   
   public Burger() {
      numBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 15;
      burgerName = "Burg";
   }
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
      this.numBites = 0;
      this.numPatties = numPatties;  
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   public void bite() {
      System.out.println("Chomp...");
      numBites++;
   }
   public int getNumBites() {
      return numBites;
   }
   public static String getBurgRecipe() {
      return "Cook burger, put on buns, add codiments";
   }
   public static void main(String[] args) {
   Burger basicBurger = new Burger(2, true, 15, "Burg");
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   basicBurger.bite();
   System.out.println(basicBurger.getNumBites());
   System.out.println(Burger.getBurgRecipe());
   }
}