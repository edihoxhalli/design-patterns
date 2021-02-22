package behavioral.chain_of_responsability;

public abstract class Handler {
    protected Handler successor;

    public Handler() {
    }

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

    public enum Request{
        MANAGERIAL, PURCHASE, HR
    }
}
