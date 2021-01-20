package com.apyrih.imageupl.profile;

import com.apyrih.imageupl.datastore.InMemoryUserProfileDataStore;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final InMemoryUserProfileDataStore inMemoryUserProfileDataStore;

    public UserProfileDataAccessService(InMemoryUserProfileDataStore inMemoryUserProfileDataStore) {
        this.inMemoryUserProfileDataStore = inMemoryUserProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return inMemoryUserProfileDataStore.getUserProfiles();
    }
}
