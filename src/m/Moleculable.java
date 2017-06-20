package m;

import r.R;

/**
 *
 * @author sbt-yukhnovskiy-ia
 * @param <T>
 */
public interface Moleculable {

    /**
     * Примитивное понятие p|q.
     * Читается как "p несовместно с q" и которое будет
     * истинным, когда хотя бы одно (или оба одновременно) из атомарных высказываний
     * будет ложным. Поэтому, может также читаться "p ложно или q ложно"; или
     * по другому "p влечет не q"
     * | = VL = VERTICAL LINE
     * @param q
     * @return 
     */
    public Object VL(R q);
    
    /**
    * Примитивное понятие ~p.=.p|p Df
    */
    public Object NOT();

    
    /**
     * p U q .=. p|~q Df
     * @param q
     * @return 
     */
    public Object U(R q);
    
    /**
     * pVq .=. ~p|~q  Df
     * 
     * @param q
     * @return 
     */
    public Object V(R q);
    
    /**
     * p.q .=. ~(p|q) Df
     * @param q
     * @return 
     */
    public Object DOT(R q);
}
