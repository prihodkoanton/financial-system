package com.kst.msuser.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "roles_accesses")
data class RolesAccesses(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    var role: Role,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "access_id")
    var access: Access,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime
)
