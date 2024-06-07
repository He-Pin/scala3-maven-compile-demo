package org.example;

import java.io.Serializable;
import java.nio.channels.Selector;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JSON path AST
 *
 * @author 虎鸣, hepin.p@alibaba-inc.com
 */
public sealed interface JsonPathAST extends Serializable {

    record RootIdentifier() implements JsonPathAST {
        public static final RootIdentifier INSTANCE = new RootIdentifier();

        @Override
        public String toString() {
            return "$";
        }
    }
}





