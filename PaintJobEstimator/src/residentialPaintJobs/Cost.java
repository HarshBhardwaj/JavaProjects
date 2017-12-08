package residentialPaintJobs;
import java.util.Scanner;

public class Cost extends RoomsPainted{
    //Local variables
    double squareFeet, totalSquareFeet;
    //Public variables that will be called from the object in the MainApp
    public double totalGallonsReq, totalHoursLaborReq, costOfPaint, laborCost, totalCost;
    //Local static variable and initialize
    final static double HOURLYRATE = 18, WALLSPACE = 115, LABORHOURS = 8;

    public Cost(){
        Scanner input1 = new Scanner(System.in);

        for (int i = 0; i < numRooms; i++){
            System.out.print("Enter the square feet of room "+(i+1)+" :");
            squareFeet = input1.nextDouble();

            totalSquareFeet = squareFeet+totalSquareFeet;
        }
        input1.close();
        totalGallonsReq = totalSquareFeet/WALLSPACE;
        totalHoursLaborReq = (totalSquareFeet/WALLSPACE)*LABORHOURS;

        costOfPaint = totalGallonsReq*pricePerGallon;
        laborCost = totalHoursLaborReq*HOURLYRATE;
        totalCost = costOfPaint+laborCost;
    }
}
