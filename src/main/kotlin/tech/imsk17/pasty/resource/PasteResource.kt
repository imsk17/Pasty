package tech.imsk17.pasty.resource

import org.springframework.http.ResponseEntity
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest

interface PasteResource {
    fun findById(id: String): ResponseEntity<PasteResponse?>
    fun save(addPersonRequest: AddPasteRequest): ResponseEntity<PasteResponse>
    fun update(updatePersonRequest: UpdatePasteRequest): ResponseEntity<PasteResponse>
    fun deleteById(id: String): ResponseEntity<Map<String, String>>
}