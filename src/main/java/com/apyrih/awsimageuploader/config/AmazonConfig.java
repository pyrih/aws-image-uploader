package com.apyrih.awsimageuploader.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

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
                .withCredentials(
                        new AWSStaticCredentialsProvider(awsCredentials)
                ).build();
    }

}
