package Section6;

public class Person {

    static int maleCount;
    static int femaleCount;
    String name;
    char sex;
    int age;
    
    //examples of encapsulation
    public String getName(String n){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public char getSex(){
        return sex;
    }
    
    public void setSex(char s){
        sex = s;
    }
    
    
    //
    static void showSexDistribution(){
        if(maleCount > femaleCount)
            System.out.println("Majority are male.");
        else if(femaleCount > maleCount)
            System.out.println("Majority are female.");
        else
            System.out.println("Equal number of male and female."); 
    }
    
    void tellSex(){
        if (sex == 'M')
            System.out.println("I'm male.");
        else if (sex=='F')
            System.out.println("I'm female");
        else System.out.println("I don't know");
    }
    
    void tellAge(){
        if (age < 10)
            System.out.println("I'm a kid.");
        else if (age < 20)
            System.out.println("I'm a teenager");
        else System.out.println("I'm old.");
    }
}
