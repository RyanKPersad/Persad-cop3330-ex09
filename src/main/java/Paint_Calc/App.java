package Paint_Calc;
import java.util.Scanner;
/**
 *
 */
public class App 
{
    static final int gallon = 350;

    public static void main( String[] args )
    {
        //Variables
        Scanner myObj = new Scanner(System.in);
        String length;
        String width;
        //Input
        System.out.println( "Enter length" );
        length = myObj.nextLine();
        System.out.println( "Enter width" );
        width = myObj.nextLine();

        //String conversion
        int newLength = Integer.parseInt(length);
        int newWidth = Integer.parseInt(width);
        int area = newLength *newWidth;
        int needed = area/gallon;

        //distinguishes on whether to add a gallon or not
         if (area % gallon != 0){
             int roundUp = needed + 1;
             String print1 = String.format("You will need to purchase %d gallons of paint to cover %d square feet.\n",
                     roundUp,area);
             System.out.println(print1);
         }else{
             String print2 = String.format("You will need to purchase %d gallons of paint to cover %d square feet.\n",
                     needed,area);
             System.out.println(print2);

         }

    }
}
