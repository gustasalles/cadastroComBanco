package org.example.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {
    public static Date StringToDate(String date) {
        // A string contendo a data no formato desejado
        String dataString;
        dataString = date;
        // Defina o formato da data da string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Faça o parse da string para obter a data
            Date data = dateFormat.parse(dataString);
            System.out.println("Data convertida: " + data);
            return data;
        } catch (
                ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static java.sql.Date fromSqlDate(java.util.Date utilDate) {
        if (utilDate == null) {
            return null;
        }
        return new java.sql.Date(utilDate.getTime());
    }
}



