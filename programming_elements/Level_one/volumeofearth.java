package Level_one;

public class volumeofearth {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKilometers = 6378;

        // Correct volume calculation using floating-point division
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKilometers, 3);

        // Convert radius to miles (1 km = 0.621371 miles)
        double radiusMiles = radiusKilometers * 0.6;

        // Calculate volume in cubic miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display results
        System.out.println(
                "The volume of earth in cubic kilometers is: " + volumeKm + " and cubic miles is: " + volumeMiles);

    }
}
