package BigExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final Random random;
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        random = new Random();
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }

    public static void main(String[] args) {
        DnDCharacter character = new DnDCharacter();
        for (int i = 0; i < 1000; i++) {
            if (character.getStrength() > 2 && character.getStrength() < 19) {
                System.out.println("ok getStrength");
            }else if(character.getDexterity() > 2 && character.getDexterity() < 19) {
                System.out.println("ok getDexterity");
            }else if(character.getConstitution() > 2 && character.getConstitution() < 19){
                System.out.println("ok getConstitution");
            }else if(character.getIntelligence() > 2 && character.getIntelligence() < 19){
                System.out.println("ok getIntelligence");
            }else if(character.getWisdom() > 2 && character.getWisdom() < 19){
                System.out.println("ok getWisdom");
            }else if(character.getCharisma() > 2 && character.getCharisma() < 19){
                System.out.println("ok getCharisma");
            }else if(character.getHitpoints() == 10 + character.modifier(character.getConstitution())) {
                System.out.println("ok getHitpoints");
            }
        }
    }
    int ability() {
        int sum = 0;
        List<Integer> elements = new ArrayList<>();
        for(int i = 0 ; i<4;i++) {
            elements.add((int)(Math.random() * 6) + 1);
        }
        Collections.sort(elements);
        elements.remove(0);
        for(int elem : elements) {
            sum = sum + elem;
        }
        return sum;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }

}
