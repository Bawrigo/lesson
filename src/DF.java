import java.util.Scanner;

public class DF {


    public static void main(String[] args) {
        System.out.print("neshe san kiritesiz:");
        Scanner scanner = new Scanner(System.in);
        int numberOfVariables = (scanner.nextInt());
        DF df = new DF();
        double number1 = df.getNumber();
        double number2 = df.getNumber();
        double number3 = df.getNumber();
        int operation = df.getOperation();

        double result = df.getResult(operation, number1, number2, number3, numberOfVariables);
        System.out.println("Result: " + result);


    }

    public  double qosiw(double number1, double number2, double number3) {

        return number1 + number2 + number3;
    }

    public  double qosiw(double number1, double number2) {
        return number1 + number2;
    }

    public  double aliw(double number1, double number2) {

        return number1 - number2;
    }

    public  double aliw(double number1, double number2, double number3) {
        return number1 - number2 - number3;

    }

    public  double kobeytiw(double number1, double number2) {

        return number1 * number2;
    }

    public  double kobeytiw(double number1, double number2, double number3) {
        return number1 * number2 * number3;
    }

    public  double boliw(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("You cannot divide by 0");
            return Double.NaN;

        }
    }

    public  double boliw(double number1, double number2, double number3) {
        if (number2 != 0 && number3 != 0) {
            return number1 / number2 / number3;
        } else {
            System.out.println("You cannot divide by 0");
            return Double.NaN;
        }
    }

    public  double arif(double number1, double number2) {
        return (number1 + number2) / 2;
    }

    public  double arif(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }


    public  double getResult(int operation, double number1, double number2, double number3, int numberOfVariables) {
        switch (operation) {
            case 1:
                if (numberOfVariables == 3) {
                    return qosiw(number1, number2, number3);
                } else {
                    return qosiw(number1, number2);
                }
            case 2:
                if (numberOfVariables == 3) {
                    return aliw(number1, number2, number3);
                } else {
                    return aliw(number1, number2);
                }
            case 3:
                if (numberOfVariables == 3) {
                    return kobeytiw(number1, number2, number3);
                } else {
                    return kobeytiw(number1, number2);
                }
            case 4:
                if (numberOfVariables == 3) {
                    return boliw(number1, number2, number3);
                } else {
                    return boliw(number1, number2);
                }
            case 5:
                if (numberOfVariables == 3) {
                    return arif(number1, number2, number3);
                } else {
                    return arif(number1, number2);
                }
        }
        return 0;
    }


    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number=");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.print("Imput error ! Please try again:");
            return 0;
        }
    }

    public static int getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1 +
                2 -
                3 *
                4 /
                5 arif""");
        System.out.print("Choose operation:");
        return scanner.nextInt();
    }

}




