package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDrivenApp {
	static List<String> friends = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		
		
		
		friends.add("Will");
		friends.add("Will");
		friends.add("Kirsten");
		friends.add("Dean");
		friends.add("Trev");
		friends.add("Jake");
		friends.add("Kai");
		
		while (choice != 5) {
			printMenu();
			
			choice = getUserChoice();
			
			if(choice == 1) {
				displayFriends();
			}else if(choice == 2){
				addFriend();
			}else if(choice == 3) {
				deleteFriends();
			}else if(choice == 4) {
				deleteAllFriends();
			}
		}
	}
	public static void printMenu() {
		System.out.println("1) Display Friends");
		System.out.println("2) Add Friend");
		System.out.println("3) Delete Friends");
		System.out.println("4) Delete All Friends");
	}
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void displayFriends() {
System.out.println(friends);
	}
	public static void addFriend() {
	System.out.println("Enter New Friends Name: ");
		friends.add(scanner.next());
	}
	public static void deleteFriends() {
		System.out.println("enter Friends Name You Wish to Remove: ");
		friends.remove(scanner.next());
	}
	public static void deleteAllFriends() {
		System.out.println("Friends Sucessfully Cleared");
		friends.clear();
	}
 }
