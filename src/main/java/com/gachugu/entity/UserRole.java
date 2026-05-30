package com.gachugu.entity;

public enum UserRole {
    ADMIN("Administrator"),
    TEACHER("Teacher"),
    STUDENT("Student"),
    PARENT("Parent"),
    STAFF("Staff");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
