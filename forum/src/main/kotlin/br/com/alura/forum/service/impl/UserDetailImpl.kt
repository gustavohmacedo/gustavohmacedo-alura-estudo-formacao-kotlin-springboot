package br.com.alura.forum.service.impl

import br.com.alura.forum.entity.User
import org.springframework.security.core.userdetails.UserDetails

data class UserDetailImpl(
    private val user: User
) : UserDetails {

    override fun getAuthorities() = null

    override fun getPassword() = user.password

    override fun getUsername() = user.email

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true
}