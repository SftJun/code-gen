package ${packageName}.repository.mysql

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface ${beanName}Repository : JpaRepository<${beanName} , Long> , QueryDslPredicateExecutor<${beanName}>