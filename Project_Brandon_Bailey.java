/*
Brandon Bailey
3/25/2024
This is the Demo class to display our policy and manipulate settings using the Policy class
*/
import java.util.*;
import java.io.*;

public class Project_Brandon_Bailey{

   public static void main(String[] args){
      
      
      try {
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
        
        // Declare variables
         String policyNumber;
         String providerName;
         String holderFirstName;
         String holderLastName;
         int holderAge;
         String smokingStatus;
         double holderHeight;
         double holderWeight;
       
        // Create an array list to store objects. This will hold policy information for each policy holder 
         ArrayList<Policy> policies = new ArrayList<>();
         
        // Counters for smokers and non-smoker policy holders. Will check through each policy in the while loop below.
         int smokerCount = 0;
         int nonSmokerCount = 0;
         
       // While loop to input information from the policy lines                
         while (inputFile.hasNext()){
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
            holderAge = Integer.parseInt(inputFile.nextLine());
            smokingStatus = inputFile.nextLine();
            holderHeight = Double.parseDouble(inputFile.nextLine());
            holderWeight = Double.parseDouble(inputFile.nextLine());
            
          
            if (inputFile.hasNext()){
               inputFile.nextLine();
            }
            
            //Create policy object using policy class type
            Policy p = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, holderHeight, holderWeight, smokingStatus);
            
            policies.add(p);
           // Smoker - non-smoker counter
            if (smokingStatus.equals("smoker")){
               smokerCount++;
            } else if (smokingStatus.equals("non-smoker")){
               nonSmokerCount++;
            }
            
         }
         
         inputFile.close(); //Close input
         
         
        //Output our array for each policy holder
         for (int i = 0; i < policies.size(); i++) {
                System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
                System.out.println("Provider Name: " + policies.get(i).getProviderName());
                System.out.println("Policyholder's First Name: " + policies.get(i).getHolderFirstName());
                System.out.println("Policyholder's Last Name: " + policies.get(i).getHolderLastName());
                System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
                System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
                System.out.printf("Policyholder's Height: %.2f\n", policies.get(i).getHolderHeight()); // Format height with 2 decimal places
                System.out.printf("Policyholder's Weight: %.2f\n", policies.get(i).getHolderWeight()); // Format weight with 2 decimal places
                System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).calculateBMI()); // Format BMI with 2 decimal places
                System.out.printf("Policy Price: $%.2f\n", policies.get(i).calculateInsurancePrice()); // Format price with 2 decimal places
                System.out.println();
         }
         
         //Output our smoker, non-smoker counters
         System.out.println("The number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of polciies with a non-smoker is: " + nonSmokerCount); 
         
        //If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      } catch(IOException ex){
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}
