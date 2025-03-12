import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        PetBathMachine petBathMachine = new PetBathMachine();
        int choice;
        do {
            System.out.println("Start menu:");
            System.out.println("1. Bathe the pet");
            System.out.println("2. Fill with water");
            System.out.println("3. Fill with shampoo");
            System.out.println("4. Check water level");
            System.out.println("5. Check shampoo level");
            System.out.println("6. Check if there is a pet in the bath");
            System.out.println("7. Add a pet to the bath");
            System.out.println("8. Remove the pet from the bath");
            System.out.println("9. Clean the machine");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    petBathMachine.cleanPet();
                    break;
                case 2:
                    System.out.print("Enter the amount of water to add: ");
                    int waterAmount = scanner.nextInt();
                    petBathMachine.addWater(waterAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount of shampoo to add: ");
                    int shampooAmount = scanner.nextInt();
                    petBathMachine.addShampoo(shampooAmount);
                    break;
                case 4:
                    System.out.println("The water level is " + petBathMachine.getWaterVolume() + " out of "
                            + PetBathMachine.MAX_WATER + ".");
                    break;
                case 5:
                    System.out.println("The shampoo level is " + petBathMachine.getShampooVolume() + " out of "
                            + PetBathMachine.MAX_SHAMPOO + ".");
                    break;
                case 6:
                    System.out
                            .println("The machine " + (petBathMachine.hasPet() ? "has" : "does not have") + " a pet.");
                    break;
                case 7:
                    System.out.print("Enter the name of the pet: ");
                    String petName = scanner.nextLine();
                    Pet pet = new Pet(petName);
                    petBathMachine.addPetToBath(pet);
                    break;
                case 8:
                    petBathMachine.removePetFromBath();
                    break;
                case 9:
                    petBathMachine.clean();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

}
