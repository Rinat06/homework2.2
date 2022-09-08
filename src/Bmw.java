public class Bmw extends Car{
    private equipment equipment;

    public Bmw(String body, int volume,equipment equipment) {
        super(body, volume);
        this.equipment = equipment;
    }
    public equipment getEquipment() {
        return equipment;
    }

    @Override
    public void print() {
        System.out.println(  "----------" +
                "\n BMW " +
                "\n Кузов: " + getBody() +
                "\n Объем: " + getVolume() +
                "\n Компликтация: " + getEquipment());
    }
}
