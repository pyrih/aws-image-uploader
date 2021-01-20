package com.apyrih.awsimageuploader.bucket;

public enum BucketName {
    PROFILE_IMAGE("image-upload-n6m4gb");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
