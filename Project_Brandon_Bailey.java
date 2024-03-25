/*
Brandon Bailey
3/25/2024
This is the Demo class to display our policy and manipulate settings using the Policy class
*/
import java.util.Scanner;

public class Project_Brandon_Bailey{

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      String policyNumber = scanner.nextLine();
      System.out.print("Please enter the Provider Name: ");
      String providerName = scanner.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      String holderFirstName = scanner.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      String holderLastName = scanner.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      int holderAge = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = scanner.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double holderHeight = scanner.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double holderWeight = scanner.nextDouble();
      
      Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, holderHeight, holderWeight, smokingStatus);
      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("Policyholder's Age: " + policy.getHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHolderHeight());
      System.out.println("Policyholder's Weight: " + policy.getHolderWeight());
      System.out.println("Policyholder's BMI: " + policy.calculateBMI());
      System.out.println("Policy Price: $" + policy.calculateInsurancePrice());
      
      scanner.close();
   }
}
