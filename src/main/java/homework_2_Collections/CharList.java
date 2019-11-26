package homework_2_Collections;

import java.util.*;

public class CharList {
    private List<Character> container;

    public CharList() {
        container = new ArrayList<>();
    }

    public CharList(String s) {
        char[] chars = s.toCharArray();
        container = new ArrayList<>();
        for (char aChar : chars) {
            container.add(aChar);
        }
    }

    private CharList(List<Character> characterArrayList) {
        container = new ArrayList<>(characterArrayList);
//        container.addAll(characterArrayList);
    }

    @Override
    public String toString() {
        return container.toString();
    }

    boolean add(Character c) {
        return container.add(c);
    }

    //Rework
    CharList subString(int start, int end) {
        return new CharList(container.subList(start, end));
    }

    int length() {
        return container.size();
    }

    char chatAt(int index) {
        return container.get(index);
    }

    int indexOf(char c) {
        return container.indexOf(c);
    }

    public CharList removeDublicates() {
        Set<Character> set = new HashSet<>(container);
        container.clear();
        container.addAll(set);
        return new CharList(container);
    }

    public CharList removeFirst(Character c) {
        container.remove(c);
        return new CharList(container);
    }

    public CharList removeAllWithValue(Character c) {
        container.removeAll(Collections.singleton(c));
        return new CharList(container);
    }

    public boolean isEmpty() {
        return container.isEmpty();
    }

    public boolean contains(Character c) {
        return container.contains(c);
    }

    public CharList clearList() {
        container.clear();
        return new CharList(container);
    }

    public CharList sortList() {
        Collections.sort(container);
        return new CharList(container);
    }

    public CharList reverseList() {
        Collections.reverse(container);
        return new CharList(container);
    }

    public CharList mixedList() {
        Collections.shuffle(container);
        return new CharList(container);
    }

    public CharList trim() {
        if (container.get(0).equals(' ') && container.get(container.size() - 1).equals(' ')) {
            container.remove(0);
            container.remove(container.size() - 1);
            return new CharList(container);
        }
        return new CharList(container);
    }
}
