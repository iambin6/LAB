package Week5;

import java.util.Scanner;


public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void InputAll(){
        Scanner sc = new Scanner(System.in);
        super.InputAll();
        
        while (true) {
            System.out.print("Platform: ");
            this.platform = sc.nextLine().trim();
            if (!this.platform.isEmpty()) break;
            System.out.println("Data input is invalid");
        }
        System.out.print("Instructors: ");
        this.instructors = sc.nextLine().trim();

        System.out.print("Note: ");
        this.note = sc.nextLine().trim();
    }

    @Override
    public String toString() {
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }
    
}