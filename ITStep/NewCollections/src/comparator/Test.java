package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductComparator implements Comparator<Product>{

    
    enum SortType {
        NAME, WEIGHT, TYPE 
    }
    
    private SortType type;
    
    @Override
    public int compare(Product o1, Product o2) {
        if(type == null) 
            throw new IllegalArgumentException("EMPTY SORTING TYPE");
        switch (type) {
        case NAME:
            return o1.name.compareTo(o2.name);
        case WEIGHT:
            return new Double(o1.weight).compareTo(o2.weight);
        case TYPE:
            return o1.type.compareTo(o2.type);
        default:
            break;
        }
        return 0;
    }
    
}

class Product {
    String name;
    double weight;
    String type;
}

class Creator {
    String name;
    int age;
    Product product[];
}

class Car implements Comparable<Car>, Comparator<Car>{
    String model;
    double price;
    
    
    public Car(String model, double price) {
        super();
        this.model = model;
        this.price = price;
    }

    public int compareTo(Car c) {
        return this.model.compareTo(c.model);
    }



    @Override
    public String toString() {
        return "Car [model=" + model + ", price=" + price + "]";
    }

    public int compare(Car c1, Car c2) {
        if( c1.price == c2.price) {
            return 0;
        } else if(c1.price > c2.price) {
            return 1;
        } else {
            return -1;
        }
        
    }
 
}

class NumsComparator implements Comparator<Integer> {
    //ascending or descending order
    private boolean isAsc = false;
    public NumsComparator(boolean isAsc) {
        System.out.println("tralala");
        this.isAsc = isAsc;
    }

    public int compare(Integer a, Integer b) {
        if(isAsc) {
            return b.compareTo(a);
        } else {
            return a.compareTo(b);
        }
        
    }
    public boolean isAsc() {
        return isAsc;
    }
    public void setAsc(boolean isAsc) {
        this.isAsc = isAsc;
    }   
    
}

class Phone {
    
    String model;
    String os;
    List<String> nums;
    Double price;
    
    public Phone(String model, String os, List<String> nums, Double price) {
        super();
        this.model = model;
        this.os = os;
        this.nums = nums;
        this.price = price;
    }
    
    @Override
    public String toString() {
    
    return String.format("MODEL: %s. Price: %f OS: %s\n%s\n", model, price, os, nums);
    }
    
}


public class Test {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, -22, Integer.MAX_VALUE, 
                ((int)(Math.random() * 2)) == 0?
                        Integer.MIN_VALUE :  Integer.MAX_VALUE);
        
        System.out.println("BEFORE SORTING:");
        System.out.println(nums);
        NumsComparator comp = new NumsComparator(false);
        
        Collections.sort(nums, comp);
        
        System.out.println("AFTER SORTING:");
        System.out.println(nums);
        
        comp.setAsc(true);
        Collections.sort(nums, comp);
        System.out.println(nums);
        
        
        
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW M3", 230000));
        cars.add(new Car("ACURA F370", 390000));
        cars.add(new Car("MERCEDES S500", 300000));
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        
        Collections.sort(cars, new Car("DYMMU", 0));
        System.out.println(cars);
        
        

        List<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone("Apple X10", "iOS 9",
                Arrays.asList("+375294564584", 
                        "+375295564584",
                        "+375292564584"), 252.3));
        phones.add(new Phone("Apple X5", "iOS 8",
                Arrays.asList("+375296564584", 
                        "+375297564584",
                        "+375293564584"), 300.8) );
        phones.add(new Phone("LG MX32", "Android 9",
                Arrays.asList("+375295564584", 
                        "+375293564584",
                        "+375299564584"), 100.8));
        
        for (Phone phone : phones) {
            Collections.sort(phone.nums);
        }
        
        Collections.sort(phones, new Comparator<Phone>() {

            public int compare(Phone p1, Phone p2) {
                return p1.os.compareToIgnoreCase(p2.os);
            }
        });
        
        //By price
        boolean flag = true;
        Collections.sort(phones, (Phone a, Phone b) -> {
            if(flag) {
                return a.price.compareTo(b.price);
            } else {
                return b.price.compareTo(a.price);
            }
            
        });
        
        System.out.println("NEW STYLE:");
        System.out.println(phones);
        
        
        //by model 
        Collections.sort(phones, (a,b) -> { return a.model.compareTo(b.model);});
        System.out.println("NEW SHORT STYLE:");
        System.out.println(phones);
        
        
    }

}
