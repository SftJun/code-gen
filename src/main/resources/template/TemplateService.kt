package ${packageName}.service

import com.querydsl.core.types.dsl.BooleanExpression
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface ${beanName}Service {

    fun add(entity: ${beanName}): ${beanName}

    fun update(entity: ${beanName}): ${beanName}

    fun list(predicate: BooleanExpression? , pageRequest: PageRequest?): Page<${beanName}>
}