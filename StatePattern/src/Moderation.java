public class Moderation implements State {
    Document document;
    public Moderation(Document document) {
        this.document = document;
    }
    @Override
    public void publish(Document document) {
        System.out.println("Document is in moderation state. Moving to published.");
        document.state = new Published(document);
    }
    @Override
    public void approve(Document document) {
        System.out.println("Document is in moderation state. Moving to published.");
        document.state = new Published(document);
    }
    
}
