/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6;

/**
 *
 * @author lylahk
 */
class XYZ implements MyInterface {
    @Override
    public void method1(){
        System.out.println("implementation of method1");
    }
    
    @Override
    public void method2(){
        System.out.println("implementation of method2");
    }
    
    public static void main(String[] args){
        MyInterface obj = new XYZ();
        obj.method1();
        
    }
}
