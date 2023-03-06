package Lesson_23022023;

//import java.util.Scanner;
//
//public class AppEnum {
//
//    public static void main(String[] args) {
//        System.out.println("Input day: ");
//        Scanner scanner = new Scanner(System.in);
//        String day = scanner.nextLine().toUpperCase();
//
//       Day inputDay = null;
//       for (Day dayValue: Day.values()){
//         if (dayValue.name().equals(day)){
//             inputDay = dayValue;
//             break;
//         }
//       }
//       if (inputDay == null){
//           System.out.println("You input incorrect day");
//           return;
//       }
////Day[] values = Day.values();
//
//        //Day inputDay = Day.valueOf(day);
//
//        switch (inputDay) {
//            case FRIDAY:
//                System.out.println("Its a good day");
//                break;
//            case MONDAY, TUESDAY:
//                System.out.println("Its ...");
//                break;
//            default:
//                System.out.println("Incorrect");
//        }
//       //if (Day.FRIDAY.name().equals(day)) {
//
//       //    }
//        //if (day.equals("friday")) {
////
//        //}
//        Week week = new Week();
//        scanner.close();
//    }
//}
//