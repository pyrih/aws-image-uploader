package com.apyrih.awsimageuploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AwsImageUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsImageUploaderApplication.class, args);
	}

}
