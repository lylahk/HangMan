
package Section5;

public class Calculation {
    
    public int z;
    
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }
    
    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The difference of the given numbers: " + z);
    }

    
public static void main(String[] args){
    int a = 20, b = 10;
    My_Calculations demo = new My_Calculations();
    demo.addition(a, b);
    demo.subtraction(a,b);
    demo.multiplication(a,b);
    }

public static class My_Calculations extends Calculation{
    
    public void multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }
}


}


