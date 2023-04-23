import java.util.Scanner;

public class Student{
    //Here the most part of Encapsulation in been use 
    private String firstName;
    private String lastName;
    private int gradeYear = 0;
    private String studentID;
    private String courses;
    private int tutionBalance = 0;
    private static int costOfCourse=600;
    private static int id=1000; //here static means we hava one thing that is common for all who are chocie which sub only pay for that one only and also id after starting index keeps on increaing
    //Consturctor:prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName=in.nextLine();

        System.out.println("Enter student last name :");
        //0/only one call");
        this.lastName = in.nextLine();
        System.out.println
        ("1-Freshmen\n2-sophmore\n3 - Junior\n4 -Senior\nEnter student class level: ");
        this.gradeYear=in.nextInt();
        System.out.println(firstName+ ""+lastName+" "+gradeYear);
setStudentID();
System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
    }
    //Constructor: prompt user to enter student's name and year
    //Generate Id
    private void setStudentID(){//want to generate the student id
    //Grade Level + ID
    id++;
    this.studentID = gradeYear+" "+id;
    }
    //Enroll in Courses
    //not want to enter any parameter here
    public void enroll()
    {
        //check from two of that which would we learn that want
        do{
System.out.print("Enter course to enroll ( Q to quite)");
Scanner in=new Scanner(System.in);
String course = in.nextLine();
if(!course.equals("Q")){
    courses =courses +"\n"+course;//course means that enter by user value and courses here means that listed above
    //here your courses is that listed above so in it is inserted
    tutionBalance = tutionBalance +costOfCourse;
}
else{break;}
}while(1 != 0);
System.out.println("ENROLLED IN: "+courses);
// System.out.println("TUTION BALANCE: "+tutionBalance);
}
    
    // view balance
    //here we learn about pay tution fees
    public void viewBalance(){
        System.out.println("Your balance is:$"+tutionBalance);
    }
    //Pay Tution
    public void payTuition(int i){
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thanks you for your payment of $"+ payment);
        viewBalance();
    }
    //Show status
}
