package cn.xj.pojo;

import java.util.List;

public class Category {
    Product father;
    List<Product> children;

    public Product getFather() {
        return father;
    }

    public void setFather(Product father) {
        this.father = father;
    }

    public List<Product> getChildren() {
        return children;
    }

    public void setChildren(List<Product> children) {
        this.children = children;
    }
}
