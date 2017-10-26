package ${packageName}.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ${beanName}Controller {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @PostMapping("/add")
    fun add(@RequestBody po: ${beanName}Po): BizResponse<*> {
        TODO("")
    }

    @PostMapping("/update")
    fun update(@RequestBody po: ${beanName}Po): BizResponse<*> {
        TODO("")
    }

    @PostMapping("/list")
    fun list(@RequestBody po: ${beanName}Po): BizResponse<*> {
        TODO("")
    }
}