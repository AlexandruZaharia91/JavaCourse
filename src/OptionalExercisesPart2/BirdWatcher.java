package OptionalExercisesPart2;

import java.util.Arrays;
import java.util.Random;

public class BirdWatcher {


    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birds = new BirdWatcher();
        System.out.println("get last week birds: " + Arrays.toString(birds.getLastWeek()));
        System.out.println("number of birds for today: " + birds.getToday(birdsPerDay));
        System.out.println("number of birs before update: " + Arrays.toString(birdsPerDay));
        birds.incrementTodaysCount(birdsPerDay);
        System.out.println("days without birds: " + birds.hasDayWithoutBirds(birdsPerDay));
        System.out.println("number of birds for 4 days: " + birds.getCountForFirstDays(4, birdsPerDay));
        System.out.println("days with 5 or more than 5 birds per day: " + birds.getBusyDays(birdsPerDay));
    }

    public int[] getLastWeek() {
        int[] getLastWeekBirds = {3, 2, 4, 1, 5, 10, 2};
        return getLastWeekBirds;
    }

    public int getToday(int[] birdsPerDay) {
        int birdNumberToday = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (i == birdsPerDay.length - 1) {
                birdNumberToday = birdsPerDay[i];
            }
        }
        return birdNumberToday;
    }


    public void incrementTodaysCount(int[] birdsPerDay) {
       for(int i = 0; i< birdsPerDay.length;i++){
           if(i == birdsPerDay.length - 1) {
               birdsPerDay[i] = birdsPerDay[i] + 1;
           }
       }
        System.out.println("birds per day after update: " + Arrays.toString(birdsPerDay));
    }

    public boolean hasDayWithoutBirds(int[] birdsPerDay) {
        boolean dayswithoutBirds = false;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                dayswithoutBirds = true;
            }
        }
        return dayswithoutBirds;
    }


    public int getCountForFirstDays(int days, int[] birdsPerDay) {
        int i = 0;
        int getNumberOfBirds = 0;
        while (i < days) {
            getNumberOfBirds = getNumberOfBirds + birdsPerDay[i];
            i++;
        }
        return getNumberOfBirds;
    }

    public int getBusyDays(int[] birdsPerDay) {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }


}
