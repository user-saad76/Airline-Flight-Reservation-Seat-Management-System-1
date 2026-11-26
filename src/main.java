import java.util.Scanner;

class Person{
      private String name;
       private int age;
       private String PhoneNumber;
      private String PassportNumber;

      Person( String name,int age, String PhoneNumber,String PassportNumber){
          this.name = name;
          this.age = age;
          this.PhoneNumber = PhoneNumber;
          this.PassportNumber = PassportNumber;
      }

      void PersonDetails(){
          System.out.println("Name = " + name);
          System.out.println("Age = " + age);
          System.out.println("Phone number = " + PhoneNumber);
          System.out.println("PassportNumber = " + PassportNumber);
      }
}
class Passenger extends Person{
      int passengerId;
      String email;

     Passenger(int passengerId,String email,String name,int age, String PhoneNumber,String PassportNumber){
        super(name,age,PhoneNumber, PassportNumber);
         this.passengerId = passengerId;
         this.email = email;
     }

    @Override
    void PersonDetails() {
        super.PersonDetails();
        System.out.println("Passenger Id  = " + passengerId);
        System.out.println("Email  = " + email);
    }
}
class Flight{
   String flightID;
   String flightName;
   String Destination;
   String TotalSeats;

   Flight(String flightID,String flightName,String Destination, String TotalSeats){
       this.flightID = flightID;
       this.flightName = flightName;
       this.Destination = Destination;
       this.TotalSeats = TotalSeats;
   }

   String FlightID(){
        return flightID;
   }
   String FlightName(){
       return flightName;
   }
   String getDestination(){
       return Destination;
   }
   String TotalSeats(){
       return TotalSeats;
   }



}
class Seat{
   private int seatNumber;
   private String seatType;
   private int isBooked;

   Seat(int seatNumber){
       this.seatNumber = seatNumber;

   }
   int getSeatNumber(){
       return seatNumber;
   }
    String getSeatType(){
        return seatType;
    }
    int getIsBooked(){
       return isBooked;
    }
}
class Reservation{

}
class Airline{

}









public class main {
    public static void main(String[] args) {

        System.out.println("*************************Airline Flight Reservation & Seat Management System***************************");
        Scanner input = new Scanner(System.in);
        String[][] flights = {
                {" FlightID ", " flightName ", " Destination ", " TotalSeats "}
                , {" 101 ", " PK-301 ", " Karachi ", " 20 "}
                , {" 102 ", " PK-405 ", " Lahore ", " 20 "}
                , {" 103 ", " PK-701 ", " Islamabad ", " 20 "}
                , {" 104 ", " PK-220 ", " Dubai ", " 20 "}
        };
        int totalFlights = 4;
        Flight[] flight = new Flight[totalFlights];
        System.out.println();
         for(int row = 1;row<flights.length;row++){
             int index = row-1;
             flight[index] = new Flight(flights[row][0].trim(),
                     flights[row][1].trim(),
                     flights[row][2].trim(),
                     flights[row][3].trim());
         }
        System.out.println(" FlightID "  + " flightName " + " Destination " + "  TotalSeats ");
         for(int x = 0;x<totalFlights-1;x++){
             System.out.println(flight[x].FlightID() + "  " + flight[x].FlightName() + "  " + flight[x].getDestination() + "   " + flight[x].TotalSeats());
         }

        System.out.println();
        System.out.println("******************************************************");
        System.out.println();
         int totalSeats = 4;
          Seat[] seat = new Seat[totalSeats];
        int booked = 0;
        int[][] seat1 = {
                { booked, booked, booked, booked},
                { booked, booked, booked, booked},
                { booked, booked, booked, booked},
                { booked, booked, booked, booked},
        };


        while(true){
             System.out.print("Search flightName you want to booked seat: ");
             String choice = input.nextLine();
             if(choice.equalsIgnoreCase("PK-301")){
                  for(int row = 0;row< seat1.length;row++){
                      for(int column = 0;column<seat1[row].length;column++){
                          seat[column] = new Seat(seat1[row][column]);
                      }
                  }
                  for(int row = 0;row<seat1.length;row++){
                      System.out.print("Row - " + row + "  ");
                      for(int column  = 0;column<seat1[row].length;column++){
                          if(seat1[row][column]==0){
                              System.out.print( " Available " +  "  ");
                          }
                          else if(seat1[row][column]==1){
                              System.out.print( " Booked " + "  ");
                          }
                      }
                      System.out.println();
                  }

                 System.out.print("You want to booked a ticket or not (Yes/No) or Cancel :  ");
                 String ticketBooked = input.nextLine();
                 if(ticketBooked.equalsIgnoreCase("Yes")){
                     System.out.print("Enter the seat row you want to booked : ");
                     int bookedSeatRow = input.nextInt();
                     System.out.print("Enter the seat column you want to booked : ");
                     int bookedSeatColumn = input.nextInt();
                     input.nextLine();
                     boolean isbooked = false;
                     for(int row = 0;row<seat1.length;row++){
                         for(int column = 0;column<seat1[row].length;column++){
                             if(row==bookedSeatRow&&column==bookedSeatColumn){
                                 if(seat1[bookedSeatRow][bookedSeatColumn]==0){
                                     seat1[bookedSeatRow][bookedSeatColumn] = 1;
                                     isbooked = true;
                                     break;
                                 }
                                 else if(seat1[bookedSeatRow][bookedSeatColumn]==1){
                                     isbooked = false;
                                     System.out.println("Seat are already booked");
                                 }
                             }
                         }
                       if(isbooked){
                           System.out.println("Your seat are booked successfully");
                           break;
                       }
                     }
                 }
                 else if(ticketBooked.equalsIgnoreCase("Cancel")){
                     System.out.print("Enter the seat row you have booked : ");
                       int bookedSeatRow = input.nextInt();
                     System.out.print("Enter the seat column you have booked : ");
                     int bookedSeatColumn = input.nextInt();
                     input.nextLine();
                     boolean isCancelled = false;
                       for(int row = 0;row<seat1.length;row++){
                           for(int column = 0;column<seat1[row].length;column++){
                               if(row==bookedSeatRow&&column==bookedSeatColumn){
                                   if(seat1[row][column]==1){
                                       seat1[row][column] = 0;
                                       isCancelled = true;
                                       break;
                                   }
                               }
                           }
                           if(isCancelled){
                               System.out.println("You have cancelled the seat ");
                               break;
                           }
                       }

                 }

             } else if (choice.equalsIgnoreCase("PK-405")) {




             }
             else if (choice.equalsIgnoreCase("PK-701")) {

             }
             else if (choice.equalsIgnoreCase("PK-220")) {

             }

         }




    }
    }


