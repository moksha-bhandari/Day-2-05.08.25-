class Car {
    String nameofCompany;
    boolean isAvailable;
    F fdetials; //1

    Car(String nameofCompany, boolean isAvailable, F fdetails) { //2
        this.nameofCompany = nameofCompany;
        this.isAvailable = isAvailable;
        this.fdetials=fdetails; //3
    }

    public void getCarDetails() {
        System.out.println("Company: " + nameofCompany);
        System.out.println("Availability: " + isAvailable); 
        fdetials.displayCar(); //4 calling F class method here
    }
}
public class demo3 {
    public static void main(String[] args) {

        F obj = new F("Ferrari", "16", "red");
        Car c1= new Car("F1",true);
        c1.getCarDetails();
        
    }
}