package car;

import car.exception.DealershipException;

public class Car {

    private int id;

    private int repairPrice;

    private int cost;

    private boolean sold;

    public Car(int id, int cost, int repairPrice) {
        this.id = id;
        this.cost = cost;
        this.sold = false;
        this.repairPrice = repairPrice;
    }

    public void sell() {
        this.sold = true;
    }

    public int id() {
        return this.id;
    }

    public int cost() {
        return this.cost;
    }

    public boolean isSold() {
        return this.sold;
    }

    public boolean isAvailable() {
        // check if a car is available (not sold or not rented)

        return !isSold();
    }
    public Invoice rent ( Car car , int months ) throws DealershipException {
        car.cost=car.cost * months;
        return  Invoice.forSoldCar(car);
    }
}
