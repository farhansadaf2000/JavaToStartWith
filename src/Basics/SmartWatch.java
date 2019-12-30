package Basics;

public class SmartWatch {
    /** This app wil be a showcasing of my knowledge about undermentioned variable types :
     * int
     * short
     * long
     * float
     * double
     * char
     * boolean
     * byte
     * String
     */
    public static void main(String[] args){
        /*main method starts here.
       Here I will also be showcasing my knowledge of Math operations and Comparison operators*/
        //This is int type.
        int numberOfSmartWatchForMe = 3;
        int numberOfSmartWatchForMyFamily = 10;
        int totalSmartWatchToBuy = numberOfSmartWatchForMe + numberOfSmartWatchForMyFamily;
        System.out.println("The number of smart watch I will be buying is : " + totalSmartWatchToBuy);
        //This is short type.
        short numberOfSmartWatchForMySister = 1;
        System.out.println(numberOfSmartWatchForMySister);
        //Modulo Demo
        int moduloDemo = totalSmartWatchToBuy % 4;
        System.out.println("Remainder is: " + moduloDemo);
        //This is long type.
        long numberOfSmartWatchesProduced = 10000000;
        short numberOfStores = 100;
        long numberOfSmartWatchesEachStoreWillGet = numberOfSmartWatchesProduced/numberOfStores;
        System.out.println("Each store will try to sell " + numberOfSmartWatchesEachStoreWillGet + " smart watches.");
        //This is float type.
        float costOfEachSmartWatch = (float) 1000.58;
        float totalProductionCost = costOfEachSmartWatch * numberOfSmartWatchesProduced;
        System.out.println("Company had to bear a total cost of " + totalProductionCost + " dollars.");
        //This is double type.
        double priceOfEachSmartWatch = costOfEachSmartWatch + costOfEachSmartWatch * 20/100;
        double totalRevenue = priceOfEachSmartWatch * numberOfSmartWatchesProduced - totalProductionCost;
        System.out.println("Total revenue for the company is " + totalRevenue + " dollars.");
        //These are char type and byte type.
        byte ageOfTheCompany = 15;
        char gradeOfTheCompany = 'A';
        System.out.println("The grade of the company is: " + gradeOfTheCompany
                + "and age of the company is: " + ageOfTheCompany + ".");
        //This is boolean type and String.
        String proposedNameOfTheCompany, finalNameOfTheCompany;
        proposedNameOfTheCompany = "Kaua Technology";
        finalNameOfTheCompany = "Rasin Inc.";
        System.out.println(finalNameOfTheCompany.equals(proposedNameOfTheCompany));
        boolean situation1, situation2;
        situation1 = ageOfTheCompany >= numberOfSmartWatchesEachStoreWillGet;
        System.out.println(situation1);
        situation2 = totalRevenue <= totalProductionCost;
        System.out.println(situation2);
    }
}
