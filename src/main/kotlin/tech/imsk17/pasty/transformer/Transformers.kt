package tech.imsk17.pasty.transformer

import tech.imsk17.pasty.domain.Paste
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest

fun Paste.toPasteResponse(): PasteResponse {
    return PasteResponse(
        id = this.id,
        content = this.content,
        isUrl = Regex("").matches(content)
    )
}

fun AddPasteRequest.toPaste(): Paste {
    return Paste(
        content = this.content,
    )
}

fun UpdatePasteRequest.toPaste(): Paste {
    return Paste(
        id = this.id,
        content = this.content,
    )
}