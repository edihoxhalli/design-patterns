package behavioral.chain_of_responsability;

public class Sales extends Handler {
    public Sales(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(request == Request.PURCHASE)
            System.out.println("Request: "+request
                    + "handled by: " +this.getClass().getSimpleName());
        else
            this.successor.handleRequest(request);
    }
}
