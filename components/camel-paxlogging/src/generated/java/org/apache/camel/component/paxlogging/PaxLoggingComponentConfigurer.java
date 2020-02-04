/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.paxlogging;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PaxLoggingComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "bundleContext": ((PaxLoggingComponent) target).setBundleContext(property(camelContext, org.osgi.framework.BundleContext.class, value)); return true;
        case "basicPropertyBinding": ((PaxLoggingComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((PaxLoggingComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bundlecontext": ((PaxLoggingComponent) target).setBundleContext(property(camelContext, org.osgi.framework.BundleContext.class, value)); return true;
        case "basicpropertybinding": ((PaxLoggingComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((PaxLoggingComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
