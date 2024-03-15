package com.kst.msuser.model

import com.kst.msuser.model.enums.RoleNames
import jakarta.persistence.*

@Entity
@Table(name = "roles")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    val name: RoleNames
)