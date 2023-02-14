package BigExercises;

import java.util.*;

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
