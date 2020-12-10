import java.util.Scanner;

public class IsPrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int number = scanner.nextInt();

        int i = 2;

        while(i < number)
        {
            if (number % i == 0 )
            {
                System.out.println(number + " is not a prime number.");
                break;
            }
            i++;

        }
        if (i==number){
            System.out.println(number+ " is a Prime Number");
        }
    }

}

