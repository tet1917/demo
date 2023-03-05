package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class KeisanThreeService {
	public String keisan(String first, String sisoku, String param1, String param2, String param3) {
		int kekka1;
		kekka1=0;
		int x = Integer.parseInt(param1);
		int y = Integer.parseInt(param2);
		int z = Integer.parseInt(param3);


		if (first == "firstTasu") {
			if (sisoku == "tasu") {
				kekka1 = x + y + z;
			} else if (sisoku == "hiku") {
				kekka1 = x + y - z;
			} else if (sisoku == "kake") {
				kekka1 = x + y * z;
			} else if (sisoku == "waru") {
				kekka1 = x + y / z;
			}

		} else if (first == "firstHiku") {
			if (sisoku == "tasu") {
				kekka1 = x - y + z;
			} else if (sisoku == "hiku") {
				kekka1 = x - y - z;
			} else if (sisoku == "kake") {
				kekka1 = x - y * z;
			} else if (sisoku == "waru") {
				kekka1 = x - y / z;
			}
		} else if (first == "firstKake") {
			if (sisoku == "tasu") {
				kekka1 = x * y + z;
			} else if (sisoku == "hiku") {
				kekka1 = x * y - z;
			} else if (sisoku == "kake") {
				kekka1 = x * y * z;
			} else if (sisoku == "waru") {
				kekka1 = x * y / z;
			}
		} else if (first == "firstWaru") {
			if (sisoku == "tasu") {
				kekka1 = x / y + z;
			} else if (sisoku == "hiku") {
				kekka1 = x / y - z;
			} else if (sisoku == "kake") {
				kekka1 = x / y * z;
			} else if (sisoku == "waru") {
				kekka1 = x / y / z;
			}
		}
		return String.valueOf(kekka1);
	}
}
