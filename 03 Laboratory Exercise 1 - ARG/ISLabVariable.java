/**
 * ISLabVariable.java
 *
 * Initializes six (6) variables and prints them using string
 * concatenation with the '+' operator.
 */
public class ISLabVariable {

    public static void main(String[] args) {
        // Initialize variables based on the table.
        String f_Name = "Veronica";               // Your first name
        String l_Name = "Velasquez";              // Your last name
        char middle_ini = 'V';                    // Your middle initial
        short favNum = 12;                        // Your favorite number
        String favCarChar = "Doraemon";           // Your favorite cartoon/anime character
        String favSubj = "Computer Programming 1"; // Your favorite subject

        // Print statements that combine words and variable names.
        System.out.println("My name is " + f_Name + " " + middle_ini + ". " + l_Name + ".");
        System.out.println();
        System.out.println(favNum + " is my favorite number.");
        System.out.println();
        System.out.println("I love " + favCarChar + "!");
        System.out.println();
        System.out.println("My favorite subject is " + favSubj + ".");
    }
}
