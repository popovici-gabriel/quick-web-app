package com.test.quick.application.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

@Component
@ConfigurationProperties(prefix = "quick")
public class QuickConfiguration {

    private InetAddress host;

    private Integer port;

    public InetAddress getHost() {
        return host;
    }

    public void setHost(InetAddress host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuickConfiguration{");
        sb.append("host=").append(host);
        sb.append(", port=").append(port);
        sb.append('}');
        return sb.toString();
    }
}
