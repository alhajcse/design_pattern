import java.util.ArrayList;
import java.util.List;

public class NonVegMeno implements Hotel{

    @Override
    public List<Menu> getMenus() {
        List<Menu> menuList = new ArrayList<>();
        Menu menu=new Menu("Chiken Fry",150);
        menuList.add(menu);
        return menuList;
    }
}
