package r;

/**
 * R2(x,y) или xR2y -> x.R2(y) - возможно определение как интерфейса, что 
 * более правильно, так как уже его может реализовать класс
 * 
 * R3(x,y,z) -> R2(x,R2(y,z)) или x.R2(y.R2(z)) - тоже имплементирует R2, отсюда
 * добавляем функцию r2 в R
 * @author sbt-yukhnovskiy-ia
 */
public class R2 extends R {
    
    public R2(Object... x) {
        super(2, x);
    }

    @Override
    public Object r2(Object... y) {
        return new R1(y);
    }
    
}
