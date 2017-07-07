package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tanuj on 7/6/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring-config.xml");
// DATABASE
// Database database = (Database) applicationContext.getBean("Database");
////        System.out.println(database);

//        Restaurant restaurant = (Restaurant) applicationContext.getBean("teaRestaurant");
//        restaurant.getHotDrink().prepareHotDrink();
//        Restaurant restaurant1 = (Restaurant) applicationContext.getBean("teaRestaurant");
//        restaurant1.getHotDrink().prepareHotDrink();
//        Complex complex = applicationContext.getBean(Complex.class);
//        System.out.println(complex);
//        Restaurant restaurant2 = applicationContext.getBean(Restaurant.class);
//        restaurant2.getHotDrink().prepareHotDrink();
        Restaurant restaurant = (Restaurant) applicationContext.getBean("teaRestaurant");
        System.out.println(restaurant);
        Restaurant restaurant1 = (Restaurant) applicationContext.getBean("teaRestaurant");
        System.out.println(restaurant1);

    }
}
