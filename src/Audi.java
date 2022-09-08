public class Audi extends Car{
    private int size_wheel;



    public Audi(String body, int volume, int size_wheel) {
        super(body, volume);
        this.size_wheel = size_wheel;
    }

    public int getSize_wheel() {
        return size_wheel;
    }

    @Override
    public void print() {
        System.out.println( " Audi " +
                "\n Кузов: " + getBody() +
                "\n Объем: " + getVolume() +
                "\n Размер колес: " + getSize_wheel());
    }
}
