class Animals {
    String animal_name;
    int animal_age;
    String animal_species;

    public String getAnimal_name() {
        return animal_name;
    }

    public int getAnimal_age() {
        return animal_age;
    }

    public String getAnimal_species() {
        return animal_species;
    }
}

class Mammals extends Animals {
    String furColor;
    int number_of_legs;

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void giveBirth(Boolean gives_birth) {
        String birthProbability = gives_birth ? "Gives Birth" : "Does not Give Birth";
        System.out.printf("%s", birthProbability);
    }

    public void nursesYoung(Boolean raises_young) {
        String adult_raising_parent = raises_young ? "Nurses the young" : "Does not Nurse the young";
        System.out.printf("%s", adult_raising_parent);
    }
}

class Birds extends Animals {

}

public class Animal {
    public static void main(String[] args) {

        // For Mammals
        Mammals lion = new Mammals();
        Mammals platypus = new Mammals();
        // Birds eagle = new Birds();

        // Lion's attributes
        lion.animal_name = "Lion";
        lion.animal_age = 9;
        lion.animal_species = "Panthera Leo";
        lion.number_of_legs = 4;
        lion.setFurColor("Golden yellow");
        lion.giveBirth(true);
        lion.nursesYoung(true);

        // Platypus
        platypus.animal_name = "Platypus";
        platypus.animal_age = 3;
        platypus.animal_species = "Ornithorhynchus anatinus";
        platypus.number_of_legs = 4;
        platypus.setFurColor("Dark brown");
        platypus.giveBirth(true);
        platypus.nursesYoung(true);

        displayZoo(lion);
    }

    public static void displayZoo(Object animal) {
        if (animal instanceof Mammals) {
            Mammals mammal = (Mammals) animal;
            System.out.printf("Name: %s\n" +
                            "Age: %d\n" +
                            "Species: %s\n" +
                            "Fur Color: %s\n" +
                            "Gives Birth: ", mammal.animal_name, mammal.animal_age, mammal.animal_species,
                    mammal.getFurColor());
            mammal.giveBirth(true);
            System.out.print("\nNurses Young: ");
            mammal.nursesYoung(true);
            System.out.println();
        } else if (animal instanceof Birds) {
            Birds bird = (Birds) animal;
            System.out.printf("Name: %s\n" +
                            "Age: %d\n" +
                            "Species: %s\n",
                    bird.animal_name, bird.animal_age, bird.animal_species);
        }
    }
}
