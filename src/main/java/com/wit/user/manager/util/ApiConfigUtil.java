package com.wit.user.manager.util;

import com.wit.user.manager.exception.ApiException;
import org.springframework.http.HttpStatus;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiConfigUtil extends Exception {

    private static final long serialVersionUID = -7728890108742026510L;
    private static final String DEFAULT_PROPERTY_FILE_NAME = "application.properties";
    private static final String SERVICE_ENDPOINT_IDENTIFIER = "service.endpoint";
    private static final String PUBSUB_TOPIC_IDENTIFIER = "service.pubsub.topic";
    private static ApiConfigUtil apiCallConfig;

    private ApiConfigUtil() {
    }

    public static ApiConfigUtil getInstance() {

        if (apiCallConfig == null) {
            apiCallConfig = new ApiConfigUtil();
            return apiCallConfig;
        }
        return apiCallConfig;
    }

    private static String parseEnvVariable(String value) throws ApiException {
        if (null == value) {
            return null;
        }

        Pattern p = Pattern.compile("\\$\\{(\\w+)\\}|\\$(\\w+)");
        Matcher m = p.matcher(value);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String envVarName = null == m.group(1) ? m.group(2) : m.group(1);
            String envVarValue = System.getenv(envVarName);
            if (null != envVarValue) {
                m.appendReplacement(sb, Matcher.quoteReplacement(envVarValue));
            } else {
                throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Environment value not found " + envVarName);
            }

        }
        m.appendTail(sb);
        return sb.toString();

    }

    private static String extractId(String key) {
        String[] keys = key.split("\\.");
        return keys[keys.length - 1];
    }

    public Map<String, String> fetchServiceEndpoints() throws ApiException {
        Properties prop = new Properties();
        Map<String, String> map = new HashMap<>();
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            prop.load(loader.getResourceAsStream(DEFAULT_PROPERTY_FILE_NAME));
            Enumeration<Object> enumKeys = prop.keys();
            while (enumKeys.hasMoreElements()) {
                String key = (String) enumKeys.nextElement();
                if (key.startsWith(SERVICE_ENDPOINT_IDENTIFIER)) {
                    map.put(extractId(key), parseEnvVariable(prop.getProperty(key)));
                }
            }
        } catch (Exception e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());

        }

        return map;
    }

    public Map<String, String> fetchPubsubTopics() throws ApiException {
        Properties prop = new Properties();
        Map<String, String> map = new HashMap<>();
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            prop.load(loader.getResourceAsStream(DEFAULT_PROPERTY_FILE_NAME));
            Enumeration<Object> enumKeys = prop.keys();
            while (enumKeys.hasMoreElements()) {
                String key = (String) enumKeys.nextElement();
                if (key.startsWith(PUBSUB_TOPIC_IDENTIFIER)) {
                    map.put(extractId(key), prop.getProperty(key));
                }
            }
        } catch (Exception e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Error occured while extracting pubsub topics");

        }

        return map;
    }

}
