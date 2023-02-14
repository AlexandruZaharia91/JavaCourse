package BigExercises;

public class VerificareCNP {
    private static final String numarConstanta = "279146358279";

    public static void main(String[] args) throws Exception {
        VerificareCNP cnp = new VerificareCNP();
        System.out.println(cnp.checkCNP("2990219469000"));
    }


    public String checkCNP(String number) throws Exception {
        int suma = 0;
        int cifraControl = 0;
        if(number.length() > 13 || number.length() < 13) {
            throw new IllegalArgumentException("Please add a CNP with 13 digits");
        }
        for(int i = 0;i<number.length()-1;i++) {
            System.out.println(Integer.parseInt(String.valueOf(number.charAt(i)))  + "-----" + Integer.parseInt(String.valueOf(numarConstanta.charAt(i))));
            suma = suma + (Integer.parseInt(String.valueOf(number.charAt(i))) * Integer.parseInt(String.valueOf(numarConstanta.charAt(i))));
        }

        if(suma % 11 <10 ){
            cifraControl = suma%11;
        }else if(suma%11 == 10){
            cifraControl = 1;
        }

        if(cifraControl != Integer.parseInt(String.valueOf(number.charAt(number.length()-1)))) {
            System.out.println("CNP ul nu este bun , nu este corect scris!!!!!!!");
            throw new Exception("Wrong CNP");
        }
        return "CNP is: " + number + "  si cifra de control este: " + cifraControl;
    }




}
