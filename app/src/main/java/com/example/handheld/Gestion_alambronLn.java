package com.example.handheld;

public class Gestion_alambronLn {

    public String extraerDatoCodigoBarras(String dato, String codigoBarra){
        Integer numSeparador = 0;
        Integer contSeparador = 0;
        String respuesta = "";
        switch (dato){
            case "proveedor":
                numSeparador = 0;
                break;
            case "num_importacion":
                numSeparador = 1;
                break;
            case "detalle":
                numSeparador = 2;
                break;
            case "num_rollo":
                numSeparador = 3;
                break;
        }
        for (int i = 0; i <= codigoBarra.length() - 1; i++){
            if (numSeparador.equals(contSeparador)){
                if (codigoBarra.charAt(i) != '-'){
                    respuesta = respuesta + codigoBarra.charAt(i);
                }
            }
            if (codigoBarra.charAt(i) == '-'){
                contSeparador += 1;
            }
        }
        return respuesta;
    }
}
