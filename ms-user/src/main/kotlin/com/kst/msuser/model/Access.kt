package com.kst.msuser.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "accesses")
data class Access(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    var owner: User,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accessed_user_id")
    var accessedUserId: User,
    @Column(name = "read_permission")
    val readPermission: Boolean,
    @Column(name = "write_permission")
    val writePermission: Boolean,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updatedAt: LocalDateTime
)
