package OopsByKK.Introduction;

import OopsByKK.AccessModifier.Public.B;

public  class outer{

 public static class Box{

   int length;
   int breadth;
   int height;

   Box(){

     this.length=12;
     this.breadth=24;
     this.height=36;
   }

   Box(int length,int breadth,int height){

     this.length=length;
     this.breadth=breadth;
     this.height=height;
   }

   Box(int side){
     this.length=side;
     this.breadth=side;
     this.height=side;
   }

   Box(Box other){

     this.length=other.length;
     this.breadth=other.breadth;
     this.height=other.height;
   }

  }

  public static class BoxWeight extends Box{

   int weight;

    BoxWeight(){
        super();
     this.weight=400;
    }

    BoxWeight(int length,int breadth,int height,int weight){
      super(length,breadth,height);
      this.weight=weight;
    }

    BoxWeight(int side){
      super(side);
      this.weight=side;
    }

    BoxWeight(BoxWeight other){
      super(other);
      this.weight=other.weight;
    }


  }


  public static void main(String[] args) {

     Box obj1=new Box();
      System.out.println(obj1.length +" " + obj1.breadth +" "+ obj1.height);

      Box obj2=new Box(98,97,96);
      System.out.println(obj2.length +" " + obj2.breadth +" "+ obj2.height);

      Box obj3=new Box(9000);
      System.out.println(obj3.length +" " + obj3.breadth +" "+ obj3.height);

      Box obj4=new Box(obj2);
      System.out.println(obj4.length +" " + obj4.breadth +" "+ obj4.height);


      BoxWeight obj5=new BoxWeight();
      System.out.println(obj5.length +" " + obj5.breadth +" "+ obj5.height +" "+ obj5.weight);

      BoxWeight obj6=new BoxWeight(1111,2222,3333,4444);
      System.out.println(obj6.length +" " + obj6.breadth +" "+ obj6.height +" "+ obj6.weight);

      BoxWeight obj7=new BoxWeight(34567);
      System.out.println(obj7.length +" " + obj7.breadth +" "+ obj7.height +" "+ obj7.weight);

      BoxWeight obj8=new BoxWeight(obj6);
      System.out.println(obj8.length +" " + obj8.breadth +" "+ obj8.height +" "+ obj8.weight);

      Box obj9=new BoxWeight();
      System.out.println(obj9.length +" " + obj9.breadth +" "+ obj9.height );











  }





  }
















