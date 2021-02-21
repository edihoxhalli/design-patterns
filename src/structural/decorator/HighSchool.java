package structural.decorator;

public class HighSchool implements Diploma {
    @Override
    public String[] getDiploma() {
        return new String[]{"Preca College"};
    }
}
