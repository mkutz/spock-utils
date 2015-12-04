package de.assertagile.spockframework.utils

class BooleanString {

    private final String toString
    private final boolean asBoolean

    private BooleanString(final String toString, final boolean asBoolean) {
        this.asBoolean = asBoolean
        this.toString = toString
    }

    public static BooleanString False(String toString) {
        return new BooleanString(toString, false)
    }

    public static BooleanString True(String toString) {
        return new BooleanString(toString, true)
    }

    @Override
    public String toString() {
        toString
    }

    public boolean asBoolean() {
        asBoolean
    }
}
