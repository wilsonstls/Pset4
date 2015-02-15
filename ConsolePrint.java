package pset4;
import java.io.*;
/**
* prints output to the screen.
*/

public class ConsolePrint implements PrintStrategy
{ 
    public void print(Pyramid pyramid)
    {
      System.out.println("You selected to print to the console screen !!\n");

      PrintWriter pw = new PrintWriter(System.out);
                  pw.println(pyramid.toString());
                  pw.flush();
                  pw.close();
    }
}
