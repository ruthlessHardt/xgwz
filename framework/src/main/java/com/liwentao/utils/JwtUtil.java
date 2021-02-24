package com.liwentao.utils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "custom.jwt")
public class JwtUtil {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);
    // 秘钥
    private String secret;
    // 有效时间
    private Long expire;
    // 用户凭证
    private String header;
    // 签发者
    private String issuer;
    /**
     * 生成token签名
     * @param subject
     * @return
     */
    public String createToken(String subject) {
        Date now = new Date();
        // 过期时间
        Date expireDate = new Date(now.getTime() + expire * 1000);

        //创建Signature SecretKey
        final SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));

        //header参数
        final Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("alg", "HS256");
        headerMap.put("typ", "JWT");

        //生成token
        String token = Jwts.builder()
                .setHeader(headerMap)
                .setSubject(subject)
                .setIssuedAt(now)
                .setExpiration(expireDate)
                .setIssuer(issuer)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        logger.info("JWT[" + token + "]");
        return token;
    }

    /**
     * 解析token
     *
     * @param token token
     * @return
     */
    public Claims parseToken(String token) {

        Claims claims = null;
        try {
            //创建Signature SecretKey
            final SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));

            claims = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            logger.info("Parse JWT token success");
        } catch (JwtException e) {
            logger.info("Parse JWT error " + e.getMessage());
            return null;
        }
        return claims;
    }

    /**
     * 判断token是否过期
     *
     * @param expiration
     * @return
     */
    public boolean isExpired(Date expiration) {
        return expiration.before(new Date());
    }

    //getter and setter
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    //用于其他地方获取Header配置信息
    public String getHeader() {
        return header;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
