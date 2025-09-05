//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Point point = new Point("12.9716,77.5946");
        point.render();

        Park[] parks = {new Park("Agra Park", "12.9716,77.5946"),
                        new Park("Mysore Park", "12.3971,76.6122"),
                        new Park("Bangalore Park", "12.9716,77.5946")};

        Layer<Park> parkLayer = new Layer<Park>( parks);

        parkLayer.renderLayer();

        River[] rivers = {new River("Agra River", "12.9716,77.5946", "12.3971,76.6122", "12.9716,77.5946"),
        new River("Mysore River", "12.3971,76.6122", "12.9716,77.5946", "12.9716,77.5946")};

        Layer<River> riverLayer = new Layer<>(rivers);

        riverLayer.renderLayer();
    }
}