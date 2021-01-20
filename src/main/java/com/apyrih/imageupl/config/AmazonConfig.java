package com.apyrih.imageupl.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    public static final Regions CLIENT_REGION = Regions.EU_CENTRAL_1;
    private final AmazonS3Properties amazonS3Properties;

    public AmazonConfig(AmazonS3Properties amazonS3Properties) {
        this.amazonS3Properties = amazonS3Properties;
    }

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new AWSCredentials() {
            @Override
            public String getAWSAccessKeyId() {
                return amazonS3Properties.accessKeyId();
            }

            @Override
            public String getAWSSecretKey() {
                return amazonS3Properties.secretKey();
            }
        };

        return AmazonS3ClientBuilder
                .standard()
                .withRegion(CLIENT_REGION)
                .withCredentials(
                        new AWSStaticCredentialsProvider(awsCredentials)
                ).build();
    }

}
