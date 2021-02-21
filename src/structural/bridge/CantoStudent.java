package structural.bridge;

public class CantoStudent extends Student {

    public CantoStudent(Job job) {
        super(job);
    }

    @Override
    public void learn() {
        System.out.println("La la la la...");
        System.out.println(this.learning + this.futureJob.work());
    }
}
