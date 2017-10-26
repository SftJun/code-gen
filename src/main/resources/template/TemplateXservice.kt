package ${packageName}.xservice

import com.zetafin.commons.biz.vo.DataTablePageVO

interface ${beanName}Xservice {

    fun add(po: ${beanName}Po): ${beanName}Vo

    fun update(po: ${beanName}Po): ${beanName}Vo

    fun list(po: ${beanName}Po): DataTablePageVO<${beanName}Vo>
}