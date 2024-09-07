//import stuff here
import java.util.Scanner;

//Your code here
public class Program7{
    public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    
    //create variables
    double schruteBucks= 0.0; 
    double klevins= 0.0; 
    double stanleyNickles = 0.0;
    double decimalSchruteBuck=0.0;
    
    //ask user for input
    System.out.println("Enter schrute-bucks: ");
    schruteBucks = myScanner.nextDouble();
    
    System.out.println("Enter klevins: ");
    klevins = myScanner.nextDouble();

    System.out.println("Enter stanleyn-nickles: ");
    stanleyNickles = myScanner.nextDouble();
    
    //calculations
    klevins=klevins/20.0;
    stanleyNickles= stanleyNickles/240;
    decimalSchruteBuck=(schruteBucks+klevins+stanleyNickles)+0.005;
    
    //casting
    decimalSchruteBuck= (int)(decimalSchruteBuck*100);
    decimalSchruteBuck= (double)(decimalSchruteBuck/100);
    
    System.out.println("Decimal schrute-bucks: $"+ decimalSchruteBuck);


}   
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanleyn-nickles: 
9
Decimal schrute-bucks: $7.89

*/
