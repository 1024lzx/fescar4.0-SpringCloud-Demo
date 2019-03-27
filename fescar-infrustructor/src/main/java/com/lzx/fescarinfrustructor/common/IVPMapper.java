package com.lzx.fescarinfrustructor.common;

import java.util.List;

public interface IVPMapper<V,P> {
    P vo2po(V v);
    V po2vo(P p);
    List<P> vos2pos(List<V> vos);
    List<V> pos2vos(List<P> pos);
}
