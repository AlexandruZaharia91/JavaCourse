package OptionalExercisesPart2;

public class Lasagna {
    final int ovenLasagnaTime = 40;

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("preparare lasagna: " + lasagna.preparationTimeMinutes(3));
        System.out.println("cat mai trebuie lasta la cuptor: " + lasagna.remainingMinutesInOven(20));
        System.out.println("total time in Minutes = " + lasagna.totalTimeInMinutes(3, 20));
    }

    public int expectedMinutesInOven() {
        return ovenLasagnaTime;
    }

    public int remainingMinutesInOven(int minuteInOven) {
        return expectedMinutesInOven() - minuteInOven;
    }

    public int preparationTimeMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes) {
        return preparationTimeMinutes(numberOfLayers) + remainingMinutesInOven(numberOfMinutes);
    }
}
