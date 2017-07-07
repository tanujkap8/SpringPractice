package main;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by tanuj on 7/7/17.
 */
public class Complex
{
    List<Integer> list;
    Set<Integer> set;


    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    Map<String,Integer> map;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }




}
