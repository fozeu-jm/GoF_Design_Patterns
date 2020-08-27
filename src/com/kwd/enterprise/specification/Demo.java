package com.kwd.enterprise.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Specification<T>{
    boolean isSatisfied(T item);
}

interface Filter<T>{
    Stream<T> filter(List<T> items, Specification<T> spec);
}

class ColorSpecification implements Specification<Product>{
    Color color;
    public ColorSpecification(Color c){
        this.color = c;
    }

    @Override
    public boolean isSatisfied(Product item){
        return item.color == this.color;
    }
}

class BetterFilter implements Filter<Product>{
    public Stream<Product> filter(List<Product> items, Specification<Product> spec){
        return items.stream().filter( p -> spec.isSatisfied(p));
    }
}

enum Color{
    BLUE,
    GREEN
}

class Product{
    Color color;
    private String name;
    public Product(Color color, String name){
        this.color = color;
        this.name = name;
    }
}

class Demo {
    public static void demo(String[] args) {
        List<Product> products = new ArrayList<>();
        BetterFilter bf = new BetterFilter();
        bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(product -> System.out.println(product));
    }
}

