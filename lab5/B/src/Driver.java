import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    enum Mode{
        ADMIN,
        USER
    }

    static void clearConsole(){
        for(int i = 0; i < 1000; i++)
           System.out.println('\n');
    }
    public static void main(String[] args){
        Mode mode = Mode.USER;

        ArrayList<TextBook> textBooks = new ArrayList<TextBook>();
        ArrayList<Course> courses = new ArrayList<Course>();


         Scanner scan = new Scanner(System.in);
        while(true) {
            if (mode == Mode.USER) {
                System.out.println("You are in user mode!");
                System.out.println("Enter 1 to view available courses");
                System.out.println("Enter 2 and name of the course to display info about course");
                System.out.println("Enter 3 for change to admin mode");
                String command = scan.nextLine();
                clearConsole();
                if(Integer.parseInt(command) == 1){
                    for(int i = 0; i < courses.size(); i++){
                        System.out.println(courses.get(i).courseTitle);
                    }
                }
                else if(Integer.parseInt(command) == 2){
                    String coursetit = command.substring(2);
                    for(int i = 0; i < courses.size(); i++){
                        if(courses.get(i).courseTitle == coursetit){
                            System.out.println(courses.get(i).description);
                        }
                    }
                }
                else if(Integer.parseInt(command) == 3){
                    clearConsole();
                    System.out.println("Please enter admin login and password seperated by line!!!");

                }
            }
        }

    }
}
