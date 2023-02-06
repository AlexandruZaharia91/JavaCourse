package BigExercises.Cars;

public class DisplayRC {
    private final String brandRemoteCar;
    CarFunction function;

    public DisplayRC() {
        function = new CarFunction();
        brandRemoteCar = "Mercedes";
    }

    public static void main(String[] args) {
        DisplayRC toy = new DisplayRC();
        System.out.println("Toy's Brand: " + toy.getBrand());
        System.out.println(toy.batteryValue());
        while(toy.batteryValue() >0){
            toy.driveToy();
        }
        if(toy.batteryValue() == 0){
            toy.driveToy();
        }

    }

    public String getBrand() {
        return this.brandRemoteCar;
    }

    public int batteryValue() {
        return function.batteryPercentage;
    }

    public void driveToy() {
        if (function.batteryPercentage != 0) {
            System.out.println("Battery: " + function.batteryPercentage() + "%");
        } else {
            System.out.println("Battery empty");
        }

        if (function.distanceDisplay != 0) {
            System.out.println("Distance : " + function.distanceDisplay());
        } else {
            System.out.println("No distance available, low battery");
        }
    }


}
