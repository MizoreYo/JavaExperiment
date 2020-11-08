package site.mizore.dogstate;

public class Dog {
    private DogState state;
    public void cry() {
        state.showState();
    }
    public void setState(DogState s) {
        state=s;
    }
}
