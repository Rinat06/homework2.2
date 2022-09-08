public class Mersedes  extends  Car{
private version version;

    public Mersedes(String body, int volume,version version) {
        super(body, volume);
        this.version = version;
    }

    public version getVersion() {
        return version;
    }

    @Override
    public void print() {
        System.out.println( "----------" +
                "\n Mersedes-benz" +
                "\n Кузов: " + getBody() +
                "\n Объем: " + getVolume() +
                "\n Версия: " + getVersion());
    }
}
