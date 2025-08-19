class Sample {
    String name, dept;
    int age;

    Sample(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public void displayStudent() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Department = " + dept);
    }
}

class Teacher extends Sample {
    Teacher(String name, int age, String dept) {
        super(name, age, dept);
        System.out.println("Name of the Teacher: " + name);
    }
}

public class demo2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Lec", 22, "CSE");
         // Now it will show all details
    }
}
