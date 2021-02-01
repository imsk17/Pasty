package tech.imsk17.pasty.transformer

import tech.imsk17.pasty.domain.Paste
import tech.imsk17.pasty.dto.AddPasteRequest
import tech.imsk17.pasty.dto.PasteResponse
import tech.imsk17.pasty.dto.UpdatePasteRequest

fun Paste.toPasteResponse(): PasteResponse {
    return PasteResponse(
        id = this.id,
        content = this.content,
        isUrl = this.isUrl
    )
}

fun AddPasteRequest.toPaste(): Paste {
    return Paste(
        content = this.content,
        isUrl = Regex("^(https?://)?((([a-z\\d]([a-z\\d-]*[a-z\\d])*)\\.)+[a-z]{2,}|((\\d{1,3}\\.){3}\\d{1,3}))(:\\d+)?(/[-a-z\\d%_.~+]*)*(\\?[;&a-z\\d%_.~+=-]*)?(#[-a-z\\d_]*)?$")
            .matches(content)
    )
}

fun UpdatePasteRequest.toPaste(): Paste {
    return Paste(
        id = this.id,
        content = this.content,
        isUrl =  Regex("^(https?://)?((([a-z\\d]([a-z\\d-]*[a-z\\d])*)\\.)+[a-z]{2,}|((\\d{1,3}\\.){3}\\d{1,3}))(:\\d+)?(/[-a-z\\d%_.~+]*)*(\\?[;&a-z\\d%_.~+=-]*)?(#[-a-z\\d_]*)?$")
            .matches(content)
    )
}