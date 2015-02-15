package pset4;
import java.util.Scanner;
/*Date:  2-11-2015
*By:  Kevin Wilson
*Pset3 problem for Java launchCode class - demonstrate the Singleton Design Pattern
*program generates 1-half of a pyramid populated with a keyboard sign that will be selected by the user at run time.
*It will be printed to either the console or to a text file depending on user input also at runtime.
*
*/

public class Mario
{

    public static void main(String[] varArgs) 
    {  
        System.out.println("\n  ! The Pyramid Program !\n"); 
        System.out.println("\n  Filled with keyboard symbols the user gets to select.\n");   
    
          // request user input
        Scanner userInput = new Scanner(System.in);   
        System.out.println("\n  which symbol?  %  or  #  ");   
        String symbolInput = userInput.nextLine();

        System.out.println("\n To print pyramid to the console screen enter  1 ");
        System.out.println("\n To print pyramid to a text file enter  2 \n");
        int selPrint = userInput.nextInt();
        if (selPrint != 1 && selPrint != 2)
          throw new IllegalArgumentException(" Input Error - Invalid Print Selection !!");

             PrintStrategy printstrategy1 = new ConsolePrint();   
             PrintStrategy printstrategy2 = new FilePrint();


        PyramidTypeFactory typeFactory = PyramidTypeFactory.getInstance();           // create a Pyramid type instance

        Pyramid makePyramid = typeFactory.makePyramidType(symbolInput);     // input symbol is sent to the Factory which decides which subclass
                                                                            // subclass return value is then sent to makePyramid object 

        if (selPrint == 2)  
                { printstrategy2.print(makePyramid);                        // pyramid is generated using the value in makePyramid
                }  else 
                  printstrategy1.print(makePyramid);


    }   //closes main
}    //closes class Mario
     