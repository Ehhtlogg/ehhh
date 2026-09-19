import java.util.Scanner;

public class B{
    public static void main (String args []){
    Scanner scanner = new Scanner(System.in);


 System.out.println("Enter your grade: ");
int grade = scanner.nextInt();

if (grade >= 90) {
    System.out.println("PUTA ANG GALING!!");
} else if (grade >= 80) {
    System.out.println("WOWOWOWOWOW");
} else if (grade >= 70) {
    System.out.println("Bawi nextlife");
} else if (grade >= 60) {
    System.out.println("tang inang grade iyan");
} else {
    System.out.println("how is this even possible????? apaka baba");
}

System.out.println ("Try again?: Yes or No");
String answer = scanner.next().toLowerCase();

if (answer.equals("yes")) {
    main(args);
} else if (answer.equals("no")) {
    System.out.println("Bawi next life");
}

scanner.close();



        
}
}