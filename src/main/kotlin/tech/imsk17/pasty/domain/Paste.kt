package tech.imsk17.pasty.domain

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Paste(
    @Id
    val id: String = UUID.randomUUID().toString().subSequence(0, 8).toString(),
    val content: String,
    val expiry: LocalDateTime = LocalDateTime.now().plusMonths(6),
)
