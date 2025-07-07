package OopsByKK.Generics.GenericMethod;



public class Stats<T extends Number> {

    T[] numbers;

    Stats(T[] numbers){

        this.numbers=numbers;
    }

    double average(){

        double sum=0.0;

        for(T ele : numbers){

            sum+=ele.doubleValue();
        }

        return sum/numbers.length;
    }



    public static void main(String[] args) {

        Integer[] arr={1,2,3};
        Stats<Integer> obj=new Stats<>(arr);
        System.out.println(obj.average());

        Double[] doubleArr={1.1,2.2,3.3};
        Stats<Double> obj2=new Stats<>(doubleArr);
        System.out.println(obj2.average());



    }
}
