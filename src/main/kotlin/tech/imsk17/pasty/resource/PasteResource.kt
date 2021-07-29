package tech.imsk17.pasty.resource

import org.springframework.http.ResponseEntity
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest

interface PasteResource {
    fun findById(id: String): ResponseEntity<PasteResponse?>
    fun save(addPasteRequest: AddPasteRequest): ResponseEntity<PasteResponse>
    fun update(updatePasteRequest: UpdatePasteRequest): ResponseEntity<PasteResponse>
    fun deleteById(id: String): ResponseEntity<Map<String, String>>
}