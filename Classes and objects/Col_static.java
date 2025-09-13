class Student{
    static String college = "BNMIT";
    String name;  // instance variable

    Student(String name){
        this.name  = name ;    // this keyword is call the instance varibale 
        name = "raj";   // this is constructor variable whic have no use 
    }
    void show(){
        System.out.println(name + " studies in " +college);
    }
    void marks(){
        System.out.println("The marks in the phy is 98");
    }
}

public class Col_static{
    public static void main(String[] args) {
        Student s1 = new Student("Kushal");
        Student s2 = new Student("Ram");
        s1.show();
        s2.show();
        s1.marks();
    
        
    }
}