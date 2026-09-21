package OOPS.CompositionAndAggregation.Aggregation;


class Professor{

    String name;

   public Professor(String name){

        this.name=name;
    }


    void display(){

        System.out.println(" professor :"+name);
    }
}


class University{

    Professor professor;

   public University(Professor professor){

        this.professor=professor;
    }

    void display(){

        professor.display();
    }
}
public class AggregationDemo {

    public static void main(String[] args) {


        Professor p=new Professor(" HC VERMA ");
        University u=new University(p);
        u.display();

    }
}
