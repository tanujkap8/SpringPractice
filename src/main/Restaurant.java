package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by tanuj on 7/6/17.
 */
@Component
public class Restaurant
{

// CONSTRUCTOR
//   public Restaurant(HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }
//    @Autowired
    HotDrink hotDrink;

    public HotDrink getHotDrink(){return hotDrink;}
//    @Required
    @Autowired
    public void setHotDrink(HotDrink hotDrink) {this.hotDrink = hotDrink;}

}
