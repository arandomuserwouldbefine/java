package CoreJava;

import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

public class MemberDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();

        // Get user input for member details
        System.out.println("Enter name: ");
        member.name = sc.nextLine();
        System.out.println("Enter age: ");
        member.age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter phone number: ");
        member.phoneNumber = sc.nextLine();
        System.out.println("Enter address: ");
        member.address = sc.nextLine();
        System.out.println("Enter salary: ");
        member.salary = sc.nextDouble();

        // Print the salary
        member.printSalary();

        sc.close();
    }
}
