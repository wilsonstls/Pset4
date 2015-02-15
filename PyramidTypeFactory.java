package pset4;
/**
*2/11/15
*Factory design pattern implementation that instantiates Pyramid object 
*/

public class PyramidTypeFactory
{
   // Singleton Pattern involked to insure only 1 instance of Pyramid class is created.
   private static PyramidTypeFactory firstInstance;
   private PyramidTypeFactory() {}

   public static PyramidTypeFactory getInstance() 
   {
      if (firstInstance == null) 
      {
         firstInstance = new PyramidTypeFactory(); 
         System.out.println(" Creating a new Pyramid Factory instance");
      }
      return firstInstance;
   }

   public Pyramid makePyramidType(String pyramidType)
   {
      if (pyramidType.equals("%")) {

          return new PercentSignPyramid();

      } else if (pyramidType.equals("#")) {

          return new PoundSignPyramid();

      } else 

          throw new IllegalArgumentException(" Input Error - Not one of the available symbols!!");
   }
}
