package in.objects.classexamples;

import java.util.HashMap;
import java.util.Map;

final class ImmutableStudent {
	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;

	public ImmutableStudent(String name, int regNo, Map<String, String> metadata) {
		super();
		this.name = name;
		this.regNo = regNo;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}

}

final class MutableStudent {
	private  String name;
	private  int regNo;
	private  Map<String, String> metadata;

	public MutableStudent(String name, int regNo, Map<String, String> metadata) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.metadata = metadata;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetadata() {
		return metadata;
	}

}

public class ImmutableClassApp {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		ImmutableStudent s = new ImmutableStudent("ABC", 101, map);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetadata());

		map.put("3", "third");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor

		s.getMetadata().put("4", "fourth");
		System.out.println(s.getMetadata());
		
		Map<String, String> mmap = new HashMap<>();
		mmap.put("1", "first");
		mmap.put("2", "second");
		MutableStudent s1 = new MutableStudent("ABC", 101, mmap);
		System.out.println(s1.getName());
		System.out.println(s1.getRegNo());
		System.out.println(s1.getMetadata());

		mmap.put("3", "third");
		System.out.println(s1.getMetadata()); // Remains unchanged due to deep copy in constructor

		s1.getMetadata().put("4", "fourth");
		System.out.println(s1.getMetadata());
	}
}
