package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/* UserDefined Exception
. We can create user-defined exception class by extending from exception class or any of its sub classes
. We will throw a user-defined exception in any of the drive methods based on some condition.
. Runtime exceptions and its subclasses are not checked by compiler hence need not be declared in
  calling methods signature.
. UserDefined checked exceptions must be declared in the calling methods signature.
 */
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter balance:");
            int balance = sc.nextInt();
            updateBalance(balance);
        } catch (InvalidBalanceException e) {
            System.out.println("Invalid Balance Exception Occured");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception Occured");
            e.printStackTrace();
        }
        System.out.println("Exit Main()");
    }

    public static void updateBalance(int balance) throws InvalidBalanceException {
        if (balance < 0)
            throw new InvalidBalanceException("Balance cannot be negative");
        System.out.println("No Exception has occured");
    }

}

class InvalidBalanceException extends Exception {
    InvalidBalanceException(String msg) {
        super(msg);
    }
}
