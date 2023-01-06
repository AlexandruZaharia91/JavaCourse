package OptionalExercisesPart2;

import java.util.Arrays;
import java.util.Random;

public class BirdWatcher {
    private final int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birds = new BirdWatcher(birdsPerDay);
        System.out.println("get last week birds: " + Arrays.toString(birds.getLastWeek()));
        System.out.println("number of birds for today: " + birds.getToday());
        System.out.println("number of birs before update: " + Arrays.toString(birds.birdsPerDay));
        birds.incrementTodaysCount();
        System.out.println("add a new bird for today: " + Arrays.toString(birds.birdsPerDay));
        System.out.println("days without birds: " + birds.hasDayWithoutBirds());
        System.out.println("number of birds for 4 days: " + birds.getCountForFirstDays(4));
        System.out.println("days with 5 or more than 5 birds per day: " + birds.getBusyDays());
    }

    public int[] getLastWeek() {
        int[] getLastWeekBirds = {3, 2, 4, 1, 5, 10, 2};
        return getLastWeekBirds;
    }

    public int getToday() {
        int birdNumberToday = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (i == birdsPerDay.length - 1) {
                birdNumberToday = birdsPerDay[i];
            }
        }
        return birdNumberToday;
    }


    public void incrementTodaysCount() {
        Random rnd = new Random();
        int day = rnd.nextInt(5);
        if (day == 0) {
            day = day + 1;
        }
        birdsPerDay[day] = birdsPerDay[day] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayswithoutBirds = false;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                dayswithoutBirds = true;
            }
        }
        return dayswithoutBirds;
    }


    public int getCountForFirstDays(int days) {
        int i = 0;
        int getNumberOfBirds = 0;
        while (i < days) {
            getNumberOfBirds = getNumberOfBirds + birdsPerDay[i];
            i++;
        }
        return getNumberOfBirds;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }


}
