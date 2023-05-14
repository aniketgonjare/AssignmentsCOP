package com.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import com.exception.InvalidEmployeeException;

import com.code.Employee;

public interface UtilsIO {
	static void storeProductDetails(String fileName, Map<String, Employee> maplist) throws IOException {
		try (ObjectOutputStream obj = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(fileName)))) {
			obj.writeObject(maplist); // serialization
		}

	}

	static Map<String, Employee> restoreProductDetails(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException, InvalidEmployeeException {
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
			// @SuppressWarnings("unchecked")
			// Map<String,Employee> test=(Map<String,Employee>)in.readObject();
			/*
			 * if(test.isEmpty()) { throw new InvalidEmployeeException("empty file"); }
			 */
//			else
			return (Map<String, Employee>) in.readObject(); // de-serializaton

		} catch (Exception e) {
			System.out.println(" error during de-searialization " + e);
			return new HashMap<>();
		}

	}

}
