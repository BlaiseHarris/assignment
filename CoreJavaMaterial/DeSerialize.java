package com.hcl;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize {
    public static void main(String[] args) {
        Student s=null; //initializing student as null
        
            try {
                FileInputStream fis=new FileInputStream("student.ser"); // getting the file input stream and passing it into the
                ObjectInputStream ois=new ObjectInputStream(fis);       // obj input stream so we can read the serialized names by 
                														// deseriailizing ! remember ! the SSN is transient so it deserializes
                														// as a default value of 0
                
                s=(Student)ois.readObject(); //ois.readObject return Object but we want only student object
                ois.close();fis.close();
                
                
                System.out.println(s.stuName);
                System.out.println(s.stuAddress);
                System.out.println(s.stuSSN);
                
            }catch(Exception e) {e.printStackTrace();}
        
        
    }
}