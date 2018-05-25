package net.atos.practica.apirest.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String EXPIRE_HEADER = "Expires";
    public static final String LOG_IN = "/login";


    public static final String ISSUER_INFO = "https://www.autentia.com/";

}
