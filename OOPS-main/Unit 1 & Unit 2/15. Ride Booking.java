abstract class Ride {
    int distance;
    abstract void calculateFare();
}

class BikeRide extends Ride { void calculateFare() { System.out.println(distance * 5); } }
class AutoRide extends Ride { void calculateFare() { System.out.println(distance * 8); } }
class CarRide extends Ride { void calculateFare() { System.out.println(distance * 12); } }
