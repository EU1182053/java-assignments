

class CoderStudent {
    // static variable means common entity or quality of a method or class or
    // objects like college name for students
    // instance variables can be used by many methods, constructors
    // private - within the class
    // protected - through child class
    // public - everywhere
    // default - within the package
    public static int id = 0;
    public  String studId = "CS-";
    public String studName;
    public String courseName;

    CoderStudent(String studentId, String studentName, String crsName){
        id += 1;
        studId = studId + String.valueOf(id);
        System.out.println(id);
        studName = studentName;
        courseName = crsName;
        

    }

    void display(){
        System.out.println("Student ID: "+studId+" Student Name: "+studName+" Course Name: "+courseName);
    }

}

// class is a collection of objects with similar properties
public class Assignment108 {
    
    
    public static void main(String[] args) {
        CoderStudent cd1 = new CoderStudent("CS-", "Siddhesh", "Java Web");
        CoderStudent cd2 = new CoderStudent("CS-", "Siddhesh", "Java Web");
        CoderStudent cd3 = new CoderStudent("CS-", "Siddhesh", "Java Web");
        CoderStudent cd4 = new CoderStudent("CS-", "Siddhesh", "Java Web");
        CoderStudent cd5 = new CoderStudent("CS-", "Siddhesh", "Java Web");
        
        cd1.display();
        cd2.display();
        cd3.display();
        cd4.display();
        cd5.display();
    
    
    }
}
