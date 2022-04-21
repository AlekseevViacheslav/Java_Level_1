public class Main {


    public static void main(String[] args) {

        // AGE, aGe, Age, aGe, AgE     ageOfChild

        System.out.println("Вызов метода checkWorker");
        checkWorker();
        System.out.println("Вызов метода isLegalAge");

        drawCat();

        System.out.println("Повторный вызов методов");
        checkWorker();


        double sumOfSomething = sum(100, 200);
        System.out.println(sumOfSomething);

        int numOfMonth = 1;

        System.out.println("Работа if");
        if (numOfMonth == 1) {
            System.out.println("Январь");
        }
        else if (numOfMonth == 2) {
            System.out.println("Февраль");
        }
        else if (numOfMonth == 3) {
            System.out.println("Март");
        }

        System.out.println("Работа switch");
        switch (numOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
        }

        int salary = 4956;
        int balance = 0;
        int goal = 4983244;

        while (balance < goal) { //условие окончания
            balance += salary;
            System.out.println(balance + " " + goal);

        }

        for (int i = 0; i < 10; i++) {

            int TV = 5;

            for (int j = 0; j < 10; j++) {
                String test = "";
                System.out.println(i + " " + j);
            }
            System.out.println("Первый цикл завершает итерацию");
        }



        /*
        int page = 30;
        for (int i = 0; i < page; i++) {
            drawCat();
            System.out.println(page);
        }
         */

        //while (true) {} -> бесконечный цикл


        int n = 0;
        while (n > 0) {
            n--;
            System.out.println(n);
        }

        n = 0;
        do {
            n--;
            System.out.println(n);
        } while (n > 0);

        System.out.println();
    }

    public static void checkWorker() {
        //Работник
        //Integer
        int age = 20; //byte [8], short [16], int [32] {-2 млрда ~ 2 млрд}, long [64]
        //Дробные
        double salary = 200000; //float [32], double [64]
        //String
        String name = "Слава";
        String secondName = "Алексеев";
        //Boolean
        boolean isActive = true;//true, false

        //активный
        if (isActive) {
            System.out.println("Ты премирован! Премия " + salary * 2);

            if (age > 18) {
                System.out.println("Даю грамоту");
            }

        }
        else {
            System.out.println("Ты плохой работник!");
        }

        //какого возраста человек
        int num = -1;

        if (num >= 35) {
            System.out.println("Взрослый человек");
        }
        else if (num >= 18) {
            System.out.println("Молодой человек");
        }
        else if (num >= 14) {
            System.out.println("Юноша");
        }
        if (num > 0) {
            System.out.println("Ребёнок");
        }
        else {
            System.out.println("Бред какой-то");
        }

    }

    public static boolean checkIsLegalAge(int age) {
        boolean isLegalAge = age >= 18 && age <= 100;   //()
        return isLegalAge;
    }

    public static void drawCat() {
        System.out.println(" _..---...,\"\"-._ ,/}/)\n" +
                " .'' , ``..'(/-<\n" +
                " / _ { ) \\\n" +
                " ; _ `. `. < a(\n" +
                " ,' ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /-._))) `-._)))\n" +
                " `...' ");
    }

    //сумму двух чисел
    public static double sum(double x, double y) {
        double result = 0;
        result = x + y;
        return result;
    }



    public static void printGreeting(String name) {
        System.out.println(name + " приветствую");
    }

}
