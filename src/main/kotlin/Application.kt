import com.outlook.sftjun.CodeUtils

fun main(args: Array<String>) {
    val packageName = "com.outlook.sftjun"
    val beanName = "Repay"
    CodeUtils.apply {
        listTemplateNames("template/")
                .map { genCode(packageName, beanName, it) }
                .forEach { println(it) }
    }
}