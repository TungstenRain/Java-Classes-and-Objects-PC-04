package ch08pc04;

/**
 * LandTract Class
 */
public class LandTract {
    // Fields
    private double length, width;
    
    // Constructors
    /**
     * Construct the LandTract Class with variables
     * @param len double The length of the tract of land
     * @param w double The width of the tract of land
     */
    public LandTract(double len, double w) {
        length = len;
        width = w;
    }
    
    // Methods
    /**
     * Get the area of the tract of land
     * @return double The tract of land's area
     */
    public double getArea() {
        return length * width;
    }
    
    /**
     * Compare one LandTract object to another
     * @param tract2 LandTract The LandTract to be compared to
     * @return boolean True if equal; false otherwise
     */
    public boolean equals(LandTract tract2) {
        if (getArea() == tract2.getArea())
            return true;
        else
            return false;
    }
    
    /**
     * Convert the LandTract information to string
     * @return String The LandTract information
     */
    @Override
    public String toString() {
        return "The length is " + length + " and the width is " + width + " and the area is " + getArea();
    }
}
