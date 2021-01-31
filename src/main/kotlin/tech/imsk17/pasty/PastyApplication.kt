package tech.imsk17.pasty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PastyApplication

fun main(args: Array<String>) {
    runApplication<PastyApplication>(*args)
}
