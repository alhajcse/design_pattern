import java.util.List;

public class HotelKeeperImplementation implements HotelKeeperFacade{
    @Override
    public List<Menu> getVegMenu() {
        VegMeno vegMenu = new VegMeno();
        return vegMenu.getMenus();
    }

    @Override
    public List<Menu> getNonVegMenu() {
        NonVegMeno nonVegMeno = new NonVegMeno();
        return nonVegMeno.getMenus();
    }
}
