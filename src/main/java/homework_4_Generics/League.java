package homework_4_Generics;

import java.util.*;

public class League<T extends Team> {

    private Set<T> teamsContainer;

    public League() {
        teamsContainer = new TreeSet<>();
    }

    public void add(T t) {
        teamsContainer.add(t);
    }

    public void printLeague() {
        System.out.println(League.class.getSimpleName() + " teams:");
        for (T t : teamsContainer) {
            System.out.println(t.getName());
        }
    }


}
