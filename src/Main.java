import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception exception){
            System.out.println(exception);
            exception.getStackTrace();
            exception.printStackTrace();
            exception.getCause();
        }

    }

    public static void checkAge(int age) throws Exception{
        try{
            if(age<0 || age > 130){
                throw new IllegalAccessException();
            } else {
                System.out.printf("Your age %d, is agreat!!!", age);
            }
        }catch (IllegalAccessException exception){
            try{
                throw new TechnicalWrongAgeException("Technical wrong exception!!!", exception);
            }catch (TechnicalWrongAgeException exception1){
                throw new IllegalAccessException();
            }
        }
    }
}
