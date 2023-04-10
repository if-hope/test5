public class Main {
    public static void main(String[] args) {

            //Birthday birthday = new Birthday();

            //int result = birthday.printAge();

            //System.out.println("~~~" + result + "~~~");
            //System.out.println(String.format("~~~<%d>~~~",result));



//        int day = 8;
//         switch (day) {
//             default:
//                 System.out.println("No such day in week");
//                 //break;
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");
//                 break;
//             //default:
//                 //System.out.println("No such day in week");
//         }

//         String text = "Hello";
//
//         switch (text.length()) {
//             case 4:
//                 System.out.println("wrong");
//                 break;
//             case 5:
//                 System.out.println("right");
//                 break;
//             default:
//                 System.out.println("something new");
//         }

//         if (day == 5) {
//             System.out.println("right" + day);
//         } else {
//             System.out.println("wrong" + day);
//         }

         for (int i = 6; i>=1; i--){
             String text = "";
             int f = 1;
             //System.out.println(i);
             for (int j = 1; j<=i; j++){
                text = text + "#";
                f *= j;
             }
             System.out.println(i + " " + text);
             System.out.println("Factorial" + f);
         }





        }

    }


