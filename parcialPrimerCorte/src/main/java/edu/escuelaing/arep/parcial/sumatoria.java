package edu.escuelaing.arep.parcial;

import java.util.List;

public class sumatoria {

		 public static Integer Sumatoria(List<Integer> num){
		        int respuesta = num.size();
		        Integer sum = 0;
		        for (Integer numb : num){
		            sum += numb;
		        }
		        return sum;
		    }
}
