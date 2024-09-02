public class CarFectory {

    public Car getCarFectory(String model) {

        if(model == null) return null;

        if(model.equalsIgnoreCase("BMW")) {
            return new BMW();
        }
        else if(model.equalsIgnoreCase("Toyota")){
            return new Toyota();
        }
        return null;
    }
}
