package structural.decorator;

public class Masters extends Bachelors {
    public Masters(Diploma diploma) {
        super(diploma);
    }

    @Override
    public String[] getDiploma() {
        String[] previousDiplomas = diploma.getDiploma();
        String[] diplomas = new String[previousDiplomas.length+1];
        diplomas[diplomas.length - 1] = "Masters of Nihilism";
        return joinDiplomas(previousDiplomas, diplomas);
    }
}
