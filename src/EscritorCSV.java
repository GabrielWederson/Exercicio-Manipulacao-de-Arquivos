import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EscritorCSV {
    String caminho = "C:\\Users\\gabri\\OneDrive\\Documentos\\FileReader-FileWriter\\FileReader-Writer\\csvs";

    public void lerCSVS(){
        try (BufferedReader br = new BufferedReader(new FileReader(caminho + "\\produto.csv"))){
            System.out.println("produto.csv: ");
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println(" ");
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(caminho + "\\saida\\somatorio.csv"))){
            System.out.println("somatorio.csv: ");

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println(" ");
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
