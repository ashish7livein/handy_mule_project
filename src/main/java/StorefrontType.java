

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum StorefrontType {
    EN,
    FR,
    ADULT_EN,
    ADULT_FR,
    ALL;

    private static final Logger LOGGER = LogManager.getLogger(StorefrontType.class);

    public static StorefrontType fromString(String s) {
        StorefrontType type;

        if (StringUtils.equalsIgnoreCase(s, EN.name())) {
            type = EN;
        } else if (StringUtils.equalsIgnoreCase(s, FR.name())) {
            type = FR;
        } else if (StringUtils.equalsIgnoreCase(s, ADULT_EN.name())) {
            type = ADULT_EN;
        } else if (StringUtils.equalsIgnoreCase(s, ADULT_FR.name())) {
            type = ADULT_FR;
        } else if (StringUtils.equalsIgnoreCase(s, ALL.name())) {
            type = ALL;
        } else {
            String msg = "Invalid storefront type = \'" + s + "\'";
            LOGGER.error(msg);
            throw new IllegalArgumentException(msg);
        }

        return type;
    }
}
