package Exercises;


public class Variables {
    //variabile globale
    int carti;
    double reviste;
    String nume;
    boolean check;

    public static void main(String[] args) {
        Variables var = new Variables();
        var.sum();
        var.liceu();
        //System.out.println(var.x);
        //System.out.println(var.y);
    }

    public void sum() {
        //variabile locale
        int x = 10;
        int y = 15;
        System.out.println("suma: " + (10 + 15));
    }

    public void liceu() {
        // variabilele globale se initializeaza default
        System.out.println("cantitatea de carti si reviste din biblioteca: " + (carti + reviste));
        System.out.println("valoare string: " + nume);
        System.out.println("valoare boolean: " + check + "\n\n");

        // variabilele globale se initializeaza de catre programator sau de alta entitate din exterior
        System.out.println("-----------------initializate cu valori------------------\n\n");
        this.carti = 200;
        this.reviste = 150;
        this.nume = "Popescu";
        this.check = true;
        System.out.println("cantitatea de carti si reviste din biblioteca: " + (carti + reviste));
        System.out.println("valoare string: " + nume);
        System.out.println("valoare boolean: " + check);

        // variabila text pointeaza catre "Popescu" nu catre Popescu Andrei
        String text = "Popescu";
        text.concat(" Andrei");
        System.out.println("valoare variabilei text: " + text);

        // variabila text pointeaza catre "Popescu Andrei" nu catre Popescu
        text = text.concat("  Andrei");
        System.out.println("valoarea variabilei text: " + text);


        System.out.println("cursorul se va duce pe o noua linie");
        System.out.print("cursorul ramane pe pozitia curenta");

        System.out.println("\n\n");
        System.out.println("Expresii multiple: " + this.reviste + "-----" + (this.carti + this.reviste) + "------" + this.check);

    }
}
