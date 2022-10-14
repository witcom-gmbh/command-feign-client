package com.fntsoftware.businessgateway.helper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class CommandPropertyNamingStrategy extends PropertyNamingStrategy {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4825545423435958505L;
	
	@Override
	public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
		return field.getName();
	}
	@Override
	public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
		return convert(method, defaultName);
	}
	@Override
	public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
		return convert(method, defaultName);
	}
	/**
	 * get the class from getter/setter methods
	 * 
	 * @param method
	 * @param defaultName
	 *            - jackson generated name
	 * @return the correct property name
	 */
	private String convert(AnnotatedMethod method, String defaultName) {
		Class<?> clazz = method.getDeclaringClass();
		List<Field> flds = getAllFields(clazz);
		for (Field fld : flds) {
			if (fld.getName().equalsIgnoreCase(defaultName)) {
				return fld.getName();
			}
		}
		return defaultName;
	}
	/**
	 * get all fields from class
	 * 
	 * @param currentClass
	 *            - should not be null
	 * @return fields from the currentClass and its superclass
	 */
	private List<Field> getAllFields(Class<?> currentClass) {
		List<Field> flds = new ArrayList<>();
		while (currentClass != null) {
			Field[] fields = currentClass.getDeclaredFields();
			Collections.addAll(flds, fields);
			if (currentClass.getSuperclass() == null)
				break;
			currentClass = currentClass.getSuperclass();
		}
		return flds;
	}
	

}
