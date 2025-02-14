package OopsByKK.Properties.Polymorphism;


// polymorphism does not apply on instance variable
class Parents {
    int value = 10;  // Instance variable in Parent
}

class Childs extends Parents {
    int value = 20;  // Hides Parent's variable
}

public class Test1 {
    public static void main(String[] args) {
        Parents obj = new Childs(); // Parent reference, Child object
        System.out.println(obj.value);  // Accessing instance variable
    }
}

