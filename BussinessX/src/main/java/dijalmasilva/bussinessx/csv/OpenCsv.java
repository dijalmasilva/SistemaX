/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.bussinessx.csv;

import au.com.bytecode.opencsv.CSVReader;
import dijalmasilva.bussinessx.entidades.Feriado;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe utilizada para leitura de arquivo CSV
 *
 * @author kaique
 */
public class OpenCsv {

    /**
     * Método usado para ler um arquivo csv e retornar uma {@linkplain List} de
     * feriados
     *
     * @param filename
     * @return {@linkplain List}
     * @throws java.text.ParseException
     */
    public List<Feriado> lerCSV(File filename) throws ParseException {
        try {
            if (filename.getName().endsWith(".csv")) {
                CSVReader reader = new CSVReader(new InputStreamReader(
                        new FileInputStream(filename), "UTF-8"), ';', '\'', 1);
                try {
                    String[] values = reader.readNext();
                    List<Feriado> feriados = new ArrayList<>();
                    while (values != null) {
                        String feriado = values[0];
                        String split[] = feriado.split(",");
                        Feriado f = new Feriado();
                        f.setTitle(split[1]);

                        String data = split[0];
                        String datasplit[] = data.split("/");

                        String dataConvertida = datasplit[2] + datasplit[1] + datasplit[0];
                        f.setStart(dataConvertida);
                        f.setEnd(dataConvertida);
                        feriados.add(f);

                        values = reader.readNext();
                    }

                    return feriados.isEmpty() ? null : feriados;
                } finally {
                    reader.close();
                }
            } else {
                return null;
            }

        } catch (IOException e) {
        }
        return null;
    }
}
