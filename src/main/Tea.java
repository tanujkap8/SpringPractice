package main;

/**
 * Created by tanuj on 7/6/17.
 */
public class Tea implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing tea...");
    }
}
