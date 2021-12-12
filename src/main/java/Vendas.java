import lombok.Data;

@Data
public class Vendas {

    private int rank;
    private String name;
    private String platform;
    private int year;
    private String gender;
    private String publisher;
    private float na_sales;
    private float eu_sales;
    private float jp_sales;
    private float other_sales;
    private float global_sales;

    public Vendas(int rank, String name, String platform, int year, String gender, String publisher, float na_sales, float eu_sales, float jp_sales, float other_sales, float global_sales){

        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.gender = gender;
        this.publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        this.other_sales = other_sales;
        this.global_sales = global_sales;

    }

}
