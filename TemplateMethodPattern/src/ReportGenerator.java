abstract class ReportGenerator {
    public void generateReport() {
        fetchData();
        processData();
        formatReport();
        printReport();
    }

    protected abstract void fetchData();

    protected abstract void processData();

    protected abstract void formatReport();

    protected void printReport() {
        System.out.println("Report has been generated and printed.");
    }
}