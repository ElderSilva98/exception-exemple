package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.InsufficientValueException;

public class Program {

	public static void main(String[] args) {
		
		try {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: "); int number = sc.nextInt();
		System.out.print("Holder: "); String holder = sc.next();
		System.out.print("Initial balance: "); double balance = sc.nextDouble();
		System.out.print("withdraw limit: "); double limit = sc.nextDouble();
		System.out.println();
		Account acc = new Account(number,holder,balance,limit);
		
		System.out.print("Enter the amount for withdraw: "); double amount = sc.nextDouble();
		acc.withdraw(amount);
		
		sc.close();
		
		}catch (InsufficientValueException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
		
	}
}
