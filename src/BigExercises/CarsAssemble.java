package BigExercises;

public class CarsAssemble {


    public static void main(String[] args) {
        CarsAssemble cars = new CarsAssemble();
        cars.prodRateHour(6);
        cars.numberOfCarsPerMinute();

        System.out.println("masini per hour: " + cars.getProdPerHour() + "       " + "masini per minute: " + cars.getNumberOfCarsPerMinute());

    }

    /*
     * In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).
     *
     * At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4,
     * it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced,
     * which then have to be discarded. The following table shows how speed influences the success rate:
     *
     * 1 to 4: 100% success rate.
     * 5 to 8: 90% success rate.
     * 9: 80% success rate.
     * 10: 77% success rate.
     *
     * 1) Calculate the production rate per hour  - depends of current assembly line's speed : check above table
     * 2) Calculate  the number of working items produced per minute
     */

    private int numberPerHour = 221;
    private double prodPerHour;
    private int numberOfCarsPerMinute;


    public void setNumberPerHour(int numberPerHour) {
        this.numberPerHour = numberPerHour;
    }

    public double getProdPerHour() {
        return prodPerHour;
    }

    public int getNumberOfCarsPerMinute() {
        return numberOfCarsPerMinute;
    }




    public void prodRateHour(int speed) {

        switch (speed) {

            case 1:
            case 2:
            case 3:
            case 4:
                prodPerHour = (speed * 221);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                prodPerHour = (double) ((speed * 221) * 90)/100;
                break;
            case 9:
                prodPerHour = (double) ((speed * 221) * 80)/100;
                break;
            case 10:
                prodPerHour = (double) ((speed * 221) * 77)/100;
                break;
            default:
                System.out.println("speed number does not exist !!!!!!, Please add a speed  number between 1-10");

        }

    }


    public void numberOfCarsPerMinute() {
        numberOfCarsPerMinute = (int) prodPerHour / 60;
    }




}
