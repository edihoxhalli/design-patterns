package creational.prototype;

public abstract class Animal implements Cloneable {
    private float age;
    private String type;
    private boolean isPet;
    private String race;

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", type='" + type + '\'' +
                ", isPet=" + isPet +
                ", race='" + race + '\'' +
                '}';
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getType() {
        return "Animal";
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
