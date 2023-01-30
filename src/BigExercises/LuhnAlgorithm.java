package BigExercises;

import java.util.*;

public class LuhnAlgorithm {

    private List<Integer> elements;
    private List<Integer> reverseValue;
    private String[] hiddenValue;
    private int count = 0;

    public LuhnAlgorithm(String elements) throws Exception {
        this.elements = new ArrayList<>();
        this.reverseValue = new ArrayList<>();
        for (int i = 0; i < elements.length(); i++) {
            if(elements.charAt(i) != 'x') {
                this.elements.add(Integer.parseInt(String.valueOf(elements.charAt(i))));
            }else {
                count++;
            }
            if (this.elements.size() > 16) {
                throw new Exception("Card number has more elements > 16");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        LuhnAlgorithm card = new LuhnAlgorithm("059a");
        LuhnAlgorithm card1 = new LuhnAlgorithm("79927398713");
        LuhnAlgorithm card2 = new LuhnAlgorithm("2090399073585x");
        LuhnAlgorithm card3 = new LuhnAlgorithm("5320540439486843");

        card.validCreditCar();
        card1.validCreditCar();
        card2.validCreditCar();
        card3.validCreditCar();
    }


    public void validCreditCar() {
        int sum = 0;
        int temp = 0;
        this.reverseElements();
        for (int i = 0; i < reverseValue.size(); i++) {
            if (i % 2 != 0) {
                temp = reverseValue.get(i) * 2;
                if (temp >= 10) {
                    int val = sumNumbers(temp);
                    this.reverseValue.set(i, val);
                } else {
                    this.reverseValue.set(i, temp);
                }
            }
        }
        for (int j = reverseValue.size()-1; j >=0; j--) {
            sum = sum + reverseValue.get(j);
        }

        if (sum % 10 == 0) {
            if(count > 0) {
                int checkDigit = (10 -(sum%10))%10;
                elements.add(checkDigit);
                System.out.println("card number is valid!!!!!!! : " + elements.toString());
            }else {
                System.out.println("card number is valid!!!!!!! : " + elements.toString());
            }
        } else if(sum % 10 != 0) {
            if(count > 0) {
                int checkDigit = (10 - (sum % 10)) % 10;
                elements.add(checkDigit);
                System.out.println("The system added the check-Digit" + elements.toString());
            }else {
                System.out.println("!!!!!!!!!!!1Please add a correct card number!!!!!!!!!!!!");
            }
        }
    }

    public int sumNumbers(int number) {
        int newValue = 0;
        while (number > 0) {
            int temp = number % 10;
            newValue = newValue * 1 + temp;
            number = number / 10;
        }
        return newValue;
    }

    public List<Integer> reverseElements() {
        for (int i = elements.size() -1; i >= 0; i--) {
            reverseValue.add(elements.get(i));
        }
        if(count>0) {
            for(int z = 0; z<count;z++) {
                reverseValue.add(z,0);
            }
        }
        return reverseValue;
    }
}
