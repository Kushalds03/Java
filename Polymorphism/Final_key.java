 final class Parent {    // prevents inheritance 
   final void value(){   // prevents the method overridding     
        final int a = 10;  // with in a class iit will work 
        System.out.println(a);
    }
}

 class child extends Parent{
    void value(){
        int a = 5;
        System.out.println(a);
    }
}

public class Final_key{
    public static void main(String[] args) {
        Parent p = new Parent();
        child c = new child();
        p.value();
        c.value();
    }
}


