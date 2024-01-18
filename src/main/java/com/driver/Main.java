package com.driver;

public class Main {

    public class A{

        public String meth(){
            return"Invoking method from class A";
        }

    }
    public class B extends A{
        @Override
        public String meth(){
            return"Method is overridden in Extendend class B";
        }
    }
    public void main(String[]args){
        B objB = new B();
        String resultTask3 = objB.meth();
        System.out.println(resultTask3);

        // Task 5
        String resultTask5 = objB.meth();
        System.out.println(resultTask5);
    }
}
