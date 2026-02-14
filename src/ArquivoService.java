import java.io.*;


public class ArquivoService {

    String caminho = "C:\\Users\\gabri\\OneDrive\\Documentos\\FileReader-FileWriter\\FileReader-Writer\\csvs";

    public void somatoriaProdutos(Produto produto){

        String linhaProduto = produto.getNome() + "," + produto.getValor() + "," + produto.getQuantidade();
        String linhaSomatorio = produto.getNome() + "," + produto.getValor() * produto.getQuantidade();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
            boolean criado = new File(caminho + "\\saida").mkdir();

        } catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho + "\\produto.csv", true))){
                bw.write(linhaProduto);
                bw.newLine();

            System.out.println("produto adicionado a arquivo produto.csv");
            System.out.println(" ");
        } catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho + "\\saida\\somatorio.csv", true))){
                bw.write(linhaSomatorio);
                bw.newLine();

            System.out.println("produto adicionado a arquivo somatorio.csv");
            System.out.println(" ");
        } catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }


}
