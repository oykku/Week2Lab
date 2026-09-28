import java.util.Map;

public class Main5 {

    // Exercise 4'ten gelen sınıf
    static class InventorySnapshot {
        private final Map<String, Long> quantities;

        InventorySnapshot(Map<String, Long> quantities) {
            this.quantities = Map.copyOf(quantities);
        }

        long available(String componentCode) {
            return quantities.getOrDefault(componentCode, 0L);
        }
    }

    // Part A — Dependency: sadece parametre olarak alıyor, saklamıyor
    static class MaterialPlanner {
        void showWoodStock(InventorySnapshot stock) {
            System.out.println("Planner sees WOOD-A: " + stock.available("WOOD-A"));
        }
    }

    // Part B — Association: alanda (field) saklıyor
    static class StockViewer {
        private final InventorySnapshot stock;

        StockViewer(InventorySnapshot stock) {
            this.stock = stock;
        }

        void showWood() {
            System.out.println("Viewer remembers WOOD-A: " + stock.available("WOOD-A"));
        }
    }

    public static void main(String[] args) {
        InventorySnapshot stock = new InventorySnapshot(Map.of("WOOD-A", 3000L));

        // Part A
        System.out.println("--- Part A: Dependency ---");
        MaterialPlanner planner = new MaterialPlanner();
        planner.showWoodStock(stock);

        // Part B
        System.out.println("--- Part B: Association ---");
        StockViewer viewer = new StockViewer(stock);
        viewer.showWood();
        viewer.showWood();
    }
}