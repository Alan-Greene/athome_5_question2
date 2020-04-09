package week11fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

public class DVDCollection {
   private DVD[] collection;
   private int count;
   private double totalCost;

   public DVDCollection ()
   {
      collection = new DVD[4];
      count = 0;
      totalCost = 0.0;
   }

   public void addDVD (){
      File in_file = new File("files", "collection.txt");

      try (Scanner in = new Scanner(in_file)){
         while (in.hasNextLine()){
            String name = in.nextLine();
            String director = in.nextLine();
            double price = Double.parseDouble(in.nextLine());
            collection[count] = new DVD (name, director, price);
            totalCost += price;
            count++;

         }
      } catch (FileNotFoundException fnf){
         System.out.println("file not found exception: " + fnf.getMessage());
      }
   }


   @Override
  public String toString()
   {

      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My DVD Collection\n\n";

      report += "Number of DVDs: " + count + "\n";
      report += "Total cost: " + String.format("€%,.2f",totalCost) + "\n";
      report += "Average cost: " + String.format("€%,.2f",totalCost/count);

      report += "\n\nDVD List:\n\n";

      for (int cd = 0; cd < count; cd++)
         report += collection[cd].toString() + "\n";

      return report;
   }
}
