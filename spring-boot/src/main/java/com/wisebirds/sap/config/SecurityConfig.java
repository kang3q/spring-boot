package com.wisebirds.sap.config;

// @Configuration
// @EnableGlobalMethodSecurity(prePostEnabled = true)
// @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
class SecurityConfig { // extends WebSecurityConfigurerAdapter {
	// @Autowired
	// private UserDetailsService userDetailsService;
	//
	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http.authorizeRequests() //
	// .antMatchers("/", "/public/**").permitAll() //
	// .antMatchers("/users/**").hasAuthority("ADMIN") //
	// .anyRequest().fullyAuthenticated() //
	// .and() //
	// .formLogin() //
	// .loginPage("/login") //
	// .failureUrl("/login?error") //
	// .usernameParameter("email") //
	// .permitAll() //
	// .and() //
	// .logout() //
	// .logoutUrl("/logout") //
	// .deleteCookies("remember-me") //
	// .logoutSuccessUrl("/") //
	// .permitAll() //
	// .and() //
	// .rememberMe(); //
	// }
	//
	// @Override
	// public void configure(AuthenticationManagerBuilder auth) throws Exception {
	// auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	// }
}
