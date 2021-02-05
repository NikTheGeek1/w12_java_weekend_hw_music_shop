package music_shop.instruments;

public class Drums extends Instrument {

    private int numOfParts;

    public Drums(String type, String colour, int numOfParts, double price) {
        super(type, colour, price);
        this.numOfParts = numOfParts;
    }

    public int getNumOfParts() {
        return numOfParts;
    }

    public void setNumOfParts(int numOfParts) {
        this.numOfParts = numOfParts;
    }


    @Override
    public String play() {
        return "tou rou tou toun";
    }

    @Override
    public double calculateMarkup() {
        return getPrice();
    }
}
