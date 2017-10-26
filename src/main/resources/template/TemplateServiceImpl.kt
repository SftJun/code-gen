package ${packageName}.service.impl

import com.querydsl.core.types.dsl.BooleanExpression
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class ${beanName}ServiceImpl : ${beanName}Service {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    override fun add(entity: ${beanName}): ${beanName} {
       TODO("")
    }

    override fun update(entity: ${beanName}): ${beanName} {
        TODO("")
    }

    override fun list(predicate: BooleanExpression? , pageRequest: PageRequest?): Page<${beanName}> {
        TODO("")
    }
}