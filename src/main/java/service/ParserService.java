package service;

import java.lang.reflect.Field;

import org.springframework.stereotype.Service;

@Service ("ParserService")
public class ParserService {

	public static <T> String stringify(T entity) {
		StringBuilder builder = new StringBuilder();
		builder.append(entity.getClass().getName());
		builder.append('{');
		for (Field f : entity.getClass().getDeclaredFields()) {
			builder.append(f.getName());
			builder.append("=");
//			builder.append(entity[f.]);
//		    sb.append(", ");
		}
		return builder.toString();
	}
	
}
