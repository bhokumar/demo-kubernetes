package com.smartrobo.kubernetes.contollers

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KubernetesConfigMapController {

    @Value('${smartrobo.version: defaultValue}')
    String version

    @GetMapping("/configs")
    ResponseEntity<Map<String, Object>> configReader() {
        def responseData = [version: version]
        def responseEntity = ResponseEntity.ok(responseData)
        return responseEntity
    }
}
