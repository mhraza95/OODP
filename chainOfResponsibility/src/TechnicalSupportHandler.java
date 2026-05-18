public class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleQuery(QueryType queryType) {
        if (queryType == QueryType.TECHNICAL) {
            System.out.println("Handling technical query.");
        } else if (nextHandler != null) {
            nextHandler.handleQuery(queryType);
        } else {
            System.out.println("No handler available for this query type.");
        }
    }
}