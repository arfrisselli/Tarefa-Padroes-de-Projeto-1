package br.com.arfrisselli.factory;

/**
 * @author arfrisselli
 */
public class CompanyCarFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Tesla(1000, "electric fuel", "blue");
            case "B":
                return new Audi(800, "gasoline", "red");
            default:
                System.out.println("The requested car is not available");
                return null;
        }
    }
}
