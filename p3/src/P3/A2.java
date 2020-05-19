package P3;

import java.util.ArrayList;
import java.util.List;

public class A2 {
	public static void main(String[]args) {
		List<String>list=new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println("这是个for循环遍历");
		for(int a=0;a<list.size();a++) {
			System.out.println(list.get(a));
		}
	}

}
