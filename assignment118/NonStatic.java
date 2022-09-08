package assignment118;

public class NonStatic {
    public static void main(String[] args) {
        StaticMethod st = new StaticMethod();
        st.simpleDisplay();
        StaticMethod.staticDisplay();
    }
}
