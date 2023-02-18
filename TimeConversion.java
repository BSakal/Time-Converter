package timeconversiondriver;

/**
* @author Brandon Sakal
* ITSC1212-101, Long
* @version 1
* @since 2022-09-30
* Project 2
* This is the TimeConversion class required for Project 2.
*/
public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    void showDecaseconds(int numSeconds){
        // Initializing a new variable and converting it.
        double decaseconds = (double)numSeconds / 10;
        // Showing the user what the time converesion is.
        System.out.println("A decasecond is 10 seconds.");
        // Showing the user the converted time.
        System.out.println("You entered " + decaseconds + " decaseconds.");
        // These steps are done for each of the 5 different time conversions.
    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    void showJiffies(int numSeconds){
        double jiffies = (double)numSeconds / 100;
        System.out.println("A jiffy is 10 milliseconds.");
        System.out.println("You entered " + jiffies + " jiffies.");
    }



    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    void showNewYorkMinutes(int numSeconds){
        double newYorkMinutes = (double)numSeconds / 20;
        System.out.println("A New York Minute is 1/20th of 1 second.");
        System.out.println("You entered " + newYorkMinutes + " New York Minutes.");
    }


    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    void showNanoCenturies(int numSeconds){
        double nanoCenturies = (double)numSeconds / 3.156;
        System.out.println("A nano century is 3.156 seconds.");
        System.out.println("You entered " + nanoCenturies + " nano centuries.");
    }


     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    void showScaramuccis(int numSeconds){
        double scaramuccies = (double)numSeconds / 950400;
        System.out.println("A Scaramucci is 11 days.");
        System.out.println("You entered " + scaramuccies + " Scaramuccies.");
    }




    
}//end class