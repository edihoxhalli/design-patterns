package structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My interesting timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(screenName + " " + message);
    }
}
