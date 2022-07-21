package com.hcl;
interface Generic1{ // with an interface you must define all methods to the classes that implement them
    public int discount(int x);
    public void print();
}
// Interfaces uses key word implements
class Costco1 implements Generic1{
    @Override
    public int discount(int x) {
        System.out.println("The discount is "+x*1);
        return x*2;
    }
    @Override
    public void print() {
        System.out.println("This is from Costco");
    }
    
}
class Walmart1 implements Generic1{
    @Override
    public int discount(int x) {
        System.out.println("The discount is "+x*2);
        return x*2;
    }
    @Override
    public void print() {
        System.out.println("This is from Walmart");
    }
    
}
public class InterfaceMain {
    public static void main(String[] args) {
    	// using the interface then the class that implements
        Generic1 g=new Costco1();
        g.discount(2);
        g.print();
        Generic1 w=new Walmart1();
        w.discount(2);
        w.print();
    }
}