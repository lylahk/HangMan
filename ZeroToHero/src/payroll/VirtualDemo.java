package payroll;

public class VirtualDemo {

    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta UP", 33600);
        Employee e = new Salary("John Adams", "Boston MA", 22400);
        System.out.println("Call mailCheck method using Salary reference - -");
        s.mailCheck();
        System.out.println("\nCall mailCheck method using Employee reference - -");
        e.mailCheck();
        
    }
    
}
