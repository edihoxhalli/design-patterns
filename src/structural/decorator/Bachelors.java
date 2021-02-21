package structural.decorator;

public class Bachelors extends DiplomaDecorator {
    public Bachelors(Diploma diploma){
        super(diploma);
    }

    @Override
    public String[] getDiploma() {
        String[] previousDiplomas = diploma.getDiploma();
        String[] diplomas = new String[previousDiplomas.length+1];
        diplomas[diplomas.length - 1] = "Bachelor of Science";
        return joinDiplomas(previousDiplomas, diplomas);
    }

    protected String[] joinDiplomas(String[] previousDiplomas, String[] diplomas){
        for (int i = 0; i < previousDiplomas.length; i++) {
            diplomas[i] = previousDiplomas[i];
        }
        return diplomas;
    }
}
