package de.assertagile.spockframework.utils

import static de.assertagile.spockframework.utils.BooleanString.True
import static de.assertagile.spockframework.utils.BooleanString.False

import spock.lang.Specification
import spock.lang.Unroll

class MySpec extends Specification {

    @Unroll
    def "Let's rock and unroll this true #booleanString"(BooleanString booleanString) {
        expect:
        booleanString

        where:
        booleanString << [ True("test"), True("specification") ]
    }

    @Unroll
    def "Let's rock and unroll this false #booleanString"(BooleanString booleanString) {
        expect:
        !booleanString

        where:
        booleanString << [ False("test"), False("specification") ]
    }
}
