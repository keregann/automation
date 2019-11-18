package homework_2_Collections;

public class CharListMainRun {
    public static void main(String[] args) {

        CharList charList1 = new CharList();
        charList1.add('a');
        charList1.add('c');
        charList1.add('b');
        charList1.add('1');
        charList1.add('2');
        charList1.add('3');
        charList1.add('1');
        charList1.add('2');
        charList1.add('3');

        CharList charList2 = new CharList(" acb123123 ");

        System.out.println("*************Char Lists populated************ ");
        System.out.println("Charlist 1 : " + charList1);
        System.out.println("Charlist 2 : " + charList2);

        System.out.println("*********Main methods implimentation******");
        System.out.println("Charlist 1 : " + charList1.toString());
        System.out.println("Charlist 1 length : " + charList1.length());
        System.out.println("Charlist 1 sublist(1,5): " + charList1.subString(1,5));
        System.out.println("Charlist 1 charAt 1: " + charList1.chatAt(1));
        System.out.println("Charlist 1 indexOf '1': " + charList1.indexOf('1'));
        System.out.println("Charlist 1 revers : " + charList1.reverseList());
        System.out.println("Charlist 1 mix : " + charList1.mixedList());
        System.out.println("Charlist 1 removeDublicates : " + charList1.removeDublicates());
        System.out.println("Charlist 1 removeFirst '1': " + charList1.removeFirst('1'));
        System.out.println("Charlist 1 removeAllWithValue 'c': " + charList1.removeAllWithValue('c'));
        System.out.println("Charlist 1 contains character 'a': " + charList1.contains('a'));
        System.out.println("Charlist 1 clearList : " + charList1.clearList());
        System.out.println("Charlist 1 isEmpty : " + charList1.isEmpty());
        System.out.println("Charlist 1 printout : " + charList1.toString());

        System.out.println("*********Additional methods implimentation******");
        System.out.println("Charlist 2 trim : " + charList2.trim());


    }
}
