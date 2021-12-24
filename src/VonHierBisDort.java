public class VonHierBisDort {

    private static void printSubset(String[] array, int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        String[] favourites = {"Gelsenkirchen", "Bochum", "Dortmund", "Witten", "Wattenscheid"};
        printSubset(favourites, 0, 2);
    }
}