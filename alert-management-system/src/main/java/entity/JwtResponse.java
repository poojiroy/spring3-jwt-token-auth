package entity;
public class JwtResponse {
    private String jwtToken;
    private String userName;

    private JwtResponse(Builder builder) {
        this.jwtToken = builder.jwtToken;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public String getUserName() {
        return userName;
    }

    public static class Builder {
        private String jwtToken;
        private String userName;

        private Builder() {
        }

        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(this);
        }
    }

    @Override
    public String toString() {
        return "JwtResponse [jwtToken=" + jwtToken + ", userName=" + userName + "]";
    }
}
