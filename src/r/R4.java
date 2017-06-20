package r;

/**
 * R4(x,y,z,w) означает "субъекты x,y,z,w находятся в четырехместном отношении R4 (интенсионально) 
 * @author sbt-yukhnovskiy-ia
 */
public class R4 extends R{

    public R4(Object... x) {
        super(4, x);
    }
    
    @Override
    public Object r2(Object... y) {
        return new R2(y);
    }
    
}
