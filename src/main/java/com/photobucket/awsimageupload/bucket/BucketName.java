package com.photobucket.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("photobucketapp");

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
    private final String bucketName;

}
