public class StudentActivity {
   
   
   private String name;
   private String category;
   private int numberOfStudents;
   private double financialRequirements;
   private boolean scholarshipsAvalible;
   private double fundsAvalible;
   private double meetingCost;
   
   public StudentActivity() {
      name = "Cheese of the Month Club";
      category = "Recreational";
      numberOfStudents = 25;
      financialRequirements = 0.0;
      scholarshipsAvalible = false;
      fundsAvalible = 100.00;
      meetingCost = 10.00;
      }
      public StudentActivity(String name, String category, int numberOfStudents, double financialRequirements, boolean scholarshipsAvalible) {
      this.name = name;
      this.category = category;
      this.numberOfStudents = numberOfStudents;
      this.financialRequirements = financialRequirements;
      this.scholarshipsAvalible = scholarshipsAvalible;
      }
      public void meet() {
      fundsAvalible -= meetingCost;
      System.out.println("Subtracted" + meetingCost + "from fundsAvalible. Funds remaining:" + fundsAvalible);
      
      }
}