package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner){
        System.out.println(owner + "ddd");
        this.owner = owner;
    }

    @Override
    public void use(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "[IDCard:]" + owner;
    }

    public String getOwner(){
        return owner;
    }
}
