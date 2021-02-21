package structural.bridge;

public abstract class Student {
    protected String learning;
    protected Job futureJob;

    public Student(Job job){
        this.futureJob = job;
        this.learning = "In the future I will ";
    }

    public abstract void learn();
}
