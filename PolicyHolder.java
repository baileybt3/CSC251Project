/*
Brandon Bailey
4/22/2024
This program contains the policyholder information
*/

public class PolicyHolder
{
   //Initialize fields associated with policy holder
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private double holderHeight;
   private double holderWeight;
   private String smokingStatus;
   
   // Constructor which initializes PolicyHolder object with provided values
   public PolicyHolder(String holderFirstName, String holderLastName,
                       int holderAge, double holderHeight, double holderWeight,
                       String smokingStatus)
   {
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
      this.smokingStatus = smokingStatus;
   }
   
   //Getters and setters for PolicyHolder fields
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   public void setHoldlerFirstName(String holderFirstName)
   {
      this.holderFirstName = holderFirstName;
   }
   
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   public void setHoldlerLastName(String holderLastName)
   {
      this.holderLastName = holderLastName;
   }
   
   public int getHolderAge()
   {
      return holderAge;
   }
   
   public void setHolderAge(int holderAge)
   {
      this.holderAge = holderAge;
   }
   
   public double getHolderHeight()
   {
      return holderHeight;
   }
   
   public void setHolderHeight(double holderHeight)
   {
      this.holderHeight = holderHeight;
   }
   
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   public void setHolderWeight(double holderWeight)
   {
      this.holderWeight = holderWeight;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   //Method to calculate BMI(Body Mass Index)
   public double calculateBMI(){
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
      
   

}