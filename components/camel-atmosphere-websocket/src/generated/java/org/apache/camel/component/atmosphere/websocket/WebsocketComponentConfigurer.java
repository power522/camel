/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.servlet.ServletComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketComponentConfigurer extends ServletComponentConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketComponent target = (WebsocketComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}
