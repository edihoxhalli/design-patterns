package structural.decorator;

public abstract class DiplomaDecorator implements Diploma {
    protected Diploma diploma;

    public DiplomaDecorator(Diploma diploma){
        this.diploma = diploma;
    }

    @Override
    public String[] getDiploma() {
        return diploma.getDiploma();
    }
}
