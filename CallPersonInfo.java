import java.util.Scanner;
public class CallPersonInfo {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        PersonInfo person1 = new PersonInfo();
        int persons1Kid;
        String persons1Name;

        System.out.print("Enter Your Name: ");
        persons1Name = scnr.nextLine();
        person1.setName(persons1Name);
        System.out.println();

        System.out.print("Enter Current Number of Kids: ");
        persons1Kid = scnr.nextInt();
        person1.setNumKids(persons1Kid);
        System.out.println();

        System.out.println(person1.getName() + "'s Kids: " + person1.getNumKids());
        person1.incNumKids();
        System.out.println("New baby, kids now: " + person1.getNumKids());
    }
}
