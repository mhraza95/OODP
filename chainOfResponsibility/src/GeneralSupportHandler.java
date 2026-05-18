public class GeneralSupportHandler extends SupportHandler {
    @Override
    public void handleQuery(QueryType queryType) {
        if (queryType == QueryType.GENERAL) {
            System.out.println("Handling general query.");
        } else if (nextHandler != null) {
            nextHandler.handleQuery(queryType);
        } else {
            System.out.println("No handler available for this query type.");
        }
    }

}
