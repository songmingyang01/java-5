# java作业  计202  2020310606  宋明扬
## 一、目的
掌握对象传值的影响，并修改程序，实力化多个Lake对象，同一Fish对象均setFish 其中，通过调用输出方法，查看weight的变化情况。
## 二、对象传值
引用传递是指向真实内容的地址值，在方法调用时，实参地址被传递给形参，在方法体中实参和形参指向同一块内存地址，对形参操作会影响实参。
## 三、代码分析
1. 首先实力化了一个Fish对象niqiu，并输出此时其重量。
```java
        Fish niqiu = new Fish();
        System.out.println("泥鳅的重量" + niqiu.weight);
```
2. 然后，将niqiu通过Lake中setfish方法放入其中，并用eat方法增重，显示此时lake1中niqiu重量以及niqiu本身就是重量。
```java
        Lake lake1 = new Lake();
        lake1.setFish(niqiu);
        lake1.eat(30);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1中泥鳅的重量" + lake1.fish.weight);
```
3. 再实体化另一个对象lake2，将niqiu放入其中，同样用eat方法增重，显示此时lake1、lake2中niqiu，以及niqiu本身的重量。
```java
        Lake lake2 = new Lake();
        lake2.setFish(niqiu);
        lake2.eat(100);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1泥鳅的重量" + lake1.fish.weight);
        System.out.println("lake2中泥鳅的重量" + lake2.fish.weight);
```
4.lake3和上面同理。
```java
        Lake lake3 = new Lake();
        lake3.setFish(niqiu);
        lake3.eat(170);
        System.out.println("泥鳅的重量" + niqiu.weight);
        System.out.println("lake1泥鳅的重量" + lake1.fish.weight);
        System.out.println("lake2中泥鳅的重量" + lake2.fish.weight);
        System.out.println("lake3中泥鳅的重量" + lake3.fish.weight);
```
5.对比发现，当对象在方法中做形参时，实际指向了实参的地址，因此，在方法调用时，改变形参的同时也改变了实参。不仅如此，还同时改变了同样指向这一地址的其他类里面的该对象。
