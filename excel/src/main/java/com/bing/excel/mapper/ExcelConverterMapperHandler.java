package com.bing.excel.mapper;

import com.bing.excel.converter.FieldValueConverter;
import com.bing.excel.mapper.ConversionMapper.FieldConverterMapper;

public interface ExcelConverterMapperHandler {


  ConversionMapper getObjConversionMapper();

  @Deprecated
  FieldValueConverter getLocalConverter(Class definedIn,
      String fieldName);

  FieldConverterMapper getLocalFieldConverterMapper(Class definedIn,
      String fieldName);

  String getModelName(Class<?> definedIn);

}
