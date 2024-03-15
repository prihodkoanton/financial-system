package com.kst.msuser.model

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "actions")
data class Action(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "name")
    var name: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User,
    @Column(name = "description")
    var description: String,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime,
    @UpdateTimestamp
    @Column(name = "updated_at")
    var updated_at: LocalDateTime
)
