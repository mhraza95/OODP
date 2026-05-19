public class  Draft implements State {
    Document document;
    public Draft(Document document) {
        this.document = document;
    }
    @Override
    public void publish(Document document) {
        System.out.println("Document is in draft state. Moving to moderation.");
        document.state = new Moderation(document);
    }
    @Override
    public void approve(Document document) {
        System.out.println("Document is in draft state. Cannot approve.");
    }
}
