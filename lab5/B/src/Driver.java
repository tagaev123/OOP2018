import javax.print.DocFlavor;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
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
        String testadmin, testpassword, str;
        ArrayList<Instructor> instructors = new ArrayList<>();
        ArrayList<TextBook> textBooks = new ArrayList<TextBook>();
        ArrayList<Course> courses = new ArrayList<Course>();
        BufferedWriter bw = null;
        try{
            FileWriter fw = new FileWriter("D:\\OOP\\lab5\\B\\src\\adminactions.txt");
            bw = new BufferedWriter(fw);
        } catch(IOException e){
            e.printStackTrace();
        }


         Scanner scan = new Scanner(System.in);
        while(true) {
            if (mode == Mode.USER) {
                System.out.println("You are in user mode!");
                System.out.println("Enter 1 to view available courses");
                System.out.println("Enter 2 and name of the course to display info about course");
                System.out.println("Enter 3 for change to admin mode");
                String command = scan.nextLine();
               //3 clearConsole();
                if(Integer.parseInt(command) == 1){
                    for(int i = 0; i < courses.size(); i++){
                        System.out.println(courses.get(i).courseTitle);
                        System.out.println("Press enter to continue");

                        continue;
                    }
                }
                else if(Integer.parseInt(command) == 2){
                    String coursetit = command.substring(2);
                    for(int i = 0; i < courses.size(); i++){
                        if(courses.get(i).courseTitle.equals(coursetit)){
                            System.out.println(courses.get(i).description);
                        }
                    }
                    System.out.println("Press enter to continue");

                    continue;
                }
                else if(Integer.parseInt(command) == 3){

                    System.out.println("Please enter admin login and password seperated by line!!!");
                    testadmin = scan.nextLine();
                    testpassword = scan.nextLine();
                    try {
                        FileReader fr = new FileReader("D:\\OOP\\lab5\\B\\src\\admin.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String admin = br.readLine();
                        admin = admin.substring(10);

                        String password = br.readLine();
                        password = password.substring(10);
                         br.close();
                        if(testadmin.equals(admin) && password.equals(testpassword)){
                            mode = Mode.ADMIN;
                            continue;
                        }
                        else{
                            System.out.println("Invalid login or password");
                            System.out.println("Press enter to continue");
                            continue;
                        }
                    } catch(IOException e){
                        e.printStackTrace();
                    }

                }
            }
            else{
                System.out.println("You are in admin mode!");
                System.out.println("Enter 1 to view available courses");
                System.out.println("Enter 2 and name of the course to display info about course");
                System.out.println("Enter 3 to add new textbook");
                System.out.println("Enter 4 to add new course");
                System.out.println("Enter 5 to add new instructor");

                String command = scan.nextLine();

                if(Integer.parseInt(command) == 1){
                    for(int i = 0; i < courses.size(); i++){
                        System.out.println(courses.get(i).courseTitle);
                        System.out.println("Press enter to continue");

                        continue;
                    }
                }
                else if(Integer.parseInt(command) == 2){
                    String coursetit = command.substring(2);
                    for(int i = 0; i < courses.size(); i++){
                        if(courses.get(i).courseTitle == coursetit){
                            System.out.println(courses.get(i).description);
                        }
                    }
                    System.out.println("Press enter to continue");

                    continue;
                }
                 else if(Integer.parseInt(command) == 3){
                     System.out.println("Enter the ISBN and title, then authors to add textbook seperated by space");
                     str = scan.nextLine();
                     String[] s =  str.split(" ", 2);
                     ArrayList<String> at = new ArrayList<String>();
                     for(int j = 2; j < s.length;j++){
                         at.add(s[j]);
                     }
                     textBooks.add(new TextBook(s[0], s[1], at));

                     try{
                         DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                         String date = df.format(new Date());
                         bw.write(date + " admin added new textbook " + s[1]);
                         bw.newLine();
                         bw.close();
                     } catch(IOException e){
                         e.printStackTrace();
                     }
                     continue;
                }
                else if(Integer.parseInt(command) == 4){
                    System.out.println("Enter the course title and description");
                    str = scan.nextLine();
                    String[] s =  str.split(" ");
                    courses.add(new Course(s[0], s[1]));

                    try{
                        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String date = df.format(new Date());
                        bw.write(date + " admin added new course " + s[0]);
                        bw.newLine();
                        bw.close();
                    } catch(IOException e){ e.printStackTrace();}
                    continue;
                }
                else if(Integer.parseInt(command) == 5){
                    System.out.println("Enter firstname, lastname, department, email");
                    str = scan.nextLine();
                    String[] s =  str.split(" ");
                    instructors.add(new Instructor(s[0], s[1], s[2], s[3]));

                    try{
                        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String date = df.format(new Date());

                        bw.write(date + " admin added new instructor " + s[0] + " " + s[1]);
                        bw.newLine();
                        bw.close();
                    } catch(IOException e){ e.printStackTrace();}
                    continue;

                }


            }
        }

    }
}
