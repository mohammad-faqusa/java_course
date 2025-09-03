## 155. Abstract Class Challenge (Part 2): Finalizing the Store & Order System

### the process 
1. create OrderItem record 
`OrderITem(int qty, productforsale)`
2. add method to store
```jshelllanguage
public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty);
order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
```
3. add printOrder(ArrayList<OrderITem> order)
```jshelllanguage
public static void printOrder(ArrayList<OrderItem> order){
    double salesTotal = 0; 
    
    for(var item : order) {
        item.product().printPricedItem(item.qty());
        item.product().printDescription(item.qty()); 
        salesTotal += item.product().getSalesPrice(item.qty);
    }
    
    System.out.println("the totlal price : " + salesTotal);
}
```

4. back to main method 
```jshelllanguage
public static void main(String[] args) {
    
    // .... previous 
    
    var order1 = new ArrayList<OrderItem>; 
    addItemToOrder(order1, 1, 2);
    addItemToOrder(order1, 0 , 1); 
    printOrder(order1); 
}
```

create another product type (furnature)
* copy and paste the art object
* add objects in main method 
* create order2 in main method 
* pass the furnature items to it 
