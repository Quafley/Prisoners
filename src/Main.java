import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Prison jail = new Prison();
        Scanner sc = new Scanner(System.in);

        boolean showmenu = true;

        while (showmenu) {
            displayMenu();
            int menuchoise = sc.nextInt();
            switch (menuchoise) {

                case 1:
                    jail.printJail();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Please give me the name of the Prisoner: ");
                    String prisonerName = sc.nextLine();
                    System.out.println("Please give me the crime committed of the Prisoner: ");
                    String prisonercomitted = sc.nextLine();
                    System.out.println("Please give me the age of the Prisoner: ");
                    int prisonerAge = sc.nextInt();
                    System.out.println("Please give me the sentence for the Prisoner: ");
                    int prisonerSentence = sc.nextInt();
                    System.out.println("Prisoner in sollitary? (y/n)");
                    String prisonerSolitary = sc.next();

                    boolean sollitary = false;

                    while (!(prisonerSolitary.equals("y") || prisonerSolitary.equals("n"))) {
                        System.out.println("Wrong input! I asked for y or n... not: " + prisonerSolitary + "...");
                        prisonerSolitary = sc.nextLine();
                    }
                    if (prisonerSolitary.equals("y")) {
                        sollitary = true;
                    }

                    jail.addPrisoner(prisonerName, prisonercomitted, prisonerAge, prisonerSentence, sollitary);
                    break;

                case 3:
                    //
                    break;

                case 4:
                    jail.save("prisoners.json");
                    break;

                case 5:
                    jail.load("prisoners.json");
                    break;
                default:
                    System.out.println("Please only chose an option from the menu.");
                    break;
            }
        }


////         different printing options.
////         print the whole jail.

//
////         print prisoners with the specified age.
//        jail.printValue(18);
//
////         print prisoners with bread in their sentence.
//        jail.printSpecificWord("Stealing");
//
////         print prisoners that are in sollitary (or that aren't).
//        jail.printSollitary(true);
//
//        System.out.println("gemiddelde leeftijd: " + jail.printGemiddelde());
    }

    public static void displayMenu() {
        System.out.println("------------------\n" +
                "1. Print the whole jail\n" +
                "2. Add a Prisoner to the Prison\n" +
                "3. Remove a Prisoner from the Prison\n" +
                "4. Save the Prison to the JSON file.\n" +
                "5. Load the Prison from the JSON file.\n");
    }
}


/**
 * Dit is het gedeelte om de Prison met .csv
 */
//        sc.nextLine();
//
//        while (sc.hasNextLine()) {
//            try {
//                String line = sc.nextLine();
//                String[] split = line.split(";");
//                jail.addPrisoner(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), split[4]);
//            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//                System.out.println("One of your lines is wrong, please correct these! " + e.getMessage());
//
//            }
//        }