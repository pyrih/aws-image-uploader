package com.apyrih.awsimageuploader.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "aws.s3")
@ConstructorBinding
public class AmazonS3Properties {
    private final String accessKeyId;
    private final String secretKey;

    public AmazonS3Properties(String accessKeyId, String secretKey) {
        this.accessKeyId = accessKeyId;
        this.secretKey = secretKey;
    }

    public String accessKeyId() {
        return accessKeyId;
    }

    public String secretKey() {
        return secretKey;
    }
}
