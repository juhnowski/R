package r;

/**
 * R1(x) означает "субъект x имеет предикатом R1"
 * @author sbt-yukhnovskiy-ia
 * @param <T>
 */
public class R1<T> extends R {
    
    public R1(T... x) {
        super(1, x);
    }

    @Override
    public Object r2(Object... y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
