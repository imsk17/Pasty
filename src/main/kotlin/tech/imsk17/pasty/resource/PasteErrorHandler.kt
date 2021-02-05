package tech.imsk17.pasty.resource

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import tech.imsk17.pasty.dto.ErrorResponse

@ControllerAdvice
class PasteErrorHandler {
    @ExceptionHandler(NoSuchElementException::class)
    fun handleException(e: NoSuchElementException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.badRequest().body(ErrorResponse(message = e.localizedMessage, errorCode = 404))
    }
}