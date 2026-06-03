package com.Streams;

import java.util.List;
import java.util.function.Function;

public class ProductImplementation {
    public static void main(String[] args) {
        List<Product> productList = List.of(new Product(11237,"IPHONE",150000.00,"USA","Electronics"),
                new Product(14387,"GALAXY ULTRA",120000.00,"SOUTH KOREA","Electronics"),
                new Product(16647,"LACTOSE",13000.00,"UK","FASHION"),
                new Product(16509,"PIGEON",2000.00,"INDIA","HOME APPLIANCES"),
                new Product(16590,"AFNAN",4000.00,"UAE","GROOMING"),
                new Product(13126,"LEXUS",6300000.00,"JAPAN","AUTOMOBILE"),
                new Product(17855,"DRY FRUITES",2000.00,"INDIA","FOOD"));


        for (Product list : productList){
            System.out.println(list);
        }
        System.out.println(" ");

        productList.stream().filter(p->p.getPrice()>10000.00).forEach(System.out::println);
        System.out.println(" ");
        productList.stream().map(p->p.getOrigin().toLowerCase()).forEach(System.out::println);
        System.out.println(" ");
        productList.stream().map(p->p.getPrice()).forEach(System.out::println);
        System.out.println(" ");

        productList.stream().map(p->{p.setPrice(p.getPrice()+8000);
            return p;
        })
          .filter(p->p.getPrice()<10000.00).forEach(System.out::println);
    }
}
