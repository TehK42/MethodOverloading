public class Main {

    public static void main(String[] args) {


        calcFeetAndInchesToCentimeters(9);




    }

    //Function that converts feet and inches to centimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //Tests if the given values are able to be calculated
        //Feet must be greater than zero, Inches must be greater than or equal to 0 or
        // inches must be greater than or equal to 12
        if((feet < 0) || ((inches < 0) || (inches > 12))) {

            return -1;

        }
        //Feet to Centimeters conversion
        //Feet -> Inches -> Centimeters
        double centimeters = (feet * 12) * 2.54;
        //Takes previous centimeter value and adds it to inches conversion
        centimeters += inches * 2.54;
        //Prints out Feet, inches, and the converted value given from it into centimeters
        //Adds values of feet and inches and calculates centimeters
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters +" cm");
        //returns the calculated value of centimeters
        return centimeters;

    }

    //Overloaded Method of calcFeetAndInchesToCentimeters using only one parameter
    public static double calcFeetAndInchesToCentimeters(double inches) {
        //Tests whether the given value is less than zero
        //If less than zero then cancel method
        if(inches < 0) {
            return -1;
        }

        //Feet conversion that casts the given value into an integer
        //then converts inches into feet by dividing inches by 12
        double feet = (int) inches / 12;
        //Calculates the remaining inches from the given value after converting to feet
        double remainingInches = (int) inches % 12;
        //Prints out Feet and Inches and the Remaining inches
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        //Returns the values of feet and the remaining inches
        //by using the first method and inputting the variables in this method
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
