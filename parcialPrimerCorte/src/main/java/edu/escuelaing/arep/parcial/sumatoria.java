package edu.escuelaing.arep.parcial;

import java.util.List;

public class sumatoria {
		/**
	         * 
	         * @param num Recibe una lista de Double
	         * @return la sumatoria del arreglo dividido por la cantidad de elementos
	         * del mismo
	         */
		 public static double Sumatoria(List<Double> num){
		        int respuesta = num.size();
		        double sum = 0;
		        for (Double numb : num){
		            sum += numb;
		        }
		        return sum;
		    }
}
