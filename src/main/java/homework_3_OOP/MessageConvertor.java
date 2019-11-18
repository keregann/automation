package homework_3_OOP;

public class MessageConvertor {

    public XmlMessage convertToXMLMessage(AbstractMessage abstractMessage) {
        return new XmlMessage(abstractMessage.getBody());
    }

    public JsonMessage convertToJsonMessage(AbstractMessage abstractMessage) {
        return new JsonMessage(abstractMessage.getBody());
    }

}
