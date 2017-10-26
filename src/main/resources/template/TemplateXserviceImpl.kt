package ${packageName}.xservice.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class ${beanName}XserviceImpl : ${beanName}Xservice {

    private val logger = LoggerFactory.getLogger(${beanName}XserviceImpl::class.java)

    @Transactional
    override fun add(po: ${beanName}Po): ${beanName}Vo {
        TODO("")
    }

    @Transactional
    override fun update(po: ${beanName}Po): ${beanName}Vo {
        TODO("")
    }

    override fun list(po: ${beanName}Po): DataTablePageVO<${beanName}Vo> {
        TODO("")
    }
}