package ToyCar;

public class CarFunction {
    public int batteryPercentage = 100;
    public int distanceDisplay;

    public CarFunction() {
        this.distanceDisplay = this.batteryPercentage * 20;
    }

    public int batteryPercentage() {
        batteryPercentage -= 1;
        return batteryPercentage;
    }


    public int distanceDisplay() {
        if (batteryPercentage != 100) {
            distanceDisplay = batteryPercentage * 20;
        }
        return distanceDisplay;
    }
}
