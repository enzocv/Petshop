package com.example.enzo.petshop;

/**
 * Created by Beto on 10/07/2015.
 */
public class Constantes {

    /**
     * Transicion Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transicion Detalle -> Actualizacion
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    private static final String PUERTO_HOST = "3306";

    private static final String IP = "http://10.0.0.1:";

    /**
     * URL del Web Service
     */
    public static final String GET =
            IP
            + PUERTO_HOST
            + "/py_webservices/obtener_veterinarias.php";

}
