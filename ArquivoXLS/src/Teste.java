import java.io.IOException;
public class Teste {
public static void main(String[] args) throws IOException {
    XLS xls=new XLS();
    xls.setInputFile("Comprovante.xls");
    Arq.escritor(xls.leitura());
}
}