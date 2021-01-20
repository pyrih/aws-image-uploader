package com.apyrih.imageupl.datastore;

import com.apyrih.imageupl.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("af25035b-318c-460b-bf75-6f266b419db0"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("9974a758-013f-4a31-827a-230f32407f68"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
