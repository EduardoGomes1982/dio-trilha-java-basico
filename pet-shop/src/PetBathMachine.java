public class PetBathMachine {

    private Pet pet;
    private int waterVolume;
    private int shampooVolume;
    private boolean clean;
    public static final int MAX_WATER = 30;
    public static final int MAX_SHAMPOO = 10;

    public PetBathMachine() {
        this.waterVolume = MAX_WATER;
        this.shampooVolume = MAX_SHAMPOO;
        this.clean = true;
    }

    public Pet getPet() {
        return pet;
    }

    public void addPetToBath(Pet pet) {
        if (hasPet()) {
            System.out.println("The machine already has a pet. Please remove the pet first.");
            return;
        }
        if (!clean) {
            System.out.println("The machine is not clean. Please clean the machine first.");
            return;
        }
        this.pet = pet;
    }

    public void removePetFromBath() {
        if (!hasPet()) {
            System.out.println("The machine does not have a pet.");
            return;
        }
        clean = pet.isClean();
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void addWater(int water) {
        if (water <= 0 || water > 2) {
            System.out.println("The water volume must be 1 or 2.");
            return;
        }
        if (water > MAX_WATER - waterVolume) {
            System.out.println("The water volume exceeds the maximum capacity.");
            return;
        }
        waterVolume += water;
    }

    public int getWaterVolume() {
        return waterVolume;
    }

    public void addShampoo(int shampoo) {
        if (shampoo <= 0 || shampoo > 2) {
            System.out.println("The shampoo volume must be 1 or 2.");
            return;
        }
        if (shampoo > MAX_SHAMPOO - shampooVolume) {
            System.out.println("The shampoo volume exceeds the maximum capacity.");
            return;
        }
        shampooVolume += shampoo;
    }

    public int getShampooVolume() {
        return shampooVolume;
    }

    public void cleanPet() {
        if (!hasPet()) {
            System.out.println("The machine does not have a pet.");
            return;
        }
        if (waterVolume < 10 || shampooVolume < 2) {
            System.out.println("The machine does not have enough water or shampoo.");
            return;
        }
        waterVolume -= 10;
        shampooVolume -= 2;
        pet.clean();
    }

    public void clean() {
        if (hasPet()) {
            System.out.println("The machine has a pet. Please remove the pet first.");
            return;
        }
        if (waterVolume < 3 || shampooVolume < 1) {
            System.out.println("The machine does not have enough water or shampoo.");
            return;
        }
        waterVolume -= 3;
        shampooVolume -= 1;
        clean = true;
    }

}
