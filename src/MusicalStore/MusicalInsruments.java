package MusicalStore;

/**
 * Created by RishatRg on 20.10.2017.
 */
interface MusicalInstrument {
    String getName();
    String getSound();
    double getCost();
}

class Guitar implements MusicalInstrument {
    double cost;
    String model;

    Guitar(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return " Guitar," + model;
    }

    public String getSound() {
        return " звучит " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

class Piano implements MusicalInstrument {
    double cost;
    String model;

    Piano(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return " Piano, " + model;
    }

    public String getSound() {
        return " звучит " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

class Violin implements MusicalInstrument {
    double cost;
    String model;

    Violin(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return "Violin, " + model;
    }

    public String getSound() {
        return " играет " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

class Balalaika implements MusicalInstrument {
    double cost;
    String model;

    Balalaika(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return "Balalaika, " + model;
    }

    public String getSound() {
        return " играет " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

class Cello implements MusicalInstrument {
    double cost;
    String model;

    Cello(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return "Cello, " + model;
    }

    public String getSound() {
        return " играет " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

class Drum implements MusicalInstrument {
    double cost;
    String model;

    Drum(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return "Drum, " + model;
    }

    public String getSound() {
        return " играет " + model;
    }

    @Override
    public double getCost() {
        return cost;
    }
}



