package assignment118;
// only abtract method

// final and static variables
// can't implements class
// interface implements keyword

//Interface declaration: by first user  
interface Drawable {
    void draw();
}

// Implementation: by second user
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
    }
}
