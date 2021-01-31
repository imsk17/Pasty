package tech.imsk17.pasty.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.imsk17.pasty.domain.Paste

@Repository
interface PastyDao : JpaRepository<Paste, String>