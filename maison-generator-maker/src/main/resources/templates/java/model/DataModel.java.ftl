package ${basePackage}.model;

import lombok.Data;

/**
 * 数据模型
 */
@Data
public class DataModel {
<#list modelConfig.models as modelInfo>

    <#if modelInfo.description??>
    /**
     * ${modelInfo.description}
     */
    </#if>
    private ${modelInfo.type} ${modelInfo.fieldName} = <#if modelInfo.defaultValue?is_boolean>${modelInfo.defaultValue?c}<#else>"${modelInfo.defaultValue}"</#if>;
</#list>
}







