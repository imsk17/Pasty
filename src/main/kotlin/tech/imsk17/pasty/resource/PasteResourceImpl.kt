package tech.imsk17.pasty.resource

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest
import tech.imsk17.pasty.service.PasteService


@RestController
@RequestMapping("/api/paste")
class PasteResourceImpl(
    private val pasteService: PasteService
) : PasteResource {
    @GetMapping("/{id}")
    override fun findById(@PathVariable id: String): ResponseEntity<PasteResponse?> {
        val pasteResponse = this.pasteService.findById(id) ?: throw NoSuchElementException("no entity with that id found")
        return ResponseEntity.ok().body(pasteResponse)
    }

    @PostMapping("/")
    override fun save(@RequestBody addPasteRequest: AddPasteRequest): ResponseEntity<PasteResponse> {
        val pasteResponse = this.pasteService.save(addPasteRequest)
        return ResponseEntity.ok().body(pasteResponse)
    }

    @PutMapping("/")
    override fun update(@RequestBody updatePasteRequest: UpdatePasteRequest): ResponseEntity<PasteResponse> {
        return ResponseEntity.ok().body(pasteService.update(updatePasteRequest))
    }

    @DeleteMapping("/{id}")
    override fun deleteById(@PathVariable id: String): ResponseEntity<Map<String, String>> {
        pasteService.deleteById(id)
        return ResponseEntity.ok().body(mapOf("status" to "success"))
    }
}