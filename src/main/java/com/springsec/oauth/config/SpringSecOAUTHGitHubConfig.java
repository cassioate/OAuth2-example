package com.springsec.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecOAUTHGitHubConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
	}

	/*
	 * private ClientRegistration clientRegistration() { return
	 * CommonOAuth2Provider.GITHUB.getBuilder("github").clientId(
	 * "085df2d66466289f40eb")
	 * .clientSecret("781cd4b90c56c2ae7ce85331bdd2fb07e2c99229").build(); }
	 */

	
	/*
	 * private ClientRegistration clientRegistration() { ClientRegistration cr =
	 * ClientRegistration.withRegistrationId("github").clientId(
	 * "085df2d66466289f40eb")
	 * .clientSecret("781cd4b90c56c2ae7ce85331bdd2fb07e2c99229").scope(new String[]
	 * { "read:user" })
	 * .authorizationUri("https://github.com/login/oauth/authorize")
	 * .tokenUri("https://github.com/login/oauth/access_token").userInfoUri(
	 * "https://api.github.com/user")
	 * .userNameAttributeName("id").clientName("GitHub")
	 * .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
	 * .redirectUriTemplate("{baseUrl}/{action}/oauth2/code/{registrationId}").build
	 * (); return cr; }
	 */
	 

	/*
	 * @Bean public ClientRegistrationRepository clientRepository() {
	 * ClientRegistration clientReg = clientRegistration(); return new
	 * InMemoryClientRegistrationRepository(clientReg); }
	 */

}
