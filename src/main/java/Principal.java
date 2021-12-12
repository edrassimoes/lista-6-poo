import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static java.lang.Float.parseFloat;

public class Principal {

    private static final String csvPath = "vendas-games.csv";

    public static void main(String[] args) {

        List<Vendas> vendasList = new ArrayList<>();

        //Leitor do arquivo .csv
        try {
            CSVReader csvReader = new CSVReader(new FileReader(new File(csvPath)));

            List<Map<String,String>> linhas = new ArrayList<>();

            String[] headers = csvReader.readNext();
            String[] colunas = null;

            while((colunas = csvReader.readNext()) != null ) {
                Map<String, String> campos = new HashMap<>();

                for (int i = 0; i < colunas.length; i++) {
                    campos.put(headers[i],colunas[i]);
                }

               linhas.add(campos);

            }

            linhas.forEach( c -> {
                Vendas v = new Vendas(Integer.parseInt(c.get("rank")), c.get("name"), c.get("platform"),Integer.parseInt(c.get("year")),c.get("genre"),c.get("publisher"),parseFloat(c.get("na_sales")),parseFloat(c.get("eu_sales")),parseFloat(c.get("jp_sales")),parseFloat(c.get("other_sales")),parseFloat(c.get("global_sales")));
                vendasList.add(v);
            });

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        Busca.buscaPlatform(vendasList,"Wii");

        Busca.buscaPublisher(vendasList, "Nintendo");

    }

}
