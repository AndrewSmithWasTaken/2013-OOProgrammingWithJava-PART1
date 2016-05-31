public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return (this.squareMeters > otherApartment.squareMeters);
    }
    
//    public int cost(Apartment a) {
//        return a.squareMeters * a.pricePerSquareMeter;
//    }
    
//    public static int cost(Apartment a) {
//        return a.squareMeters * a.pricePerSquareMeter;
//    }
    
    private int cost(){
        return pricePerSquareMeter*squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.cost() - otherApartment.cost());
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.cost() > otherApartment.cost();
    }
}



