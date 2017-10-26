package com.outlook.sftjun

import java.io.File
import java.io.FileInputStream
import java.nio.charset.StandardCharsets

/**
 *  Generate code utils
 */
object CodeUtils {
    /**
     * Generate code file
     * @param packageName package name
     * @param beanName entity name
     * @param templateName template code file name
     * @return generated file absolute path
     */
    fun genCode(packageName: String, beanName: String, templateName: String): String {

        val templateFileInputStream = FileInputStream(templateName)
        val genFileName = templateName.replace("template/Template", "out/$beanName")
        val genFile = File(genFileName)
        if (!genFile.exists()) {
            genFile.parentFile.mkdirs()
            genFile.createNewFile()
        }

        val bufferWriter = genFile.bufferedWriter(StandardCharsets.UTF_8)
        templateFileInputStream.bufferedReader(StandardCharsets.UTF_8).lines().forEach {
            val line = it.toString()
                    .replace("\${packageName}", packageName)
                    .replace("\${beanName}", beanName)
            bufferWriter.apply {
                write(line)
                newLine()
            }
        }
        bufferWriter.flush()
        return genFileName
    }

    /**
     * List all template's code file in the Template dir
     * @param templateDir template code dir
     * @return list file name start with 'Template'
     */
    fun listTemplateNames(templateDir: String): List<String> {
        val folder = File(ClassLoader.getSystemResource(templateDir).path)
        return folder.listFiles()
                .map { it.absolutePath }
                .filter { it.contains("Template") }
    }
}