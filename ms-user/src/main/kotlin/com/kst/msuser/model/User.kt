package com.kst.msuser.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "first_name")
    var firstName: String,
    @Column(name = "last_name")
    var lastName: String,
    @Column(name = "email")
    var email: String,
    @Column(name = "password")
    var password: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    var role: Role,
    @CreationTimestamp
    @Column(name = "registration_date")
    val registrationDate: LocalDateTime,
    @UpdateTimestamp
    @Column(name = "update_at")
    var updateAt: LocalDateTime,
    @OneToMany(mappedBy = "owner",
        cascade = [CascadeType.ALL],
        orphanRemoval = true)
    var ownedAccesses: MutableList<Access> = mutableListOf(),
    @OneToMany(mappedBy = "accessedUserId",
        cascade = [CascadeType.ALL],
        orphanRemoval = true)
    var accessedAccesses: MutableList<Access> = mutableListOf()
)
