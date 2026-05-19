public class Published implements State {
    Document document;
    public Published(Document document) {
        this.document = document;
    }
    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }
    @Override
    public void approve(Document document) {
        System.out.println("Document is already published. Cannot approve.");
    }
    
}
