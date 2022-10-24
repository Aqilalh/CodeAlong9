A lambda Expression implements a functional interface
A lambda expression is not another way of writing instances of anonymous classes
Can extend any type of class

Functional interface is an interface that has only one abstract method
Default and static methods do not count

The java.util.function package has more than 40 interfaces Orgainzed in 4 categories
- Supplier
-Consumer
- Predicate
- Function

supplier<T>   T get()  example = () -> "Hello!";
It does not take anything; produces something

Consumer<T>   void accept(T t)  example () -> system.out.println(s);
it takes something; does not return

Predicate<T> boolean test(T t)  String -> string.isEmpty();
It takes something; returns a boolean. Its used to filter data

Function<T,R> r apply(T t)  user-> user.getName();
it takes something; returns something else. Its used for mapping.

Lambdas are not instances of anonymous classes
The complied code is diffferent and uses unvokednamic

Autoboxing is a trick used by the complier to automaticallly convert a primitive type, lets say an int, to an object.

An intger is an object, it has a method, it extends the object class, and it is just
a wrapper on an int, which is a primtive type, which is only a value.

You can create new lambdas by combining existing lambdas
-consumer
-predicate
-function

