package oi.turntabl.functional_programming.functional_interface;

@FunctionalInterface
public interface Function<T, R>{
    R apply(T t);
}
