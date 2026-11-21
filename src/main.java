

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
   String Destruction(){
       return Destination;
   }
   String TotalSeats(){
       return TotalSeats;
   }



}
class Seat{

}
class Reservation{

}
class Airline{

}









public class main {
    public static void main(String[] args) {

        System.out.println("*************************Airline Flight Reservation & Seat Management System***************************");
        String[][] flights = {
                {" FlightID ", " flightName ", " Destination ", " TotalSeats "}
                , {" 101 ", " PK-301 ", " Karachi ", " 20 "}
                , {" 102 ", " PK-405 ", " Lahore ", " 20 "}
                , {" 103 ", " PK-701 ", " Islamabad ", " 20 "}
                , {" 104 ", " PK-220 ", " Dubai ", " 20 "}
        };
        int totalFlights = 5;
        Flight[] flight = new Flight[totalFlights];
        System.out.println();
        for (int row = 0; row < flights.length; row++) {
            for (int column = 0; column < flights[row].length; column++) {
                if (column == 0) {
                    flight[column].flightID = flights[row][column];
                } else if (column == 1) {
                    flight[column].flightName = flights[row][column];
                } else if (column == 2) {
                    flight[column].Destination = flights[row][column];
                } else if (column == 3) {
                    flight[column].TotalSeats = flights[row][column];
                }
            }
        }
        for(int x = 0;x<flights.length;x++){
            System.out.println(flight[x].FlightID() + "   " + flight[x].FlightName() +  "   " + flight[x].Destruction() +  "  " + flight[x].TotalSeats());
        }



    }
    }

