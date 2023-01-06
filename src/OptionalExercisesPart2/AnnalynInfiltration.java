package OptionalExercisesPart2;

public class AnnalynInfiltration {
    boolean free = false;


    public static void main(String[] args) {
        AnnalynInfiltration infiltration = new AnnalynInfiltration();
        System.out.println("fast attack: " + infiltration.canFastAttack(true));
        System.out.println("spy: " + infiltration.canSpy(true, false, false));
        System.out.println("signal prisoner: " + infiltration.canSignalPrisoner(false, false));
        System.out.println("prisoner can be free: " + infiltration.canFreePrisoner(true, false, false, true));

    }

    public boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !(archerIsAwake) && prisonerIsAwake;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        if ((petDogIsPresent && knightIsAwake) && !archerIsAwake) {
            free = true;
        } else if (prisonerIsAwake && !archerIsAwake) {
            free = true;
        }
        return free;
    }

}
