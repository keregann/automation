package homework_3_OOP;

import java.util.Arrays;

public class XmlMessage extends AbstractMessage implements Message {
    private String name = "XML";

    public XmlMessage(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void prepareMessage() {
        System.out.println("No body");
    }

    @Override
    public void prepareMessage(String body1) {
        System.out.println(body1);
    }

    @Override
    public void prepareMessage(String[] body) {
        System.out.println(Arrays.toString(body).replace("[","").replace("]",""));
    }
}
