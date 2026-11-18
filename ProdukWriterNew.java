import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ProdukWriterNew {
    public static void main(String[] args) {
        List<Produk<String, Double>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 25));
        produkList.add(new Produk<>("Keyboard", 350000.0, 15));
        Path filePath = Paths.get("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double> produk : produkList) lines.add(produk.toString());
            Files.write(filePath, lines, StandardCharsets.UTF_8);
            System.out.println("Data produk berhasil disimpan.");
            List<String> hasilBaca = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            System.out.println("\\nIsi file produk_output.txt:");
            for (String line : hasilBaca) System.out.println(line);
            Produk<String, String> pelanggan = new Produk<>("Andi", "andi@email.com", 1);
            System.out.println("\\nContoh data pelanggan:");
            System.out.println(pelanggan);
        } catch (IOException e) {
            System.out.println("Gagal mengolah file: " + e.getMessage());
        }
    }
}
