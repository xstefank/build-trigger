package io.xstefank.model.json;

public class BuildJMSPayload {

    public String email;
    public Product product;
    public Environment environment;
    public String upstream;
    public String revision;
    public String script;
    public String version;

    public static BuildJMSPayload from(BuildInfo buildInfo, String email) {
        BuildJMSPayload createBuildPayload = new BuildJMSPayload();

        createBuildPayload.email = email;
        createBuildPayload.product = buildInfo.product;
        createBuildPayload.environment = buildInfo.environment;
        createBuildPayload.upstream = buildInfo.upstream;
        createBuildPayload.revision = buildInfo.revision;
        createBuildPayload.script = buildInfo.script;
        createBuildPayload.version = buildInfo.version;

        return createBuildPayload;
    }

    @Override
    public String toString() {
        return "BuildJMSPayload{" +
            "email='" + email + '\'' +
            ", product=" + product +
            ", environment=" + environment +
            ", upstream='" + upstream + '\'' +
            ", revision='" + revision + '\'' +
            ", script='" + script + '\'' +
            ", version='" + version + '\'' +
            '}';
    }
}