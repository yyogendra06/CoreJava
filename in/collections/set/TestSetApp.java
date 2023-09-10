package in.collections.set;

import java.util.HashSet;

public class TestSetApp {

	public static class Name {
		String str;

		public Name(String str) {
			super();
			this.str = str;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((str == null) ? 0 : str.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Name other = (Name) obj;
			if (str == null) {
				if (other.str != null)
					return false;
			} else if (!str.equals(other.str))
				return false;
			return true;
		}

	}

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		Name s3 = new Name("def");
		Name s4 = new Name("def");

		HashSet<Object> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);

		System.out.println(set);
	}
}
