package com.raven.config;

public class OAuthConfig {

    // Return only placeholder values—no external file or secrets loaded.
    public static String getClientId() {
        return "YOUR_GOOGLE_CLIENT_ID.apps.googleusercontent.com";
    }
    
    public static String getClientSecret() {
        return "";
    }
    
    public static String getRedirectUri() {
        return "http://localhost:8080/oauth/callback";
    }
    
    public static String getScope() {
        return "openid email profile";
    }
    
    public static String getAuthUrl() {
        return "https://accounts.google.com/o/oauth2/v2/auth";
    }
    
    public static String getTokenUrl() {
        return "https://oauth2.googleapis.com/token";
    }
    
    public static String getUserInfoUrl() {
        return "https://www.googleapis.com/oauth2/v2/userinfo";
    }
}
