public class BillingSupportHandler extends SupportHandler {
    @Override
    public void handleQuery(QueryType queryType) {
        if (queryType == QueryType.BILLING) {
            System.out.println("Handling billing query.");
        } else if (nextHandler != null) {
            nextHandler.handleQuery(queryType);
        } else {
            System.out.println("No handler available for this query type.");
        }
    }

}
