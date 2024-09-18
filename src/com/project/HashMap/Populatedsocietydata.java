package com.project.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Populatedsocietydata {
	HashMap<Integer, List<Person>> populateData() {
		HashMap<Integer, List<Person>> map = new HashMap<>();

		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("C:\\Users\\chish\\OneDrive\\Desktop\\populatedsocietydata.csv"));
			String read = "";

			while ((read = reader.readLine()) != null) {
				String[] token = read.split(",");

				if (token.length>=6) {
					int appartmentnumber = Integer.parseInt(token[0]);
					String personnumber = token[1];
					String Name = token[2];
					String relation = token[3];
					String Email = token[4];
					int age = Integer.parseInt(token[5]);
					String mobile = (token.length>=7)?token[6]:null;
					String occupation = (token.length>=8)?token[7]:null;
					double salary = (token.length>=9)?Double.parseDouble(token[8]):0.0;

					Salarystructure s1 = new Salarystructure();
					s1.setSalary(salary);
					s1.setOccupation(occupation);

					Person p1 = new Person();
					p1.setName(Name);
					p1.setMobile(mobile);
					p1.setEmail(Email);
					p1.setRelations(Relation.valueOf(relation.toUpperCase()));
					p1.setAge(age);
					p1.setsalarystu(s1);
					
					List<Person> appartmentresidents = map.getOrDefault(appartmentnumber, new ArrayList<>());

					appartmentresidents.add(p1);
					map.put(appartmentnumber,appartmentresidents);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;
	}
}