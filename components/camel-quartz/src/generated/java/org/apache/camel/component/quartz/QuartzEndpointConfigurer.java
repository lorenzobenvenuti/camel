/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.quartz;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class QuartzEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        QuartzEndpoint target = (QuartzEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": target.setAutoStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cron": target.setCron(property(camelContext, java.lang.String.class, value)); return true;
        case "customcalendar":
        case "customCalendar": target.setCustomCalendar(property(camelContext, org.quartz.Calendar.class, value)); return true;
        case "deletejob":
        case "deleteJob": target.setDeleteJob(property(camelContext, boolean.class, value)); return true;
        case "durablejob":
        case "durableJob": target.setDurableJob(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "firenow":
        case "fireNow": target.setFireNow(property(camelContext, boolean.class, value)); return true;
        case "jobparameters":
        case "jobParameters": target.setJobParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "pausejob":
        case "pauseJob": target.setPauseJob(property(camelContext, boolean.class, value)); return true;
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": target.setPrefixJobNameWithEndpointId(property(camelContext, boolean.class, value)); return true;
        case "recoverablejob":
        case "recoverableJob": target.setRecoverableJob(property(camelContext, boolean.class, value)); return true;
        case "startdelayedseconds":
        case "startDelayedSeconds": target.setStartDelayedSeconds(property(camelContext, int.class, value)); return true;
        case "stateful": target.setStateful(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "triggerparameters":
        case "triggerParameters": target.setTriggerParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "triggerstartdelay":
        case "triggerStartDelay": target.setTriggerStartDelay(property(camelContext, long.class, value)); return true;
        case "usingfixedcamelcontextname":
        case "usingFixedCamelContextName": target.setUsingFixedCamelContextName(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("autoStartScheduler", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("cron", java.lang.String.class);
        answer.put("customCalendar", org.quartz.Calendar.class);
        answer.put("deleteJob", boolean.class);
        answer.put("durableJob", boolean.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fireNow", boolean.class);
        answer.put("jobParameters", java.util.Map.class);
        answer.put("pauseJob", boolean.class);
        answer.put("prefixJobNameWithEndpointId", boolean.class);
        answer.put("recoverableJob", boolean.class);
        answer.put("startDelayedSeconds", int.class);
        answer.put("stateful", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("triggerParameters", java.util.Map.class);
        answer.put("triggerStartDelay", long.class);
        answer.put("usingFixedCamelContextName", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        QuartzEndpoint target = (QuartzEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autostartscheduler":
        case "autoStartScheduler": return target.isAutoStartScheduler();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cron": return target.getCron();
        case "customcalendar":
        case "customCalendar": return target.getCustomCalendar();
        case "deletejob":
        case "deleteJob": return target.isDeleteJob();
        case "durablejob":
        case "durableJob": return target.isDurableJob();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "firenow":
        case "fireNow": return target.isFireNow();
        case "jobparameters":
        case "jobParameters": return target.getJobParameters();
        case "pausejob":
        case "pauseJob": return target.isPauseJob();
        case "prefixjobnamewithendpointid":
        case "prefixJobNameWithEndpointId": return target.isPrefixJobNameWithEndpointId();
        case "recoverablejob":
        case "recoverableJob": return target.isRecoverableJob();
        case "startdelayedseconds":
        case "startDelayedSeconds": return target.getStartDelayedSeconds();
        case "stateful": return target.isStateful();
        case "synchronous": return target.isSynchronous();
        case "triggerparameters":
        case "triggerParameters": return target.getTriggerParameters();
        case "triggerstartdelay":
        case "triggerStartDelay": return target.getTriggerStartDelay();
        case "usingfixedcamelcontextname":
        case "usingFixedCamelContextName": return target.isUsingFixedCamelContextName();
        default: return null;
        }
    }
}

