public abstract class Car implements Printable {
    private String  body;
    private int volume;

    public Car(String body, int volume) {
        this.body = body;
        this.volume = volume;
    }

    public String getBody() {
        return body;
    }

    public int getVolume() {
        return volume;
    }
}

