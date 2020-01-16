import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Prison jail = new Prison();
        File prisoners = new File("prisoners.csv");
        Scanner sc = new Scanner(prisoners);
        sc.nextLine();

        while (sc.hasNextLine()) {
            try {
                String line = sc.nextLine();
                String[] split = line.split(";");
                jail.addPrisoner(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), split[4]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("One of your lines is wrong, please correct these! " + e.getMessage());

            }
        }

        // different printing options.
////         print the whole jail.
        //jail.printJail();
//
////         print prisoners with the specified age.
//        jail.printValue(18);
//
////         print prisoners with bread in their sentence.
//        jail.printSpecificWord("Stealing");
//
////         print prisoners that are in sollitary (or that aren't).
        jail.printSollitary(true);
//
//
//        System.out.println("gemiddelde leeftijd: " + jail.printGemiddelde());
    }
}

