import java.util.ArrayList;
import java.util.List;

public class Main3 {

    static class BomLine {
        private final String partCode;
        private final int quantity;
        private final int scrapPercent;

        BomLine(String partCode, int quantity, int scrapPercent) {
            this.partCode = partCode;
            this.quantity = quantity;
            this.scrapPercent = scrapPercent;
        }
    }

    static class BomRevision {
        private final List<BomLine> lines;

        BomRevision(List<BomLine> lines) {
            this.lines = List.copyOf(lines);
        }

        List<BomLine> lines() {
            return lines;
        }
    }

    public static void main(String[] args) {
        List<BomLine> original = new ArrayList<>();

        original.add(new BomLine("WOOD-A", 20, 5));

        BomRevision revision = new BomRevision(original);

        System.out.println("Before change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());

        original.add(new BomLine("GLUE-A", 2, 0));

        System.out.println("After change:");
        System.out.println("Original size: " + original.size());
        System.out.println("Revision size: " + revision.lines().size());

        // İkinci adım: aşağıdaki satırın başındaki // işaretini sil ve tekrar çalıştır
        // revision.lines().clear();
    }
}