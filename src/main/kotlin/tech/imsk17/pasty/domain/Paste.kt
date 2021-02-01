package tech.imsk17.pasty.domain

import org.apache.coyote.Response
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob

@Entity
data class Paste(
    @Id
    val id: String = UUID.randomUUID().toString().subSequence(0, 8).toString(),
    @Lob
    @Column(columnDefinition = "TEXT")
    val content: String,
    val expiry: LocalDateTime = LocalDateTime.now().plusMonths(6),
    val isUrl: Boolean
)
