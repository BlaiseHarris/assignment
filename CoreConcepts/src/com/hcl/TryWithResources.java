package com.hcl;

import java.util.*;
import java.io.*;

// Don't have to use finally block anymore
public class TryWithResources {
	 public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("saran.text")){ // creating new file
			String txt="Welcome to the world of Java"; // creating text
			byte arr[]=txt.getBytes(); // making byte arr uses txt.getbytes to get them
			fos.write(arr); // writes the text to the file
			// dont need fos.close
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
