package OopsByKK.streamAPI.comparable;

public class Theory {

    public static void main(String[] args) {

        //In Java, when you want to sort objects (like a list of custom Employee, Student, Book, etc.),
        //Java does not know how to compare them by default.
        //Primitive types (int, char, etc.) can be sorted because Java knows how to compare them.
        //Objects? Java needs your help:
        //Comparable → "natural order" (one fixed way inside the class).
        //Comparator → "custom order" (you can create many different ways outside the class).




        //What is Comparable?
        //Comparable means the class itself decides how its objects should be compared.
        //It’s like saying:
        //"Every time you compare two Student objects, compare by roll number (or name, or marks)."


        //In Java, the Comparable interface is used for this.
        //It has only one method:
        // public interface Comparable<T> {
        //    int compareTo(T o);
        //}


        //compareTo() returns:
        //0 → if both objects are equal.
        //Negative number → if this object is smaller than the other.
        //Positive number → if this object is greater than the other.






    }
}
