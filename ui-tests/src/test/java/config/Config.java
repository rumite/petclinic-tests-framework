package config;

import org.slf4j.Logger;

import java.util.Properties;

public class Config {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(Config.class);
    private static final Properties properties = new Properties();

    static {
        logger.info("Loading configuration properties...");
        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
            logger.info("Configuration properties loaded successfully.");
        } catch (Exception e) {
            logger.error("Failed to load config.properties, using default values.");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
