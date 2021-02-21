package structural.bridge;

public class MathStudent extends Student {

    public MathStudent(Job job){
        super(job);
    }

    @Override
    public void learn() {
        System.out.println("x + y = z...");
        System.out.println(this.learning + this.futureJob.work());
    }
}
