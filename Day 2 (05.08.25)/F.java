class F {
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