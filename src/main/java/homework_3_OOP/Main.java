package homework_3_OOP;

import static homework_3_OOP.MessageProcessor.printOutMessage;

public class Main {
    public static void main(String[] args) {
        JsonMessage jsonMessage1 = new JsonMessage("i am Json 1");
        XmlMessage xmlMessage1 = new XmlMessage("i am XML 1");

        printOutMessage(jsonMessage1);
        printOutMessage(xmlMessage1);

        MessageConvertor messageConvertor = new MessageConvertor();

        printOutMessage(messageConvertor.convertToJsonMessage(xmlMessage1));
        printOutMessage(messageConvertor.convertToXMLMessage(jsonMessage1));
    }
}
