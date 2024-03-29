/*August 10, 2022*/

package com.daily.Service;

import com.daily.Entity.User;
import com.daily.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepo repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		Optional<User> user = repository.findByUserName(username);
		return user.map(GroupUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException(username + " Not Found"));
	}
}