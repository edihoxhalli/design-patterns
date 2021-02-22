package behavioral.chain_of_responsability;

public class HumanResources extends Handler {
    public HumanResources(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if(request == Request.HR)
            System.out.println("Request: "+request
                    + "handled by: " +this.getClass().getSimpleName());
        else
            this.successor.handleRequest(request);
    }
}
