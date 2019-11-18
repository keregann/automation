package homework_4_Generics;

public abstract class Team implements Comparable<Team> {

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Team o) {
        return (this.name.compareTo(o.getName()));

    }
}
