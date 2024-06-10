package io.github.benny123tw.servlet.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "vite")
public class ViteProperties {

    /**
     * Whether to enable debug mode in Vite.
     */
    private boolean debug = true;

    /**
     * The path of the manifest file generated by Vite.
     */
    private String manifestPath = "/WEB-INF/dist/.vite/manifest.json";

    /**
     * The local server URL for Vite development.
     */
    private String localServerUrl = "http://localhost:5173";

    /**
     * The path to the resources.
     */
    private String resourcePath = "/resources";

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getManifestPath() {
        return manifestPath;
    }

    public void setManifestPath(String manifestPath) {
        this.manifestPath = manifestPath;
    }

    public String getLocalServerUrl() {
        return localServerUrl;
    }

    public void setLocalServerUrl(String localServerUrl) {
        this.localServerUrl = localServerUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

}
