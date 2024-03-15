package com.kst.msuser.repository

import com.kst.msuser.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}