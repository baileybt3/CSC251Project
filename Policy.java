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
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private double holderHeight;
   private double holderWeight;
   private String smokingStatus;
   
   /*
   *Non-Arg constructer initializes all attributes to a default value
   * @param policyNumber - The policy number
   * @param providerName - The provider's name
   * @param holderFirstName - The policyholder's first name
   * @param holderLastName - The policyholder's last name
   * @param holderAge - The policyholder's age
   * @param holderHeight - The policyholder's height
   * @param holderWeight - The policyholder's weight
   * @param smokingStatus - The policyholder's smoking status ("smoker" or "non-smoker")
   */
   public Policy(){
      policyNumber = "";
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      holderHeight = 0.0;
      holderWeight = 0.0;
      smokingStatus = "";
   }
   
   /*
   * Accept argument constructor which intializes attributes with provided values
   */
   public Policy(String pNum, String pName, String hFN, String hLN, int hAge, double hHeight, double hWeight, String sS){
      policyNumber = pNum;
      providerName = pName;
      holderFirstName = hFN;
      holderLastName = hLN;
      holderAge = hAge;
      holderHeight = hHeight;
      holderWeight = hWeight;
      smokingStatus = sS;
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
   
   public String getHolderFirstName(){
      return holderFirstName;
   }
   
   public void setHolderFirstName(String hFN){
     holderFirstName = hFN;
   }
   
   public String getHolderLastName(){
      return holderLastName;
   }
   
   public void setHolderLastName(String hLN){
      holderLastName = hLN;
   }
   
   public int getHolderAge(){
      return holderAge;
   }
   
   public void setAge(int hAge){
      holderAge = hAge;
   } 
   
   public double getHolderHeight(){
      return holderHeight;
   }
   
   public void setHeight(double hHeight){
      holderHeight = hHeight;
   }
   
   public double getHolderWeight(){
      return holderWeight;
   }
   
   public void setWeight(double hWeight){
      holderWeight = hWeight;
   }
   
   public String getSmokingStatus(){
      return smokingStatus;
   }
   
   public void setSmokingStatus(String sS){
      smokingStatus = sS;
   }
   
   /*
   * Method to calculate and return BMI calculation
   *
   * @return BMI of policyholder
   */
   public double calculateBMI(){
      return (holderWeight * 703) / (holderHeight * holderHeight);
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
      
      if(holderAge > 50){
         additionalFee += 75.0;
      }
      
      if(smokingStatus.equals("smoker")){
         additionalFee += 100.0;
      }
      
      double BMI = calculateBMI();
      if (BMI > 35){
         additionalFee += (BMI - 35) * 20.0;
      }
      
      return baseFee + additionalFee;
   }
   
}
   
   