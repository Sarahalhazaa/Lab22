import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//Q1-------------------------------------------------------------
//        ArrayList<String> S= new ArrayList<String>();
//        S.add("cat");
//        S.add("dog");
//        S.add("red");
//        S.add("is");
//        S.add("am");
//        Checklongest( S );

//Q2---------------------------------------------------------------
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        a.add(1);
//        a.add(1);
//        a.add(1);
//        a.add(3);
//        a.add(3);
//        a.add(5);
//        System.out.println(" Enter number :");
//       int num = scanner.nextInt();
//        Checkoccurrences(a , num);

//Q3---------------------------------------------------------
//        int[] b = {1, 4, 7, 17, 25, 3, 100};
//        System.out.println(" Enter number :");
//        int number = scanner.nextInt();
//        max(b, number);

//Q4----------------------------------------------------------
//        ArrayList<Integer> A = new ArrayList<Integer>();
//        A.add(1);
//        A.add(2);
//        A.add(3);
//        A.add(4);
//        A.add(5);
//        reverse(A);


//Q5------------------------------------------------------------

//        System.out.println(" Enter size :");
//        int size = scanner.nextInt();
//        list(size);
//Q6-----------------------------------------------------------------
//        System.out.println(" Enter min range :");
//        int minrange = scanner.nextInt();
//        System.out.println(" Enter max range :");
//        int maxrange = scanner.nextInt();
//        System.out.println(" Enter number to generate :");
//        int g = scanner.nextInt();
//        random( minrange , maxrange , g);

//Q7------------------------------------------------------------------
//        System.out.print("Enter a password: ");
//        String password = scanner.nextLine();
//
//        int totalScore = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//
//        if (totalScore >= 8) {
//            System.out.println("Password is strong.");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }
//Q8--------------------------------------------------------------------

//        System.out.print("Enter number to generate Fibonacci sequence: ");
//        int number = scanner.nextInt();
//        Fibonacci (number);


//---------------------------------------------------------------------
    }




    //Q1-------------------------------------------------------------
    public static void Checklongest(ArrayList<String> s) {
        int longest = s.get(0).length();
        int longest1 = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() > longest) {
                longest = s.get(i).length();
                longest1 = i;
            }
        }
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).length() == longest) {
                System.out.println(s.get(i));
            }
        }
    }

    //Q2-----------------------------------------------------------------
    public static void Checkoccurrences(ArrayList<Integer> a, int num) {

        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == num) {
                count++;

            }
        }
        System.out.println(num + "occurs" + count + "times");
        count = 0;

    }
    //Q3---------------------------------------------------------------
    public static void max(int[] a, int n) {

        Arrays.sort(a);
        int[] max = new int[n];

        for (int i = 0; i < n; i++) {
            max[i] = a[a.length - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(max[i]);
        }
    }
    //Q4----------------------------------------------------------------
    public static void reverse(ArrayList<Integer> A) {
        String reverse = "";
        for (int i = A.size() - 1; i >= 0; i--) {
            reverse += A.get(i);
        }
        System.out.println(reverse);
    }
    //Q5----------------------------------------------------------------
    public static void list(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[size];
        System.out.println(" Enter the number to enter to switch :");
        int n = scanner.nextInt();
       do {

        switch (n) {
            case 1:
                for (int i = 0; i < size; i++) {
                    System.out.println(" Enter number :");
                    A[i] = scanner.nextInt();

                }
                break;
            case 2:
                for (int i = 0; i < A.length; i++) {
                    System.out.println(A[i]);
                }
                break;
            case 3:
                System.out.println(" Enter number of search :");
               int m = scanner.nextInt();
                for (int i = 0; i < A.length; i++) {
                    if (A[i] == m) {
                        if (i == A.length -1){
                            System.out.println(A[i] +" The number exists");}
                    }
                }
                break;
            case 4:
                Arrays.sort(A);
                for (int i = 0; i < A.length; i++) {
                    System.out.println(A[i]);
                }
                break;
            case 5:
                break;
        }
           System.out.println(" Enter the number to enter to switch :");
          n = scanner.nextInt();
        }while (n!= 5);

        }

//Q6-----------------------------------------------------------------

    public static void random(int minrange , int maxrange , int g) {

        Random random =new Random();
        for (int i =0 ; i< g ; i++) {
            int RandomNumber = random.nextInt(maxrange) + minrange;
            System.out.println(RandomNumber);
        }
    }
//Q7------------------------------------------------------------------
public static int checkLength(String password) {

    if ( password.length()<=5 ) {
        return 0;
    } else if (password.length()<=7) {
        return 2;
    } else {
        return 3;
    }
}

   public static int checkSpecialCharacters(String password) {
        if (password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:'\"<>,.?/].*")) {
            return 2;
        } else {
            return 0;
        }
    }
    public static int checkUpperCaseLowerCase(String password) {
        if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")) {
            return 3;
        } else {
            return 0;
        }
    }

//Q8--------------------------------------------------------------------------
public static void Fibonacci(int number) {
    int firstnum = 0;
    int secondnum = 1;

    System.out.println("Fibonacci sequence ;");

    for (int i = 0; i < number; i++) {
        System.out.print(firstnum + " ");

        int nextnumber = firstnum + secondnum;
        firstnum = secondnum;
        secondnum = nextnumber;
    }
}

}
