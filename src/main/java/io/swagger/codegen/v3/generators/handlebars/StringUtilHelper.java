package io.swagger.codegen.v3.generators.handlebars;

import com.github.jknack.handlebars.Options;
import org.apache.commons.lang3.StringUtils;

import io.swagger.codegen.v3.generators.DefaultCodegenConfig;

public class StringUtilHelper {

    /**
     * concat parameters found to a given string.
     * @param element
     * @param options
     * @return
     */
    public String concat(String element, Options options) {
        final StringBuilder builder = new StringBuilder(element);
        if (options.params != null && options.params.length > 0) {
            for (Object param : options.params) {
                builder.append(param);
            }
        }
        return builder.toString();
    }

    /**
     * Convert the parameter to camelCase, with first character lowered.
     * @param name
     * @param options
     * @return
     */
    public String camelCase(String name, Options options){
        return DefaultCodegenConfig.camelize(name, true);
    }

    /**
     * Convert the parameter to PascalCase, with first character Upper.
     * @param name
     * @param options
     * @return
     */
    public String pascalCase(String name, Options options){
        return DefaultCodegenConfig.camelize(name, false);
    }

    /**
     * Convert the parameter to lowercase, with an underscore between fragments.
     * @param name
     * @param options
     * @return
     */
    public String underscore(String name, Options options){
        return DefaultCodegenConfig.underscore(name);
    }

     /**
     * Convert the parameter to lowercase, with a dash between fragments.
     * @param name
     * @param options
     * @return
     */
    public String dashize(String name, Options options){
        return underscore(name, options).replaceAll("[_ ]", "-");
    }

     /**
     * Convert the parameter to lowercase.
     * @param element
     * @param options
     * @return
     */
    public String lowerCase(String element, Options options){
        return element.toLowerCase();
    }

     /**
     * Convert the parameter to uppercase.
     * @param element
     * @param options
     * @return
     */
    public String upperCase(String element, Options options){
        return element.toUpperCase();
    }

     /**
     * Capitalizes a String changing the first letter to title case as per Character.toTitleCase(char). No other letters are changed.
     * @param element
     * @param options
     * @return
     */
    public String capitalize(String element, Options options){
        return StringUtils.capitalize(element);
    }

    /**
     * Return the literal backslash character as a string.
     */
    public String backSlash() {
        return "\\";
    }

    /**
     * Return the literal backslash character as a string.
     */
    public String backslash() {
        return backSlash();
    }
}
