 
public class ArrayReturn1
{
   public static double[] returnArray( )
   {
      double[] x;

      x = new double[3];    // Create an array of 3 elements

      x[0] = 2.3;
      x[1] = 3.4;
      x[2] = 4.5;

      return( x );         // Return the **reference** (location) of the array
   }


   public static void main(String[] args)
   {
      double[] a;

      a = returnArray();

      System.out.println("Array AFTER calling returnArray:");

      for (int i = 0; i < a.length; i++)
         System.out.println( a[i] );   
   }
}