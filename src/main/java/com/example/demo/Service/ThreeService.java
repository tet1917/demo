package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ThreeService {
	public String ThreeParam(String param) {
		List<String> list1 = new ArrayList<>();
		int num = Integer.parseInt(param);
		for (int i = 1; i <= num; i++) {
			if (i % 7 == 0 && i % 5 == 0 && i % 3 == 0) {
				list1.add("ThreeFiveSeven");
			} else if (i % 7 == 0 && i % 5 == 0) {
				list1.add("FiveSeven");
			} else if (i % 7 == 0 && i % 3 == 0) {
				list1.add("ThreeSeven");
			} else if (i % 5 == 0 && i % 3 == 0) {
				list1.add("ThreeFive");
			} else if (i % 7 == 0) {
				list1.add("Seven");
			} else if (i % 5 == 0) {
				list1.add("Five");
			} else if (i % 3 == 0) {
				list1.add("Three");
			} else {
				list1.add(Integer.toString(i));
			}
		}
		return String.valueOf(list1);
	}
}
