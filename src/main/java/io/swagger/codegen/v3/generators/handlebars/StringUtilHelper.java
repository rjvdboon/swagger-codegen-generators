package io.swagger.codegen.v3.generators.handlebars;

import com.github.jknack.handlebars.Options;

import org.apache.commons.lang3.StringUtils;

//import io.swagger.codegen.v3.CodegenConstants;
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

    public String camelCase(String name, Options options){
        return DefaultCodegenConfig.camelize(name, true);
    }

    public String pascalCase(String name, Options options){
        return DefaultCodegenConfig.camelize(name, false);
    }

    public String underscore(String name, Options options){
        return DefaultCodegenConfig.underscore(name);
    }

    public String dashize(String name, Options options){
        return underscore(name, options).replaceAll("[_ ]", "-");
    }

    public String escapeString(String element, Options options){
        return element.replaceAll("\\", "\\\\").replaceAll("\"", "\\\"");
    }

    public String lowerCase(String element, Options options){
        return element.toLowerCase();
    }

    public String upperCase(String element, Options options){
        return element.toUpperCase();
    }

    public String capitalize(String element, Options options){
        return StringUtils.capitalize(element);
    }

    public String backSlash() {
        return "\\";
    }

}
