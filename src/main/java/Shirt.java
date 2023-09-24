public class Shirt implements Washable {
    private String color;
    private int cleanliness;

    public Shirt(String color) {
        this.color = color;
    }

    public boolean shouldBeWashed() {
        return cleanliness < 90;
    }

    @Override
    public void onWash() {
        cleanliness += 20;
    }

    @Override
    public String toString() {
        return getColor();
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color + " shirt";
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return int return the cleanliness
     */
    public int getCleanliness() {
        return cleanliness;
    }

    /**
     * @param cleanliness the cleanliness to set
     */
    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

}