/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        Restaurant newRestaurant = new Restaurant("humam",4);

        newRestaurant.addReview("ahmed" ,"amazing", 5);
        newRestaurant.addReview("humam" ,"i like it", 3.5f);
        newRestaurant.addReview("zaid" ,"delicous" ,5);

        System.out.println(newRestaurant);
    }
}