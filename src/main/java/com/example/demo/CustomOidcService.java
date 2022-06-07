package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistration;

import java.util.Optional;

public class CustomOidcService extends OidcUserService {

    @Autowired
    private UserRepository userRepository;
    private ClientRegistrationRepository repository;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
         OidcUser user = super.loadUser(userRequest);

        return process(user, userRequest);

    }
    private OidcUser process(OidcUser userRequest, OidcUserRequest request) {
        GitHubUserInfo git = new GitHubUserInfo(userRequest.getAttributes());
        Optional<User> email = userRepository.findByEmail(git.getEmail());
        if(email.isEmpty()) {
            User user = new User();
            user.setName(git.getName());
            user.setUsername(git.getEmail());
            user.setOnline(true);
            userRepository.save(user);
        }
        return userRequest;
    }
    public LogoutSuccessHandler logout() {
        OidcClientInitiatedLogoutSuccessHandler successHandler = new OidcClientInitiatedLogoutSuccessHandler(
                this.repository);

        successHandler.setPostLogoutRedirectUri("{baseUrl}");
        return successHandler;
    }

}
