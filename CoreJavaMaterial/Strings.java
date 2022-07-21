package com.hcl;
public class Strings {
    
    public static void main(String[] args) {
        String s1="Dylan";  //String is always immutable
        String s2="Dylan"; // these string using the same memory
        //s1.concat("Saran"); cant add saran like this because not changable
        String s3=new String("Dylan"); // this allocates different memory with new String("blah");
        String s4=s3.intern();  //store the string in the constant pool
        
        if(s1.equals(s4)) {
            System.out.println(true);
            
        }else {
            System.out.println(false);
        }
        if(s1==s2) { // false connects to same memory location
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        
        
    }
}