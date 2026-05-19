public class Document {
    State state;
    public Document() {
        state = new Draft(this);
    }
    public void publish() {
        state.publish(this);
    }
    public void approve() {
        state.approve(this);
    }
}