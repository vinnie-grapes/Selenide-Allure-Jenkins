package config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static CredentialsConfig value =
            ConfigFactory.create(CredentialsConfig.class, System.getProperties());
}
