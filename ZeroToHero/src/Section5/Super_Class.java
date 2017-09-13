
class SuperClass{
    int num = 20;
    
    public void display(){
        System.out.println("This is the display method of super class.");
    }
    
    public static class SubClass extends SuperClass{
        int num = 10;
        
        public void display(){
            System.out.println("This is the display method of sub class.");
        }
        
        public void myMethod(){
            SubClass sub = new SubClass();
            sub.display();
            super.display();
            System.out.println("Value of variable named num in sub class: " + sub.num);
            System.out.println("Value of variable named num in super class: " + super.num);
        }
    }
    
    public static void main(String[] args){
            SubClass obj = new SubClass();
            obj.myMethod();
    
    }
}