import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Мен буюрса");
        System.out.println("              тогуз айда");
        System.out.println("                            программист болом");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("*****            ***");
        System.out.println("*****            ***");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****             ***");
        System.out.println("*****             ***");
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println();
        System.out.println();

        System.out.println("*********   ***********        *******        *******  **********  **********  ***  ***");
        System.out.println("*********   ***********       ********       ********  **********  **********  *** **");
        System.out.println("***             ***          ***   ***      ***   ***  ***         ***         *****");
        System.out.println("***             ***         **********     ***    ***  **********  *********   ****");
        System.out.println("***             ***        ***********    ***     ***  ***    ***  ***         ******");
        System.out.println("*********       ***       ***      ***   ***      ***  ***    ***  *********   ***  **");
        System.out.println("*********       ***      ***       ***  ***       ***  **********  *********   ***    ***");


        System.out.println("                 *");
        System.out.println("               ****");
        System.out.println("              *******");
        System.out.println("             *********");
        System.out.println("            ***********");
        System.out.println("           *************");
        System.out.println("          ****************");
        System.out.println("                ****");



        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any hours:  ");
        double hours = scanner.nextDouble();
        System.out.println("Please enter any minutes:  ");
        double minutes = scanner.nextDouble();
        System.out.println("Please enter any seconds:  ");
        double seconds = scanner.nextDouble();

        double resultHours = hours * 60 * 60;
        double resultMinutes = minutes * 60;

        double result = resultHours + resultMinutes + seconds;

        System.out.println("Total: " + result + "seconds");*/



       /* for(int i = 1; i < 10; i++) {
            for(int y = 1; y <10; y++){// таблица умножения
                System.out.print(y * i + "      ");
            }
            System.out.println("  ");*/


         /* for(int i = 1; i > 2 ; i++) {
            for(int y = 5; y < 1; y--){
                System.out.print(y * i + " * ");
            }
            System.out.println(" *  ");*/


       /* Scanner sc = new Scanner(System.in);
        System.out.println("Digit: ");
        int a = sc.nextInt();
        System.out.println((a > 0)? "Positive" : (a < 0)? "Negative" : (a == 0)? "It is null" :"" );*/


        /*Scanner sk = new Scanner(System.in);
        System.out.println("Digit: ");
        int a = sk.nextInt();
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("There is not !!!");*/




        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digit: ");
        int a = sc.nextInt();
        switch (a) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("it is null");*/

        /*int a = 0;
        while (a < 10) {
            System.out.println("Hello");
            a++;*/

       /* for (int a = 0; a < 10; a++) {
            System.out.println("Hello");*/



       /* int[] summa1 = new int[10];
        summa1[0] = 1;
        summa1[1] = 2;
        summa1[2] = 3;
        summa1[3] = 4;
        summa1[4] = 5;
        summa1[5] = 6;
        summa1[6] = 7;
        summa1[7] = 8;
        summa1[8] = 9;
        summa1[9] = 10;
        for(int i = 0; i < summa1.length; i++) {
            System.out.println(summa1[i]);*/


        //System.out.println(summa1.length);

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any digits;  ");
        int a = sc.nextInt();
        System.out.println((a > 0)? "Positive" : (a < 0)? "Negative" : (a == 0)? "It's null" : "");*/


        /* Random random = new Random();
        int[] massive = new int[10];
         for (int i = 0; i < massive.length; i++) {
            massive[i] = rand.nextInt(1,100);
            for(int i = 0; i < massive;i++)
                
        System.out.println(massive[i]);*/


       /* Random random = new Random();
        int[] massive = new int[15];
        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(0, 9);
            System.out.println(massive[i]);
            if(massive[i] % 2 == 0) {  // jup san chigaruu
                System.out.println();
                counter++;
            }
            System.out.println("jup san: " + counter);*/


       /* int[] massive1 = new int[5];
        int[] massive2 = new int[5];
        Random random = new Random();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < massive1.length ; i++) {
            massive1[i] = random.nextInt(0, 5);
            System.out.printf("%d", massive1[i]);
            count1 = count1 + massive1[i];
        }

        for (int i = 0; i < massive2.length; i++) {
            massive2[i] = random.nextInt(0,5);
            System.out.printf("%d", massive2[i]);
            count2 = count2 + massive2[i];

            System.out.printf("%d", count1 / massive1.length);
            System.out.println(" ");

            System.out.printf("%d", count2 / massive2.length);
            System.out.println(" ");
            if(count1 > count2) {
                System.out.println("first big digit");
            }else{
                System.out.println("second big digit");*/



       /* String aboutlucky = "I'm was unlucky before. Now I'm was lucky. So you too was lucky.";
        System.out.println(aboutlucky.replace("was", "is"));*/


       /* int[] number = new int[10];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 10;
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            if (number[i] % 2 == 0) {
                System.out.println();
                counter++;
            }
            System.out.println("jup sun:" + counter);*/


       /* hello();
        bye();
    }
    static  void hello() {
        System.out.println("Hello");
    }
    static void bye() {
        System.out.println("Bye");*/


        /* саламатсызбы();
        Stalbek("Stalbek");
    }
    static  void саламатсызбы() {
        System.out.println("Саламатсызбы");
    }
    static void Stalbek(String name) {
        System.out.println("Саламатсызбы"+name);*/


  /*   method();
    }
    static void method() {
        System.out.println("Бул менин биринчи методум");*/


    /*   sumOfTwoNumbers(4,5);

    }
    static  void sumOfTwoNumbers(int a, int b) {
        System.out.println("Сумма двух цифр" + (a+b));*/

      /*  sumOfTwoNumbers(6);
    }

        static void sumOfTwoNumbers(int a) {// jup san, tak san
            System.out.println((a % 2 == 0)? "Jup san":  "tak san");*/

      /*  sumOfTwoNumbers(20,30);

    }
     static void sumOfTwoNumbers(int a, int b) {// eki sandyn chon sanyn chygaruu
        System.out.println(Math.min(a,b));*/


      /*  String [] animals = {"Dog", "Hours", "Monkey"} ;
        array(animals);

    }
    static void array (String [] animals) {
        for (String print: animals) {
            System.out.println(print);*/

     /*   Random random = new Random();
        int[] arrayNum = new int[10];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(1, 9);

            System.out.println(arrayNum[i]);
        }


    maxNumbers(arrayNum);
    minNumbers(arrayNum);
    }
      public static void maxNumbers (int[] array)  {
        Arrays.sort(array);
        System.out.println("max" + array[9]);

    }

    public static void minNumbers (int [] array) {
        Arrays.sort(array);
        System.out.println("min: "+ array[0]);*/

       /* System.out.println( myFirstReturnMethod());

    }

        static String myFirstReturnMethod () {
            return "This is return method";*/

    /*    int n = one();
        System.out.println(n+2);
    }
    static int one() {
        return 1;*/

     /*   System.out.println(function(3));

    }

    static String function(int a) {
        if (a % 2 == 0) {
            return "jup san: ";
        }
            return "tak san: ";*/



      /*  Scanner scanner = new Scanner();
        System.out.println(function(scanner.nextInt()));
        }
        static String function(int a);
    if (a % 2 == 0);
    return */

        /*System.out.println(middleSumm(2,4,7));
    }
        static double middleSumm(int a, int b, int c) {
            return (a + b + c)/3d;//если дабл то "d", если флоат то "f"*/

      /*  Scanner sc = new Scanner(System.in);
        System.out.println(name(sc.next()));
        }

        static String name(String names) {
        if(names.length() <= 4) {
            return "Сиздин атыныз кыска";

        } else if (names.length() <=7 ) {
            return "Сиздин атыныз ортoчо";
        }else {
            return "СИдин атыныз узун";*/






       /* System.out.println(name("Stalbek",35));
            }

            static String name(String name,int age ) {

                return "My name is" + name + "I'm" + age + "yers old";*/
        /*int a =1;
        int b =20;
        int[] num = new int[20];
        for(int i = 0; i < num.length;i++) {
            num[i] = digit(a,b);
            System.out.println(num[i]+" ");*/
       /* int[] digit = (1, 7, 9, 6, 5, 4, 8, 2);
        massivMini(digit);
        massivMaxi(digit);
    }
    static void massive*/


        method(1, 5, 6, 8, 600);
    }

    static void method(int... dig) {
        //   int sum = 0;
        //   for (int i = 0; i < dig.length; i++) {

        //     sum = sum + dig[i];/// берилген сандардын суммасын чыгаруу for менен

        //  }
        //  System.out.println(sum);
        int summ = 0;
        for (int arr : dig) {
            summ = summ + arr;// foredge менен берилген сандардын суммасын чыгаруу
        }
        System.out.println(summ);
    }


}























































