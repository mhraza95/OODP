public class App {
    public static void main(String[] args) throws Exception {
        // Create handlers
        SupportHandler technicalHandler = new TechnicalSupportHandler();
        SupportHandler billingHandler = new BillingSupportHandler();
        SupportHandler generalHandler = new GeneralSupportHandler();

        // Set up the chain of responsibility
        technicalHandler.setNextHandler(billingHandler);
        billingHandler.setNextHandler(generalHandler);

        // Test queries
        System.out.println("Testing technical query:");
        technicalHandler.handleQuery(QueryType.TECHNICAL);

        System.out.println("\nTesting billing query:");
        technicalHandler.handleQuery(QueryType.BILLING);

        System.out.println("\nTesting general query:");
        technicalHandler.handleQuery(QueryType.GENERAL);

        System.out.println("\nTesting unknown query:");
        technicalHandler.handleQuery(null);
    }
}
