import java.util.ArrayList;
import java.util.List;

public class VegMeno implements Hotel{

    @Override
    public List<Menu> getMenus() {
        List<Menu> menuList = new ArrayList<>();
        Menu menu=new Menu("Salad",250);
        menuList.add(menu);
        return menuList;
    }
}
