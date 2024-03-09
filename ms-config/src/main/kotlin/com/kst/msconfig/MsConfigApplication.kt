package com.kst.msconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class MsConfigApplication

fun main(args: Array<String>) {
    runApplication<MsConfigApplication>(*args)
}
