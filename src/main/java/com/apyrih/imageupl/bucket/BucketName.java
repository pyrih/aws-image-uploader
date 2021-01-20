package com.apyrih.imageupl.bucket;

public enum BucketName {
    PROFILE_IMAGE("image-upload-n6m4gb");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
