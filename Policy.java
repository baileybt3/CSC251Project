/*
Brandon B
3/25/2024
This program is an Insurance Policy Calculator
*/
import java.util.*;

public class Policy{

   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder){
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
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
      
   public void setPolicyHolder(){
      this.policyHolder = policyHolder;
   }
   
   //This method calculate the price of the policy for the policy holder, increasing depending on given information.
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
   
}
   
   