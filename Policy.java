/*
Brandon B
3/25/2024
This program is an Insurance Policy Calculator
*/
import java.util.*;

// Create our Policy class
public class Policy{
   
   //Declare variables as private to hide from other classes and prevent data corruption
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   /*
   *Non-Arg constructer initializes all attributes to a default value
   */
   public Policy(){
      policyNumber = "";
      providerName = "";
      policyHolder = null;
   }
   
   /*
   * Accept argument constructor which intializes attributes with provided values
   */
   public Policy(String pNum, String pName, PolicyHolder holder){
      policyNumber = pNum;
      providerName = pName;
      policyHolder = holder;
   }
   
   // Getter and setter methods for each value
   public String getPolicyNumber(){
      return policyNumber;
   }
   
   public void setPolicyNumber(String pNum){
      policyNumber = pNum;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
   public PolicyHolder getPolicyHolder(){
      return policyHolder;
   }
   
   public void setPolicyHolder(PolicyHolder holder){
      policyHolder = holder;
   }
   
   /*
   * Calculate the insurance price based on policyholder's inputted information
   * 
   * Create and intializes base price of $600
   * Create and intialize variable for additional price orignally set to $0
   * If statements add to additionalFee depending on the policyholder's input
   *
   * @return The calculated insurance price baseFee + additionalFees
   */
   public double calculateInsurancePrice(){
      double baseFee = 600.0;
      double additionalFee = 0.0;
      
      if(policyHolder.getHolderAge() > 50){
         additionalFee += 75.0;
      }
      
      if(policyHolder.getSmokingStatus().equals("smoker")){
         additionalFee += 100.0;
      }
      
      double BMI = policyHolder.calculateBMI();
      if (BMI > 35){
         additionalFee += (BMI - 35) * 20.0;
      }
      
      return baseFee + additionalFee;
   }
   
   // toString method to represent Policy object as a string
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName + "\n" +
             "Policyholder's First Name: " + policyHolder.getHolderFirstName() + "\n" +
             "Policyholder's Last Name: " + policyHolder.getHolderLastName() + "\n" +
             "Policyholder's Age: " + policyHolder.getHolderAge() + "\n" +
             "Policyholder's Smoking Status: " + policyHolder.getSmokingStatus() + "\n" +
             String.format("Policyholder's Height: %.2f\n", policyHolder.getHolderHeight()) +
             String.format("Policyholder's Weight: %.2f\n", policyHolder.getHolderWeight()) +
             String.format("Policyholder's BMI: %.2f\n", policyHolder.calculateBMI()) +
             String.format("Policy Price: $%.2f\n", calculateInsurancePrice()) + "\n";
   }
}
