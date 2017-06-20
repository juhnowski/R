/*
 * Позитивная схема определения атомарных предложений.

 * R1(x)
 * R2(x,y)
 * R3(x,y,z)
 * R4(x,y,z,w)
 * и так до бесконечности
 */
package r;

/**
 *
 * @author sbt-yukhnovskiy-ia
 */
public abstract class R<T> {
    
    public R(int n, T... x) {
        if (x.length != n){
            throw new IllegalArgumentException();
        }
    }
    
    public abstract Object r2(T... y);
            
    
    
}
