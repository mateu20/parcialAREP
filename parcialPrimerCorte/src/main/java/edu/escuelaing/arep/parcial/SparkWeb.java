package edu.escuelaing.arep.parcial;
import java.util.List;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
/**
 *
 * @author david.gonzalez-g
 */

import static spark.Spark.*;

public class SparkWeb {
  public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/calcular", (req, res) -> CalcularPage(req, res));
    }
    /**
     * 
     * @param req Pide informacion respecto a los requisitos HTML
     * @param res Pide informacion respecto a las respuestas HTML
     * @return el index html de la pagina 
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>\n"
                +"<head>\n" +
                    "<title> OrdenamientoMergeSort</title>"
                +"</head>\n"
                + "<body>\n"
                + "<h2>OrdenamientoMergeSort</h2>\n"
                + "<form action=\"/calcular\">\n"
                + "  Ingrese datos separados por un espacio:<br>\n"
                + "  <input type=\"text\" name=\"Ingrese datos separados por espacios\">\n"
                + "  <br>\n"
                + "  <input type=\"submit\" value=\"calcular\">\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>\n";
        return pageContent;
    }
    private static String CalcularPage(Request req, Response res) {
    	String pageContent= null;
    	return pageContent;
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }//returns default port if heroku-port isn't set(i.e. on localhost)    }}
    
}