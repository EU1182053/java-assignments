package assignment98;
class Parent{
    void printData(){
        System.out.println("Method of parent class.");
    }
}

class Child extends Parent{
    void printData(){
        System.out.println("Method of child class.");
    }
}

public class UpCasting {
    
    public static void main(String[] args) {
        Parent obj1 = (Parent) new Child();
        Parent obj2 = (Parent) new Child();

        obj1.printData();
        obj2.printData();
    }
}
