package framework;

import java.util.HashMap;
import java.util.Map;

import framework.Product;

public class Manager {
    private Map<String, Product> showCase = new HashMap<>();

    public void register(String name, Product prototype){
        showCase.put(name, prototype);
    }

    public Product create(String prototypeName){
        Product p = showCase.get(prototypeName);
        return p.createCopy();
    }
}
