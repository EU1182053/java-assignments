package assignment118;

public class StaticMethod {
    static int a = 50;

    int b = 40;

    void simpleDisplay(){
        System.out.println("simpleDisplay a "+a);
        System.out.println("simpleDisplay b "+b);
    }

    static void staticDisplay(){
        System.out.println("staticDisplay a "+a);
        System.out.println("In staticDisplay b can't be accessed because it is instance variable." );
    }

    public static void main(String[] args) {
        StaticMethod st = new StaticMethod();
        st.simpleDisplay();
        staticDisplay();
    }
}
