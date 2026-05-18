public class App {
    public static void main(String[] args) throws Exception {
        Subject subject = new SubjectImpl();
        Observer observer1 = new ObserverImpl("Observer 1");    
        Observer observer2 = new ObserverImpl("Observer 2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObservers("Hello Observers!");
        subject.removeObserver(observer1);
        subject.notifyObservers("Hello again, Observers!");
    }
}
