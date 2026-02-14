public class Main {
    public static void main(String[] args) {
        Produto pp = new Produto("PC GAMER", 3000.0, 3);
        Produto p = new Produto("TV", 100.0, 2);
        Produto ppp = new Produto("Bola", 50.0, 2);
        ArquivoService a = new ArquivoService();
        EscritorCSV e = new EscritorCSV();

        a.somatoriaProdutos(p);
        a.somatoriaProdutos(pp);
        a.somatoriaProdutos(ppp);
        e.lerCSVS();
    }
}