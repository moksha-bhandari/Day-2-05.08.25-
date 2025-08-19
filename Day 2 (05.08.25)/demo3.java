class Car {
    String nameofCompany;
    boolean isAvailable;

    Car(String nameofCompany, boolean isAvailable) {
        this.nameofCompany = nameofCompany;
        this.isAvailable = isAvailable;
    }

    public void getCarDetails() {
        System.out.println("Company: " + nameofCompany);
        System.out.println("Availability: " + isAvailable);
    }
}

class F extends Car {
    String carName, modelName, color;

    F(String carName, String modelName, String color) {
        super("F1", true);
        this.carName = carName;
        this.modelName = modelName;
        this.color = color;
    }

    public void displayCar() {
        System.out.println("Name of the car: " + carName);
        System.out.println("Model: " + modelName);
        System.out.println("Color: " + color);
    }
}

public class demo3 {
    public static void main(String[] args) {
        F f1 = new F("Ferrari", "16", "red");
        f1.getCarDetails();
        f1.displayCar();
    }
}
