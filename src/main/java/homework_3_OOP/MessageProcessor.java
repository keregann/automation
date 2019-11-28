package homework_3_OOP;

public class MessageProcessor {
    public static void printMessage(AbstractMessage abstractMessage) {
        System.out.println(abstractMessage.getName() + " : " + abstractMessage.getBody());
    }
}
