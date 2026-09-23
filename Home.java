public class Home {

    private final int floor;

    public Home(int floor) {
        this.floor = floor;
    }

    public String toTextHome() {
        if ((floor % 10) == 1 && floor != 11) {
            return "Дом с " + floor + " этажом";
        } else {
            return "Дом с " + floor + " этажами";
        }
    }
}
