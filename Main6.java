public class Main6 {

    static class InventoryService {
        void updateStock() {
            System.out.println("Stock updated");
        }
    }

    static class MaterialPlanner {
        void calculateMaterialNeeds() {
            System.out.println("Material requirements calculated");
        }
    }

    static class InvoiceService {
        void createInvoice() {
            System.out.println("Invoice created");
        }
    }

    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();
        MaterialPlanner planner = new MaterialPlanner();
        InvoiceService invoice = new InvoiceService();

        inventory.updateStock();
        planner.calculateMaterialNeeds();
        invoice.createInvoice();
    }
}