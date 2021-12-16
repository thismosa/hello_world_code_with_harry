package com.company;
class Phone {
    public void  greet(){
        System.out.println("how are you ");
    }
    public void name (){
        System.out.println("my name is java");
    }

}
class SmartPhone extends Phone{
    public void swatah(){
        System.out.println("app ka sudatah hai");
    }
    public void name(){
        System.out.println("my name is java in class second");
    }
}

public class newOOP {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        
    }
}
