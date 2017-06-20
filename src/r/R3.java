package r;

/**
 * R3(x,y,z) означает "субъекты x,y,z находятся в трехместном (тернарном) отношении R3 (интенсионально)"
 * @author sbt-yukhnovskiy-ia
 */
public class R3 extends R{

    public R3(Object... x) {
        super(3, x);
    }
    
    @Override
    public Object r2(Object... y) {
        return new R2(y);
    }
    
}
