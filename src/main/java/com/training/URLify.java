package com.training;

/**
 * {@link URLify} has methods to convert a string into a URL.
 * {@link URLify#convertToURL(String)} converts input string
 * to an URL.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class URLify {
    /**
     * Returns URL form of a given string
     *
     * @param input string to be URLified
     * @return URL version of the given string
     */
    public String convertToURL(String input) {
        // count spaces in the string
        int spaces = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaces++;
            }
        }

        // create an array of characters of required length
        char url[] = new char[input.length() + spaces * 2];

        // fill the new array accordingly and return it
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                url[j] = '%';
                url[j + 1] = '2';
                url[j + 2] = '0';
                j += 3;
            } else {
                url[j] = input.charAt(i);
                j++;
            }
        }
        return new String(url);
    }
}
