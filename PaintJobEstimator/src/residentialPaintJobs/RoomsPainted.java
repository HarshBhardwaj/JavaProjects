package residentialPaintJobs;
import java.util.Scanner;
@SuppressWarnings("resource")

public class RoomsPainted {
    public double numRooms, pricePerGallon;

    RoomsPainted(){
        try{
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter the number of rooms to be painted: ");
            numRooms = input1.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter the price of the paint per gallon: $");
            pricePerGallon = input2.nextDouble();
        } catch (Exception e){
            System.out.println("Invalid Data Entered");
        }
    }
}
