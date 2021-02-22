package behavioral.chain_of_responsability;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println(
                "I'm the CEO and I can approve anything! Request: "
                        +request);
    }

}
