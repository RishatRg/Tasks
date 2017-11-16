package Collection.Pet;

/**
 * Created by RishatRg on 04.11.2017.
 */
 class Pet {
     String name;
     String character;
     int age;

    public Pet(String name, String character, int age) {
        this.name = name;
        this.character = character;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", character='" + character + '\'' +
                ", age=" + age +
                '}';
    }
}

