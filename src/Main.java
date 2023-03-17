import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner.nextLine());
        student.setSerName(scanner.nextLine());
        student.setSerName();
        System.out.println("Name"+student.getName()+"\n"+"surname"+student.getSerName()+"\n");
    }
}
