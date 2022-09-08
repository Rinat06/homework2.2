public class Main {
    public static void main(String[] args) {
Audi audi = new Audi("w210",5,19);
Mersedes mersedes = new Mersedes("w221",6,version.version_long);
Bmw bmw = new Bmw("e60",4,equipment.equipment_M);
Printable[] printable = {audi,mersedes,bmw};
        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }
    }
}