package Section6;

public class MainProgram {
    
    public static void main(String[] args){
        
    //instantiating several objects
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    
    //accessing instance variables
    p1.name = "Vincent";p1.sex = 'M';p1.age = 8;
    p2.name = "Janice";p2.sex = 'F';p2.age = 18;
    p3.name = "Ricky";p3.sex = 'M';p3.age = 34;
    
    //access static variables
    Person.maleCount = 2;
    Person.femaleCount = 1;
    
    //accessing instance methods
    p1.tellSex(); p1.tellAge();
    p2.tellSex(); p2.tellAge();
    p3.tellSex(); p3.tellAge();
    
    //accessing static method
    Person.showSexDistribution();
    
    }
}
