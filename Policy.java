/*
Brandon B
3/25/2024
This program is an Insurance Policy Calculator
*/
import java.util.*;

public class Policy{

   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private double holderHeight;
   private double holderWeight;
   private String smokingStatus;
   
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
   
   public Policy(String policyNumber, String providerName, String holderFirstName, String holderLastName, int holderAge, double holderHeight, double holderWeight, String smokingStatus){
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
      this.smokingStatus = smokingStatus;
   }
   
   public String getPolicyNumber(){
      return policyNumber;
   }
   
   public void setPolicyNumber(String policyNumber){
      this.policyNumber = policyNumber;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public void setProviderName(String providerName){
      this.providerName = providerName;
   }
   
   public String getHolderFirstName(){
      return holderFirstName;
   }
   
   public void setHolderFirstName(String holderFirstName){
     this.holderFirstName = holderFirstName;
   }
   
   public String getHolderLastName(){
      return holderLastName;
   }
   
   public void setHolderLastName(String holderLastName){
      this.holderLastName = holderLastName;
   }
   
   public int getHolderAge(){
      return holderAge;
   }
   
   public void setAge(int holderAge){
      this.holderAge = holderAge;
   } 
   
   public double getHolderHeight(){
      return holderHeight;
   }
   
   public void setHeight(double holderHeight){
      this.holderHeight = holderHeight;
   }
   
   public double getHolderWeight(){
      return holderWeight;
   }
   
   public void setWeight(double holderWeight){
      this.holderWeight = holderWeight;
   }
   
   public String getSmokingStatus(){
      return smokingStatus;
   }
   
   public void setSmokingStatus(String smokingStatus){
      this.smokingStatus = smokingStatus;
   }
   
   public double calculateBMI(){
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
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
   
   