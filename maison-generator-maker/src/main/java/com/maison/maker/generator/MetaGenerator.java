package com.maison.maker.generator;

import com.maison.maker.meta.Meta;
import com.maison.maker.meta.MetaManager;

public class MetaGenerator {

    public static void main(String[] args) {
        Meta meta = MetaManager.getMetaObject();
        System.out.println(meta);

    }
}
