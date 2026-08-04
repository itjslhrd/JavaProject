package com.mnu.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//ADto : 기본 정보
//BDto : 성적 정보
public class Exam_07 {
	public static void main(String[] args) {
		Map<ADto, BDto> map = new HashMap();
		
		ADto a = new ADto(1,"김학생");
		BDto b = new BDto(1,90,80,80);
		
		map.put(a, b);
		a = new ADto(2,"강학생");
		b = new BDto(2,95,85,85);
		map.put(a, b);

		a = new ADto(3,"오학생");
		b = new BDto(3,89,88,88);
		map.put(a, b);
		
		//keySey =>키만 Set 반환
		Set<ADto> keySet = map.keySet();
		for(ADto key : keySet) {
			System.out.print(key.getBun() + " ");
			System.out.print(key.getName() + " ");
			System.out.print(map.get(key).getKor() + " ");
			System.out.print(map.get(key).getEng() + " ");
			System.out.print(map.get(key).getMat() + "\n");
		}
		
		System.out.println("--------------------");
		//entrySet(); => Set<Map.Entry) : 키와 값의 결합
		Set<Map.Entry<ADto, BDto>> entrySet = map.entrySet();
		for(Map.Entry<ADto, BDto> entry : entrySet) {
			System.out.print(entry.getKey().getBun() + " ");
			System.out.print(entry.getKey().getName() + " ");
			System.out.print(entry.getValue().getKor() + " ");
			System.out.print(entry.getValue().getEng() + " ");
			System.out.print(entry.getValue().getMat() + "\n");
		}
		
	}

}
