public class Car {
    private final int carId;
    private final String brand;
    private final String modelName;
    private final int maxVelocity;
    private final int power;
    private final int ownerId;

    public Car(int carId, String brand, String modelName, int maxVelocity, int power, int ownerId) {
        this.carId = carId;
        this.brand = brand;
        this.modelName = modelName;
        this.maxVelocity = maxVelocity;
        this.power = power;
        this.ownerId = ownerId;
    }

    public int getPower() {
        return this.power;
    }

    public int getCarId() {
        return this.carId;
    }

    public int getOwnerId() {
        return this.ownerId;
    }

    public String getBrand(){
        return this.brand;
    }
}

