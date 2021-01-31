package tech.imsk17.pasty.service

import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest

interface PasteService {
    fun findById(id: String): PasteResponse?
    fun save(addPersonRequest: AddPasteRequest): PasteResponse
    fun update(updatePersonRequest: UpdatePasteRequest): PasteResponse
    fun deleteById(id: String)
}