public class Pants implements Washable {
    private String material;
    private int cleanliness;
    private boolean ripped;

    public Pants(String material) {
        this.material = material;
        this.cleanliness = 50;
        this.ripped = true;
    }

    public boolean shouldBeWashed() {
        return cleanliness < 90 && !ripped;
    }

    @Override
    public void onWash() {
        cleanliness += 20;
        ripped = Math.random() < 0.5;
    }

    public String toString() {
        return getMaterial() + " pants";
    }

    /**
     * @return String return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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

    /**
     * @return boolean return the ripped
     */
    public boolean isRipped() {
        return ripped;
    }

    /**
     * @param ripped the ripped to set
     */
    public void setRipped(boolean ripped) {
        this.ripped = ripped;
    }

}