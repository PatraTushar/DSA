package basicsByKK;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println(" enter a fruit ");
//        String fruit=sc.next();



        //Type 1

//        switch (fruit){
//
//            case "Mango":
//                System.out.println(" King of fruits ");
//                break;
//
//            case "Apple":
//                System.out.println(" A sweet red fruit ");
//                break;
//
//            case "Orange":
//                System.out.println(" Round fruit ");
//                break;
//
//            case "Grapes":
//                System.out.println(" Small fruits ");
//                break;
//
//            default:
//                System.out.println(" please enter a valid fruit ");
//
//
//        }
//
        // Type 2

//        switch (fruit){
//
//            case "Mango"-> System.out.println(" King of fruits ");
//
//            case "Apple"-> System.out.println(" A sweet red fruit ");
//
//            case "Orange"-> System.out.println(" Round fruit ");
//
//            case "Grapes"-> System.out.println(" Small fruits ");
//
//            default->System.out.println(" please enter a valid fruit ");
//
//
//
//        }
//
//
//
//    }


        // Display day between 1 and 7

      //  System.out.println(" enter day ");
      //  int day=sc.nextInt();

//        switch (day) {
//
//            case 1:
//                System.out.println(" Monday ");
//                break;
//
//
//            case 2:
//                System.out.println(" Tuesday ");
//                break;
//
//            case 3:
//                System.out.println(" Wednesday ");
//                break;
//
//            case 4:
//                System.out.println(" Thursday ");
//                break;
//
//            case 5:
//                System.out.println(" Friday ");
//                break;
//
//            case 6:
//                System.out.println(" Saturday ");
//                break;
//
//            case 7:
//                System.out.println(" Sunday ");
//                break;
//
//            default:
//                System.out.println(" Invalid day ");
//        }

        // weekdays and weekends


//        switch (day) {
//
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//
//            case 5:
//                System.out.println(" Weekdays ");
//                break;
//
//            case 6:
//
//            case 7:
//                System.out.println(" Weekends ");
//                break;
//
//
//        }
//

        // Nested switch case

        System.out.println(" enter employ id");
        int empID=sc.nextInt();

        System.out.println(" enter department ");
        String department=sc.next();

        switch (empID){

            case 1:
                System.out.println(" Tushar ");
                break;

            case 2:
                System.out.println(" Kunal ");
                break;

            case 3:
                System.out.println(" employ number 3");

                switch (department){

                    case "IT":
                        System.out.println(" IT department ");
                        break;

                    case "Management":
                        System.out.println(" management department ");
                        break;

                    default:
                        System.out.println(" No department entered ");
                }

                break;

            default:
                System.out.println(" enter correct empID ");
        }




    }

    }












