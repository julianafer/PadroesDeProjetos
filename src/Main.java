public class Main {
    public static void main(String[] args) {
        String data = "Testandooo dadosoosos.";

        DataSource dataSource = new FileDataSource("OutputDemo.txt");

        DataSource encoded = new CompressionDecorator(new EncryptionDecorator(dataSource));

        encoded.writeData(data);

        String result = encoded.readData();

        System.out.println("Dados originais: " + data);
        System.out.println("Dados após leitura: " + result);
    }
}
