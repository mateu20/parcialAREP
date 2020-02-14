
package edu.escuelaing.arep.parcial;

import java.io.*;
import java.net.*;
import java.util.*;
public class cliente {     
    
    public static void main(String[] args) throws IOException {		
		Socket echoSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;		
		List<Integer>  numeros =new ArrayList<>();
		numeros.add(1);
		numeros.add(4);
		numeros.add(3);
		numeros.add(2);
		String query =  numeros.toString().replace("[", "").replace("]", "").replace(" ", "");		
		URL herokuApp = new URL("https://murmuring-everglades-67404.herokuapp.com/calcular"+query);	
		URLConnection con = herokuApp.openConnection();
		
		in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		BufferedReader stdIn = new BufferedReader(
		new InputStreamReader(System.in));
		String line;        
		while ((line = in.readLine()) != null) { 
			System.out.println(line); 
		}
		
		in.close();
		stdIn.close();
		
	}
    
    
	
}
