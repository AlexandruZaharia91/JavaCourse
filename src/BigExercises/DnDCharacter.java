package BigExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
Instructions
For a game of Dungeons & Dragons, each player starts by generating a character they can play with.
This character has, among other things, six abilities; strength, dexterity, constitution, intelligence, wisdom and charisma.
These six abilities have scores that are determined randomly. You do this by rolling four 6-sided dice and record the sum of
the largest three dice. You do this six times, once for each ability.

Your character's initial hitpoints are 10 + your character's constitution modifier. You find your character's constitution
modifier by subtracting 10 from your character's constitution, divide by 2 and round down.

Write a random character generator that follows the rules above.

For example, the six throws of four dice may look like:

5, 3, 1, 6: You discard the 1 and sum 5 + 3 + 6 = 14, which you assign to strength.
3, 2, 5, 3: You discard the 2 and sum 3 + 5 + 3 = 11, which you assign to dexterity.
1, 1, 1, 1: You discard the 1 and sum 1 + 1 + 1 = 3, which you assign to constitution.
2, 1, 6, 6: You discard the 1 and sum 2 + 6 + 6 = 14, which you assign to intelligence.
3, 5, 3, 4: You discard the 3 and sum 5 + 3 + 4 = 12, which you assign to wisdom.
6, 6, 6, 6: You discard the 6 and sum 6 + 6 + 6 = 18, which you assign to charisma.
Because constitution is 3, the constitution modifier is -4 and the hitpoints are 6.

Notes
Most programming languages feature (pseudo-)random generators, but few programming languages are designed to roll dice. One such language is Troll.
 */

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
