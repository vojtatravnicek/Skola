public class Modrani {
    public static void main(String[] args) {
        awh.Image obr = awh.Image.loadFromFile(args[0]);
        int sirka = obr.getWidth();
        int vyska = obr.getHeight();
 
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                awh.Color puvodni = obr.getPixel(x, y);
                awh.Color nova = awh.Color.fromRgb(
                        0,
                        0,
                        puvodni.getBlue()
                );
                obr.setPixel(x, y, nova);
            }
        }
 
        obr.saveToFile(args[1]);
    }
}
