class demoBlock
 {
 
    {
        System.out.println("Instance block is called"); // displayed second
    }
    static{
        System.out.println("inside static block"); // displayed first
    }
 
    demoBlock() // constructor
    {
        System.out.println("Inside constructor"); //displayed 3rd
    }
}
//static block- instance block- constructor- main method
 public class demo5{
     public static void main(String[] args) {
       new demoBlock();
        System.out.println("Inside main mathod");
     }
 }