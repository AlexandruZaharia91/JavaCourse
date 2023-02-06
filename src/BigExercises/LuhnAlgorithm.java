package BigExercises;

import java.util.*;

/*
Instructions
Given a number determine whether or not it is valid per the Luhn formula.

The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers,
such as credit card numbers and Canadian Social Insurance Numbers.

The task is to check if a given string is valid.

Validating a Number
Strings of length 1 or less are not valid. Spaces are allowed in the input, but they should be stripped
before checking. All other non-digit characters are disallowed.

Example 1: valid credit card number
4539 3195 0343 6467
The first step of the Luhn algorithm is to double every second digit, starting from the right. We will be doubling

4_3_ 3_9_ 0_4_ 6_6_
If doubling the number results in a number greater than 9 then subtract 9 from the product. The results of our doubling:

8569 6195 0383 3437
Then sum all of the digits:

8+5+6+9+6+1+9+5+0+3+8+3+3+4+3+7 = 80
If the sum is evenly divisible by 10, then the number is valid. This number is valid!

Example 2: invalid credit card number
8273 1232 7352 0569
Double the second digits, starting from the right

7253 2262 5312 0539
Sum the digits

7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57
57 is not evenly divisible by 10, so this number is not valid.

 */

public class LuhnAlgorithm {

    private List<Integer> elements;
    private List<Integer> reverseValue;
    private String[] hiddenValue;
    private int count = 0;



    public static void main(String[] args) throws Exception {
        LuhnAlgorithm card = new LuhnAlgorithm();
        LuhnAlgorithm card1 = new LuhnAlgorithm();
        LuhnAlgorithm card2 = new LuhnAlgorithm();
        LuhnAlgorithm card3 = new LuhnAlgorithm();
        LuhnAlgorithm card4 = new LuhnAlgorithm();

        card.validCreditCar("4417123456789113");
        card1.validCreditCar("79927398713");
        card2.validCreditCar("2090399073585x");
        card3.validCreditCar("234 567 891 234");
        card4.validCreditCar("56");
    }

    public void LuhnAlgorithm(String elements) throws Exception {
        String newElements = null;
        int digits = 0;
        this.elements = new ArrayList<>();
        this.reverseValue = new ArrayList<>();
        if(elements.contains(" ")) {
            newElements = elements.replaceAll("\\s+","");
        }else {
            newElements = elements;
        }

        for(int i = 0;i<newElements.length();i++){
            if(Character.isDigit(newElements.charAt(i))){
                digits++;
            }
        }

        if (elements.length() > 16) {
            throw new Exception("Card number has more elements > 16");
        }else if(digits  < 2){
            throw new Exception("Card number is not ok");
        }else if(elements.length() < 1){
            throw new Exception("Card number has less elements < 8");
        }
        for (int i = 0; i < newElements.length(); i++) {
            if (elements.charAt(i) != 'x') {
                this.elements.add(Integer.parseInt(String.valueOf(newElements.charAt(i))));
            } else if (newElements.charAt(i) == 'x') {
                count++;
            } else if(Character.isAlphabetic(newElements.charAt(i))){
                throw new Exception("Card number is not ok");
            } else {
                throw new Exception("Card number is not ok");
            }
        }

    }


    public void validCreditCar(String cardNumber) throws Exception {
        LuhnAlgorithm(cardNumber);
        int sum = 0;
        int temp;
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
                System.out.println("!!!!!!!!!!!Please add a correct card number!!!!!!!!!!!!");
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
