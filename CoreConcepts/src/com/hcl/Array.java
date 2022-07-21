package com.hcl;
class Emp{
    int empId;
    String empName;
    Emp(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    @Override
    public String toString() {
        return "Emp [empId=" + empId + ", empName=" + empName + "]";
    }
}
public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[3]; // initializing an array of integers
        arr[0]=45; // adding values to an index
        arr[1]=23;
        arr[2]=25;
        
        for(int i=0;i<arr.length;i++) {
            System.out.println("Index "+i + "   "+arr[i]);
        }
        Emp[] emp; // Creating array of employees
        emp=new Emp[3];
        emp[0]=new Emp(111,"Vijay"); // adding emp to specific index
        emp[1]=new Emp(222,"Athul");
        emp[2]=new Emp(333,"Justin");
        
        for(int i=0;i<emp.length;i++) {
            System.out.println("Index "+i + "   "+emp[i].empId+" "+emp[i].empName);
        }
        Emp[] emp1=new Emp[] {new Emp(123,"Brandan"),new Emp(124,"Hadiqa"),new Emp(125,"Jordan")};
        for(Emp emp2:emp1) { // can also be made like this and this is an enhanced for loop
            System.out.println(emp2);
        }
    }
}