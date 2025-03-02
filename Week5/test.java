package Week5;

public class test {
    public static void main(String[] args) {
        CourseManagement courseManagerment = new CourseManagement();
        OnlineCourse onlineCourse1 = new OnlineCourse();
        OnlineCourse onlineCourse2 = new OnlineCourse();
        onlineCourse1.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse1);
        
        onlineCourse2.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse2);
        
        courseManagerment.showOnlineCourse();
    }
}