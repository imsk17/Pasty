package tech.imsk17.pasty.service

import org.springframework.stereotype.Service
import tech.imsk17.pasty.dao.PastyDao
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest
import tech.imsk17.pasty.transformer.toPaste
import tech.imsk17.pasty.transformer.toPasteResponse

@Service
class PasteServiceImpl(private val pasteDao: PastyDao) : PasteService {
    override fun findById(id: String): PasteResponse? {
        val paste = pasteDao.findById(id)
        return if (paste.isPresent) paste.get().toPasteResponse()
        else null
    }

    override fun save(addPersonRequest: AddPasteRequest): PasteResponse {
        val paste = addPersonRequest.toPaste()
        return pasteDao.save(paste).toPasteResponse()
    }

    override fun update(updatePersonRequest: UpdatePasteRequest): PasteResponse {
        val paste = updatePersonRequest.toPaste()
        return pasteDao.save(paste).toPasteResponse()
    }

    override fun deleteById(id: String) {
      pasteDao.deleteById(id)
    }
}