

 class Getter_Setter {
    private String name;
    
    public   Getter_Setter(String name ){
        this.name = name;


    }

    public String  getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Getter_Setter get = new Getter_Setter("kushal");
        System.out.println("Name: " + get.getName()); 
    }
    
}
