package com.hcl;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    String stuName;
    String stuAddress;
    int stuSSN;
    
    public void display() {
        System.out.println(stuName + "  "  +stuAddress +"  "+stuSSN);
    }
    
}
 class SerializbleTest {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.stuName="Carlos";
        s1.stuAddress="PIT";
        s1.stuSSN=12345678;
        
        try {
            FileOutputStream fos=new FileOutputStream("student.ser"); // does not store obj so use objectOutput
            ObjectOutputStream oos=new ObjectOutputStream(fos); // how to output obj to fos or student.ser
            oos.writeObject(s1);
            oos.close();fos.close();
            System.out.println("Student objects serialized data is saved in student.ser");
        }catch(Exception e) {e.printStackTrace();}
        
    }
}