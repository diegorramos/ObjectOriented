package br.com.polovinskycode.validate;

public class NumberValidate {

    public static void validate(Object objOne, Object objTwo) {
        if (objOne == null || objTwo == null) {
            throw new IllegalArgumentException("Null attribute");
        }
    }
}
