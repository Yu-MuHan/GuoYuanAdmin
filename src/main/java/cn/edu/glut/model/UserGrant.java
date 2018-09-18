package cn.edu.glut.model;

public class UserGrant {
    private Integer userGrantId;

    private Integer userId;

    private String loginType;

    private String grantCode;

    private String identifier;

    public Integer getUserGrantId() {
        return userGrantId;
    }

    public void setUserGrantId(Integer userGrantId) {
        this.userGrantId = userGrantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    public String getGrantCode() {
        return grantCode;
    }

    public void setGrantCode(String grantCode) {
        this.grantCode = grantCode == null ? null : grantCode.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }
}