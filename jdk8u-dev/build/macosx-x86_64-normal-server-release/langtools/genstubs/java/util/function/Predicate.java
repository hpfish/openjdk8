package java.util.function;

public interface Predicate<T> {
    
    boolean test(T t);
    
    Predicate<T> and(Predicate<? super T> other);
    
    Predicate<T> negate();
    
    Predicate<T> or(Predicate<? super T> other);
    
    <T>Predicate<T> isEqual(Object targetRef);
}