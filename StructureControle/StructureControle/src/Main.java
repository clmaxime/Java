import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nombre : ");
//        int userChoice = Integer.parseInt(scanner.nextLine());
//
//        if (userChoice % 2 == 0) {
//            System.out.print("Pair");
//        }
//        else {
//            System.out.print("Pair");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nombre : ");
//        int userChoice = Integer.parseInt(scanner.nextLine());
//
//        int result = 0;
//        for (int i = 0; i < userChoice; i++) {
//            result += i;
//        }
//            System.out.print(result);
//
//    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Saisissez des nombres, la saisie s'arrête à 0 : ");

            int number = 0;
            while (true) {
                System.out.print("Nombre : ");
                int userChoice = Integer.parseInt(scanner.nextLine());

                if (userChoice == 0) {
                    System.out.println("Nombre plus grand : " + number);
                    break;
                }

                if (userChoice > number) {
                    number = userChoice;
                }
        }

            
    }

}