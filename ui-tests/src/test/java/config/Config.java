package config;

import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(Config.class);
    private static final Properties DEFAULT = new Properties();

    static {
        try (InputStream resourceAsStream = Config.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (resourceAsStream != null) {
                DEFAULT.load(resourceAsStream);
            }
        } catch (IOException e) {
            logger.error("WARNING: failed ro load config.properties. Proceeding with system/default values...");
        }
    }

    public static String getProperty(String key) {
        return DEFAULT.getProperty(key);
    }

    public static String getBaseUrl() {
        String envUrl = System.getenv("BASE_URL");
        if (envUrl != null && !envUrl.isEmpty()) {
            return envUrl;
        }
        return DEFAULT.getProperty("baseUrl", "http://localhost:8080");
    }

}
