/*Let’s consider a hotel. This hotel has a hotel keeper. There are a lot of restaurants
inside the hotel e.g. Veg restaurants, Non-Veg restaurants, and Veg/Non Both restaurants.
 You, as a client want access to different menus of different restaurants. You do not know
 what are the different menus they have. You just have access to a hotel keeper who knows
 his hotel well. Whichever menu you want, you tell the hotel keeper and he takes it out of
 the respective restaurants and hands it over to you.*/
//hide all complex subsystem
public class Main {
    public static void main(String[] args) {

        HotelKeeperFacade hotelKeeper=new HotelKeeperImplementation();

        for(Menu menu:hotelKeeper.getVegMenu()){
            System.out.println("Veg Menu: "+menu.name);
            System.out.println("Veg Price: "+menu.price);
        }

        for(Menu menu:hotelKeeper.getNonVegMenu()){
            System.out.println("NonVeg Menu: "+menu.name);
            System.out.println("NonVeg Price: "+menu.price);
        }



    }
}