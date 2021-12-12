import java.util.List;
import java.util.stream.Collectors;

public class Busca {

    public static void buscaPlatform(List<Vendas> list, String str){
        List<Vendas> listaFiltrada = list.stream()
                .filter(v -> v.getPlatform().equals(str))
                .collect(Collectors.toList());

        listaFiltrada.forEach(lf -> {
            System.out.println("=================================================");
            System.out.println("Rank: " + lf.getRank());
            System.out.println("Nome: " + lf.getName());
            System.out.println("Plataforma: " + lf.getPlatform());
            System.out.println("Ano: " + lf.getYear());
            System.out.println("Gênero: " + lf.getGender());
            System.out.println("Publisher: " + lf.getPublisher());
            System.out.println("N. de vendas NA: " + lf.getNa_sales());
            System.out.println("N. de vendas EU: " + lf.getEu_sales());
            System.out.println("N. de vendas JP: " + lf.getJp_sales());
            System.out.println("N. de vendas OUTROS: " + lf.getOther_sales());
            System.out.println("Total de vendas: " + lf.getGlobal_sales());
        });

    }

    public static void buscaPublisher(List<Vendas> list, String str){

        List<Vendas> listaFiltrada = list.stream()
                .filter(v -> v.getPublisher().equals(str))
                .collect(Collectors.toList());

        listaFiltrada.forEach(lf -> {
            System.out.println("=================================================");
            System.out.println("Rank: " + lf.getRank());
            System.out.println("Nome: " + lf.getName());
            System.out.println("Plataforma: " + lf.getPlatform());
            System.out.println("Ano: " + lf.getYear());
            System.out.println("Gênero: " + lf.getGender());
            System.out.println("Publisher: " + lf.getPublisher());
            System.out.println("N. de vendas NA: " + lf.getNa_sales());
            System.out.println("N. de vendas EU: " + lf.getEu_sales());
            System.out.println("N. de vendas JP: " + lf.getJp_sales());
            System.out.println("N. de vendas OUTROS: " + lf.getOther_sales());
            System.out.println("Total de vendas: " + lf.getGlobal_sales());
        });


    }


}
