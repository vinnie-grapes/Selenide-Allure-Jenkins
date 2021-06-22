package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/Credentials.properties"
})

public interface CredentialsConfig extends Config {
    @Key("login")
    String login();
    @Key("password")
    String password();
}
