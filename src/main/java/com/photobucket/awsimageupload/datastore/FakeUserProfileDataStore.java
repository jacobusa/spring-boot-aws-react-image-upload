package com.photobucket.awsimageupload.datastore;


import com.photobucket.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d4cd8ae7-7af5-4421-8a12-5ad3de2ba7f1"), "Janet", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("903513c3-28a7-4d37-b19e-cda590d9c366"), "Antonio", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("88dbec42-5ca7-40d2-a73a-3c0f31bb8e27"), "Tucker", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }




}
