package com.mahendra.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:./src/test/resources/config/config.properties",
        "file:./src/test/resources/config/data.properties"})

public interface Configuration extends Config {

    @Key("TARGET")
    String TARGET();

    @Key("BROWSER")
    String BROWSER();

    @Key("HEADLESS")
    Boolean HEADLESS();

    @Key("URL_LOCAL")
    String URL_LOCAL();

    @Key("REMOTE_URL")
    String REMOTE_URL();

    @Key("REMOTE_PORT")
    String REMOTE_PORT();

    @Key("EXCEL_DATA_FILE_PATH")
    String EXCEL_DATA_FILE_PATH();
}
